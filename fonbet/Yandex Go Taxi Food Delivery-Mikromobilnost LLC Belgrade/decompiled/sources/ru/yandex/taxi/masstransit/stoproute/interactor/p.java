package ru.yandex.taxi.masstransit.stoproute.interactor;

import defpackage.ah00;
import defpackage.b01;
import defpackage.dz00;
import defpackage.f340;
import defpackage.gh00;
import defpackage.m010;
import defpackage.mdh;
import defpackage.n4u0;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.tt2;
import defpackage.uyj;
import kotlinx.coroutines.flow.m0;

/* loaded from: classes6.dex */
public final class p {
    public final ah00 a;
    public final tt2 b;
    public final ru.yandex.taxi.masstransit.stoproute.mapper.a c;
    public final m010 d;
    public final f340 e;
    public final dz00 f;
    public final ru.yandex.taxi.masstransit.overlay.onmap.i g;
    public final b01 h = new b01(21, this);

    public p(ah00 ah00Var, tt2 tt2Var, ru.yandex.taxi.masstransit.stoproute.mapper.a aVar, m010 m010Var, f340 f340Var, dz00 dz00Var, ru.yandex.taxi.masstransit.overlay.onmap.i iVar) {
        this.a = ah00Var;
        this.b = tt2Var;
        this.c = aVar;
        this.d = m010Var;
        this.e = f340Var;
        this.f = dz00Var;
        this.g = iVar;
    }

    public final void a(tse tseVar, n4u0 n4u0Var, String str) {
        dz00 dz00Var = this.f;
        m0 m0Var = new m0(n4u0Var, new c(ru.yandex.taxi.experiments.d.b(dz00Var.a)), new MtStopRouteMapController$initMap$2(this, null));
        this.b.getClass();
        sjh sjhVar = uyj.a;
        tje.N(tseVar, null, null, new MtStopRouteMapController$initMap$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.T(kotlinx.coroutines.flow.e.F(m0Var, mdh.b), 1), null, this.e), 3);
        tje.N(tseVar, null, null, new MtStopRouteMapController$initMap$$inlined$safeCollectIn$2(kotlinx.coroutines.flow.e.T(new e(n4u0Var), 1), null, this, tseVar, n4u0Var), 3);
        ((gh00) this.a).e(this.h);
        tje.N(tseVar, null, null, new MtStopRouteMapController$initMap$$inlined$safeCollectIn$3(kotlinx.coroutines.flow.e.n(new g(com.yandex.go.coroutines.b.d(n4u0Var, new MtStopRouteMapController$initMap$$inlined$start$1(null, null))), kotlinx.coroutines.flow.e.t(new i(com.yandex.go.coroutines.b.d(n4u0Var, new MtStopRouteMapController$initMap$$inlined$start$2(null, null)), str)), new k(ru.yandex.taxi.experiments.d.b(dz00Var.a)), new MtStopRouteMapController$initMap$9(4, null)), null, this, str), 3);
    }
}
