package ru.yandex.taxi.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/analytics/RoutesAnalytics$ReturnedRouteTypeV2", "", "Lru/yandex/taxi/analytics/RoutesAnalytics$ReturnedRouteTypeV2;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Toll", "Free", "mainscreen"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RoutesAnalytics$ReturnedRouteTypeV2 {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ RoutesAnalytics$ReturnedRouteTypeV2[] $VALUES;
    public static final RoutesAnalytics$ReturnedRouteTypeV2 Free;
    public static final RoutesAnalytics$ReturnedRouteTypeV2 Toll;
    private final String eventValue;

    static {
        RoutesAnalytics$ReturnedRouteTypeV2 routesAnalytics$ReturnedRouteTypeV2 = new RoutesAnalytics$ReturnedRouteTypeV2("Toll", 0, "toll");
        Toll = routesAnalytics$ReturnedRouteTypeV2;
        RoutesAnalytics$ReturnedRouteTypeV2 routesAnalytics$ReturnedRouteTypeV22 = new RoutesAnalytics$ReturnedRouteTypeV2("Free", 1, "free");
        Free = routesAnalytics$ReturnedRouteTypeV22;
        RoutesAnalytics$ReturnedRouteTypeV2[] routesAnalytics$ReturnedRouteTypeV2Arr = {routesAnalytics$ReturnedRouteTypeV2, routesAnalytics$ReturnedRouteTypeV22};
        $VALUES = routesAnalytics$ReturnedRouteTypeV2Arr;
        $ENTRIES = a.a(routesAnalytics$ReturnedRouteTypeV2Arr);
    }

    public RoutesAnalytics$ReturnedRouteTypeV2(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static RoutesAnalytics$ReturnedRouteTypeV2 valueOf(String str) {
        return (RoutesAnalytics$ReturnedRouteTypeV2) Enum.valueOf(RoutesAnalytics$ReturnedRouteTypeV2.class, str);
    }

    public static RoutesAnalytics$ReturnedRouteTypeV2[] values() {
        return (RoutesAnalytics$ReturnedRouteTypeV2[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
