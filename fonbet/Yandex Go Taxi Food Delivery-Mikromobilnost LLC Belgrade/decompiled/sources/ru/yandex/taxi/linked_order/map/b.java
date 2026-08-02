package ru.yandex.taxi.linked_order.map;

import defpackage.ah00;
import defpackage.b01;
import defpackage.b2l0;
import defpackage.cpy;
import defpackage.eci0;
import defpackage.gh00;
import defpackage.h3y;
import defpackage.hoy;
import defpackage.jqr;
import defpackage.kly;
import defpackage.l30;
import defpackage.l8x;
import defpackage.ney;
import defpackage.o400;
import defpackage.ptw;
import defpackage.qoy;
import defpackage.r1s;
import defpackage.r8;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse;
import defpackage.ul00;
import defpackage.uyj;
import defpackage.vb3;
import defpackage.wsr0;
import defpackage.xm00;
import defpackage.xsr0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.linked_order.interactor.a0;
import ru.yandex.taxi.linked_order.interactor.c0;
import ru.yandex.taxi.linked_order.interactor.e0;
import ru.yandex.taxi.linked_order.interactor.f0;
import ru.yandex.taxi.linked_order.interactor.y;

/* loaded from: classes5.dex */
public final class b extends r8 {
    public final hoy c;
    public final ney w;
    public final b2l0 x;
    public final xm00 y;

    public b(ah00 ah00Var, xm00 xm00Var, hoy hoyVar, ney neyVar, b2l0 b2l0Var) {
        super(5, ah00Var);
        this.c = hoyVar;
        this.w = neyVar;
        this.x = b2l0Var;
        this.y = xm00Var.p();
    }

    public final void Hg(tls tlsVar) {
        a aVar = new a(this, this.y, tlsVar);
        hoy hoyVar = this.c;
        hoyVar.Bg(aVar);
        r1s r1sVar = hoyVar.y;
        r0 r0Var = (r0) r1sVar.c;
        gh00 gh00Var = (gh00) ((ah00) r1sVar.b);
        Float valueOf = Float.valueOf(gh00Var.j());
        r0Var.getClass();
        r0Var.m(null, valueOf);
        gh00Var.e((b01) r1sVar.w);
        hoyVar.x.c = new ptw(15, hoyVar);
        h3y h3yVar = hoyVar.C;
        r0 r0Var2 = hoyVar.D;
        Boolean bool = Boolean.TRUE;
        r0Var2.getClass();
        r0Var2.m(null, bool);
        f0 f0Var = hoyVar.B;
        qoy qoyVar = f0Var.c;
        ul00 ul00Var = f0Var.d;
        String str = ul00Var.a;
        if (str == null) {
            str = "";
        }
        y yVar = new y(qoyVar.a(str));
        tse Jg = hoyVar.Jg();
        wsr0 wsr0Var = xsr0.a;
        int i = 3;
        eci0 O = kotlinx.coroutines.flow.e.O(yVar, Jg, wsr0.a(wsr0Var, 3), 1);
        eci0 O2 = kotlinx.coroutines.flow.e.O(f0Var.a(hoyVar.E, O), hoyVar.Jg(), wsr0.a(wsr0Var, 3), 1);
        d dVar = new d(O2);
        eci0 O3 = kotlinx.coroutines.flow.e.O(kotlinx.coroutines.flow.e.t(new e0(O)), hoyVar.Jg(), wsr0.a(wsr0Var, 3), 1);
        tje.N(hoyVar.Jg(), null, null, new LinkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$safeCollectIn$1(new c0(kotlinx.coroutines.flow.e.t(new a0(O)), f0Var.a), null, hoyVar), 3);
        tje.N(hoyVar.Jg(), null, null, new LinkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$safeCollectIn$2(O3, null, hoyVar), 3);
        tje.N(hoyVar.Jg(), null, null, new LinkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$safeCollectIn$3(f0Var.b(O), null, hoyVar), 3);
        tje.N(hoyVar.Jg(), null, null, new LinkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$safeCollectIn$4(dVar, null, hoyVar), 3);
        l8x l8xVar = hoyVar.F;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        kly klyVar = hoyVar.A;
        String str2 = ul00Var.a;
        hoyVar.F = klyVar.a(str2 != null ? str2 : "", f0Var, r0Var2, O, O3, dVar);
        tje.N(hoyVar.Jg(), null, null, new LinkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$safeCollectIn$5(r0Var2, null, hoyVar), 3);
        tje.N(hoyVar.Jg(), null, null, new LinkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$safeCollectIn$6((r0) r1sVar.c, null, hoyVar), 3);
        hoyVar.G.cancel();
        cpy cpyVar = (cpy) h3yVar.get();
        cpyVar.getClass();
        tse tseVar = cpyVar.a;
        kotlinx.coroutines.flow.internal.g X = kotlinx.coroutines.flow.e.X(kotlinx.coroutines.flow.e.t(new r(O)), new LinkedOrderRouteProgressTracker$startTracker$$inlined$flatMapLatest$1(null, cpyVar, O, dVar));
        cpyVar.b.getClass();
        sjh sjhVar = uyj.a;
        hoyVar.G = new l30(8, tje.N(tseVar, null, null, new LinkedOrderRouteProgressTracker$startTracker$$inlined$safeCollectIn$1(kotlinx.coroutines.flow.e.F(X, o400.a), cpyVar, null), 3), com.yandex.go.coroutines.b.h(tseVar, kotlinx.coroutines.flow.e.F(new jqr(new t(O2, cpyVar), new LinkedOrderRouteProgressTracker$startTracker$positionJob$2(cpyVar, null), i), uyj.a)));
        tje.N(hoyVar.Jg(), null, null, new LinkedOrderMapOverlayPresenter$registerForUpdatesInternal$$inlined$safeCollectIn$7(((cpy) h3yVar.get()).k, null, hoyVar), 3);
        this.w.b(this, new vb3(6, this));
    }

    public final void Ig() {
        this.y.m();
        this.w.d(this);
        this.c.Cg();
    }
}
