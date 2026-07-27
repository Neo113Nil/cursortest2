package q2;

import com.google.android.gms.internal.ads.C2635Kc;

/* loaded from: classes.dex */
public final class b1 extends AbstractBinderC4919z {

    /* renamed from: n, reason: collision with root package name */
    public final k2.x f40090n;

    /* renamed from: u, reason: collision with root package name */
    public final C2635Kc f40091u;

    public b1(k2.x xVar, C2635Kc c2635Kc) {
        this.f40090n = xVar;
        this.f40091u = c2635Kc;
    }

    @Override // q2.InterfaceC4868A
    public final void P1(C4920z0 c4920z0) {
        k2.x xVar = this.f40090n;
        if (xVar != null) {
            xVar.onAdFailedToLoad(c4920z0.b());
        }
    }

    @Override // q2.InterfaceC4868A
    public final void t() {
        C2635Kc c2635Kc;
        k2.x xVar = this.f40090n;
        if (xVar == null || (c2635Kc = this.f40091u) == null) {
            return;
        }
        xVar.onAdLoaded(c2635Kc);
    }
}
