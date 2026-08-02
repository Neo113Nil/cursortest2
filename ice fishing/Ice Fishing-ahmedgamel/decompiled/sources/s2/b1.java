package s2;

import com.google.android.gms.internal.ads.C2655Kc;

/* loaded from: classes.dex */
public final class b1 extends AbstractBinderC4968z {

    /* renamed from: n, reason: collision with root package name */
    public final m2.x f40392n;

    /* renamed from: u, reason: collision with root package name */
    public final C2655Kc f40393u;

    public b1(m2.x xVar, C2655Kc c2655Kc) {
        this.f40392n = xVar;
        this.f40393u = c2655Kc;
    }

    @Override // s2.InterfaceC4917A
    public final void r2(C4969z0 c4969z0) {
        m2.x xVar = this.f40392n;
        if (xVar != null) {
            xVar.onAdFailedToLoad(c4969z0.b());
        }
    }

    @Override // s2.InterfaceC4917A
    public final void t() {
        C2655Kc c2655Kc;
        m2.x xVar = this.f40392n;
        if (xVar == null || (c2655Kc = this.f40393u) == null) {
            return;
        }
        xVar.onAdLoaded(c2655Kc);
    }
}
