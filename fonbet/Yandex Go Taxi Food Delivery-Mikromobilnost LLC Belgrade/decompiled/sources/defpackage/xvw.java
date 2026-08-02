package defpackage;

import com.yandex.go.address.position_confirmation.j;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.point_selection_settings.PointSelectionSettingsInteractor$PointType;
import com.yandex.go.point_selection_settings.d;
import com.yandex.go.preorder.mode.SourcePointMode;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.mapkit.geometry.Polyline;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.domain.u;
import ru.yandex.taxi.preorder.source.mode.interactor.e;
import ru.yandex.taxi.routeselector.a;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class xvw {
    public final dqe0 a;
    public final nzb0 b;
    public final oep0 c;
    public final e d;
    public final wiq0 e;
    public final c f;
    public final tit0 g;
    public final com.yandex.go.navigation.screen.c h;
    public final c9l0 i;
    public final AddressResolveRepository j;
    public final agt0 k;
    public final ru.yandex.taxi.e l;
    public final q4 m;
    public final biv0 n;
    public final lgv0 o;
    public final hp0 p;
    public final a q;
    public final jev0 r;
    public final avd0 s;
    public final j t;
    public final ru.yandex.taxi.preorder.source.data.c u;
    public final rei v;
    public final u w;
    public final mzb x;
    public final com.yandex.go.taxi.summary.map.walkingroute.e y;
    public boolean z;

    public xvw(dqe0 dqe0Var, nzb0 nzb0Var, oep0 oep0Var, e eVar, wiq0 wiq0Var, c cVar, tit0 tit0Var, com.yandex.go.navigation.screen.c cVar2, c9l0 c9l0Var, AddressResolveRepository addressResolveRepository, agt0 agt0Var, ru.yandex.taxi.e eVar2, q4 q4Var, biv0 biv0Var, lgv0 lgv0Var, hp0 hp0Var, a aVar, jev0 jev0Var, avd0 avd0Var, j jVar, ru.yandex.taxi.preorder.source.data.c cVar3, rei reiVar, u uVar, mzb mzbVar, com.yandex.go.taxi.summary.map.walkingroute.e eVar3) {
        this.a = dqe0Var;
        this.b = nzb0Var;
        this.c = oep0Var;
        this.d = eVar;
        this.e = wiq0Var;
        this.f = cVar;
        this.g = tit0Var;
        this.h = cVar2;
        this.i = c9l0Var;
        this.j = addressResolveRepository;
        this.k = agt0Var;
        this.l = eVar2;
        this.m = q4Var;
        this.n = biv0Var;
        this.o = lgv0Var;
        this.p = hp0Var;
        this.q = aVar;
        this.r = jev0Var;
        this.s = avd0Var;
        this.t = jVar;
        this.u = cVar3;
        this.v = reiVar;
        this.w = uVar;
        this.x = mzbVar;
        this.y = eVar3;
    }

    public final void a() {
        String str;
        pex0 m;
        TariffOrderFlow tariffOrderFlow;
        Polyline a;
        pex0 m2 = ((k) this.e).m();
        zlm zlmVar = this.u.e;
        int i = 1;
        int i2 = 0;
        boolean z = (zlmVar == null || (((a = zlmVar.a()) == null || a.getPoints().isEmpty()) && zlmVar.a.b() == null)) ? false : true;
        Screen b = this.h.b();
        if (this.i.b()) {
            this.d.h(this.m.a() ? SourcePointMode.POINT_WITH_ROUTE : SourcePointMode.POINT, false, false);
            return;
        }
        jpv0 b2 = this.n.b();
        b2.getClass();
        if (b2 instanceof fpv0) {
            jpv0 b3 = this.n.b();
            b3.getClass();
            if (!(b3 instanceof fpv0) || this.d.a.a() == SourcePointMode.TOLL_ROAD_SELECTOR) {
                this.d.b();
                return;
            } else {
                this.d.h(b == Screen.ROUTE_STOPS_V2 ? SourcePointMode.ROUTE_ON_ROUTE_STOPS : this.l.f() ? SourcePointMode.PIN_ABSENCE : b == Screen.WHERE_YOU_ARE ? SourcePointMode.WHERE_YOU_ARE : this.z ? SourcePointMode.POINT_ZOOMING : SourcePointMode.POINT, false, false);
                return;
            }
        }
        jev0 jev0Var = this.r;
        if (jev0Var.a.a() && !((com.yandex.go.taxi.summary.map.focus.data.c) jev0Var.b).d.get()) {
            this.d.h(SourcePointMode.POINT_WITH_ROUTE, false, false);
            avd0 avd0Var = this.s;
            pex0 m3 = ((k) this.e).m();
            zud0 a2 = ((d) avd0Var).a(m3 != null ? m3.b : null, PointSelectionSettingsInteractor$PointType.SOURCE);
            ((pep0) this.c).f(new zsa(18, this.q, new vvw(this, i2), new vvw(this, i)), new y9l0(ModalViewOrigin.SUMMARY, RouteSelectorOpenReason.PIN, a2 != null ? a2.a : null, a2 != null ? a2.b : null, a2 != null ? a2.c : null, null, 96), hxx.a);
            return;
        }
        if (this.a.a.P == TariffOrderFlow.DRIVE_FLOW) {
            this.d.h(SourcePointMode.DRIVE_TARIFF_FLOW, false, false);
            return;
        }
        if (this.a.a.P == TariffOrderFlow.SHUTTLE_FLOW) {
            this.d.h(SourcePointMode.SHUTTLE_TARIFF_FLOW, false, false);
            return;
        }
        rei reiVar = this.v;
        k kVar = (k) reiVar.b;
        pex0 m4 = kVar.m();
        if (m4 != null && (str = m4.b) != null && (m = kVar.m()) != null && (tariffOrderFlow = m.u0) != null && tariffOrderFlow == TariffOrderFlow.DELIVERY_FLOW && reiVar.a.f(str)) {
            this.d.h(SourcePointMode.DELIVERY_NDD_FLOW, false, false);
            return;
        }
        if (b()) {
            ((com.yandex.go.clarify_address.before_order.a) this.x).b.d = true;
            this.d.h(SourcePointMode.ROUTE_WITH_POINT_A_CONFIRMATION, false, false);
            return;
        }
        if (this.o.d() && ((com.yandex.go.clarify_address.before_order.a) this.x).a()) {
            this.d.h(SourcePointMode.ROUTE_WITH_FOCUS_TO_POINT_A, false, false);
            return;
        }
        if (m2 != null && this.y.a(m2)) {
            this.d.h(SourcePointMode.ROUTE_WITH_FOCUS_TO_WALKING_ROUTE, false, false);
            return;
        }
        lgv0 lgv0Var = this.o;
        if (!lgv0Var.a()) {
            mgv0 mgv0Var = lgv0Var.b;
            mgv0Var.d = false;
            mgv0Var.e = null;
            mgv0Var.f = null;
        }
        boolean z2 = this.g.m;
        e eVar = this.d;
        if (z2) {
            eVar.h(SourcePointMode.FOCUS_ON_MULTIEXIT_POINT, true, false);
        } else {
            eVar.h(!z ? SourcePointMode.POINT : this.a.a.P == TariffOrderFlow.DELIVERY_FLOW ? SourcePointMode.DELIVERY_FLOW : (this.o.f() || this.d.a.a() == SourcePointMode.POINT) ? SourcePointMode.ROUTE : this.d.a.a(), false, false);
        }
    }

    public final boolean b() {
        j jVar = this.t;
        oyb0 oyb0Var = jVar.j;
        return ((!(oyb0Var.a() instanceof vyb0) && (!((Boolean) jVar.l.c.getValue()).booleanValue() || (oyb0Var.a() instanceof syb0) || (oyb0Var.a() instanceof wyb0))) || this.f.d() == null || ((com.yandex.go.clarify_address.before_order.a) this.x).d()) ? false : true;
    }

    public final void c(zzs zzsVar, Runnable runnable) {
        this.z = true;
        r7v r7vVar = new r7v(11, this, runnable);
        agt0 agt0Var = this.k;
        int i = agt0Var.b.a;
        ((gh00) agt0Var.a).D(ru.yandex.taxi.map.utils.a.F(zzsVar), i != 0 ? Math.min(17.0f, i) : 17.0f, 400.0f, new mx0(14, r7vVar));
    }
}
