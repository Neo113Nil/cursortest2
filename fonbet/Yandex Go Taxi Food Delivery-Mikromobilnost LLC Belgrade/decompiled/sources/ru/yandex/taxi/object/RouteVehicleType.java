package ru.yandex.taxi.object;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/yandex/taxi/object/RouteVehicleType;", "", "TAXI", "TRUCK", "MOTO", "DEFAULT", "api"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RouteVehicleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteVehicleType[] $VALUES;
    public static final RouteVehicleType DEFAULT;
    public static final RouteVehicleType MOTO;
    public static final RouteVehicleType TAXI;
    public static final RouteVehicleType TRUCK;

    static {
        RouteVehicleType routeVehicleType = new RouteVehicleType("TAXI", 0);
        TAXI = routeVehicleType;
        RouteVehicleType routeVehicleType2 = new RouteVehicleType("TRUCK", 1);
        TRUCK = routeVehicleType2;
        RouteVehicleType routeVehicleType3 = new RouteVehicleType("MOTO", 2);
        MOTO = routeVehicleType3;
        RouteVehicleType routeVehicleType4 = new RouteVehicleType("DEFAULT", 3);
        DEFAULT = routeVehicleType4;
        RouteVehicleType[] routeVehicleTypeArr = {routeVehicleType, routeVehicleType2, routeVehicleType3, routeVehicleType4};
        $VALUES = routeVehicleTypeArr;
        $ENTRIES = a.a(routeVehicleTypeArr);
    }

    public static RouteVehicleType valueOf(String str) {
        return (RouteVehicleType) Enum.valueOf(RouteVehicleType.class, str);
    }

    public static RouteVehicleType[] values() {
        return (RouteVehicleType[]) $VALUES.clone();
    }
}
