package defpackage;

import com.yandex.go.analytics.realtime.a;
import com.yandex.go.analytics.realtime.event.CreativeType;
import com.yandex.go.analytics.realtime.event.RealtimeEventType;
import com.yandex.go.analytics.view_tracking.ViewVisibilityTracker$SingleState;
import com.yandex.go.taxi.order.logger.TaxiOrderLogGroup;
import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.taxi.order.models.api.screen.OrderScreen;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.builders.MapBuilder;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.communications.model.CommunicationItem;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class wpf0 {
    public final dei0 a;
    public final ypf0 b;
    public final a3y0 c = new a3y0(TaxiOrderLogGroup.EMPTY.getTag(), "PromoPlaqueRealtimeAnalytics");
    public final boolean d;
    public final EnumMap e;
    public final LinkedHashMap f;
    public o2y0 g;
    public OrderScreen h;
    public final EnumMap i;
    public final MapBuilder j;
    public final Set k;

    public wpf0(dei0 dei0Var, ypf0 ypf0Var) {
        this.a = dei0Var;
        this.b = ypf0Var;
        this.d = ((Boolean) ((a) dei0Var).d.getValue()).booleanValue();
        EnumMap enumMap = new EnumMap(RealtimeEventType.class);
        Iterator<E> it = RealtimeEventType.a().iterator();
        while (it.hasNext()) {
            enumMap.put((EnumMap) it.next(), (RealtimeEventType) new LinkedHashSet());
        }
        enumMap.remove(RealtimeEventType.Clicked);
        this.e = enumMap;
        this.f = new LinkedHashMap();
        EnumMap enumMap2 = new EnumMap(OrderScreen.class);
        Iterator<E> it2 = OrderScreen.a().iterator();
        while (it2.hasNext()) {
            enumMap2.put((EnumMap) it2.next(), (OrderScreen) EmptyList.a);
        }
        this.i = enumMap2;
        MapBuilder mapBuilder = new MapBuilder();
        Set singleton = Collections.singleton(CommunicationItem.DisplayOnType.MULTIORDER);
        mapBuilder.put(OrderScreen.ORDER_TRACKING, singleton);
        mapBuilder.put(OrderScreen.ORDER_LIST, singleton);
        mapBuilder.put(OrderScreen.ORDER_DETAILS, j73.f0(new CommunicationItem.DisplayOnType[]{CommunicationItem.DisplayOnType.DETAILS, CommunicationItem.DisplayOnType.DETAILS_TOP}));
        this.j = mapBuilder.j();
        this.k = j73.f0(new DriveState[]{DriveState.FAILED, DriveState.CANCELLED});
    }

    public static MapBuilder b(TaxiOrder taxiOrder) {
        DriveState driveState;
        MapBuilder mapBuilder = new MapBuilder();
        if (taxiOrder != null) {
            mapBuilder.put("tariff_class", taxiOrder.x());
        }
        if (taxiOrder != null && (driveState = taxiOrder.h.b) != null) {
            int i = vpf0.a[driveState.ordinal()];
            String str = i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : "totw_complete" : "totw_transporting" : "totw_waiting" : "totw_driving" : "totw_search";
            if (str != null) {
                mapBuilder.put(MetaDataField.SCREEN_FIELD, str);
            }
        }
        return mapBuilder.j();
    }

    public final boolean a(CommunicationItem communicationItem, OrderScreen orderScreen) {
        Set set;
        jsq0 jsq0Var = communicationItem.j;
        if (jsq0Var == null) {
            return true;
        }
        List list = jsq0Var.a;
        if (orderScreen == null || (set = (Set) this.j.get(orderScreen)) == null || list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (kotlin.collections.a.G(set, (CommunicationItem.DisplayOnType) it.next())) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        Set keySet;
        l8x l8xVar;
        a3y0.a(this.c, new String[]{oyr.j(hashCode(), " ", " invalidate")}, null, 6);
        Iterator it = this.e.values().iterator();
        while (it.hasNext()) {
            ((Set) it.next()).clear();
        }
        ViewVisibilityTracker$SingleState viewVisibilityTracker$SingleState = ViewVisibilityTracker$SingleState.Initial;
        ypf0 ypf0Var = this.b;
        LinkedHashMap linkedHashMap = ypf0Var.e;
        Set set = (Set) ypf0Var.d.get(viewVisibilityTracker$SingleState);
        if (set != null) {
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                it2.remove();
            }
        }
        Map map = (Map) linkedHashMap.get(viewVisibilityTracker$SingleState);
        if (map == null || (keySet = map.keySet()) == null) {
            return;
        }
        for (String str : kotlin.collections.a.J0(keySet)) {
            Map map2 = (Map) linkedHashMap.get(viewVisibilityTracker$SingleState);
            if (map2 != null && (l8xVar = (l8x) map2.remove(str)) != null) {
                l8xVar.a(null);
            }
        }
    }

    public final void d(String str, Map map, MapBuilder mapBuilder, RealtimeEventType realtimeEventType) {
        Set set;
        if (map == null || map.isEmpty()) {
            return;
        }
        boolean z = true;
        if (realtimeEventType != RealtimeEventType.Clicked && (set = (Set) this.e.get(realtimeEventType)) != null) {
            boolean contains = set.contains(str);
            if (!contains) {
                set.add(str);
            }
            z = true ^ contains;
        }
        if (z) {
            this.c.getClass();
            a3y0.h(new String[]{"report"});
            hst hstVar = jst.e;
            ((a) this.a).d(new jei0(realtimeEventType, CreativeType.PromoOnSummary, 0L, str, map, mapBuilder, 68));
        }
    }
}
