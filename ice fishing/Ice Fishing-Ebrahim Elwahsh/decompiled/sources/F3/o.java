package F3;

import android.widget.EditText;
import com.google.android.material.textfield.TextInputLayout;

/* loaded from: classes2.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r f1056a;

    public o(r rVar) {
        this.f1056a = rVar;
    }

    public final void a(TextInputLayout textInputLayout) {
        r rVar = this.f1056a;
        if (rVar.f1073L == textInputLayout.getEditText()) {
            return;
        }
        EditText editText = rVar.f1073L;
        n nVar = rVar.f1076O;
        if (editText != null) {
            editText.removeTextChangedListener(nVar);
            if (rVar.f1073L.getOnFocusChangeListener() == rVar.b().e()) {
                rVar.f1073L.setOnFocusChangeListener(null);
            }
        }
        EditText editText2 = textInputLayout.getEditText();
        rVar.f1073L = editText2;
        if (editText2 != null) {
            editText2.addTextChangedListener(nVar);
        }
        rVar.b().m(rVar.f1073L);
        rVar.j(rVar.b());
    }
}
