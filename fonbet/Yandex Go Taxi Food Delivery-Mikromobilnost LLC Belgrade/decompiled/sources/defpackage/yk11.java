package defpackage;

import android.animation.ValueAnimator;
import ru.yandex.taxi.logistics.deliveries.map.search.TwoPulsingCirclesView;

/* loaded from: classes14.dex */
public final /* synthetic */ class yk11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoPulsingCirclesView b;

    public /* synthetic */ yk11(TwoPulsingCirclesView twoPulsingCirclesView, int i) {
        this.a = i;
        this.b = twoPulsingCirclesView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        TwoPulsingCirclesView twoPulsingCirclesView = this.b;
        switch (i) {
            case 0:
                TwoPulsingCirclesView.disappearAnimation$lambda$0(twoPulsingCirclesView, valueAnimator);
                break;
            case 1:
                TwoPulsingCirclesView.disappearAnimation$lambda$1(twoPulsingCirclesView, valueAnimator);
                break;
            case 2:
                TwoPulsingCirclesView.disappearAnimation$lambda$2(twoPulsingCirclesView, valueAnimator);
                break;
            case 3:
                TwoPulsingCirclesView.appearAnimation$lambda$0(twoPulsingCirclesView, valueAnimator);
                break;
            case 4:
                TwoPulsingCirclesView.appearAnimation$lambda$1(twoPulsingCirclesView, valueAnimator);
                break;
            case 5:
                TwoPulsingCirclesView.appearAnimation$lambda$2(twoPulsingCirclesView, valueAnimator);
                break;
            case 6:
                TwoPulsingCirclesView.constrictionAnimation$lambda$0(twoPulsingCirclesView, valueAnimator);
                break;
            default:
                TwoPulsingCirclesView.constrictionAnimation$lambda$1(twoPulsingCirclesView, valueAnimator);
                break;
        }
    }
}
