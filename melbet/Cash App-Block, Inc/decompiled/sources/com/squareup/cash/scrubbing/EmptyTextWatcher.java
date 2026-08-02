package com.squareup.cash.scrubbing;

import android.text.TextWatcher;

/* loaded from: classes4.dex */
public abstract class EmptyTextWatcher implements TextWatcher {
    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        charSequence.getClass();
    }
}
