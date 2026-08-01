package E0;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class e extends Drawable.ConstantState {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f663a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f664b;

    public /* synthetic */ e(int i, Object obj) {
        this.f663a = i;
        this.f664b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.f663a) {
            case 0:
                return ((Drawable.ConstantState) this.f664b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.f663a) {
            case 0:
                return ((Drawable.ConstantState) this.f664b).getChangingConfigurations();
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.f663a) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f664b).newDrawable();
                fVar.f670n = newDrawable;
                newDrawable.setCallback(fVar.f669y);
                return fVar;
            default:
                return new F1.c(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        switch (this.f663a) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f664b).newDrawable(resources);
                fVar.f670n = newDrawable;
                newDrawable.setCallback(fVar.f669y);
                return fVar;
            default:
                return new F1.c(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.f663a) {
            case 0:
                f fVar = new f(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.f664b).newDrawable(resources, theme);
                fVar.f670n = newDrawable;
                newDrawable.setCallback(fVar.f669y);
                return fVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
