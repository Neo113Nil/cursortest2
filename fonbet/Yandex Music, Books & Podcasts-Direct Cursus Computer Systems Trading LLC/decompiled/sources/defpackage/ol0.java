package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* loaded from: classes.dex */
public final class ol0 extends Drawable.ConstantState {
    public final /* synthetic */ int a;
    public final Object b;

    public ol0(yc3 yc3Var) {
        this.a = 1;
        this.b = yc3Var;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            case 1:
                return 0;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                pl0 pl0Var = new pl0(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                pl0Var.a = newDrawable;
                newDrawable.setCallback(pl0Var.f);
                return pl0Var;
            case 1:
            default:
                return super.newDrawable(resources);
            case 2:
                return new pcd(this);
        }
    }

    public /* synthetic */ ol0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        switch (this.a) {
            case 0:
                pl0 pl0Var = new pl0(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable();
                pl0Var.a = newDrawable;
                newDrawable.setCallback(pl0Var.f);
                return pl0Var;
            case 1:
                return (yc3) this.b;
            default:
                return new pcd(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                pl0 pl0Var = new pl0(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                pl0Var.a = newDrawable;
                newDrawable.setCallback(pl0Var.f);
                return pl0Var;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
