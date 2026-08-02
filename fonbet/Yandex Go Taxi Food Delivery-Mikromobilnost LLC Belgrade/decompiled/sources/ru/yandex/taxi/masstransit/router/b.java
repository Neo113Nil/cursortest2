package ru.yandex.taxi.masstransit.router;

import defpackage.af30;
import defpackage.ah00;
import defpackage.avv0;
import defpackage.ck31;
import defpackage.cyx;
import defpackage.dp30;
import defpackage.fp30;
import defpackage.h3y;
import defpackage.h55;
import defpackage.i3g;
import defpackage.i6r;
import defpackage.ji30;
import defpackage.m010;
import defpackage.mi30;
import defpackage.nv20;
import defpackage.oep0;
import defpackage.pj40;
import defpackage.pzt0;
import defpackage.qoi0;
import defpackage.rp60;
import defpackage.s440;
import defpackage.tje;
import defpackage.tse;
import defpackage.ysd0;
import defpackage.yvf0;
import defpackage.yz4;
import defpackage.zh0;
import defpackage.ztv0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.common_models.net.map_object.t;

/* loaded from: classes6.dex */
public final class b extends h55 {
    public final tse D;
    public final af30 E;
    public final yz4 F;
    public final ysd0 G;
    public final oep0 H;
    public final h3y I;
    public final i6r J;
    public final yvf0 K;
    public final avv0 L;
    public final rp60 M;
    public final ru.yandex.taxi.masstransit.address.interactor.i N;
    public final s440 O;
    public final ck31 P;
    public final nv20 Q;
    public pzt0 R;
    public pzt0 S;
    public pzt0 T;
    public i3g U;
    public ru.yandex.taxi.masstransit.overlay.a V;

    public b(tse tseVar, af30 af30Var, yz4 yz4Var, ysd0 ysd0Var, oep0 oep0Var, h3y h3yVar, i6r i6rVar, yvf0 yvf0Var, avv0 avv0Var, rp60 rp60Var, ru.yandex.taxi.masstransit.address.interactor.i iVar, s440 s440Var, ck31 ck31Var, nv20 nv20Var) {
        super(null);
        this.D = tseVar;
        this.E = af30Var;
        this.F = yz4Var;
        this.G = ysd0Var;
        this.H = oep0Var;
        this.I = h3yVar;
        this.J = i6rVar;
        this.K = yvf0Var;
        this.L = avv0Var;
        this.M = rp60Var;
        this.N = iVar;
        this.O = s440Var;
        this.P = ck31Var;
        this.Q = nv20Var;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        tje.N(o(), null, null, new MtDiscoveryMapOverlayRouterImpl$onAttach$1(this, null), 3);
    }

    @Override // defpackage.h55
    public final void H(Object obj) {
        pzt0 pzt0Var = this.S;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        this.S = null;
        pzt0 pzt0Var2 = this.R;
        if (pzt0Var2 != null) {
            pzt0Var2.a(null);
        }
        this.R = null;
        ru.yandex.taxi.masstransit.overlay.a aVar = this.V;
        if (aVar != null) {
            aVar.detach();
        }
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        ((ru.yandex.taxi.map_common.b) this.G).b(t.class);
        this.T = tje.N(this.D, null, null, new MtDiscoveryMapOverlayRouterImpl$onDismiss$1(this, null), 3);
        this.L.b(qoi0.a(ru.yandex.taxi.masstransit.overlay.a.class));
        r0 r0Var = this.M.b;
        Boolean bool = Boolean.FALSE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        mi30 mi30Var = new mi30(this);
        i6r i6rVar = this.J;
        i6rVar.getClass();
        i3g i3gVar = new i3g(i6rVar, pj40.c, mi30Var);
        zh0 zh0Var = this.E.a;
        this.V = new ru.yandex.taxi.masstransit.overlay.a(i3gVar, (m010) zh0Var.a.get(), (ztv0) zh0Var.b.get(), (cyx) zh0Var.c.get(), (ah00) zh0Var.d.get());
        this.U = i3gVar;
        pzt0 pzt0Var = this.T;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        tje.N(o(), null, null, new MtDiscoveryMapOverlayRouterImpl$onLaunch$3(this, null), 3);
        ((ru.yandex.taxi.map_common.b) this.G).a(t.class, new a(this));
        r0 r0Var = this.M.b;
        Boolean bool = Boolean.TRUE;
        r0Var.getClass();
        r0Var.m(null, bool);
    }

    public final void P(dp30 dp30Var) {
        fp30 fp30Var;
        i3g i3gVar = this.U;
        if (i3gVar == null || (fp30Var = (fp30) i3gVar.f.get()) == null) {
            return;
        }
        D(fp30Var, dp30Var, new ji30(dp30Var, this));
        this.F.d();
        this.L.a(qoi0.a(ru.yandex.taxi.masstransit.overlay.a.class));
    }
}
