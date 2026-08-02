package defpackage;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes3.dex */
public final class z6b {
    public final /* synthetic */ a7b a;

    public z6b(a7b a7bVar) {
        this.a = a7bVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        a7b a7bVar = this.a;
        xj4 xj4Var = a7bVar.v;
        if (a7bVar.s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = a7bVar.s;
        if (editText != null) {
            editText.removeTextChangedListener(xj4Var);
            if (a7bVar.s.getOnFocusChangeListener() == a7bVar.a().e()) {
                a7bVar.s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        a7bVar.s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(xj4Var);
        }
        a7bVar.a().l(a7bVar.s);
        a7bVar.i(a7bVar.a());
    }
}
