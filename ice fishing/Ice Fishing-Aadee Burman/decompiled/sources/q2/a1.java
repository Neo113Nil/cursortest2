package q2;

/* loaded from: classes.dex */
public final class a1 extends AbstractBinderC4913w {

    /* renamed from: n, reason: collision with root package name */
    public final k2.c f40086n;

    public a1(k2.c cVar) {
        this.f40086n = cVar;
    }

    @Override // q2.InterfaceC4915x
    public final void G(C4920z0 c4920z0) {
        k2.c cVar = this.f40086n;
        if (cVar != null) {
            cVar.onAdFailedToLoad(c4920z0.b());
        }
    }

    @Override // q2.InterfaceC4915x
    public final void d() {
        k2.c cVar = this.f40086n;
        if (cVar != null) {
            cVar.onAdLoaded();
        }
    }

    @Override // q2.InterfaceC4915x
    public final void e() {
        k2.c cVar = this.f40086n;
        if (cVar != null) {
            cVar.onAdOpened();
        }
    }

    @Override // q2.InterfaceC4915x
    public final void g() {
        k2.c cVar = this.f40086n;
        if (cVar != null) {
            cVar.onAdSwipeGestureClicked();
        }
    }

    @Override // q2.InterfaceC4915x
    public final void h() {
        k2.c cVar = this.f40086n;
        if (cVar != null) {
            cVar.onAdClicked();
        }
    }

    @Override // q2.InterfaceC4915x
    public final void n() {
        k2.c cVar = this.f40086n;
        if (cVar != null) {
            cVar.onAdImpression();
        }
    }

    @Override // q2.InterfaceC4915x
    public final void t() {
        k2.c cVar = this.f40086n;
        if (cVar != null) {
            cVar.onAdClosed();
        }
    }

    @Override // q2.InterfaceC4915x
    public final void o() {
    }

    @Override // q2.InterfaceC4915x
    public final void x(int i) {
    }
}
