package O;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class u0 extends t0 {

    /* renamed from: m, reason: collision with root package name */
    public G.e f2144m;

    public u0(A0 a02, WindowInsets windowInsets) {
        super(a02, windowInsets);
        this.f2144m = null;
    }

    @Override // O.y0
    public A0 b() {
        return A0.h(null, this.f2139c.consumeStableInsets());
    }

    @Override // O.y0
    public A0 c() {
        return A0.h(null, this.f2139c.consumeSystemWindowInsets());
    }

    @Override // O.y0
    public final G.e h() {
        if (this.f2144m == null) {
            WindowInsets windowInsets = this.f2139c;
            this.f2144m = G.e.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f2144m;
    }

    @Override // O.y0
    public boolean m() {
        return this.f2139c.isConsumed();
    }

    @Override // O.y0
    public void q(G.e eVar) {
        this.f2144m = eVar;
    }
}
