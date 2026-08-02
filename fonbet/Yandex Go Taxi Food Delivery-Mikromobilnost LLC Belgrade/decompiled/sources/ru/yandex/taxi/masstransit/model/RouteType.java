package ru.yandex.taxi.masstransit.model;

import defpackage.k4o;
import defpackage.uel0;
import kotlin.Metadata;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lru/yandex/taxi/masstransit/model/RouteType;", "", "", "type", "Ljava/lang/String;", "Companion", "uel0", "ROUTE_TYPE_BUS", "ROUTE_TYPE_MINIBUS", "ROUTE_TYPE_TRAMWAY", "ROUTE_TYPE_UNDERGROUND", "ROUTE_TYPE_RAILWAY", "ROUTE_TYPE_WATER", "ROUTE_TYPE_TROLLEYBUS", "ROUTE_TYPE_FUNICULAR", "ROUTE_TYPE_CABLE", "ROUTE_TYPE_AERO", "ROUTE_TYPE_SHUTTLE", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RouteType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteType[] $VALUES;
    public static final uel0 Companion;
    public static final RouteType ROUTE_TYPE_AERO;
    public static final RouteType ROUTE_TYPE_BUS;
    public static final RouteType ROUTE_TYPE_CABLE;
    public static final RouteType ROUTE_TYPE_FUNICULAR;
    public static final RouteType ROUTE_TYPE_MINIBUS;
    public static final RouteType ROUTE_TYPE_RAILWAY;
    public static final RouteType ROUTE_TYPE_SHUTTLE;
    public static final RouteType ROUTE_TYPE_TRAMWAY;
    public static final RouteType ROUTE_TYPE_TROLLEYBUS;
    public static final RouteType ROUTE_TYPE_UNDERGROUND;
    public static final RouteType ROUTE_TYPE_WATER;
    private final String type;

    static {
        RouteType routeType = new RouteType("ROUTE_TYPE_BUS", 0, "bus");
        ROUTE_TYPE_BUS = routeType;
        RouteType routeType2 = new RouteType("ROUTE_TYPE_MINIBUS", 1, "minibus");
        ROUTE_TYPE_MINIBUS = routeType2;
        RouteType routeType3 = new RouteType("ROUTE_TYPE_TRAMWAY", 2, "tramway");
        ROUTE_TYPE_TRAMWAY = routeType3;
        RouteType routeType4 = new RouteType("ROUTE_TYPE_UNDERGROUND", 3, "underground");
        ROUTE_TYPE_UNDERGROUND = routeType4;
        RouteType routeType5 = new RouteType("ROUTE_TYPE_RAILWAY", 4, "railway");
        ROUTE_TYPE_RAILWAY = routeType5;
        RouteType routeType6 = new RouteType("ROUTE_TYPE_WATER", 5, "water");
        ROUTE_TYPE_WATER = routeType6;
        RouteType routeType7 = new RouteType("ROUTE_TYPE_TROLLEYBUS", 6, "trolleybus");
        ROUTE_TYPE_TROLLEYBUS = routeType7;
        RouteType routeType8 = new RouteType("ROUTE_TYPE_FUNICULAR", 7, "funicular");
        ROUTE_TYPE_FUNICULAR = routeType8;
        RouteType routeType9 = new RouteType("ROUTE_TYPE_CABLE", 8, "cable");
        ROUTE_TYPE_CABLE = routeType9;
        RouteType routeType10 = new RouteType("ROUTE_TYPE_AERO", 9, "aero");
        ROUTE_TYPE_AERO = routeType10;
        RouteType routeType11 = new RouteType("ROUTE_TYPE_SHUTTLE", 10, TariffOrderFlow.ORDER_FLOW_SHUTTLE_KEY);
        ROUTE_TYPE_SHUTTLE = routeType11;
        RouteType[] routeTypeArr = {routeType, routeType2, routeType3, routeType4, routeType5, routeType6, routeType7, routeType8, routeType9, routeType10, routeType11};
        $VALUES = routeTypeArr;
        $ENTRIES = kotlin.enums.a.a(routeTypeArr);
        Companion = new uel0();
    }

    public RouteType(String str, int i, String str2) {
        this.type = str2;
    }

    public static k4o a() {
        return $ENTRIES;
    }

    public static RouteType valueOf(String str) {
        return (RouteType) Enum.valueOf(RouteType.class, str);
    }

    public static RouteType[] values() {
        return (RouteType[]) $VALUES.clone();
    }

    /* renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }
}
