package ru.yandex.taxi.preorder.source.points;

import defpackage.k4o;
import defpackage.o6l0;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00032\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"ru/yandex/taxi/preorder/source/points/RouteOverlayPlacemarkImageProvider$PlacemarkPointType", "", "Lru/yandex/taxi/preorder/source/points/RouteOverlayPlacemarkImageProvider$PlacemarkPointType;", "Companion", "o6l0", "SOURCE", "DESTINATION", "MIDDLE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RouteOverlayPlacemarkImageProvider$PlacemarkPointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteOverlayPlacemarkImageProvider$PlacemarkPointType[] $VALUES;
    public static final o6l0 Companion;
    public static final RouteOverlayPlacemarkImageProvider$PlacemarkPointType DESTINATION;
    public static final RouteOverlayPlacemarkImageProvider$PlacemarkPointType MIDDLE;
    public static final RouteOverlayPlacemarkImageProvider$PlacemarkPointType SOURCE;

    static {
        RouteOverlayPlacemarkImageProvider$PlacemarkPointType routeOverlayPlacemarkImageProvider$PlacemarkPointType = new RouteOverlayPlacemarkImageProvider$PlacemarkPointType("SOURCE", 0);
        SOURCE = routeOverlayPlacemarkImageProvider$PlacemarkPointType;
        RouteOverlayPlacemarkImageProvider$PlacemarkPointType routeOverlayPlacemarkImageProvider$PlacemarkPointType2 = new RouteOverlayPlacemarkImageProvider$PlacemarkPointType("DESTINATION", 1);
        DESTINATION = routeOverlayPlacemarkImageProvider$PlacemarkPointType2;
        RouteOverlayPlacemarkImageProvider$PlacemarkPointType routeOverlayPlacemarkImageProvider$PlacemarkPointType3 = new RouteOverlayPlacemarkImageProvider$PlacemarkPointType("MIDDLE", 2);
        MIDDLE = routeOverlayPlacemarkImageProvider$PlacemarkPointType3;
        RouteOverlayPlacemarkImageProvider$PlacemarkPointType[] routeOverlayPlacemarkImageProvider$PlacemarkPointTypeArr = {routeOverlayPlacemarkImageProvider$PlacemarkPointType, routeOverlayPlacemarkImageProvider$PlacemarkPointType2, routeOverlayPlacemarkImageProvider$PlacemarkPointType3};
        $VALUES = routeOverlayPlacemarkImageProvider$PlacemarkPointTypeArr;
        $ENTRIES = kotlin.enums.a.a(routeOverlayPlacemarkImageProvider$PlacemarkPointTypeArr);
        Companion = new o6l0();
    }

    public static RouteOverlayPlacemarkImageProvider$PlacemarkPointType valueOf(String str) {
        return (RouteOverlayPlacemarkImageProvider$PlacemarkPointType) Enum.valueOf(RouteOverlayPlacemarkImageProvider$PlacemarkPointType.class, str);
    }

    public static RouteOverlayPlacemarkImageProvider$PlacemarkPointType[] values() {
        return (RouteOverlayPlacemarkImageProvider$PlacemarkPointType[]) $VALUES.clone();
    }
}
