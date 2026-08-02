package defpackage;

import android.animation.ValueAnimator;

/* loaded from: classes3.dex */
public final /* synthetic */ class muq implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ quq b;

    public /* synthetic */ muq(quq quqVar, int i) {
        this.a = i;
        this.b = quqVar;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        quq quqVar = this.b;
        switch (i) {
            case 0:
                int i2 = quq.I;
                Object animatedValue = valueAnimator.getAnimatedValue();
                animatedValue.getClass();
                quqVar.s = ((Float) animatedValue).floatValue();
                quqVar.postInvalidateOnAnimation();
                break;
            default:
                int i3 = quq.I;
                Object animatedValue2 = valueAnimator.getAnimatedValue();
                animatedValue2.getClass();
                quqVar.v = (Float) animatedValue2;
                quqVar.postInvalidateOnAnimation();
                break;
        }
    }
}
