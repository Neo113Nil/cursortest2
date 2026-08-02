package ru.yandex.taxi.masstransit.detailedroute.overlay;

import defpackage.ag30;
import defpackage.ah00;
import defpackage.egz;
import defpackage.fw30;
import defpackage.gh00;
import defpackage.gw30;
import defpackage.pi30;
import defpackage.q6s0;
import defpackage.tje;
import defpackage.uo21;
import defpackage.xi40;
import defpackage.xm00;
import defpackage.y9x0;
import defpackage.z9x0;
import ru.yandex.taxi.masstransit.overlay.e;

/* loaded from: classes6.dex */
public final class a {
    public final d a;
    public final q6s0 b;
    public final xi40 c;
    public final ah00 d;
    public final y9x0 e;
    public final e f;
    public final uo21 g;
    public final gw30 h;
    public fw30 i;
    public xm00 j;
    public Boolean k;

    public a(d dVar, q6s0 q6s0Var, xi40 xi40Var, ah00 ah00Var, y9x0 y9x0Var, e eVar, uo21 uo21Var, gw30 gw30Var) {
        this.a = dVar;
        this.b = q6s0Var;
        this.c = xi40Var;
        this.d = ah00Var;
        this.e = y9x0Var;
        this.f = eVar;
        this.g = uo21Var;
        this.h = gw30Var;
    }

    public final void a() {
        xm00 p = ((gh00) this.d).i.p();
        this.j = p;
        pi30 pi30Var = new pi30(14);
        gw30 gw30Var = this.h;
        this.i = new fw30(p, pi30Var, gw30Var.a, gw30Var.b);
        ag30 ag30Var = new ag30(this);
        d dVar = this.a;
        dVar.Bg(ag30Var);
        tje.N(dVar.Jg(), null, null, new MtDetailedRouteOverlayPresenter$attachView$1(null, dVar), 3);
        tje.N(dVar.Jg(), null, null, new MtDetailedRouteOverlayPresenter$attachView$2(dVar, ag30Var, null), 3);
        tje.N(dVar.Jg(), null, null, new MtDetailedRouteOverlayPresenter$attachView$3(dVar, ag30Var, null), 3);
        tje.N(dVar.Jg(), null, null, new MtDetailedRouteOverlayPresenter$attachView$4(dVar, ag30Var, null), 3);
        ((z9x0) this.e).a(new egz());
    }
}
