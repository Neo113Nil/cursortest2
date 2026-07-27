package H3;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f1143a;

    public o(r rVar) {
        this.f1143a = rVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        r rVar = this.f1143a;
        if (rVar.f1160L == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = rVar.f1160L;
        n nVar = rVar.f1163O;
        if (editText != null) {
            editText.removeTextChangedListener(nVar);
            if (rVar.f1160L.getOnFocusChangeListener() == rVar.b().e()) {
                rVar.f1160L.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        rVar.f1160L = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(nVar);
        }
        rVar.b().m(rVar.f1160L);
        rVar.j(rVar.b());
    }
}
