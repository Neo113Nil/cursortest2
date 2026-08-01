package V0;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p f1292a;

    public m(p pVar) {
        this.f1292a = pVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        p pVar = this.f1292a;
        if (pVar.f1314s == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = pVar.f1314s;
        l lVar = pVar.f1317v;
        if (editText != null) {
            editText.removeTextChangedListener(lVar);
            if (pVar.f1314s.getOnFocusChangeListener() == pVar.b().e()) {
                pVar.f1314s.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        pVar.f1314s = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(lVar);
        }
        pVar.b().m(pVar.f1314s);
        pVar.j(pVar.b());
    }
}
