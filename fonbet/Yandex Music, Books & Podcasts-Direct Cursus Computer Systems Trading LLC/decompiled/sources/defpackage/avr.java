package defpackage;

import android.view.animation.Animation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class avr implements Animation.AnimationListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ SwipeRefreshLayout b;

    public /* synthetic */ avr(SwipeRefreshLayout swipeRefreshLayout, int i) {
        this.a = i;
        this.b = swipeRefreshLayout;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        dvr dvrVar;
        switch (this.a) {
            case 0:
                SwipeRefreshLayout swipeRefreshLayout = this.b;
                if (!swipeRefreshLayout.c) {
                    swipeRefreshLayout.l();
                    break;
                } else {
                    swipeRefreshLayout.z.setAlpha(KotlinVersion.MAX_COMPONENT_VALUE);
                    swipeRefreshLayout.z.start();
                    if (swipeRefreshLayout.E && (dvrVar = swipeRefreshLayout.b) != null) {
                        dvrVar.a();
                    }
                    swipeRefreshLayout.n = swipeRefreshLayout.t.getTop();
                    break;
                }
                break;
            default:
                SwipeRefreshLayout swipeRefreshLayout2 = this.b;
                bvr bvrVar = new bvr(swipeRefreshLayout2, 1);
                swipeRefreshLayout2.B = bvrVar;
                bvrVar.setDuration(150L);
                il4 il4Var = swipeRefreshLayout2.t;
                il4Var.a = null;
                il4Var.clearAnimation();
                swipeRefreshLayout2.t.startAnimation(swipeRefreshLayout2.B);
                break;
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        int i = this.a;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        int i = this.a;
    }

    private final void a(Animation animation) {
    }

    private final void b(Animation animation) {
    }

    private final void c(Animation animation) {
    }

    private final void d(Animation animation) {
    }
}
