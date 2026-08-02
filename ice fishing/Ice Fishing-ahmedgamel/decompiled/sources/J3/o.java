package J3;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f1499a;

    public o(r rVar) {
        this.f1499a = rVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        r rVar = this.f1499a;
        if (rVar.f1516L == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = rVar.f1516L;
        n nVar = rVar.f1519O;
        if (editText != null) {
            editText.removeTextChangedListener(nVar);
            if (rVar.f1516L.getOnFocusChangeListener() == rVar.b().e()) {
                rVar.f1516L.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        rVar.f1516L = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(nVar);
        }
        rVar.b().m(rVar.f1516L);
        rVar.j(rVar.b());
    }
}
