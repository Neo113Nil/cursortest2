package O;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class d0 extends c0 {

    /* renamed from: m, reason: collision with root package name */
    public G.c f801m;

    public d0(j0 j0Var, WindowInsets windowInsets) {
        super(j0Var, windowInsets);
        this.f801m = null;
    }

    @Override // O.h0
    public j0 b() {
        return j0.g(null, this.f792c.consumeStableInsets());
    }

    @Override // O.h0
    public j0 c() {
        return j0.g(null, this.f792c.consumeSystemWindowInsets());
    }

    @Override // O.h0
    public final G.c h() {
        if (this.f801m == null) {
            WindowInsets windowInsets = this.f792c;
            this.f801m = G.c.b(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f801m;
    }

    @Override // O.h0
    public boolean m() {
        return this.f792c.isConsumed();
    }

    @Override // O.h0
    public void q(G.c cVar) {
        this.f801m = cVar;
    }
}
