package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.payments.api.preorder.SuitabilityCheckType;
import com.yandex.go.preorder.deeplinks.route.RouteData$Continuation;
import com.yandex.go.route.interactor.c;
import com.yandex.go.taxi.summary.experiments.SummaryPerformanceOptimisationsExperiment;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.model.Zone;
import defpackage.bov0;
import defpackage.jl40;
import defpackage.o400;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wse0;
import java.util.HashMap;
import java.util.function.Consumer;
import kotlin.a;
import ru.yandex.taxi.am.g;
import ru.yandex.taxi.preorder.source.domain.p;

/* loaded from: classes13.dex */
public final class wse0 extends h55 {
    public final kpi0 D;
    public final b0j E;
    public final ck31 F;
    public final tit0 G;
    public final oft0 H;
    public final icv0 I;
    public final g J;
    public final yvf0 K;
    public final c L;
    public final yvf0 M;
    public final yvf0 N;
    public final fy01 O;
    public final a850 P;
    public final bwx0 Q;
    public final tte0 R;
    public final p S;
    public final amp0 T;
    public final hit0 U;
    public final biv0 V;
    public final x7k0 W;
    public final com.yandex.go.preorder.summary.c Z;
    public final tiv0 a0;
    public final i3y b0;
    public final i3y c0;
    public boolean d0;

    public wse0(kpi0 kpi0Var, b0j b0jVar, ck31 ck31Var, tit0 tit0Var, oft0 oft0Var, icv0 icv0Var, g gVar, yvf0 yvf0Var, c cVar, yvf0 yvf0Var2, yvf0 yvf0Var3, fy01 fy01Var, a850 a850Var, bwx0 bwx0Var, tte0 tte0Var, p pVar, amp0 amp0Var, hit0 hit0Var, biv0 biv0Var, x7k0 x7k0Var, yvf0 yvf0Var4, com.yandex.go.preorder.summary.c cVar2, tiv0 tiv0Var) {
        super(null);
        this.D = kpi0Var;
        this.E = b0jVar;
        this.F = ck31Var;
        this.G = tit0Var;
        this.H = oft0Var;
        this.I = icv0Var;
        this.J = gVar;
        this.K = yvf0Var;
        this.L = cVar;
        this.M = yvf0Var2;
        this.N = yvf0Var3;
        this.O = fy01Var;
        this.P = a850Var;
        this.Q = bwx0Var;
        this.R = tte0Var;
        this.S = pVar;
        this.T = amp0Var;
        this.U = hit0Var;
        this.V = biv0Var;
        this.W = x7k0Var;
        this.Z = cVar2;
        this.a0 = tiv0Var;
        final int i = 0;
        this.b0 = a.a(new sls(this) { // from class: rse0
            public final /* synthetic */ wse0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i2 = i;
                wse0 wse0Var = this.b;
                switch (i2) {
                    case 0:
                        amp0 amp0Var2 = wse0Var.T;
                        xcv0 xcv0Var = (xcv0) amp0Var2.c;
                        HashMap q = tse0.q(xcv0Var);
                        HashMap hashMap = new HashMap();
                        pho phoVar = xcv0Var.a;
                        phoVar.a("Summary.Router.Init.Start", q, 1, hashMap);
                        q0g q0gVar = (q0g) ((h3y) amp0Var2.b).get();
                        h0g h0gVar = (h0g) ((h3y) amp0Var2.a).get();
                        q0gVar.getClass();
                        h0gVar.getClass();
                        gov0 gov0Var = (gov0) new d1g(h0gVar).u4.get();
                        x4e.B(phoVar, "Summary.Router.Init.End", new HashMap(), 1);
                        return gov0Var;
                    default:
                        return new use0(wse0Var);
                }
            }
        });
        final int i2 = 1;
        this.c0 = a.a(new sls(this) { // from class: rse0
            public final /* synthetic */ wse0 b;

            {
                this.b = this;
            }

            @Override // defpackage.sls
            public final Object invoke() {
                int i22 = i2;
                wse0 wse0Var = this.b;
                switch (i22) {
                    case 0:
                        amp0 amp0Var2 = wse0Var.T;
                        xcv0 xcv0Var = (xcv0) amp0Var2.c;
                        HashMap q = tse0.q(xcv0Var);
                        HashMap hashMap = new HashMap();
                        pho phoVar = xcv0Var.a;
                        phoVar.a("Summary.Router.Init.Start", q, 1, hashMap);
                        q0g q0gVar = (q0g) ((h3y) amp0Var2.b).get();
                        h0g h0gVar = (h0g) ((h3y) amp0Var2.a).get();
                        q0gVar.getClass();
                        h0gVar.getClass();
                        gov0 gov0Var = (gov0) new d1g(h0gVar).u4.get();
                        x4e.B(phoVar, "Summary.Router.Init.End", new HashMap(), 1);
                        return gov0Var;
                    default:
                        return new use0(wse0Var);
                }
            }
        });
        this.d0 = true;
    }

    @Override // defpackage.h55
    public final void G(Object obj) {
        if (gtq0.u((gov0) this.b0.getValue()) && !this.d0) {
            bov0 a = this.V.a();
            if (a == null) {
                a = bov0.e;
            }
            R(a);
        }
        this.d0 = false;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        this.U.a.remove((use0) this.c0.getValue());
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        this.d0 = true;
        this.U.a.add((use0) this.c0.getValue());
        P(((yse0) obj).a);
    }

    public final void P(xse0 xse0Var) {
        this.D.b();
        pv0 pv0Var = xse0Var.d;
        if (this.E.a()) {
            D((m950) this.K.get(), new szi(null, null, 3), new vse0(this, xse0Var));
            return;
        }
        if (!this.J.g()) {
            r(new k7d0(21, xse0Var));
            return;
        }
        if (!this.I.a(new SuitabilityCheckType[0])) {
            D((m950) this.M.get(), tjv0.c, new cb0(16, this, xse0Var));
            return;
        }
        Address g = this.L.g();
        if (g == null || g.X1() || ((k) this.F).j().a.isEmpty()) {
            r(new vld0(18));
            return;
        }
        if (pv0Var != null) {
            mq40 mq40Var = pv0Var.c;
            if (mq40Var.a() != null) {
                wq40 b = mq40Var.b();
                if (b == null) {
                    b = mq40Var.a();
                }
                jr40 c = mq40Var.c(b);
                tit0 tit0Var = this.G;
                tit0Var.k = true;
                tit0Var.d = mq40Var;
                tit0Var.q = b;
                tit0Var.o = b;
                tit0Var.p = c;
                tit0Var.n = c;
                Q(xse0Var);
                return;
            }
        }
        this.W.a.getClass();
        Q(xse0Var);
    }

    public final void Q(xse0 xse0Var) {
        bov0 bov0Var;
        RouteData$Continuation routeData$Continuation = xse0Var.e;
        if (routeData$Continuation == RouteData$Continuation.SELECT_COPTER_CITY_TOUR) {
            z((m950) this.N.get(), new sse0(this, 0));
        }
        k9s0 k9s0Var = xse0Var.c;
        if (k9s0Var == null || (bov0Var = k9s0Var.e) == null) {
            jhv0 jhv0Var = new jhv0(xse0Var.a, false);
            khv0 ehv0Var = routeData$Continuation == RouteData$Continuation.SCHEDULE_RIDE ? new ehv0(jhv0Var) : new bhv0(jhv0Var);
            ijv0 ijv0Var = xse0Var.b;
            if (ijv0Var == null) {
                ijv0Var = this.H.c.c;
            }
            boolean z = xse0Var.f;
            bov0Var = new bov0(z, ehv0Var, ijv0Var, z);
        }
        R(bov0Var);
    }

    public final void R(final bov0 bov0Var) {
        this.P.i("order_summary", true);
        ((nwx0) this.O).a.c().o8();
        oft0 oft0Var = this.H;
        oft0Var.getClass();
        oft0Var.c = bov0Var;
        this.Q.a();
        Consumer consumer = new Consumer() { // from class: com.yandex.go.preorder.navigation.i
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                wse0 wse0Var = wse0.this;
                ru.yandex.taxi.preorder.source.domain.p pVar = wse0Var.S;
                boolean z = ((SummaryPerformanceOptimisationsExperiment) wse0Var.a0.a.b.b()).e;
                bov0 bov0Var2 = bov0Var;
                if (!z) {
                    pVar.c(bov0Var2);
                    return;
                }
                com.yandex.go.preorder.summary.c cVar = wse0Var.Z;
                ZoneAddress zoneAddress = cVar.a.c().a;
                Zone zone = zoneAddress != null ? zoneAddress.b : null;
                if (zone != null) {
                    Zone b = cVar.c.b();
                    if (jl40.l(b != null ? b.a : null, zone.a)) {
                        pVar.c(bov0Var2);
                        return;
                    }
                }
                tse o = wse0Var.o();
                sjh sjhVar = uyj.a;
                tje.N(o, o400.a.x, null, new PreorderSummaryNavigationRouter$onSourceAddressConfirmed$1(wse0Var, bov0Var2, null), 2);
            }
        };
        tte0 tte0Var = this.R;
        ru.yandex.taxi.preorder.source.domain.a aVar = tte0Var.a;
        aVar.a(tte0Var.c);
        aVar.e(consumer);
        tte0Var.f();
    }
}
