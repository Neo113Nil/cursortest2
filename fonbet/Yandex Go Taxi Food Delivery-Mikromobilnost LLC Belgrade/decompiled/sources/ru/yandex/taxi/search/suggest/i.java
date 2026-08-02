package ru.yandex.taxi.search.suggest;

import com.adjust.sdk.Constants;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.environment.SwitchNetworkEnvironmentExperiment;
import defpackage.a5o;
import defpackage.ah00;
import defpackage.atd0;
import defpackage.d2t;
import defpackage.d6z;
import defpackage.d7t;
import defpackage.e2t;
import defpackage.eci0;
import defpackage.eqe;
import defpackage.eub0;
import defpackage.evu0;
import defpackage.eyc;
import defpackage.f2t;
import defpackage.fyc;
import defpackage.g2t;
import defpackage.g8e;
import defpackage.g92;
import defpackage.gh00;
import defpackage.i4v0;
import defpackage.jl40;
import defpackage.jst;
import defpackage.k4v0;
import defpackage.k56;
import defpackage.mq40;
import defpackage.o9j0;
import defpackage.p820;
import defpackage.pv0;
import defpackage.q0t;
import defpackage.q6r;
import defpackage.qq80;
import defpackage.r0t;
import defpackage.rtx0;
import defpackage.rv0;
import defpackage.sms;
import defpackage.sxq0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.u6r;
import defpackage.urv0;
import defpackage.uyj;
import defpackage.v6r;
import defpackage.xr0;
import defpackage.xzq0;
import defpackage.yu21;
import defpackage.z4o;
import defpackage.z7l0;
import defpackage.zgc0;
import defpackage.zzs;
import java.util.Arrays;
import java.util.Collections;
import java.util.Optional;
import kotlin.Result;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.o;
import ru.yandex.taxi.persuggest.api.GeoPointAcquisitionType;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.domain.model.RoutePointType;
import ru.yandex.taxi.persuggest.repository.RequestedSourcePointInfoRepositoryImpl;
import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;

/* loaded from: classes10.dex */
public final class i implements atd0 {
    public final tt2 a;
    public final xzq0 b;
    public final ru.yandex.taxi.communications.i c;
    public final ru.yandex.taxi.g d;
    public final ru.yandex.taxi.persuggest.domain.g e;
    public final eqe f;
    public final ah00 g;
    public final e2t h;
    public final eub0 i;
    public final urv0 j;
    public final k4v0 k;
    public final rv0 l;
    public final d7t m;

    public i(tt2 tt2Var, xzq0 xzq0Var, ru.yandex.taxi.communications.i iVar, ru.yandex.taxi.g gVar, ru.yandex.taxi.persuggest.domain.g gVar2, eqe eqeVar, ah00 ah00Var, e2t e2tVar, eub0 eub0Var, urv0 urv0Var, k4v0 k4v0Var, rv0 rv0Var, d7t d7tVar) {
        this.a = tt2Var;
        this.b = xzq0Var;
        this.c = iVar;
        this.d = gVar;
        this.e = gVar2;
        this.f = eqeVar;
        this.g = ah00Var;
        this.h = e2tVar;
        this.i = eub0Var;
        this.j = urv0Var;
        this.k = k4v0Var;
        this.l = rv0Var;
        this.m = d7tVar;
    }

    public final tpr f(zzs zzsVar, String str, RoutePointType routePointType, String str2) {
        ru.yandex.taxi.persuggest.domain.g gVar = this.e;
        gVar.a.a(routePointType.getType(), str2);
        d2t d2tVar = new d2t(new o9j0(routePointType, zzsVar, str, false, false, null, null, null, null, null, null, 4088), new p820(zzsVar, "", "", routePointType, gVar.e.d(), null, null, null, null, false, 4064));
        eci0 c = gVar.c(d2tVar);
        gVar.a(c, d2tVar);
        return s(new ru.yandex.taxi.persuggest.domain.d(c));
    }

    public final tpr g(zzs zzsVar, String str, z7l0 z7l0Var, boolean z, boolean z2, qq80 qq80Var, String str2) {
        String m = this.b.m();
        ru.yandex.taxi.persuggest.domain.g gVar = this.e;
        ((ru.yandex.taxi.persuggest.source.f) gVar.g).c(FinalSuggestScreen.DEEPLINK);
        d2t d2tVar = new d2t(new o9j0(z7l0Var, zzsVar, null, z, false, null, str2, z2 ? "default" : null, null, null, null, 3892), new p820(zzsVar, Constants.DEEPLINK, m, z7l0Var, gVar.e.d(), null, null, null, GeoPointAcquisitionType.DEFAULT, false, 3552));
        gVar.a.a(z7l0Var.getType(), qq80Var.a());
        eci0 b = gVar.b(d2tVar, new i4v0(str == null ? Constants.DEEPLINK : str, null, null, null, null, null, null, false, true, 252));
        gVar.a(b, d2tVar);
        return s(new ru.yandex.taxi.persuggest.domain.d(b));
    }

    public final tpr h(zzs zzsVar, String str, RoutePointType routePointType, String str2, i4v0 i4v0Var, String str3, yu21 yu21Var, GeoPointAcquisitionType geoPointAcquisitionType, xr0 xr0Var, PositionInitAction positionInitAction, boolean z) {
        String m = this.b.m();
        ru.yandex.taxi.persuggest.domain.g gVar = this.e;
        gVar.f.getClass();
        d2t d2tVar = new d2t(new o9j0(routePointType, zzsVar, null, false, false, null, null, jl40.l(routePointType.getType(), RoutePointType.SERVICE_NAVIGATOR_B.getType()) ? "navigator" : null, xr0Var, positionInitAction, null, 2428), new p820(zzsVar, str, m, routePointType, gVar.e.d(), str3, null, yu21Var, geoPointAcquisitionType, z, 1184));
        gVar.a.a(routePointType.getType(), str2);
        eci0 b = gVar.b(d2tVar, i4v0Var);
        gVar.a(b, d2tVar);
        return s(new ru.yandex.taxi.persuggest.domain.d(b));
    }

    public final Optional i() {
        g2t a = ((f2t) this.h).a();
        return a == null ? Optional.empty() : Optional.ofNullable(m(a, false));
    }

    public final tpr j(RoutePointType routePointType, boolean z) {
        ru.yandex.taxi.persuggest.domain.g gVar = this.e;
        tpr d = gVar.d(routePointType);
        if (z) {
            d = new ru.yandex.taxi.persuggest.domain.b(kotlinx.coroutines.flow.e.t(kotlinx.coroutines.flow.e.K((tpr[]) Arrays.copyOf(new tpr[]{((f2t) gVar.c).h, d}, 2))), routePointType);
        }
        return s(d);
    }

    public final tpr k(RoutePointType routePointType, boolean z) {
        ru.yandex.taxi.persuggest.domain.g gVar = this.e;
        if (!z) {
            return new o(new b(s(gVar.d(routePointType))), new PointAddressInteractor$listenToAddressInfoChangeFlow$2());
        }
        f fVar = new f(gVar.e(routePointType), this);
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(fVar, uyj.a);
    }

    public final pv0 m(g2t g2tVar, boolean z) {
        rtx0 rtx0Var;
        pv0 pv0Var;
        rtx0 rtx0Var2;
        p820 p820Var = g2tVar.b;
        zzs zzsVar = p820Var.a;
        v6r v6rVar = g2tVar.a;
        u6r u6rVar = v6rVar.a;
        sxq0 sxq0Var = u6rVar.d;
        rtx0 rtx0Var3 = rtx0.d;
        if (sxq0Var == null || (rtx0Var = sxq0Var.a) == null) {
            rtx0.Companion.getClass();
            rtx0Var = rtx0Var3;
        }
        a5o a5oVar = null;
        a5oVar = null;
        if (jl40.l(rtx0Var.a, Boolean.TRUE)) {
            pv0Var = this.l.b(g2tVar);
            if (pv0Var == null) {
                return null;
            }
            pv0Var.j = zzsVar;
            Address address = pv0Var.a;
            com.yandex.go.analytics.e a = this.f.a(address, v6rVar.b, p820Var);
            if (a != null) {
                address.O1(a);
            }
        } else {
            PlainAddress.Companion.getClass();
            PlainAddress a2 = zgc0.a(zzsVar);
            a2.P("suggest.error.fallback");
            k56 k56Var = new k56(0);
            mq40 mq40Var = mq40.f;
            sxq0 sxq0Var2 = u6rVar.d;
            if (sxq0Var2 == null || (rtx0Var2 = sxq0Var2.a) == null) {
                rtx0.Companion.getClass();
            } else {
                rtx0Var3 = rtx0Var2;
            }
            pv0Var = new pv0(a2, k56Var, mq40Var, com.yandex.go.net.taxi.dto.response.d.a(rtx0Var3.c), EmptyList.a, "default_tag", null, null, null, null);
        }
        ((com.yandex.go.environment.a) this.m).getClass();
        SwitchNetworkEnvironmentExperiment switchNetworkEnvironmentExperiment = (SwitchNetworkEnvironmentExperiment) u6rVar.b(SwitchNetworkEnvironmentExperiment.class);
        if (switchNetworkEnvironmentExperiment != null && switchNetworkEnvironmentExperiment.b) {
            SwitchNetworkEnvironmentExperiment.Modal modal = switchNetworkEnvironmentExperiment.f;
            String a3 = modal != null ? modal.getA() : null;
            String b = modal != null ? modal.getB() : null;
            String Y = b == null ? "" : d6z.Y(switchNetworkEnvironmentExperiment, b);
            String c = modal != null ? modal.getC() : null;
            String Y2 = c == null ? "" : d6z.Y(switchNetworkEnvironmentExperiment, c);
            String d = modal != null ? modal.getD() : null;
            String Y3 = d != null ? d6z.Y(switchNetworkEnvironmentExperiment, d) : "";
            a5oVar = new a5o(switchNetworkEnvironmentExperiment.d, ((a3 == null || evu0.J(a3)) && evu0.J(Y) && evu0.J(Y2) && evu0.J(Y3)) ? null : new z4o(a3, Y, Y2, Y3), switchNetworkEnvironmentExperiment.e);
        }
        PlainAddress L1 = pv0Var.a.L1(p820Var.b);
        L1.h(v6rVar.c);
        L1.z0(p820Var.c);
        L1.n(p820Var.i);
        L1.G(p820Var.j);
        L1.y1(Long.valueOf(p820Var.e));
        L1.a(Collections.singleton(p820Var.f));
        L1.b(Collections.singleton(g2tVar.c));
        L1.k(zzsVar);
        L1.l(v6rVar.e);
        L1.g(a5oVar);
        if (z) {
            z7l0 z7l0Var = p820Var.d;
            this.c.a(u6rVar);
            if (z7l0Var == RoutePointType.POINT_A) {
                this.d.m(u6rVar);
            }
        }
        return pv0Var;
    }

    public final boolean n(r0t r0tVar, d2t d2tVar, q6r q6rVar, u6r u6rVar) {
        k4v0 k4v0Var = this.k;
        Action action = q6rVar.a;
        zzs zzsVar = q6rVar.f.k;
        k4v0Var.getClass();
        g2t g2tVar = new g2t(new v6r(u6rVar, k4v0.a(action, zzsVar, u6rVar), q6rVar.a, d2tVar.a.i, q6rVar.e), d2tVar.b, r0tVar);
        ru.yandex.taxi.persuggest.domain.g gVar = this.e;
        gVar.getClass();
        p820 p820Var = d2tVar.b;
        z7l0 z7l0Var = p820Var.d;
        q0t q0tVar = p820Var.f;
        if (z7l0Var == RoutePointType.POINT_A && !jl40.l(q0tVar, ((RequestedSourcePointInfoRepositoryImpl) gVar.h).c)) {
            gVar.d.b(g2tVar);
            return false;
        }
        ru.yandex.taxi.persuggest.source.c cVar = gVar.b;
        eyc eycVar = (eyc) cVar.o.remove(q0tVar);
        if (eycVar != null) {
            ((fyc) eycVar).T(u6rVar);
        }
        cVar.d(z7l0Var, u6rVar);
        ((f2t) gVar.c).d.j0();
        ((f2t) gVar.c).b(g2tVar);
        gVar.a(new g92(2, new Result(g2tVar)), d2tVar);
        return true;
    }

    public final tpr o(zzs zzsVar, String str, RoutePointType routePointType, String str2, boolean z, String str3, PositionInitAction positionInitAction) {
        String m = this.b.m();
        Float valueOf = Float.valueOf(((gh00) this.g).j());
        ru.yandex.taxi.persuggest.domain.g gVar = this.e;
        gVar.getClass();
        d2t d2tVar = new d2t(new o9j0(routePointType, zzsVar, null, false, false, null, null, str3, null, positionInitAction, null, 2940), new p820(zzsVar, str, m, routePointType, gVar.e.d(), null, null, null, jl40.l(str, "auto") ? GeoPointAcquisitionType.USER_LOCATION : GeoPointAcquisitionType.DEFAULT, false, 3552));
        i4v0 i4v0Var = i4v0.j;
        eci0 g = gVar.g(d2tVar, sms.g(null, null, str2, z, 2), valueOf);
        gVar.a(g, d2tVar);
        return s(new ru.yandex.taxi.persuggest.domain.d(g));
    }

    public final tpr p(zzs zzsVar, RoutePointType routePointType, String str) {
        return s(this.e.i(zzsVar, routePointType, str, this.b.m(), null));
    }

    public final tpr q(boolean z, zzs zzsVar, z7l0 z7l0Var, boolean z2, boolean z3, String str, String str2, PositionInitAction positionInitAction) {
        String m = this.b.m();
        Float valueOf = Float.valueOf(((gh00) this.g).j());
        ru.yandex.taxi.persuggest.domain.g gVar = this.e;
        gVar.getClass();
        d2t d2tVar = new d2t(new o9j0(z7l0Var, zzsVar, null, z2, z3, null, null, str2, null, positionInitAction, null, 2916), new p820(zzsVar, str, m, z7l0Var, gVar.e.d(), null, null, null, GeoPointAcquisitionType.USER_LOCATION, false, 3552));
        i4v0 i4v0Var = i4v0.j;
        eci0 g = gVar.g(d2tVar, sms.g(null, null, null, z, 6), valueOf);
        gVar.a(g, d2tVar);
        return s(new ru.yandex.taxi.persuggest.domain.d(g));
    }

    public final pv0 r(g2t g2tVar) {
        sxq0 sxq0Var = g2tVar.a.a.d;
        if (sxq0Var == null) {
            g8e.A(jst.e, "Services state is null");
            return null;
        }
        rtx0 rtx0Var = sxq0Var.a;
        if (rtx0Var == null) {
            g8e.A(jst.e, "Taxi service state is null");
            return null;
        }
        if (rtx0Var.a == null) {
            g8e.A(jst.e, "Taxi service state is unavailable");
            return null;
        }
        pv0 m = m(g2tVar, true);
        if (m == null) {
            return null;
        }
        urv0 urv0Var = this.j;
        z7l0 z7l0Var = g2tVar.b.d;
        synchronized (urv0Var) {
            if (z7l0Var == RoutePointType.POINT_A) {
                k56 k56Var = m.b;
                urv0Var.b = k56Var.e;
                urv0Var.c = k56Var.f;
            }
        }
        eub0 eub0Var = this.i;
        eub0Var.a.l(m.i);
        return m;
    }

    public final tpr s(tpr tprVar) {
        h hVar = new h(tprVar, this);
        this.a.getClass();
        return kotlinx.coroutines.flow.e.F(hVar, uyj.a);
    }

    public final tpr t(zzs zzsVar, RoutePointType routePointType) {
        String m = this.b.m();
        ru.yandex.taxi.persuggest.domain.g gVar = this.e;
        gVar.getClass();
        d2t d2tVar = new d2t(new o9j0(routePointType, zzsVar, null, false, false, null, null, null, null, null, null, 4092), new p820(zzsVar, "auto", m, routePointType, gVar.e.d(), null, null, null, GeoPointAcquisitionType.USER_LOCATION, false, 3552));
        eci0 h = ru.yandex.taxi.persuggest.domain.g.h(gVar, d2tVar, null, 6);
        gVar.a(h, d2tVar);
        return s(new ru.yandex.taxi.persuggest.domain.d(h));
    }
}
