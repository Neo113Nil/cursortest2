package ru.yandex.taxi.preorder.source.domain;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import defpackage.a850;
import defpackage.ah00;
import defpackage.aq80;
import defpackage.b0j;
import defpackage.biv0;
import defpackage.bov0;
import defpackage.cbv0;
import defpackage.fpv0;
import defpackage.gh00;
import defpackage.ghv0;
import defpackage.h3y;
import defpackage.icv0;
import defpackage.ijv0;
import defpackage.jpv0;
import defpackage.jst;
import defpackage.kpi0;
import defpackage.m8t0;
import defpackage.net0;
import defpackage.nzb0;
import defpackage.ou7;
import defpackage.pfb;
import defpackage.pv0;
import defpackage.qht0;
import defpackage.qpt0;
import defpackage.rft0;
import defpackage.rpt0;
import defpackage.set0;
import defpackage.tb;
import defpackage.tft0;
import defpackage.tit0;
import defpackage.wit0;
import defpackage.xse0;
import defpackage.yit0;
import defpackage.za31;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ru.yandex.taxi.address.models.SourcePicker;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.search.address.view.PointType;

/* loaded from: classes6.dex */
public final class p {
    public final ah00 a;
    public final ru.yandex.taxi.am.g b;
    public final cbv0 c;
    public final a850 d;
    public final yit0 e;
    public final com.yandex.go.route.interactor.c f;
    public final tit0 g;
    public final net0 h;
    public final ou7 i;
    public final h3y j;
    public final r k;
    public final biv0 l;
    public final rft0 m;
    public final b0j n;
    public final h3y o;
    public final pfb p;
    public final aq80 q;
    public final kpi0 r;
    public final h3y s;
    public final ru.yandex.taxi.preorder.interactor.g t;
    public final h3y u;
    public final tft0 v;
    public final h3y w;

    public p(ah00 ah00Var, ru.yandex.taxi.am.g gVar, cbv0 cbv0Var, a850 a850Var, yit0 yit0Var, com.yandex.go.route.interactor.c cVar, tit0 tit0Var, net0 net0Var, ou7 ou7Var, h3y h3yVar, r rVar, biv0 biv0Var, rft0 rft0Var, b0j b0jVar, h3y h3yVar2, pfb pfbVar, aq80 aq80Var, kpi0 kpi0Var, h3y h3yVar3, ru.yandex.taxi.preorder.interactor.g gVar2, h3y h3yVar4, tft0 tft0Var, h3y h3yVar5) {
        this.a = ah00Var;
        this.b = gVar;
        this.c = cbv0Var;
        this.d = a850Var;
        this.e = yit0Var;
        this.f = cVar;
        this.g = tit0Var;
        this.h = net0Var;
        this.i = ou7Var;
        this.j = h3yVar;
        this.k = rVar;
        this.l = biv0Var;
        this.m = rft0Var;
        this.n = b0jVar;
        this.o = h3yVar2;
        this.p = pfbVar;
        this.q = aq80Var;
        this.r = kpi0Var;
        this.s = h3yVar3;
        this.t = gVar2;
        this.u = h3yVar4;
        this.v = tft0Var;
        this.w = h3yVar5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(bov0 bov0Var, boolean z) {
        ZoneAddress zoneAddress = this.f.c().a;
        if (zoneAddress == null || zoneAddress.a.X1()) {
            jst.e.getClass();
            return;
        }
        this.r.b();
        boolean g = this.i.a.g();
        ijv0 ijv0Var = null;
        Object[] objArr = 0;
        net0 net0Var = this.h;
        if (!g) {
            net0Var.d();
            com.yandex.go.preorder.navigation.n.X(((qht0) this.m).b, new xse0(ghv0.a, ijv0Var, objArr == true ? 1 : 0, 62));
            return;
        }
        if (!this.n.a() || z) {
            if (!this.b.g() || ((icv0) this.q.a).a(new SuitabilityCheckType[0])) {
                d(bov0Var, zoneAddress);
                return;
            } else {
                net0Var.d();
                ((rpt0) ((qpt0) this.w.get())).b(null, null);
                return;
            }
        }
        net0Var.d();
        cbv0 cbv0Var = this.c;
        cbv0Var.getClass();
        cbv0Var.a.a("suggested_positions.ForcedDestPointChosen", new HashMap(), 1, new HashMap());
        ((set0) this.u.get()).a(PointType.DESTINATION, zoneAddress.a, SourcePicker.NONE, ModalViewOrigin.SUMMARY, false, false, false);
    }

    public final void b() {
        this.h.d();
        jpv0 b = this.l.b();
        b.getClass();
        if (!(b instanceof fpv0)) {
            this.e.a(MapPositionAction.DEFAULT);
        }
        this.k.g();
        ((wit0) this.v.a(true)).c(((gh00) this.a).e.b(), "auto", PositionInitAction.MAP);
    }

    public final void c(bov0 bov0Var) {
        ZoneAddress zoneAddress = this.f.c().a;
        if (zoneAddress == null || zoneAddress.a.X1()) {
            jst.e.s(new IllegalArgumentException("Source address is invalid, can't confirm."));
        } else {
            d(bov0Var, zoneAddress);
        }
    }

    public final void d(bov0 bov0Var, ZoneAddress zoneAddress) {
        if (zoneAddress.b == null) {
            jst.e.k(new IllegalStateException(), "We trying to open summary without selected zone");
            pv0 pv0Var = new pv0(zoneAddress.a, null, null, null, null, null, null, null, 1022);
            v vVar = (v) this.j.get();
            m8t0 m8t0Var = new m8t0(2, this);
            w wVar = vVar.d;
            tb tbVar = new tb(14, vVar, bov0Var);
            tb tbVar2 = new tb(15, vVar, m8t0Var);
            nzb0 nzb0Var = wVar.a;
            com.yandex.go.coroutines.b.g(nzb0Var.a, null, null, new SourcePointZoneRequestInteractor$requestZoneForSource$1(wVar, pv0Var, tbVar, tbVar2, null), 3);
            return;
        }
        List list = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.p.a).j().a;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (!((za31) it.next()).b.isEmpty()) {
                    if (this.g.c != null) {
                        return;
                    }
                    this.d.i("order_summary", true);
                    this.e.c(bov0Var);
                    this.t.c(zoneAddress);
                    return;
                }
            }
        }
        jst.e.k(new IllegalStateException(), "We trying to open summary without tariffs");
        b();
    }
}
