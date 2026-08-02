package defpackage;

import com.yandex.go.chargers.api.ChargersOpenReason;
import com.yandex.go.superapp.impl.router.a;
import com.yandex.go.taxi.order.analytics.DetailsOpenReason;
import com.yandex.go.taxi.order.api.details.TaxiCardNavigationAction;
import com.yandex.go.taxi.order.cache.api.data.model.OrderType;
import ru.yandex.taxi.common_models.SupportedEatsServices;
import ru.yandex.taxi.logistics.delivery_state.DeliveryStateBaseParams;
import ru.yandex.taxi.multiorder.multi.ServiceType;

/* loaded from: classes.dex */
public final class u5w0 {
    public final y50 a;
    public final oep0 b;
    public final j5y0 c;
    public final yvf0 d;
    public final nf e;
    public final yvf0 f;
    public final yvf0 g;
    public final jv21 h;
    public final h3y i;
    public final i1w0 j;
    public final h3y k;
    public final yvf0 l;
    public final mjv0 m;

    public u5w0(y50 y50Var, oep0 oep0Var, j5y0 j5y0Var, yvf0 yvf0Var, nf nfVar, yvf0 yvf0Var2, yvf0 yvf0Var3, jv21 jv21Var, h3y h3yVar, i1w0 i1w0Var, h3y h3yVar2, yvf0 yvf0Var4, mjv0 mjv0Var) {
        this.a = y50Var;
        this.b = oep0Var;
        this.c = j5y0Var;
        this.d = yvf0Var;
        this.e = nfVar;
        this.f = yvf0Var2;
        this.g = yvf0Var3;
        this.h = jv21Var;
        this.i = h3yVar;
        this.j = i1w0Var;
        this.k = h3yVar2;
        this.l = yvf0Var4;
        this.m = mjv0Var;
    }

    public final void a(w201 w201Var) {
        boolean z = w201Var instanceof q6y0;
        j5y0 j5y0Var = this.c;
        i1w0 i1w0Var = this.j;
        if (z) {
            i1w0Var.a(ServiceType.TAXI.getAlias());
            ((i6y0) ((g6y0) this.k.get())).c(wfz.V);
            ((a) j5y0Var.e).b(((q6y0) w201Var).y().b(), true, DetailsOpenReason.HEADER, TaxiCardNavigationAction.EMPTY, new q251(10));
            return;
        }
        boolean z2 = w201Var instanceof d3p;
        oep0 oep0Var = this.b;
        if (z2) {
            d3p d3pVar = (d3p) w201Var;
            h1p h1pVar = d3pVar.c;
            i1w0Var.a(h1pVar.getValue());
            y2p y2pVar = d3pVar.l;
            if (y2pVar != null) {
                ((a60) this.a).c(y2pVar.a(), v770.b);
                return;
            } else {
                ((pep0) oep0Var).f((m950) this.l.get(), new p3p(new mvx(h1pVar, d3pVar.a, jl40.l(h1pVar.getValue(), SupportedEatsServices.MARKET.getKey()))), hxx.a);
                return;
            }
        }
        if (w201Var instanceof bjz) {
            i1w0Var.a(ServiceType.LOGISTICS.getAlias());
            j5y0Var.a.getClass();
            DeliveryStateBaseParams a = bsi.a((bjz) w201Var, null);
            if (a != null) {
                j5y0Var.b.d(a);
                return;
            }
            return;
        }
        if (w201Var instanceof y2y0) {
            i1w0Var.a(ServiceType.LINKED.getAlias());
            y2y0 y2y0Var = (y2y0) w201Var;
            String str = y2y0Var.a;
            int i = t5w0.a[y2y0Var.i.ordinal()];
            if (i == 1) {
                ((pep0) j5y0Var.c).f((m950) j5y0Var.d.get(), new c5y0(str, OrderType.DEFAULT), hxx.a);
                return;
            } else if (i == 2) {
                ((pep0) j5y0Var.c).f((m950) j5y0Var.d.get(), new c5y0(str, OrderType.AMBULANCE), hxx.a);
                return;
            } else {
                w511.b();
                return;
            }
        }
        if (w201Var instanceof q6o0) {
            i1w0Var.a(ServiceType.SCOOTERS.getAlias());
            m950 m950Var = (m950) this.f.get();
            pxm0 b = w0b1.b();
            zuo0 zuo0Var = ((q6o0) w201Var).g;
            String sessionId = zuo0Var.getSessionId();
            zzs k = zuo0Var.k();
            ((pep0) oep0Var).f(m950Var, new ovn0(b, sessionId, k != null ? new lvn0(k) : null), hxx.a);
            return;
        }
        if (w201Var instanceof xda) {
            i1w0Var.a(ServiceType.CHARGERS.getAlias());
            ((pep0) oep0Var).f((m950) this.g.get(), new n2a(ChargersOpenReason.DETAILED_ORDER, ((xda) w201Var).a), hxx.a);
            return;
        }
        if (w201Var instanceof jem) {
            i1w0Var.a(ServiceType.DRIVE.getAlias());
            ((pep0) oep0Var).f((m950) this.d.get(), new rdm(((jem) w201Var).a), hxx.a);
            return;
        }
        if (w201Var instanceof v7y0) {
            ((pep0) oep0Var).f((m950) this.e.get(), ((v7y0) w201Var).m(), hxx.a);
            return;
        }
        if (w201Var instanceof qg50) {
            int i2 = t5w0.b[((qg50) w201Var).f.ordinal()];
            if (i2 == 1) {
                ((kc50) this.i.get()).a(this.m.a.isEmpty() ? null : new bov0(false, (khv0) null, (ijv0) djv0.a, 11), ud50.f);
            } else if (i2 == 2) {
                ((pep0) oep0Var).f((m950) this.h.get(), zy11.a, hxx.a);
            } else {
                w511.b();
            }
        }
    }
}
