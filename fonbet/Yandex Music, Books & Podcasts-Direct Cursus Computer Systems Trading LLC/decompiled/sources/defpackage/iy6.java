package defpackage;

import android.graphics.RectF;
import android.graphics.drawable.Drawable;

/* loaded from: classes3.dex */
public final class iy6 extends mdh {
    public final RectF s;

    public iy6(iy6 iy6Var) {
        super(iy6Var);
        this.s = iy6Var.s;
    }

    @Override // defpackage.mdh, android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        jy6 jy6Var = new jy6(this);
        jy6Var.H = this;
        jy6Var.invalidateSelf();
        return jy6Var;
    }

    public iy6(eup eupVar, RectF rectF) {
        super(eupVar);
        this.s = rectF;
    }
}
