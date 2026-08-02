package ru.yandex.taxi.masstransit.router;

import defpackage.e631;
import defpackage.g18;
import defpackage.gy30;
import defpackage.h55;
import defpackage.hxx;
import defpackage.iy30;
import defpackage.iz1;
import defpackage.lx4;
import defpackage.mf00;
import defpackage.ny30;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.sq30;
import defpackage.sy00;
import defpackage.tje;
import defpackage.tq30;
import defpackage.tse;
import defpackage.x3g;
import defpackage.zgf;
import defpackage.zy11;
import defpackage.zz2;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.masstransit.domain.g0;

/* loaded from: classes6.dex */
public final class i extends h55 {
    public final gy30 D;
    public final tq30 E;
    public final ru.yandex.taxi.masstransit.address.interactor.i F;
    public final zz2 G;
    public final ru.yandex.taxi.masstransit.deeplink.g H;
    public final e631 I;
    public final tse J;
    public final sy00 K;
    public x3g L;

    public i(gy30 gy30Var, tq30 tq30Var, ru.yandex.taxi.masstransit.address.interactor.i iVar, zz2 zz2Var, ru.yandex.taxi.masstransit.deeplink.g gVar, e631 e631Var, tse tseVar, sy00 sy00Var) {
        super(null);
        this.D = gy30Var;
        this.E = tq30Var;
        this.F = iVar;
        this.G = zz2Var;
        this.H = gVar;
        this.I = e631Var;
        this.J = tseVar;
        this.K = sy00Var;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        ru.yandex.taxi.masstransit.overlay.d dVar = (ru.yandex.taxi.masstransit.overlay.d) this.I;
        pzt0 pzt0Var = dVar.f;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        dVar.e.clear();
        tje.N(this.J, null, null, new MtRoutesRootRouterImpl$onDismiss$1(this, null), 3);
        g0 g0Var = (g0) P().v.get();
        ((ru.yandex.taxi.map_common.style.source.e) g0Var.b).b();
        g0Var.g.cancel();
        g0Var.g = g18.u1;
        sy00 sy00Var = this.K;
        lx4 lx4Var = sy00Var.a;
        ((ru.yandex.taxi.analytics.j) lx4Var).m.o.remove(sy00Var.g);
        this.L = null;
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        sy00 sy00Var = this.K;
        lx4 lx4Var = sy00Var.a;
        ((ru.yandex.taxi.analytics.j) lx4Var).m.o.add(sy00Var.g);
        tje.N(o(), null, null, new MtRoutesRootRouterImpl$onLaunch$1((iy30) obj, this, null), 3);
        tje.N(o(), null, null, new MtRoutesRootRouterImpl$onLaunch$2(this, null), 3);
        Q();
    }

    public final x3g P() {
        Object value;
        sq30 sq30Var;
        x3g x3gVar = this.L;
        if (x3gVar != null) {
            return x3gVar;
        }
        r0 r0Var = this.E.a;
        do {
            value = r0Var.getValue();
            sq30Var = (sq30) value;
        } while (!r0Var.k(value, null));
        gy30 gy30Var = this.D;
        gy30Var.getClass();
        this.G.getClass();
        x3g x3gVar2 = new x3g(gy30Var, sq30Var);
        this.L = x3gVar2;
        return x3gVar2;
    }

    public final void Q() {
        x3g P = P();
        gy30 gy30Var = P.a;
        mf00 mf00Var = gy30Var.B0;
        q5z.h(mf00Var);
        zgf zgfVar = new zgf(8, P.c);
        com.yandex.go.mainscreen.superapp.impl.fragment.a aVar = gy30Var.z0;
        q5z.h(aVar);
        com.yandex.go.preorder.navigation.g gVar = gy30Var.A0;
        q5z.h(gVar);
        E(new iz1(mf00Var, zgfVar, aVar, gVar, 2), zy11.a, new ny30(this), hxx.a);
    }
}
