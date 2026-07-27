package w;

import android.view.WindowInsets;
import p.C0224c;

/* loaded from: classes.dex */
public class K extends J {

    /* renamed from: m, reason: collision with root package name */
    public C0224c f3032m;

    public K(S s2, WindowInsets windowInsets) {
        super(s2, windowInsets);
        this.f3032m = null;
    }

    @Override // w.P
    public S b() {
        return S.a(this.f3027c.consumeStableInsets(), null);
    }

    @Override // w.P
    public S c() {
        return S.a(this.f3027c.consumeSystemWindowInsets(), null);
    }

    @Override // w.P
    public final C0224c g() {
        if (this.f3032m == null) {
            WindowInsets windowInsets = this.f3027c;
            this.f3032m = C0224c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f3032m;
    }

    @Override // w.P
    public boolean k() {
        return this.f3027c.isConsumed();
    }

    @Override // w.P
    public void p(C0224c c0224c) {
        this.f3032m = c0224c;
    }
}
