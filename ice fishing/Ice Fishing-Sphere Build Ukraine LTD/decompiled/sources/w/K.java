package w;

import android.view.WindowInsets;
import p.C0225c;

/* loaded from: classes.dex */
public class K extends J {

    /* renamed from: m, reason: collision with root package name */
    public C0225c f3037m;

    public K(S s2, WindowInsets windowInsets) {
        super(s2, windowInsets);
        this.f3037m = null;
    }

    @Override // w.P
    public S b() {
        return S.a(this.f3032c.consumeStableInsets(), null);
    }

    @Override // w.P
    public S c() {
        return S.a(this.f3032c.consumeSystemWindowInsets(), null);
    }

    @Override // w.P
    public final C0225c g() {
        if (this.f3037m == null) {
            WindowInsets windowInsets = this.f3032c;
            this.f3037m = C0225c.a(windowInsets.getStableInsetLeft(), windowInsets.getStableInsetTop(), windowInsets.getStableInsetRight(), windowInsets.getStableInsetBottom());
        }
        return this.f3037m;
    }

    @Override // w.P
    public boolean k() {
        return this.f3032c.isConsumed();
    }

    @Override // w.P
    public void p(C0225c c0225c) {
        this.f3037m = c0225c;
    }
}
