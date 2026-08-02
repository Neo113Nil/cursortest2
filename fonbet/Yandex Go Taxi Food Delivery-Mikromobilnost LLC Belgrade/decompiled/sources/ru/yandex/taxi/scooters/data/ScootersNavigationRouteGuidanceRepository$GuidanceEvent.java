package ru.yandex.taxi.scooters.data;

import defpackage.k4o;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"ru/yandex/taxi/scooters/data/ScootersNavigationRouteGuidanceRepository$GuidanceEvent", "", "Lru/yandex/taxi/scooters/data/ScootersNavigationRouteGuidanceRepository$GuidanceEvent;", "LOCATION_CHANGE", "ROUTE_FINISH", "ROUTE_CHANGED", "ontheway"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ScootersNavigationRouteGuidanceRepository$GuidanceEvent {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ ScootersNavigationRouteGuidanceRepository$GuidanceEvent[] $VALUES;
    public static final ScootersNavigationRouteGuidanceRepository$GuidanceEvent LOCATION_CHANGE;
    public static final ScootersNavigationRouteGuidanceRepository$GuidanceEvent ROUTE_CHANGED;
    public static final ScootersNavigationRouteGuidanceRepository$GuidanceEvent ROUTE_FINISH;

    static {
        ScootersNavigationRouteGuidanceRepository$GuidanceEvent scootersNavigationRouteGuidanceRepository$GuidanceEvent = new ScootersNavigationRouteGuidanceRepository$GuidanceEvent("LOCATION_CHANGE", 0);
        LOCATION_CHANGE = scootersNavigationRouteGuidanceRepository$GuidanceEvent;
        ScootersNavigationRouteGuidanceRepository$GuidanceEvent scootersNavigationRouteGuidanceRepository$GuidanceEvent2 = new ScootersNavigationRouteGuidanceRepository$GuidanceEvent("ROUTE_FINISH", 1);
        ROUTE_FINISH = scootersNavigationRouteGuidanceRepository$GuidanceEvent2;
        ScootersNavigationRouteGuidanceRepository$GuidanceEvent scootersNavigationRouteGuidanceRepository$GuidanceEvent3 = new ScootersNavigationRouteGuidanceRepository$GuidanceEvent("ROUTE_CHANGED", 2);
        ROUTE_CHANGED = scootersNavigationRouteGuidanceRepository$GuidanceEvent3;
        ScootersNavigationRouteGuidanceRepository$GuidanceEvent[] scootersNavigationRouteGuidanceRepository$GuidanceEventArr = {scootersNavigationRouteGuidanceRepository$GuidanceEvent, scootersNavigationRouteGuidanceRepository$GuidanceEvent2, scootersNavigationRouteGuidanceRepository$GuidanceEvent3};
        $VALUES = scootersNavigationRouteGuidanceRepository$GuidanceEventArr;
        $ENTRIES = kotlin.enums.a.a(scootersNavigationRouteGuidanceRepository$GuidanceEventArr);
    }

    public static ScootersNavigationRouteGuidanceRepository$GuidanceEvent valueOf(String str) {
        return (ScootersNavigationRouteGuidanceRepository$GuidanceEvent) Enum.valueOf(ScootersNavigationRouteGuidanceRepository$GuidanceEvent.class, str);
    }

    public static ScootersNavigationRouteGuidanceRepository$GuidanceEvent[] values() {
        return (ScootersNavigationRouteGuidanceRepository$GuidanceEvent[]) $VALUES.clone();
    }
}
