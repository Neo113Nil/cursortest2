package H3;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.icefishinggame.icefishinggamemultigames.C5275R;

/* loaded from: classes2.dex */
public final class z extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f1221e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f1222f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0308a f1223g;

    public z(r rVar, int i) {
        super(rVar);
        this.f1221e = C5275R.drawable.design_password_eye;
        this.f1223g = new ViewOnClickListenerC0308a(2, this);
        if (i != 0) {
            this.f1221e = i;
        }
    }

    @Override // H3.s
    public final void b() {
        q();
    }

    @Override // H3.s
    public final int c() {
        return C5275R.string.password_toggle_content_description;
    }

    @Override // H3.s
    public final int d() {
        return this.f1221e;
    }

    @Override // H3.s
    public final View.OnClickListener f() {
        return this.f1223g;
    }

    @Override // H3.s
    public final boolean k() {
        return true;
    }

    @Override // H3.s
    public final boolean l() {
        EditText editText = this.f1222f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // H3.s
    public final void m(EditText editText) {
        this.f1222f = editText;
        q();
    }

    @Override // H3.s
    public final void r() {
        EditText editText = this.f1222f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f1222f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // H3.s
    public final void s() {
        EditText editText = this.f1222f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
