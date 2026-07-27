package com.giderosmobile.android.player;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

/* loaded from: classes.dex */
public class TextInputBox implements DialogInterface.OnShowListener, DialogInterface.OnClickListener, DialogInterface.OnCancelListener, DialogInterface.OnDismissListener, TextWatcher {
    private static final int EMAIL = 3;
    private static final int NUMBER = 1;
    private static final int PHONE = 2;
    private static final int TEXT = 0;
    private static final int URL = 4;
    private AlertDialog alertDialog_;
    private String button1_;
    private String button2_;
    private String cancel_;
    private EditText editText_;
    String text_;
    private long udata_;
    private boolean isVisible_ = false;
    int inputType_ = 0;
    boolean secureInput_ = false;

    private native void completeCallback(String str, int i, String str2, long j);

    /* JADX INFO: Access modifiers changed from: private */
    public static int convertInputType(int i, boolean z) {
        int i2 = z ? 128 : 0;
        if (i == 0) {
            return i2 | 1;
        }
        if (i == 1) {
            return i2 | 2;
        }
        if (i == 2) {
            return i2 | 3;
        }
        if (i == 3) {
            return i2 | 33;
        }
        if (i != 4) {
            return 0;
        }
        return i2 | 17;
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public TextInputBox(final String str, final String str2, final String str3, final String str4, final String str5, final String str6, long j) {
        this.cancel_ = str4;
        this.button1_ = str5;
        this.button2_ = str6;
        this.udata_ = j;
        this.text_ = str3;
        WeakActivityHolder.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.TextInputBox.1
            @Override // java.lang.Runnable
            public void run() {
                TextInputBox.this.alertDialog_ = new AlertDialog.Builder(WeakActivityHolder.get()).create();
                TextInputBox.this.alertDialog_.setTitle(str);
                TextInputBox.this.alertDialog_.setMessage(str2);
                TextInputBox.this.editText_ = new EditText(WeakActivityHolder.get());
                TextInputBox.this.editText_.setText(str3);
                TextInputBox.this.editText_.requestFocus();
                TextInputBox.this.editText_.addTextChangedListener(this);
                TextInputBox.this.alertDialog_.setView(TextInputBox.this.editText_);
                TextInputBox.this.alertDialog_.setCancelable(true);
                TextInputBox.this.alertDialog_.setOnShowListener(this);
                TextInputBox.this.alertDialog_.setButton(-2, str4, this);
                if (str5 != null) {
                    TextInputBox.this.alertDialog_.setButton(-1, str5, this);
                }
                if (str6 != null) {
                    TextInputBox.this.alertDialog_.setButton(-3, str6, this);
                }
                TextInputBox.this.alertDialog_.setOnCancelListener(this);
                TextInputBox.this.alertDialog_.setOnDismissListener(this);
            }
        });
    }

    public void show() {
        WeakActivityHolder.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.TextInputBox.2
            @Override // java.lang.Runnable
            public void run() {
                TextInputBox.this.alertDialog_.show();
            }
        });
    }

    public void hide() {
        WeakActivityHolder.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.TextInputBox.3
            @Override // java.lang.Runnable
            public void run() {
                TextInputBox.this.alertDialog_.hide();
            }
        });
    }

    public void delete() {
        this.alertDialog_.dismiss();
    }

    void setText(String str) {
        this.text_ = str;
        WeakActivityHolder.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.TextInputBox.4
            @Override // java.lang.Runnable
            public void run() {
                TextInputBox.this.editText_.setText(TextInputBox.this.text_);
            }
        });
    }

    String getText() {
        return this.text_;
    }

    void setInputType(int i) {
        if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
            this.inputType_ = i;
            WeakActivityHolder.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.TextInputBox.5
                @Override // java.lang.Runnable
                public void run() {
                    TextInputBox.this.editText_.setInputType(TextInputBox.convertInputType(TextInputBox.this.inputType_, TextInputBox.this.secureInput_));
                }
            });
        }
    }

    int getInputType() {
        return this.inputType_;
    }

    void setSecureInput(boolean z) {
        this.secureInput_ = z;
        WeakActivityHolder.get().runOnUiThread(new Runnable() { // from class: com.giderosmobile.android.player.TextInputBox.6
            @Override // java.lang.Runnable
            public void run() {
                int inputType = TextInputBox.this.editText_.getInputType();
                if (TextInputBox.this.secureInput_) {
                    TextInputBox.this.editText_.setInputType(inputType | 128);
                } else {
                    TextInputBox.this.editText_.setInputType(inputType & (-129));
                }
            }
        });
    }

    boolean isSecureInput() {
        return this.secureInput_;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        if (i == -3) {
            completeCallback(this.editText_.getText().toString(), 2, this.button2_, this.udata_);
        } else if (i == -2) {
            completeCallback(this.editText_.getText().toString(), 0, this.cancel_, this.udata_);
        } else {
            if (i != -1) {
                return;
            }
            completeCallback(this.editText_.getText().toString(), 1, this.button1_, this.udata_);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        completeCallback(this.editText_.getText().toString(), 0, this.cancel_, this.udata_);
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(DialogInterface dialogInterface) {
        this.isVisible_ = true;
        ((InputMethodManager) WeakActivityHolder.get().getSystemService("input_method")).showSoftInput(this.editText_, 1);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.isVisible_ = false;
    }

    public boolean isVisible() {
        return this.isVisible_;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        this.text_ = editable.toString();
    }
}
