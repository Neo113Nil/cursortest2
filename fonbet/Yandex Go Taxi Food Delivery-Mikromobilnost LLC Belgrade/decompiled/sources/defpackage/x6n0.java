package defpackage;

import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuWebViewOpenReason;
import com.yandex.go.scooters.offers.v2.g;

/* loaded from: classes13.dex */
public final class x6n0 implements ujn0 {
    public final /* synthetic */ h7n0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ g c;

    public x6n0(h7n0 h7n0Var, boolean z, g gVar) {
        this.a = h7n0Var;
        this.b = z;
        this.c = gVar;
    }

    @Override // defpackage.ujn0
    public final void Q0() {
        n6n0.a(this.a, null, null, 3);
    }

    @Override // defpackage.sy60
    public final void a() {
        if (this.b) {
            this.c.r(new qu(9));
        }
    }

    @Override // defpackage.ujn0
    public final void c() {
        this.a.d();
    }

    @Override // defpackage.ujn0
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.ujn0
    public final void l0() {
        this.a.d();
    }

    @Override // defpackage.ujn0
    public final void z() {
        izn0 izn0Var = new izn0(ScootersMosRuWebViewOpenReason.DEEPLINK);
        g gVar = this.a.b;
        gVar.A((m950) gVar.M.get(), new lzn0(izn0Var), new u6n0(0));
    }
}
