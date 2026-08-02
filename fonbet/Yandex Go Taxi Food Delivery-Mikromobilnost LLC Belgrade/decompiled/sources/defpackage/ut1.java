package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import ru.yandex.taxi.order.view.AllRatingReasonsView;

/* loaded from: classes6.dex */
public final /* synthetic */ class ut1 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup.LayoutParams b;
    public final /* synthetic */ AllRatingReasonsView c;

    public /* synthetic */ ut1(ViewGroup.LayoutParams layoutParams, AllRatingReasonsView allRatingReasonsView, int i) {
        this.a = i;
        this.b = layoutParams;
        this.c = allRatingReasonsView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        AllRatingReasonsView allRatingReasonsView = this.c;
        ViewGroup.LayoutParams layoutParams = this.b;
        switch (i) {
            case 0:
                AllRatingReasonsView.expandReasonsContainer$lambda$0(layoutParams, allRatingReasonsView, valueAnimator);
                break;
            default:
                AllRatingReasonsView.collapseReasonsContainer$lambda$0(layoutParams, allRatingReasonsView, valueAnimator);
                break;
        }
    }
}
