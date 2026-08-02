package ru.yandex.taxi.preorder.map.model;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lru/yandex/taxi/preorder/map/model/RouteIconType;", "", "DESTINATION_PIN_WITH_ARRIVAL_TIME", "UNKNOWN", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RouteIconType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteIconType[] $VALUES;
    public static final RouteIconType DESTINATION_PIN_WITH_ARRIVAL_TIME;
    public static final RouteIconType UNKNOWN;

    static {
        RouteIconType routeIconType = new RouteIconType("DESTINATION_PIN_WITH_ARRIVAL_TIME", 0);
        DESTINATION_PIN_WITH_ARRIVAL_TIME = routeIconType;
        RouteIconType routeIconType2 = new RouteIconType("UNKNOWN", 1);
        UNKNOWN = routeIconType2;
        RouteIconType[] routeIconTypeArr = {routeIconType, routeIconType2};
        $VALUES = routeIconTypeArr;
        $ENTRIES = a.a(routeIconTypeArr);
    }

    public static RouteIconType valueOf(String str) {
        return (RouteIconType) Enum.valueOf(RouteIconType.class, str);
    }

    public static RouteIconType[] values() {
        return (RouteIconType[]) $VALUES.clone();
    }
}
