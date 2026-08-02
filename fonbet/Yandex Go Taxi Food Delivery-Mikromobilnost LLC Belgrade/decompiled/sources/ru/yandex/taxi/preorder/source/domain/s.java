package ru.yandex.taxi.preorder.source.domain;

import com.yandex.go.preorder.mode.SourcePointMode;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.geometry.Polyline;
import defpackage.agt0;
import defpackage.ah00;
import defpackage.ber;
import defpackage.c9l0;
import defpackage.cjt0;
import defpackage.dqe0;
import defpackage.fy01;
import defpackage.gh00;
import defpackage.gj21;
import defpackage.hp0;
import defpackage.l8x;
import defpackage.lcz;
import defpackage.mo21;
import defpackage.mx0;
import defpackage.n050;
import defpackage.n5v0;
import defpackage.nzb0;
import defpackage.o050;
import defpackage.pzt0;
import defpackage.rjt0;
import defpackage.s8z;
import defpackage.tft0;
import defpackage.wit0;
import defpackage.x5s0;
import defpackage.zuj0;
import defpackage.zy11;
import defpackage.zzs;
import java.util.HashMap;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.analytics.LocationRequestAnalytics$Source;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;

/* loaded from: classes6.dex */
public final class s implements n050 {
    public final dqe0 a;
    public final zuj0 b;
    public final nzb0 c;
    public final rjt0 d;
    public final ru.yandex.taxi.preorder.source.mode.interactor.e e;
    public final ru.yandex.taxi.location.autolocation.a f;
    public final c9l0 g;
    public final s8z h;
    public final AddressResolveRepository i;
    public final r j;
    public final agt0 k;
    public final fy01 l;
    public final hp0 m;
    public final o050 n;
    public final tft0 o;
    public final lcz p;
    public final cjt0 q;
    public final ber r;

    public s(dqe0 dqe0Var, zuj0 zuj0Var, nzb0 nzb0Var, rjt0 rjt0Var, ru.yandex.taxi.preorder.source.mode.interactor.e eVar, ru.yandex.taxi.location.autolocation.a aVar, c9l0 c9l0Var, s8z s8zVar, AddressResolveRepository addressResolveRepository, r rVar, agt0 agt0Var, fy01 fy01Var, hp0 hp0Var, o050 o050Var, tft0 tft0Var, lcz lczVar, cjt0 cjt0Var, ber berVar) {
        this.a = dqe0Var;
        this.b = zuj0Var;
        this.c = nzb0Var;
        this.d = rjt0Var;
        this.e = eVar;
        this.f = aVar;
        this.g = c9l0Var;
        this.h = s8zVar;
        this.i = addressResolveRepository;
        this.j = rVar;
        this.k = agt0Var;
        this.l = fy01Var;
        this.m = hp0Var;
        this.n = o050Var;
        this.o = tft0Var;
        this.p = lczVar;
        this.q = cjt0Var;
        this.r = berVar;
    }

    public static final void a(s sVar, mo21 mo21Var) {
        sVar.b(mo21Var, sVar.g.a() ? "clarify.geo" : "geo", true, false);
        sVar.p.a(LocationRequestAnalytics$Source.MY_LOCATION_CLICK, mo21Var);
    }

    public final void b(mo21 mo21Var, String str, boolean z, boolean z2) {
        if (z || !this.m.a()) {
            if (this.e.a.a() != SourcePointMode.DELIVERY_NDD_FLOW) {
                n5v0 a = this.o.a(!(this.r.d() && z2));
                if (z) {
                    com.yandex.go.coroutines.b.g(this.c.a, null, null, new SourcePointLocationInteractor$handleCurrentLocationResult$1(a, mo21Var, str, this, null), 3);
                } else {
                    zzs a2 = mo21Var.a();
                    wit0 wit0Var = (wit0) a;
                    wit0Var.b(a2);
                    wit0Var.c.q(false, a2, RoutePointType.POINT_A, true, false, str, null, PositionInitAction.AUTO_LOCATION);
                }
            }
            if (z2) {
                return;
            }
            x5s0 x5s0Var = new x5s0(4, this);
            ah00 ah00Var = this.k.a;
            zzs a3 = mo21Var.a();
            Polyline polyline = ru.yandex.taxi.map.utils.a.b;
            ((gh00) ah00Var).D(new Point(a3.a, a3.b), mo21Var.d, 300.0f, new mx0(13, x5s0Var));
        }
    }

    public final void c() {
        gj21 gj21Var = this.d.g;
        gj21Var.getClass();
        gj21Var.a.a("UseLocationButtonTap", new HashMap(), 1, new HashMap());
        RouteSelectorModalView routeSelectorModalView = (RouteSelectorModalView) this.g.a.a().i(RouteSelectorModalView.class);
        if (routeSelectorModalView != null) {
            routeSelectorModalView.onMyLocationTapped();
        }
        this.n.a.g(zy11.a);
        this.f.c.f(((AddressResolveRepository.State) this.i.a.getValue()) == AddressResolveRepository.State.LOADED);
        nzb0 nzb0Var = this.c;
        nzb0Var.a.f();
        pzt0 g = com.yandex.go.coroutines.b.g(nzb0Var.a, null, null, new SourcePointLocationInteractor$onMyLocationClick$resolveLocationJob$1(this, null), 3);
        l8x l8xVar = nzb0Var.b;
        if (l8xVar != null) {
            l8xVar.a(null);
        }
        nzb0Var.b = g;
    }

    public final void d() {
        if (this.a.e() == null) {
            com.yandex.go.coroutines.b.g(this.c.a, null, null, new SourcePointLocationInteractor$requestUserLocationUpdateIfNeeded$1(this, null), 3);
        }
    }
}
