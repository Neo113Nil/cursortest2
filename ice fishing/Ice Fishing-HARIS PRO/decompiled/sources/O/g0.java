package O;

import android.graphics.Insets;
import android.view.View;
import android.view.WindowInsets;

/* loaded from: classes.dex */
public final class g0 extends f0 {

    /* renamed from: q, reason: collision with root package name */
    public static final j0 f807q;

    static {
        WindowInsets windowInsets;
        windowInsets = WindowInsets.CONSUMED;
        f807q = j0.g(null, windowInsets);
    }

    public g0(j0 j0Var, WindowInsets windowInsets) {
        super(j0Var, windowInsets);
    }

    @Override // O.c0, O.h0
    public final void d(View view) {
    }

    @Override // O.c0, O.h0
    public G.c f(int i) {
        Insets insets;
        insets = this.f792c.getInsets(i0.a(i));
        return G.c.c(insets);
    }
}
