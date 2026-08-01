package H3;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: H3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0308a implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1103n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1104u;

    public /* synthetic */ ViewOnClickListenerC0308a(int i, Object obj) {
        this.f1103n = i;
        this.f1104u = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1103n) {
            case 0:
                C0312e c0312e = (C0312e) this.f1104u;
                EditText editText = c0312e.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0312e.q();
                return;
            case 1:
                ((m) this.f1104u).u();
                return;
            case 2:
                z zVar = (z) this.f1104u;
                EditText editText2 = zVar.f1222f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = zVar.f1222f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    zVar.f1222f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    zVar.f1222f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    zVar.f1222f.setSelection(selectionEnd);
                }
                zVar.q();
                return;
            default:
                ((com.google.android.material.datepicker.l) this.f1104u).E();
                throw null;
        }
    }
}
