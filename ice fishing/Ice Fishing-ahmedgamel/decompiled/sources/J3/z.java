package J3;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.IceFishing.LiveIceFishing.C5248R;

/* loaded from: classes2.dex */
public final class z extends s {

    /* renamed from: e, reason: collision with root package name */
    public final int f1577e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f1578f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0317a f1579g;

    public z(r rVar, int i) {
        super(rVar);
        this.f1577e = C5248R.drawable.design_password_eye;
        this.f1579g = new ViewOnClickListenerC0317a(2, this);
        if (i != 0) {
            this.f1577e = i;
        }
    }

    @Override // J3.s
    public final void b() {
        q();
    }

    @Override // J3.s
    public final int c() {
        return C5248R.string.password_toggle_content_description;
    }

    @Override // J3.s
    public final int d() {
        return this.f1577e;
    }

    @Override // J3.s
    public final View.OnClickListener f() {
        return this.f1579g;
    }

    @Override // J3.s
    public final boolean k() {
        return true;
    }

    @Override // J3.s
    public final boolean l() {
        EditText editText = this.f1578f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // J3.s
    public final void m(EditText editText) {
        this.f1578f = editText;
        q();
    }

    @Override // J3.s
    public final void r() {
        EditText editText = this.f1578f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f1578f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // J3.s
    public final void s() {
        EditText editText = this.f1578f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
