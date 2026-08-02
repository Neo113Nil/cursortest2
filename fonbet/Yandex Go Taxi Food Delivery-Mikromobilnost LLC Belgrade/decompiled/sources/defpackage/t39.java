package defpackage;

import android.animation.ValueAnimator;
import ru.yandex.taxi.plus.badge.CashbackHorizontalView;

/* loaded from: classes6.dex */
public final /* synthetic */ class t39 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CashbackHorizontalView b;

    public /* synthetic */ t39(CashbackHorizontalView cashbackHorizontalView, int i) {
        this.a = i;
        this.b = cashbackHorizontalView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        CashbackHorizontalView cashbackHorizontalView = this.b;
        switch (i) {
            case 0:
                CashbackHorizontalView.expandAndChangeToPromoTextAnimator$lambda$0(cashbackHorizontalView, valueAnimator);
                break;
            case 1:
                CashbackHorizontalView.expandAndChangeToPromoTextAnimator$lambda$1(cashbackHorizontalView, valueAnimator);
                break;
            case 2:
                CashbackHorizontalView.expandAndChangeToPromoTextAnimator$lambda$2(cashbackHorizontalView, valueAnimator);
                break;
            case 3:
                CashbackHorizontalView.collapseAndShowValueTextAnimator$lambda$0(cashbackHorizontalView, valueAnimator);
                break;
            case 4:
                CashbackHorizontalView.collapseAndShowValueTextAnimator$lambda$1(cashbackHorizontalView, valueAnimator);
                break;
            default:
                CashbackHorizontalView.collapseAndShowValueTextAnimator$lambda$2(cashbackHorizontalView, valueAnimator);
                break;
        }
    }
}
