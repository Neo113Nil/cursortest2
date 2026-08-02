package defpackage;

import android.animation.AnimatorSet;
import ru.yandex.taxi.logistics.deliveries.map.search.TwoPulsingCirclesView;

/* loaded from: classes14.dex */
public final /* synthetic */ class t1e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AnimatorSet b;

    public /* synthetic */ t1e0(AnimatorSet animatorSet, int i) {
        this.a = i;
        this.b = animatorSet;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AnimatorSet animatorSet = this.b;
        switch (i) {
            case 0:
                animatorSet.start();
                break;
            case 1:
                animatorSet.start();
                break;
            default:
                TwoPulsingCirclesView.createAnimatorSet$lambda$0$0(animatorSet);
                break;
        }
    }
}
