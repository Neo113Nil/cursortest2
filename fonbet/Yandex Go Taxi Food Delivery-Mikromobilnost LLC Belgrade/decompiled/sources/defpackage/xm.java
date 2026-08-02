package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import com.yandex.go.taxi.order.feedback.ui.AchievementsView;

/* loaded from: classes14.dex */
public final /* synthetic */ class xm implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ ViewGroup.LayoutParams b;
    public final /* synthetic */ AchievementsView c;

    public /* synthetic */ xm(ViewGroup.LayoutParams layoutParams, AchievementsView achievementsView, int i) {
        this.a = i;
        this.b = layoutParams;
        this.c = achievementsView;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        AchievementsView achievementsView = this.c;
        ViewGroup.LayoutParams layoutParams = this.b;
        switch (i) {
            case 0:
                AchievementsView.expandReasonsContainer$lambda$0(layoutParams, achievementsView, valueAnimator);
                break;
            default:
                AchievementsView.collapseReasonsContainer$lambda$0(layoutParams, achievementsView, valueAnimator);
                break;
        }
    }
}
