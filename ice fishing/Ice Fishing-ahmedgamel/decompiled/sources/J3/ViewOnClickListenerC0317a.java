package J3;

import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;

/* renamed from: J3.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class ViewOnClickListenerC0317a implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1459n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1460u;

    public /* synthetic */ ViewOnClickListenerC0317a(int i, Object obj) {
        this.f1459n = i;
        this.f1460u = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1459n) {
            case 0:
                C0321e c0321e = (C0321e) this.f1460u;
                EditText editText = c0321e.i;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0321e.q();
                return;
            case 1:
                ((m) this.f1460u).u();
                return;
            case 2:
                z zVar = (z) this.f1460u;
                EditText editText2 = zVar.f1578f;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = zVar.f1578f;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    zVar.f1578f.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    zVar.f1578f.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    zVar.f1578f.setSelection(selectionEnd);
                }
                zVar.q();
                return;
            default:
                ((com.google.android.material.datepicker.l) this.f1460u).E();
                throw null;
        }
    }
}
