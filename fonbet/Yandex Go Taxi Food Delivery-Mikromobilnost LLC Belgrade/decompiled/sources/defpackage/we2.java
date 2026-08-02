package defpackage;

import android.animation.ValueAnimator;
import ru.yandex.taxi.widget.AnimatedCircularHoleFogView;

/* loaded from: classes6.dex */
public final /* synthetic */ class we2 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnimatedCircularHoleFogView b;

    public /* synthetic */ we2(AnimatedCircularHoleFogView animatedCircularHoleFogView, int i) {
        this.a = i;
        this.b = animatedCircularHoleFogView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        AnimatedCircularHoleFogView animatedCircularHoleFogView = this.b;
        switch (i) {
            case 0:
                AnimatedCircularHoleFogView.getRadiusAnimator$lambda$0(animatedCircularHoleFogView, valueAnimator);
                break;
            default:
                AnimatedCircularHoleFogView.getStaticFogAnimator$lambda$0$0(animatedCircularHoleFogView, valueAnimator);
                break;
        }
    }
}
