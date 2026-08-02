package defpackage;

import com.yandex.go.taxi.order.api.change.destination.RouteChangeType;
import com.yandex.go.taxi.order.recalculation.experiment.PriceRecalculationExperiment;
import kotlin.a;

/* loaded from: classes14.dex */
public final class yze0 {
    public final i3y a;

    public yze0(rqo rqoVar) {
        this.a = a.a(new xn3(rqoVar, 9));
    }

    public final String a() {
        PriceRecalculationExperiment d = d();
        return (String) d.c.getOrDefault(d.f.g, "");
    }

    public final String b() {
        PriceRecalculationExperiment d = d();
        return (String) d.c.getOrDefault(d.f.h, "");
    }

    public final String c() {
        PriceRecalculationExperiment d = d();
        return (String) d.c.getOrDefault(d.f.f, "");
    }

    public final PriceRecalculationExperiment d() {
        return (PriceRecalculationExperiment) ((qqo) this.a.getValue()).b();
    }

    public final String e(RouteChangeType routeChangeType) {
        int i = xze0.a[routeChangeType.ordinal()];
        if (i == 1) {
            PriceRecalculationExperiment d = d();
            return (String) d.c.getOrDefault(d.f.c, "");
        }
        if (i == 2) {
            PriceRecalculationExperiment d2 = d();
            return (String) d2.c.getOrDefault(d2.f.a, "");
        }
        if (i == 3) {
            PriceRecalculationExperiment d3 = d();
            return (String) d3.c.getOrDefault(d3.f.b, "");
        }
        if (i == 4) {
            PriceRecalculationExperiment d4 = d();
            return (String) d4.c.getOrDefault(d4.f.e, "");
        }
        if (i == 5) {
            PriceRecalculationExperiment d5 = d();
            return (String) d5.c.getOrDefault(d5.f.d, "");
        }
        w511.b();
        return null;
    }
}
