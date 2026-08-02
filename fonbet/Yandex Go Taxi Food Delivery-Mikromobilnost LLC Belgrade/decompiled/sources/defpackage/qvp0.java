package defpackage;

import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.response.OrderStatusInfo;
import com.yandex.go.taxi.order.models.api.response.SearchOverlayType;
import com.yandex.go.taxi.order.queue.interactor.d;
import java.util.LinkedHashMap;

/* loaded from: classes14.dex */
public final class qvp0 {
    public final hnz a;
    public final d b;
    public final a3y0 c = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "SearchOverlayProvider");
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();

    public qvp0(hnz hnzVar, d dVar) {
        this.a = hnzVar;
        this.b = dVar;
    }

    public final SearchOverlayType a(TaxiOrder taxiOrder, OrderStatusInfo orderStatusInfo, SearchOverlayType searchOverlayType) {
        if (jl40.l(orderStatusInfo, OrderStatusInfo.y0)) {
            this.b.getClass();
            return d.a(taxiOrder) != null ? SearchOverlayType.QUEUE : SearchOverlayType.NONE;
        }
        String str = taxiOrder.a;
        LinkedHashMap linkedHashMap = this.e;
        Object obj = linkedHashMap.get(str);
        if (obj == null) {
            obj = -1;
            linkedHashMap.put(str, obj);
        }
        linkedHashMap.put(str, Integer.valueOf(((Number) obj).intValue() + 1));
        SearchOverlayType searchOverlayType2 = SearchOverlayType.NONE;
        if (searchOverlayType == searchOverlayType2) {
            this.a.a();
            searchOverlayType = SearchOverlayType.SEARCH_CARS_OVERLAY_STRATEGY;
        }
        if (searchOverlayType != searchOverlayType2) {
            this.d.put(str, searchOverlayType);
        }
        this.c.getClass();
        a3y0.h(new String[]{"getSearchOverlayType"});
        hst hstVar = jst.e;
        return searchOverlayType;
    }
}
