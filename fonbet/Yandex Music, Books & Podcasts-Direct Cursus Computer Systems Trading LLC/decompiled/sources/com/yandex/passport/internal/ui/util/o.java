package com.yandex.passport.internal.ui.util;

import android.text.Editable;
import android.text.TextWatcher;

/* loaded from: classes4.dex */
public final class o implements TextWatcher {
    public final com.yandex.passport.legacy.lx.a a;

    public o(com.yandex.passport.legacy.lx.a aVar) {
        this.a = aVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a.mo1b(editable);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
