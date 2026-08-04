package com.gamericefishpro.space.na;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class o {
    public final /* synthetic */ p a;

    public o(p pVar) {
        this.a = pVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        p pVar = this.a;
        n nVar = pVar.O;
        if (pVar.L == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pVar.L;
        if (editText != null) {
            editText.removeTextChangedListener(nVar);
            if (pVar.L.getOnFocusChangeListener() == pVar.b().e()) {
                pVar.L.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pVar.L = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(nVar);
        }
        pVar.b().l(pVar.L);
        pVar.j(pVar.b());
    }
}
