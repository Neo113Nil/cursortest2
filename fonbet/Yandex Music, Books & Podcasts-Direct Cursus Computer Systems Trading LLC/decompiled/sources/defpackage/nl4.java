package defpackage;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: classes.dex */
public final class nl4 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public nl4(tuh tuhVar, View[] viewArr) {
        this.b = tuhVar;
        this.c = viewArr;
    }

    public static nl4 a(View... viewArr) {
        return new nl4(new tuh(24), viewArr);
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pl4 pl4Var = (pl4) this.c;
                ol4 ol4Var = (ol4) this.b;
                pl4.d(floatValue, ol4Var);
                pl4Var.a(floatValue, ol4Var, false);
                pl4Var.invalidateSelf();
                break;
            default:
                for (View view : (View[]) this.c) {
                    switch (((tuh) this.b).a) {
                        case 23:
                            view.setTranslationX(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        case 24:
                            view.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                        case 25:
                            Float f = (Float) valueAnimator.getAnimatedValue();
                            view.setScaleX(f.floatValue());
                            view.setScaleY(f.floatValue());
                            break;
                        default:
                            view.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                            break;
                    }
                }
                break;
        }
    }

    public nl4(pl4 pl4Var, ol4 ol4Var) {
        this.c = pl4Var;
        this.b = ol4Var;
    }
}
