package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$RouteOptionsTapButtonName", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$RouteOptionsTapButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "Reverse", "StopA", "StopB", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$RouteOptionsTapButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$RouteOptionsTapButtonName[] $VALUES;
    public static final TransportRouteAnalytics$RouteOptionsTapButtonName Back;
    public static final TransportRouteAnalytics$RouteOptionsTapButtonName Reverse;
    public static final TransportRouteAnalytics$RouteOptionsTapButtonName StopA;
    public static final TransportRouteAnalytics$RouteOptionsTapButtonName StopB;
    private final String eventValue;

    static {
        TransportRouteAnalytics$RouteOptionsTapButtonName transportRouteAnalytics$RouteOptionsTapButtonName = new TransportRouteAnalytics$RouteOptionsTapButtonName("Back", 0, "back");
        Back = transportRouteAnalytics$RouteOptionsTapButtonName;
        TransportRouteAnalytics$RouteOptionsTapButtonName transportRouteAnalytics$RouteOptionsTapButtonName2 = new TransportRouteAnalytics$RouteOptionsTapButtonName("Reverse", 1, "reverse");
        Reverse = transportRouteAnalytics$RouteOptionsTapButtonName2;
        TransportRouteAnalytics$RouteOptionsTapButtonName transportRouteAnalytics$RouteOptionsTapButtonName3 = new TransportRouteAnalytics$RouteOptionsTapButtonName("StopA", 2, "stop_a");
        StopA = transportRouteAnalytics$RouteOptionsTapButtonName3;
        TransportRouteAnalytics$RouteOptionsTapButtonName transportRouteAnalytics$RouteOptionsTapButtonName4 = new TransportRouteAnalytics$RouteOptionsTapButtonName("StopB", 3, "stop_b");
        StopB = transportRouteAnalytics$RouteOptionsTapButtonName4;
        TransportRouteAnalytics$RouteOptionsTapButtonName[] transportRouteAnalytics$RouteOptionsTapButtonNameArr = {transportRouteAnalytics$RouteOptionsTapButtonName, transportRouteAnalytics$RouteOptionsTapButtonName2, transportRouteAnalytics$RouteOptionsTapButtonName3, transportRouteAnalytics$RouteOptionsTapButtonName4};
        $VALUES = transportRouteAnalytics$RouteOptionsTapButtonNameArr;
        $ENTRIES = a.a(transportRouteAnalytics$RouteOptionsTapButtonNameArr);
    }

    public TransportRouteAnalytics$RouteOptionsTapButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$RouteOptionsTapButtonName valueOf(String str) {
        return (TransportRouteAnalytics$RouteOptionsTapButtonName) Enum.valueOf(TransportRouteAnalytics$RouteOptionsTapButtonName.class, str);
    }

    public static TransportRouteAnalytics$RouteOptionsTapButtonName[] values() {
        return (TransportRouteAnalytics$RouteOptionsTapButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
