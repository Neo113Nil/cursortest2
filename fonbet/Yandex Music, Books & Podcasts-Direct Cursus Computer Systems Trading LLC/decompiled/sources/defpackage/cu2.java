package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes3.dex */
public final class cu2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ju2 b;

    public /* synthetic */ cu2(ju2 ju2Var, int i) {
        this.a = i;
        this.b = ju2Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.a) {
            case 0:
                this.b.i.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iu2 iu2Var = this.b.i;
                iu2Var.setScaleX(floatValue);
                iu2Var.setScaleY(floatValue);
                break;
            case 2:
                this.b.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
            default:
                this.b.i.setTranslationY(((Integer) valueAnimator.getAnimatedValue()).intValue());
                break;
        }
    }
}
