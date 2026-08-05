package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class kf0 extends Drawable.ConstantState {
    public final Drawable.ConstantState qoPGr6Ce;

    public kf0(Drawable.ConstantState constantState) {
        this.qoPGr6Ce = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.qoPGr6Ce.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.qoPGr6Ce.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        lf0 lf0Var = new lf0();
        lf0Var.NCTxEWno = (VectorDrawable) this.qoPGr6Ce.newDrawable();
        return lf0Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        lf0 lf0Var = new lf0();
        lf0Var.NCTxEWno = (VectorDrawable) this.qoPGr6Ce.newDrawable(resources);
        return lf0Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        lf0 lf0Var = new lf0();
        lf0Var.NCTxEWno = (VectorDrawable) this.qoPGr6Ce.newDrawable(resources, theme);
        return lf0Var;
    }
}
