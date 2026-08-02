package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import ru.yandex.taxi.masstransit.analytic.MtDetailRouteCardCloseReason;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardSource;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardTappedButtonV2;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$DetailCardType;
import ru.yandex.taxi.masstransit.analytic.TransportRouteAnalytics$VehicleType;

/* loaded from: classes6.dex */
public final class yw30 {
    public final b611 a;
    public final mb11 b;
    public final ih01 c;

    public yw30(b611 b611Var, mb11 mb11Var, ih01 ih01Var) {
        this.a = b611Var;
        this.b = mb11Var;
        this.c = ih01Var;
    }

    public final void a(MtDetailRouteCardCloseReason mtDetailRouteCardCloseReason, TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource, TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType) {
        int i = xw30.a[mtDetailRouteCardCloseReason.ordinal()];
        b611 b611Var = this.a;
        if (i == 1) {
            b611Var.d(transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType);
            return;
        }
        if (i == 2) {
            b611Var.e(transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType);
        } else if (i == 3) {
            b611Var.c(transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardType);
        } else {
            w511.b();
        }
    }

    public final void c(TransportRouteAnalytics$DetailCardTappedButtonV2 transportRouteAnalytics$DetailCardTappedButtonV2, TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource, TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType, List list, TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType) {
        b611 b611Var = this.a;
        HashMap o = smw0.o(b611Var);
        o.put("button", transportRouteAnalytics$DetailCardTappedButtonV2.getEventValue());
        if (transportRouteAnalytics$VehicleType != null) {
            o.put("vehicle_type", transportRouteAnalytics$VehicleType.getEventValue());
        }
        o.put("masstransit_type", list);
        o.put("source", transportRouteAnalytics$DetailCardSource.getEventValue());
        o.put("type", transportRouteAnalytics$DetailCardType.getEventValue());
        b611Var.a.a("TransportRoute.DetailCard.Tapped", o, 2, new HashMap());
    }

    public final void d(ArrayList arrayList, TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource, TransportRouteAnalytics$DetailCardType transportRouteAnalytics$DetailCardType) {
        b611 b611Var = this.a;
        b611Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("vehicle_type", arrayList);
        hashMap.put("source", transportRouteAnalytics$DetailCardSource.getEventValue());
        hashMap.put("type", transportRouteAnalytics$DetailCardType.getEventValue());
        b611Var.a.a("TransportRoute.DetailCardTickets.Shown", hashMap, 2, new HashMap());
    }
}
