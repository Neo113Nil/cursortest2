package defpackage;

import android.view.animation.DecelerateInterpolator;
import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.order.search.ui.bubbles.PollingBubblesViewImpl;

/* loaded from: classes14.dex */
public final class v1e0 {
    public final ah00 a;
    public final PollingBubblesViewImpl b;
    public final uz8 c;
    public final xm00 d;
    public final ys0 e;
    public int f;
    public final i3y g = a.b(LazyThreadSafetyMode.NONE, new yud0(7));
    public final DecelerateInterpolator h = new DecelerateInterpolator();
    public final float i;

    public v1e0(ah00 ah00Var, PollingBubblesViewImpl pollingBubblesViewImpl, uz8 uz8Var, xm00 xm00Var, ys0 ys0Var, int i, zuj0 zuj0Var) {
        this.a = ah00Var;
        this.b = pollingBubblesViewImpl;
        this.c = uz8Var;
        this.d = xm00Var;
        this.e = ys0Var;
        this.f = i;
        this.i = ((avj0) zuj0Var).b(wug0.car_track_length);
    }
}
