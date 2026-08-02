package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/analytics/RoutesAnalytics$ShownRouteType", "", "Lru/yandex/taxi/analytics/RoutesAnalytics$ShownRouteType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Toll", "Free", "BezierOverride", "WalkRouteOverride", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RoutesAnalytics$ShownRouteType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RoutesAnalytics$ShownRouteType[] $VALUES;
    public static final RoutesAnalytics$ShownRouteType BezierOverride;
    public static final RoutesAnalytics$ShownRouteType Free;
    public static final RoutesAnalytics$ShownRouteType Toll;
    public static final RoutesAnalytics$ShownRouteType WalkRouteOverride;
    private final String eventValue;

    static {
        RoutesAnalytics$ShownRouteType routesAnalytics$ShownRouteType = new RoutesAnalytics$ShownRouteType("Toll", 0, "toll");
        Toll = routesAnalytics$ShownRouteType;
        RoutesAnalytics$ShownRouteType routesAnalytics$ShownRouteType2 = new RoutesAnalytics$ShownRouteType("Free", 1, "free");
        Free = routesAnalytics$ShownRouteType2;
        RoutesAnalytics$ShownRouteType routesAnalytics$ShownRouteType3 = new RoutesAnalytics$ShownRouteType("BezierOverride", 2, "bezier_override");
        BezierOverride = routesAnalytics$ShownRouteType3;
        RoutesAnalytics$ShownRouteType routesAnalytics$ShownRouteType4 = new RoutesAnalytics$ShownRouteType("WalkRouteOverride", 3, "walk_route_override");
        WalkRouteOverride = routesAnalytics$ShownRouteType4;
        RoutesAnalytics$ShownRouteType[] routesAnalytics$ShownRouteTypeArr = {routesAnalytics$ShownRouteType, routesAnalytics$ShownRouteType2, routesAnalytics$ShownRouteType3, routesAnalytics$ShownRouteType4};
        $VALUES = routesAnalytics$ShownRouteTypeArr;
        $ENTRIES = a.a(routesAnalytics$ShownRouteTypeArr);
    }

    public RoutesAnalytics$ShownRouteType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static RoutesAnalytics$ShownRouteType valueOf(String str) {
        return (RoutesAnalytics$ShownRouteType) Enum.valueOf(RoutesAnalytics$ShownRouteType.class, str);
    }

    public static RoutesAnalytics$ShownRouteType[] values() {
        return (RoutesAnalytics$ShownRouteType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
