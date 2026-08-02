package ru.yandex.taxi.masstransit.overlay.onmap;

import defpackage.a3v;
import defpackage.ah00;
import defpackage.b01;
import defpackage.egz;
import defpackage.fw30;
import defpackage.gh00;
import defpackage.gk40;
import defpackage.gw30;
import defpackage.gzx;
import defpackage.hk40;
import defpackage.jqr;
import defpackage.m010;
import defpackage.mdh;
import defpackage.sjh;
import defpackage.sk91;
import defpackage.tje;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.xm00;
import defpackage.y9x0;
import defpackage.z9x0;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes6.dex */
public final class a {
    public final h a;
    public final ah00 b;
    public final gw30 c;
    public final gzx d;
    public final ru.yandex.taxi.masstransit.userlocation.b e;
    public final m010 f;
    public final y9x0 g;
    public xm00 h;
    public fw30 i;
    public final b01 j = new b01(22, this);

    public a(h hVar, ah00 ah00Var, gw30 gw30Var, gzx gzxVar, ru.yandex.taxi.masstransit.userlocation.b bVar, m010 m010Var, y9x0 y9x0Var) {
        this.a = hVar;
        this.b = ah00Var;
        this.c = gw30Var;
        this.d = gzxVar;
        this.e = bVar;
        this.f = m010Var;
        this.g = y9x0Var;
    }

    public final void a() {
        gk40 gk40Var = new gk40(this);
        h hVar = this.a;
        a3v a3vVar = hVar.D;
        tt2 tt2Var = hVar.C;
        hVar.Bg(gk40Var);
        tje.N(hVar.Jg(), null, null, new MtViewOnMapOverlayPresenter$attachView$$inlined$safeCollectIn$1(hVar.H.b(), null, hVar), 3);
        r0 r0Var = hVar.N;
        tje.N(hVar.Jg(), null, null, new MtViewOnMapOverlayPresenter$attachView$$inlined$safeCollectIn$2(r0Var, null, hVar), 3);
        if (!sk91.a(hVar.z)) {
            m0 m0Var = new m0(kotlinx.coroutines.flow.e.X(r0Var, new MtViewOnMapOverlayPresenter$listenVehicles$$inlined$flatMapLatest$1(null, hVar)), ru.yandex.taxi.experiments.d.b(hVar.F.a), new MtViewOnMapOverlayPresenter$listenVehicles$2(3, null));
            tt2Var.getClass();
            sjh sjhVar = uyj.a;
            tje.N(hVar.Jg(), null, null, new MtViewOnMapOverlayPresenter$listenVehicles$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(m0Var, mdh.b), null, gk40Var), 3);
        }
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(new jqr(kotlinx.coroutines.flow.e.d(hVar.y.a), new MtViewOnMapOverlayPresenter$attachView$3(null, hVar), 3), new MtViewOnMapOverlayPresenter$attachView$$inlined$flatMapLatest$1(null, hVar));
        tt2Var.getClass();
        sjh sjhVar2 = uyj.a;
        tje.N(hVar.Jg(), null, null, new MtViewOnMapOverlayPresenter$attachView$$inlined$safeCollectIn$3(kotlinx.coroutines.flow.e.F(X, mdh.b), null, gk40Var), 3);
        tje.N(hVar.Jg(), null, null, new MtViewOnMapOverlayPresenter$attachView$$inlined$safeCollectIn$4(a3vVar.M2(), null, hVar), 3);
        a3vVar.b8(hVar);
        tje.N(hVar.Jg(), null, null, new MtViewOnMapOverlayPresenter$attachView$$inlined$safeCollectIn$5(hVar.J.b, null, hVar), 3);
        gh00 gh00Var = (gh00) this.b;
        xm00 p = gh00Var.i.p();
        this.h = p;
        MtViewOnMapOverlay$attach$1 mtViewOnMapOverlay$attach$1 = new MtViewOnMapOverlay$attach$1(1, hVar, h.class, "iconClicked", "iconClicked(Lru/yandex/taxi/masstransit/model/MtIcon$Action;)V", 0);
        gw30 gw30Var = this.c;
        this.i = new fw30(p, mtViewOnMapOverlay$attach$1, gw30Var.a, gw30Var.b);
        this.d.attach();
        this.e.Bg(new hk40(this));
        gh00Var.e(this.j);
        gh00Var.I(true);
        ((z9x0) this.g).a(new egz());
    }
}
