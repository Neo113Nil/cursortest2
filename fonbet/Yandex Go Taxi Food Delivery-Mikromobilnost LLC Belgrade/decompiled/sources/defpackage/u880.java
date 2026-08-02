package defpackage;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.objects.RouteInfo;

/* loaded from: classes10.dex */
public final class u880 {
    public final zuj0 a;
    public final xdf b;

    public u880(zuj0 zuj0Var, xdf xdfVar) {
        this.a = zuj0Var;
        this.b = xdfVar;
    }

    public final String a(RouteInfo routeInfo) {
        int b = (int) (routeInfo.getB() / 60.0d);
        int c = (int) (routeInfo.getC() / 60.0d);
        zuj0 zuj0Var = this.a;
        if (c > b) {
            return ((avj0) zuj0Var).i(kyh0.taxiotw_timeleft_range_waiting, Integer.valueOf(b), Integer.valueOf(c));
        }
        return ((avj0) zuj0Var).i(kyh0.taxiotw_timeleft_waiting, String.valueOf(b));
    }

    public final String b(TaxiOrder taxiOrder) {
        int i;
        switch (t880.a[taxiOrder.h.getB().ordinal()]) {
            case 1:
            case 2:
                i = kyh0.notification_search;
                break;
            case 3:
                i = kyh0.notification_driving;
                break;
            case 4:
                i = kyh0.notification_waiting;
                break;
            case 5:
                i = kyh0.notification_transporting;
                break;
            case 6:
                i = kyh0.notification_complete;
                break;
            case 7:
            case 8:
                i = kyh0.notification_failed;
                break;
            case 9:
                i = kyh0.notification_expired;
                break;
            default:
                i = kyh0.notification_default;
                break;
        }
        return ((avj0) this.a).h(i);
    }
}
