package defpackage;

import android.animation.ValueAnimator;
import com.yandex.go.taxi.order.search.ui.views.TwoPulsingCirclesView;

/* loaded from: classes14.dex */
public final /* synthetic */ class zk11 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ TwoPulsingCirclesView b;

    public /* synthetic */ zk11(TwoPulsingCirclesView twoPulsingCirclesView, int i) {
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
                TwoPulsingCirclesView.constrictionAnimation$lambda$0(twoPulsingCirclesView, valueAnimator);
                break;
            case 4:
                TwoPulsingCirclesView.constrictionAnimation$lambda$1(twoPulsingCirclesView, valueAnimator);
                break;
            case 5:
                TwoPulsingCirclesView.appearAnimation$lambda$0(twoPulsingCirclesView, valueAnimator);
                break;
            case 6:
                TwoPulsingCirclesView.appearAnimation$lambda$1(twoPulsingCirclesView, valueAnimator);
                break;
            default:
                TwoPulsingCirclesView.appearAnimation$lambda$2(twoPulsingCirclesView, valueAnimator);
                break;
        }
    }
}
