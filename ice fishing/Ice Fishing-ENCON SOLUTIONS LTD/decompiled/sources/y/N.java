package y;

import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class N extends M {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f8563q = 0;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        Q.a(windowInsets, null);
    }

    public N(Q q2, WindowInsets windowInsets) {
        super(q2, windowInsets);
    }

    @Override // y.J, y.O
    public boolean m(int i2) {
        boolean isVisible;
        isVisible = this.f8554c.isVisible(P.a(i2));
        return isVisible;
    }

    @Override // y.J, y.O
    public final void d(View view) {
    }
}
