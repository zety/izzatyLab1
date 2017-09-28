package com.example.user.izzatylab1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button displayButton;
    private EditText etName;
    private TextView tvMessage;
    private Button reset;

    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayButton = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editText);
        tvMessage = (TextView) findViewById(R.id.textView);
        reset = (Button) findViewById(R.id.button3);
    }

    public void displayText (View view) {

        String text = etName.getText().toString();

        //display text obtain from getText
        tvMessage.setText("Welcome! " + text);



        //show toast
        Toast toast = Toast.makeText(this,"Welcome "+text,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void displayText1 (View view) {

        etName.getText().clear();
        tvMessage.setText("Welcome! ");

        //show toast
        Toast toast = Toast.makeText(this,"Name have been reset",Toast.LENGTH_SHORT);
        toast.show();
    }
    }

