package y;

import android.view.WindowInsets;

/* loaded from: classes.dex */
public class K extends J {

    /* renamed from: m, reason: collision with root package name */
    public r.c f8559m;

    public K(Q q2, WindowInsets windowInsets) {
        super(q2, windowInsets);
        this.f8559m = null;
    }

    @Override // y.O
    public Q b() {
        return Q.a(this.f8554c.consumeStableInsets(), null);
    }

    @Override // y.O
    public Q c() {
        return Q.a(this.f8554c.consumeSystemWindowInsets(), null);
    }

    @Override // y.O
    public final r.c g() {
        if (this.f8559m == null) {
            WindowInsets windowInsets = this.f8554c;
            this.f8559m = r.c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f8559m;
    }

    @Override // y.O
    public boolean k() {
        return this.f8554c.isConsumed();
    }

    @Override // y.O
    public void p(r.c cVar) {
        this.f8559m = cVar;
    }
}
