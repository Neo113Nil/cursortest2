package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"ru/yandex/taxi/analytics/RouteStopsV2DebugAnalytics$PointType", "", "Lru/yandex/taxi/analytics/RouteStopsV2DebugAnalytics$PointType;", "", "analyticsName", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "SOURCE", "DESTINATION", "INTERMEDIATE", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final class RouteStopsV2DebugAnalytics$PointType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RouteStopsV2DebugAnalytics$PointType[] $VALUES;
    public static final RouteStopsV2DebugAnalytics$PointType DESTINATION;
    public static final RouteStopsV2DebugAnalytics$PointType INTERMEDIATE;
    public static final RouteStopsV2DebugAnalytics$PointType SOURCE;
    private final String analyticsName;

    static {
        RouteStopsV2DebugAnalytics$PointType routeStopsV2DebugAnalytics$PointType = new RouteStopsV2DebugAnalytics$PointType("SOURCE", 0, "source");
        SOURCE = routeStopsV2DebugAnalytics$PointType;
        RouteStopsV2DebugAnalytics$PointType routeStopsV2DebugAnalytics$PointType2 = new RouteStopsV2DebugAnalytics$PointType("DESTINATION", 1, "destination");
        DESTINATION = routeStopsV2DebugAnalytics$PointType2;
        RouteStopsV2DebugAnalytics$PointType routeStopsV2DebugAnalytics$PointType3 = new RouteStopsV2DebugAnalytics$PointType("INTERMEDIATE", 2, "intermediate");
        INTERMEDIATE = routeStopsV2DebugAnalytics$PointType3;
        RouteStopsV2DebugAnalytics$PointType[] routeStopsV2DebugAnalytics$PointTypeArr = {routeStopsV2DebugAnalytics$PointType, routeStopsV2DebugAnalytics$PointType2, routeStopsV2DebugAnalytics$PointType3};
        $VALUES = routeStopsV2DebugAnalytics$PointTypeArr;
        $ENTRIES = a.a(routeStopsV2DebugAnalytics$PointTypeArr);
    }

    public RouteStopsV2DebugAnalytics$PointType(String str, int i, String str2) {
        this.analyticsName = str2;
    }

    public static RouteStopsV2DebugAnalytics$PointType valueOf(String str) {
        return (RouteStopsV2DebugAnalytics$PointType) Enum.valueOf(RouteStopsV2DebugAnalytics$PointType.class, str);
    }

    public static RouteStopsV2DebugAnalytics$PointType[] values() {
        return (RouteStopsV2DebugAnalytics$PointType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getAnalyticsName() {
        return this.analyticsName;
    }
}
