package E0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f643a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f644b;

    public /* synthetic */ e(int i, Object obj) {
        this.f643a = i;
        this.f644b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f643a) {
            case 0:
                return ((Drawable.ConstantState) this.f644b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f643a) {
            case 0:
                return ((Drawable.ConstantState) this.f644b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f643a) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f644b).newDrawable();
                fVar.f650n = newDrawable;
                newDrawable.setCallback(fVar.f649y);
                return fVar;
            default:
                return new H1.c(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f643a) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f644b).newDrawable(resources);
                fVar.f650n = newDrawable;
                newDrawable.setCallback(fVar.f649y);
                return fVar;
            default:
                return new H1.c(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f643a) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f644b).newDrawable(resources, theme);
                fVar.f650n = newDrawable;
                newDrawable.setCallback(fVar.f649y);
                return fVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
