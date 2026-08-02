package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;

/* loaded from: classes.dex */
public final class jzt extends Drawable.ConstantState {
    public final Drawable.ConstantState a;

    public jzt(Drawable.ConstantState constantState) {
        this.a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        return this.a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        kzt kztVar = new kzt();
        kztVar.a = (VectorDrawable) this.a.newDrawable();
        return kztVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        kzt kztVar = new kzt();
        kztVar.a = (VectorDrawable) this.a.newDrawable(resources);
        return kztVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        kzt kztVar = new kzt();
        kztVar.a = (VectorDrawable) this.a.newDrawable(resources, theme);
        return kztVar;
    }
}
