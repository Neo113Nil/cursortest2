package com.yandex.plus.core.debug.panel.internal.utils.ext;

import android.os.SystemClock;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import com.yandex.passport.legacy.lx.d;
import com.yandex.plus.core.debug.panel.internal.presentation.view.g;

/* loaded from: classes4.dex */
public final class a implements TextWatcher {
    public long a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ g c;

    public a(EditText editText, g gVar) {
        this.b = editText;
        this.c = gVar;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        this.a = SystemClock.elapsedRealtime();
        this.b.postDelayed(new d(1, this, this.c, editable), 400L);
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
