package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes8.dex */
public final class wze0 implements vze0 {
    public final xdf a;

    public wze0(xdf xdfVar) {
        this.a = xdfVar;
    }

    public static String a(OrderStatusInfo.CostMessageDetails costMessageDetails) {
        if (costMessageDetails == null) {
            return "";
        }
        List<OrderStatusInfo.ExtraInfo> a = costMessageDetails.getA();
        if (a.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (OrderStatusInfo.ExtraInfo extraInfo : a) {
            if (extraInfo.getA().length() != 0) {
                sb.append(extraInfo.getA());
                sb.append('\n');
            }
        }
        if (sb.length() == 0) {
            return "";
        }
        sb.setLength(sb.length() - 1);
        return sb.toString();
    }

    public final pze0 b(TaxiOrder taxiOrder) {
        if (taxiOrder == null) {
            pze0 pze0Var = pze0.e;
            return p4a1.c();
        }
        pze0 pze0Var2 = pze0.e;
        oze0 b = p4a1.b();
        String str = taxiOrder.V().v;
        Double i = str != null ? avu0.i(str) : null;
        if (i == null || qpa1.d(i.doubleValue())) {
            str = taxiOrder.V().l;
        }
        ief iefVar = taxiOrder.V().K;
        b.b(iefVar);
        String g = taxiOrder.g();
        fef h = iefVar != null ? gwk0.h(iefVar) : null;
        xdf xdfVar = this.a;
        if ((g == null || evu0.J(g)) && (str == null || evu0.J(str))) {
            b.c(xdfVar.b(h, Double.valueOf(alb1.d(taxiOrder.V().k, taxiOrder.V().u))));
        } else if (g == null || evu0.J(g)) {
            b.c(xdfVar.a(h, str, false, false));
        } else {
            b.c(xdfVar.a(h, g, false, false));
        }
        b.e(kub1.e(xdfVar, iefVar, a(taxiOrder.V().T)));
        OrderStatusInfo.CostMessageDetails costMessageDetails = taxiOrder.V().T;
        if (costMessageDetails == null) {
            return b.a();
        }
        ArrayList arrayList = new ArrayList();
        for (OrderStatusInfo.CostBreakdown costBreakdown : costMessageDetails.getB()) {
            arrayList.add(new hze0(kub1.e(xdfVar, taxiOrder.V().K, costBreakdown.getC()), costBreakdown.getA(), costBreakdown.getB(), costBreakdown.getD()));
        }
        b.d(arrayList);
        return b.a();
    }
}
