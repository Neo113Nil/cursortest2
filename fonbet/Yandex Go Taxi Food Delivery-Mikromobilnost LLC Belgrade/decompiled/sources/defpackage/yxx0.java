package defpackage;

import com.yandex.go.taxi.order.analytics.TaxiOrderAnalytics$RideCardPresentation;
import com.yandex.go.taxi.order.analytics.TaxiOrderAnalytics$TaxiOrderStatus;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.builders.MapBuilder;

/* loaded from: classes8.dex */
public final class yxx0 {
    public final pho a;

    public yxx0(pho phoVar) {
        this.a = phoVar;
    }

    public static void b(yxx0 yxx0Var, String str, List list, String str2) {
        yxx0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("selected_tariffs", list);
        yxx0Var.a.a("TaxiOrder.TariffsSuggest.ApplyCompleted", hashMap, 1, tse0.r("suggest_id", hashMap, str2));
    }

    public static void c(yxx0 yxx0Var, String str, List list, String str2) {
        yxx0Var.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("order_id", str);
        hashMap.put("selected_tariffs", list);
        yxx0Var.a.a("TaxiOrder.TariffsSuggest.ApplyFailed", hashMap, 1, tse0.r("suggest_id", hashMap, str2));
    }

    public final void a(String str, TaxiOrderAnalytics$TaxiOrderStatus taxiOrderAnalytics$TaxiOrderStatus, TaxiOrderAnalytics$RideCardPresentation taxiOrderAnalytics$RideCardPresentation, String str2, String str3, MapBuilder mapBuilder) {
        HashMap p = x4e.p("order_id", str);
        p.put("order_status", taxiOrderAnalytics$TaxiOrderStatus.getEventValue());
        p.put("presentation", taxiOrderAnalytics$RideCardPresentation.getEventValue());
        p.put("analytics_id", str2);
        p.put("action", str3);
        if (mapBuilder != null) {
            p.put("item_specifics", mapBuilder);
        }
        this.a.a("TaxiOrder.RideCardItem.Tapped", p, 1, new HashMap());
    }
}
