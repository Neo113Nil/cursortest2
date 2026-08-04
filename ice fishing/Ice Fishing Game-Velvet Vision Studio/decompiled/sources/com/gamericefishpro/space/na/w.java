package com.gamericefishpro.space.na;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class w implements TextWatcher {
    public int d;
    public final /* synthetic */ EditText e;
    public final /* synthetic */ TextInputLayout i;

    public w(TextInputLayout textInputLayout, EditText editText) {
        this.i = textInputLayout;
        this.e = editText;
        this.d = editText.getLineCount();
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        TextInputLayout textInputLayout = this.i;
        textInputLayout.w(!textInputLayout.U0, false);
        if (textInputLayout.E) {
            textInputLayout.p(editable);
        }
        if (textInputLayout.M) {
            textInputLayout.x(editable);
        }
        EditText editText = this.e;
        int lineCount = editText.getLineCount();
        int i = this.d;
        if (lineCount != i) {
            if (lineCount < i) {
                int minimumHeight = editText.getMinimumHeight();
                int i2 = textInputLayout.N0;
                if (minimumHeight != i2) {
                    editText.setMinimumHeight(i2);
                }
            }
            this.d = lineCount;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
