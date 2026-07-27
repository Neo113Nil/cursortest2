package O;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class x0 extends w0 {

    /* renamed from: q, reason: collision with root package name */
    public static final A0 f2337q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f2337q = A0.h(null, windowInsets);
    }

    public x0(A0 a02, WindowInsets windowInsets) {
        super(a02, windowInsets);
    }

    @Override // O.t0, O.y0
    public G.e f(int i) {
        Insets insets;
        insets = this.f2325c.getInsets(z0.a(i));
        return G.e.c(insets);
    }

    @Override // O.t0, O.y0
    public final void d(View view) {
    }
}
