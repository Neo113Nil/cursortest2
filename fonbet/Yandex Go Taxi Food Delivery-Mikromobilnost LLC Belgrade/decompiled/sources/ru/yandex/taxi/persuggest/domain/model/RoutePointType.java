package ru.yandex.taxi.persuggest.domain.model;

import defpackage.eqj0;
import defpackage.gsq0;
import defpackage.i3y;
import defpackage.k4o;
import defpackage.y7l0;
import defpackage.z7l0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@gsq0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0019\b\u0087\u0081\u0002\u0018\u0000 \b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, d2 = {"Lru/yandex/taxi/persuggest/domain/model/RoutePointType;", "Lz7l0;", "", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "Companion", "y7l0", "POINT_A", "POINT_B", "POINT_MID", "SERVICE_EATS", "SERVICE_CHARGERS", "SERVICE_SCOOTERS", "FAVORITE", "CITY_SUGGEST", "DISCOVERY_ORGANIZATION", "SUPERAPP_DISCOVERY_MAP", "SERVICE_NAVIGATOR_A", "SERVICE_NAVIGATOR_B", "TRANSPORT_A", "TRANSPORT_B", "SUGGEST_MENU_POINT_A", "SUGGEST_MENU_POINT_B", "DELIVERY_NDD_SOURCE", "DELIVERY_NDD_DESTINATION", "go-client-android.features:common_models"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RoutePointType implements z7l0 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RoutePointType[] $VALUES;
    private static final i3y $cachedSerializer$delegate;
    public static final RoutePointType CITY_SUGGEST;
    public static final y7l0 Companion;
    public static final RoutePointType DELIVERY_NDD_DESTINATION;
    public static final RoutePointType DELIVERY_NDD_SOURCE;
    public static final RoutePointType DISCOVERY_ORGANIZATION;
    public static final RoutePointType FAVORITE;
    public static final RoutePointType POINT_A;
    public static final RoutePointType POINT_B;
    public static final RoutePointType POINT_MID;
    public static final RoutePointType SERVICE_CHARGERS;
    public static final RoutePointType SERVICE_EATS;
    public static final RoutePointType SERVICE_NAVIGATOR_A;
    public static final RoutePointType SERVICE_NAVIGATOR_B;
    public static final RoutePointType SERVICE_SCOOTERS;
    public static final RoutePointType SUGGEST_MENU_POINT_A;
    public static final RoutePointType SUGGEST_MENU_POINT_B;
    public static final RoutePointType SUPERAPP_DISCOVERY_MAP;
    public static final RoutePointType TRANSPORT_A;
    public static final RoutePointType TRANSPORT_B;
    private final String type;

    static {
        RoutePointType routePointType = new RoutePointType("POINT_A", 0, "a");
        POINT_A = routePointType;
        RoutePointType routePointType2 = new RoutePointType("POINT_B", 1, "b");
        POINT_B = routePointType2;
        RoutePointType routePointType3 = new RoutePointType("POINT_MID", 2, "mid");
        POINT_MID = routePointType3;
        RoutePointType routePointType4 = new RoutePointType("SERVICE_EATS", 3, "eats");
        SERVICE_EATS = routePointType4;
        RoutePointType routePointType5 = new RoutePointType("SERVICE_CHARGERS", 4, "chargers");
        SERVICE_CHARGERS = routePointType5;
        RoutePointType routePointType6 = new RoutePointType("SERVICE_SCOOTERS", 5, "scooters");
        SERVICE_SCOOTERS = routePointType6;
        RoutePointType routePointType7 = new RoutePointType("FAVORITE", 6, "favorite");
        FAVORITE = routePointType7;
        RoutePointType routePointType8 = new RoutePointType("CITY_SUGGEST", 7, "city_suggest");
        CITY_SUGGEST = routePointType8;
        RoutePointType routePointType9 = new RoutePointType("DISCOVERY_ORGANIZATION", 8, "discovery");
        DISCOVERY_ORGANIZATION = routePointType9;
        RoutePointType routePointType10 = new RoutePointType("SUPERAPP_DISCOVERY_MAP", 9, "superapp_discovery_map");
        SUPERAPP_DISCOVERY_MAP = routePointType10;
        RoutePointType routePointType11 = new RoutePointType("SERVICE_NAVIGATOR_A", 10, "navigator_a");
        SERVICE_NAVIGATOR_A = routePointType11;
        RoutePointType routePointType12 = new RoutePointType("SERVICE_NAVIGATOR_B", 11, "navigator_b");
        SERVICE_NAVIGATOR_B = routePointType12;
        RoutePointType routePointType13 = new RoutePointType("TRANSPORT_A", 12, "transport_a");
        TRANSPORT_A = routePointType13;
        RoutePointType routePointType14 = new RoutePointType("TRANSPORT_B", 13, "transport_b");
        TRANSPORT_B = routePointType14;
        RoutePointType routePointType15 = new RoutePointType("SUGGEST_MENU_POINT_A", 14, "a");
        SUGGEST_MENU_POINT_A = routePointType15;
        RoutePointType routePointType16 = new RoutePointType("SUGGEST_MENU_POINT_B", 15, "b");
        SUGGEST_MENU_POINT_B = routePointType16;
        RoutePointType routePointType17 = new RoutePointType("DELIVERY_NDD_SOURCE", 16, "a");
        DELIVERY_NDD_SOURCE = routePointType17;
        RoutePointType routePointType18 = new RoutePointType("DELIVERY_NDD_DESTINATION", 17, "b");
        DELIVERY_NDD_DESTINATION = routePointType18;
        RoutePointType[] routePointTypeArr = {routePointType, routePointType2, routePointType3, routePointType4, routePointType5, routePointType6, routePointType7, routePointType8, routePointType9, routePointType10, routePointType11, routePointType12, routePointType13, routePointType14, routePointType15, routePointType16, routePointType17, routePointType18};
        $VALUES = routePointTypeArr;
        $ENTRIES = a.a(routePointTypeArr);
        Companion = new y7l0();
        $cachedSerializer$delegate = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new eqj0(21));
    }

    public RoutePointType(String str, int i, String str2) {
        this.type = str2;
    }

    public static k4o b() {
        return $ENTRIES;
    }

    public static RoutePointType valueOf(String str) {
        return (RoutePointType) Enum.valueOf(RoutePointType.class, str);
    }

    public static RoutePointType[] values() {
        return (RoutePointType[]) $VALUES.clone();
    }

    @Override // defpackage.z7l0
    public final String getType() {
        return this.type;
    }
}
