package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class j8OPu0Ny extends Drawable.ConstantState {
    public final Drawable.ConstantState qoPGr6Ce;

    public j8OPu0Ny(Drawable.ConstantState constantState) {
        this.qoPGr6Ce = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.qoPGr6Ce.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.qoPGr6Ce.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        zgcfmssZ zgcfmssz = new zgcfmssZ(null);
        Drawable newDrawable = this.qoPGr6Ce.newDrawable();
        zgcfmssz.NCTxEWno = newDrawable;
        newDrawable.setCallback(zgcfmssz.b2ZJblxo);
        return zgcfmssz;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        zgcfmssZ zgcfmssz = new zgcfmssZ(null);
        Drawable newDrawable = this.qoPGr6Ce.newDrawable(resources);
        zgcfmssz.NCTxEWno = newDrawable;
        newDrawable.setCallback(zgcfmssz.b2ZJblxo);
        return zgcfmssz;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        zgcfmssZ zgcfmssz = new zgcfmssZ(null);
        Drawable newDrawable = this.qoPGr6Ce.newDrawable(resources, theme);
        zgcfmssz.NCTxEWno = newDrawable;
        newDrawable.setCallback(zgcfmssz.b2ZJblxo);
        return zgcfmssz;
    }
}
