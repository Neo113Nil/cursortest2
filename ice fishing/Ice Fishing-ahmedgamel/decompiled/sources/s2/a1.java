package s2;

/* loaded from: classes.dex */
public final class a1 extends AbstractBinderC4962w {

    /* renamed from: n, reason: collision with root package name */
    public final m2.c f40388n;

    public a1(m2.c cVar) {
        this.f40388n = cVar;
    }

    @Override // s2.InterfaceC4964x
    public final void M(C4969z0 c4969z0) {
        m2.c cVar = this.f40388n;
        if (cVar != null) {
            cVar.onAdFailedToLoad(c4969z0.b());
        }
    }

    @Override // s2.InterfaceC4964x
    public final void d() {
        m2.c cVar = this.f40388n;
        if (cVar != null) {
            cVar.onAdLoaded();
        }
    }

    @Override // s2.InterfaceC4964x
    public final void e() {
        m2.c cVar = this.f40388n;
        if (cVar != null) {
            cVar.onAdOpened();
        }
    }

    @Override // s2.InterfaceC4964x
    public final void g() {
        m2.c cVar = this.f40388n;
        if (cVar != null) {
            cVar.onAdSwipeGestureClicked();
        }
    }

    @Override // s2.InterfaceC4964x
    public final void h() {
        m2.c cVar = this.f40388n;
        if (cVar != null) {
            cVar.onAdClicked();
        }
    }

    @Override // s2.InterfaceC4964x
    public final void n() {
        m2.c cVar = this.f40388n;
        if (cVar != null) {
            cVar.onAdImpression();
        }
    }

    @Override // s2.InterfaceC4964x
    public final void t() {
        m2.c cVar = this.f40388n;
        if (cVar != null) {
            cVar.onAdClosed();
        }
    }

    @Override // s2.InterfaceC4964x
    public final void o() {
    }

    @Override // s2.InterfaceC4964x
    public final void x(int i) {
    }
}
