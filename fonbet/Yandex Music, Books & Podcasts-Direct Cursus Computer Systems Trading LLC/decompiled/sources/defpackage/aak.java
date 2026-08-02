package defpackage;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class aak extends g7b {
    public final int e;
    public EditText f;
    public final ol g;

    public aak(a7b a7bVar, int i) {
        super(a7bVar);
        this.e = R.drawable.design_password_eye;
        this.g = new ol(28, this);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // defpackage.g7b
    public final void b() {
        p();
    }

    @Override // defpackage.g7b
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // defpackage.g7b
    public final int d() {
        return this.e;
    }

    @Override // defpackage.g7b
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // defpackage.g7b
    public final boolean j() {
        return true;
    }

    @Override // defpackage.g7b
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // defpackage.g7b
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // defpackage.g7b
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // defpackage.g7b
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
