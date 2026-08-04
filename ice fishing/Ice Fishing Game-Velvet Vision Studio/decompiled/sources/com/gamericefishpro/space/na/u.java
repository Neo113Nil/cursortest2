package com.gamericefishpro.space.na;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
import com.gamericefishpro.space.R;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class u extends q {
    public final int e;
    public EditText f;
    public final a g;

    public u(p pVar, int i) {
        super(pVar);
        this.e = R.drawable.design_password_eye;
        this.g = new a(this, 2);
        if (i != 0) {
            this.e = i;
        }
    }

    @Override // com.gamericefishpro.space.na.q
    public final void b() {
        p();
    }

    @Override // com.gamericefishpro.space.na.q
    public final int c() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.gamericefishpro.space.na.q
    public final int d() {
        return this.e;
    }

    @Override // com.gamericefishpro.space.na.q
    public final View.OnClickListener f() {
        return this.g;
    }

    @Override // com.gamericefishpro.space.na.q
    public final boolean j() {
        return true;
    }

    @Override // com.gamericefishpro.space.na.q
    public final boolean k() {
        EditText editText = this.f;
        return !(editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod));
    }

    @Override // com.gamericefishpro.space.na.q
    public final void l(EditText editText) {
        this.f = editText;
        p();
    }

    @Override // com.gamericefishpro.space.na.q
    public final void q() {
        EditText editText = this.f;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.f.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.gamericefishpro.space.na.q
    public final void r() {
        EditText editText = this.f;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
