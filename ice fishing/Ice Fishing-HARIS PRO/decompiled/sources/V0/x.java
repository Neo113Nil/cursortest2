package V0;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
public final class x extends q {
    public final int e;

    /* renamed from: f, reason: collision with root package name */
    public EditText f1362f;

    /* renamed from: g, reason: collision with root package name */
    public final ViewOnClickListenerC0050a f1363g;

    public x(p pVar, int i) {
        super(pVar);
        this.e = R.drawable.design_password_eye;
        this.f1363g = new ViewOnClickListenerC0050a(2, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // V0.q
    public final void b() {
        q();
    }

    @Override // V0.q
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // V0.q
    public final int d() {
        return this.e;
    }

    @Override // V0.q
    public final View.OnClickListener f() {
        return this.f1363g;
    }

    @Override // V0.q
    public final boolean k() {
        return true;
    }

    @Override // V0.q
    public final boolean l() {
        EditText editText = this.f1362f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // V0.q
    public final void m(EditText editText) {
        this.f1362f = editText;
        q();
    }

    @Override // V0.q
    public final void r() {
        EditText editText = this.f1362f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f1362f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // V0.q
    public final void s() {
        EditText editText = this.f1362f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
