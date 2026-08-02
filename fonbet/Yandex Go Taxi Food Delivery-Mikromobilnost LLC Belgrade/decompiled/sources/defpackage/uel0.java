package defpackage;

import ru.yandex.taxi.masstransit.model.RouteType;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* loaded from: classes6.dex */
public final class uel0 {
    public static RouteType a(String str) {
        return str == null ? RouteType.ROUTE_TYPE_BUS : (str.equals("bus") || str.equals("metrobus")) ? RouteType.ROUTE_TYPE_BUS : (str.equals("minibus") || str.equals("dolmus")) ? RouteType.ROUTE_TYPE_MINIBUS : (str.equals("tramway") || str.equals("historic_tram")) ? RouteType.ROUTE_TYPE_TRAMWAY : (str.equals("underground") || str.equals("rapid_tram") || str.equals("s-bahn")) ? RouteType.ROUTE_TYPE_UNDERGROUND : (str.equals("railway") || str.equals("suburban") || str.equals("aeroexpress")) ? RouteType.ROUTE_TYPE_RAILWAY : (str.equals("water") || str.equals("ferry")) ? RouteType.ROUTE_TYPE_WATER : str.equals("trolleybus") ? RouteType.ROUTE_TYPE_TROLLEYBUS : str.equals("funicular") ? RouteType.ROUTE_TYPE_FUNICULAR : str.equals("cable") ? RouteType.ROUTE_TYPE_CABLE : str.equals("aero") ? RouteType.ROUTE_TYPE_AERO : str.equals(TariffOrderFlow.ORDER_FLOW_SHUTTLE_KEY) ? RouteType.ROUTE_TYPE_SHUTTLE : RouteType.ROUTE_TYPE_BUS;
    }
}
