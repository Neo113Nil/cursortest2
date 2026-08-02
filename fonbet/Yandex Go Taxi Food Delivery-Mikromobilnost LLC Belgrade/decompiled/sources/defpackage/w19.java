package defpackage;

import android.animation.ValueAnimator;
import ru.yandex.taxi.plus.badge.CashbackAmountView;

/* loaded from: classes6.dex */
public final /* synthetic */ class w19 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ CashbackAmountView b;

    public /* synthetic */ w19(CashbackAmountView cashbackAmountView, int i) {
        this.a = i;
        this.b = cashbackAmountView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        CashbackAmountView cashbackAmountView = this.b;
        switch (i) {
            case 0:
                CashbackAmountView.widthAnimator$lambda$0(cashbackAmountView, valueAnimator);
                break;
            case 1:
                CashbackAmountView.singlePromoTextAnimators$lambda$0(cashbackAmountView, valueAnimator);
                break;
            case 2:
                CashbackAmountView.singlePromoTextAnimators$lambda$1(cashbackAmountView, valueAnimator);
                break;
            default:
                cashbackAmountView.onTextAnimationUpdate(valueAnimator);
                break;
        }
    }
}
