package com.example.morse;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Vibrator rezges;
    EditText edittext;
    RelativeLayout relative;
    TextView textView;
    Button button;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext= findViewById(R.id.edittext);
        relative= findViewById(R.id.relative);
        textView= findViewById(R.id.uzenet);
        rezges= (Vibrator) getSystemService(VIBRATOR_SERVICE);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              textView.setText(fordito(edittext.getText().toString()));
              rezges.vibrate(1000000);
            }
        });

    }
    public String fordito(String text){
        String temp="";
        temp= text.toUpperCase();
        temp=temp.replace("0", "-----");
        temp=temp.replace("1", " .----");
        temp=temp.replace("2", "..---");
        temp=temp.replace("3", "...--");
        temp=temp.replace("4", "....-");
        temp=temp.replace("5", ".....");
        temp=temp.replace("6", "-....");
        temp=temp.replace("7", "--...");
        temp=temp.replace("8", " ---..");
        temp=temp.replace("9", "----.");

        temp=temp.replace("A",".-");
        temp=temp.replace("Á",".--.-");
        temp=temp.replace("B","-...");
        temp=temp.replace("C","-.-.");
        temp=temp.replace("D","-..");
        temp=temp.replace("E",".");
        temp=temp.replace("É","..-..");
        temp=temp.replace("F","..-.");
        temp=temp.replace("G","--.");
        temp=temp.replace("H","....");
        temp=temp.replace("I","..");
        temp=temp.replace("J",".---");
        temp=temp.replace("K","-.-");
        temp=temp.replace("L",".-..");
        temp=temp.replace("M","--");
        temp=temp.replace("N","-.");
        temp=temp.replace("O","---");
        temp=temp.replace("Ö","---.");
        temp=temp.replace("P",".--.");
        temp=temp.replace("Q","--.-");
        temp=temp.replace("R",".-.");
        temp=temp.replace("S","...");
        temp=temp.replace("T","-");
        temp=temp.replace("U","..-");
        temp=temp.replace("Ü","..--");
        temp=temp.replace("V","...-");
        temp=temp.replace("W",".--");
        temp=temp.replace("Z","--..");

        return temp;
    }
}