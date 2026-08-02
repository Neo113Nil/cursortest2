package defpackage;

import com.yandex.go.address.models.Address;
import com.yandex.go.route.interactor.c;
import ru.yandex.taxi.logistics.experiments.DeliveryPvzExperiment;
import ru.yandex.taxi.logistics.experiments.k;

/* loaded from: classes5.dex */
public final class yjt0 {
    public final jdj a;
    public final wiq0 b;
    public final cwb c;
    public final wwf d;

    public yjt0(jdj jdjVar, wiq0 wiq0Var, cwb cwbVar, wwf wwfVar) {
        this.a = jdjVar;
        this.b = wiq0Var;
        this.c = cwbVar;
        this.d = wwfVar;
    }

    public final String a(boolean z) {
        String J1;
        Address d = ((dwb) this.c).d();
        boolean z2 = d == null;
        wwf wwfVar = this.d;
        wiq0 wiq0Var = (wiq0) wwfVar.c;
        k kVar = (k) wwfVar.a;
        pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).m();
        String str = m != null ? m.b : null;
        if (str == null) {
            str = "";
        }
        boolean f = kVar.f(str);
        if (!z2) {
            if (f) {
                Address g = ((c) wwfVar.b).g();
                boolean g2 = wwfVar.g();
                if (g2 && wwf.f(g)) {
                    DeliveryPvzExperiment b = kVar.b();
                    return wwf.b(g, d6z.Y(b, b.g));
                }
                if (!g2 && wwf.f(g)) {
                    DeliveryPvzExperiment b2 = kVar.b();
                    return d6z.Y(b2, b2.k);
                }
                if (g2) {
                    DeliveryPvzExperiment b3 = kVar.b();
                    if (evu0.J(d6z.Y(b3, b3.i))) {
                        return q5z.F(g);
                    }
                }
                DeliveryPvzExperiment b4 = kVar.b();
                return d6z.Y(b4, b4.i);
            }
            if (z) {
                return q5z.F(d);
            }
            pex0 m2 = ((com.yandex.go.taxi.tariffs.internal.repository.k) this.b).m();
            jdj jdjVar = this.a;
            r3o r3oVar = (r3o) jdjVar.c;
            if (d != null && ((q3o) r3oVar.a.b()).getB()) {
                tit0 tit0Var = ((wbt0) jdjVar.b).a;
                String str2 = tit0Var.g;
                if (d.A0() && (((J1 = d.J1()) == null || evu0.J(J1)) && !"manual.pickup_point_tap".equals(str2) && !"manual.pickup_point_drag".equals(str2) && !tit0Var.c())) {
                    wae0 wae0Var = (wae0) jdjVar.w;
                    wae0Var.getClass();
                    if (wae0Var.a(m2 != null ? m2.u0 : null)) {
                        q3o q3oVar = (q3o) r3oVar.a.b();
                        q3oVar.getClass();
                        return d6z.Y(q3oVar, "no_entrance_subtitle");
                    }
                }
            }
        }
        return "";
    }

    public final String b(boolean z) {
        cwb cwbVar = this.c;
        return z ? q5z.x(((dwb) cwbVar).d()) : q5z.F(((dwb) cwbVar).d());
    }
}
