package defpackage;

import android.animation.AnimatorSet;
import ru.yandex.taxi.order.search.ui.bubbles.PollingBubblesViewImpl;

/* loaded from: classes14.dex */
public final /* synthetic */ class s1e0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ st0 b;

    public /* synthetic */ s1e0(st0 st0Var, int i) {
        this.a = i;
        this.b = st0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        st0 st0Var = this.b;
        switch (i) {
            case 0:
                w4e0 w4e0Var = ((z1e0) st0Var.a).a.e;
                if (w4e0Var != null) {
                    ((xm00) st0Var.b).o(w4e0Var);
                }
                ((PollingBubblesViewImpl) st0Var.w).hidePollingBubble();
                break;
            default:
                AnimatorSet animatorSet = (AnimatorSet) st0Var.D;
                if (animatorSet != null) {
                    animatorSet.start();
                    break;
                }
                break;
        }
    }
}
