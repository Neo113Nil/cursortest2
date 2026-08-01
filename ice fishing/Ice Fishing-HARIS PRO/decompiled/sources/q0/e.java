package q0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final Drawable.ConstantState f4244a;

    public e(Drawable.ConstantState constantState) {
        this.f4244a = constantState;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        return this.f4244a.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f4244a.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        f fVar = new f(null);
        Drawable newDrawable = this.f4244a.newDrawable();
        fVar.f4249a = newDrawable;
        newDrawable.setCallback(fVar.f4248f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        f fVar = new f(null);
        Drawable newDrawable = this.f4244a.newDrawable(resources);
        fVar.f4249a = newDrawable;
        newDrawable.setCallback(fVar.f4248f);
        return fVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources, Resources.Theme theme) {
        f fVar = new f(null);
        Drawable newDrawable = this.f4244a.newDrawable(resources, theme);
        fVar.f4249a = newDrawable;
        newDrawable.setCallback(fVar.f4248f);
        return fVar;
    }
}
