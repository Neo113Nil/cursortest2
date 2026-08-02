package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$RouteOptionsErrorButtonName", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$RouteOptionsErrorButtonName;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Update", "Back", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$RouteOptionsErrorButtonName {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$RouteOptionsErrorButtonName[] $VALUES;
    public static final TransportRouteAnalytics$RouteOptionsErrorButtonName Back;
    public static final TransportRouteAnalytics$RouteOptionsErrorButtonName Update;
    private final String eventValue;

    static {
        TransportRouteAnalytics$RouteOptionsErrorButtonName transportRouteAnalytics$RouteOptionsErrorButtonName = new TransportRouteAnalytics$RouteOptionsErrorButtonName("Update", 0, "update");
        Update = transportRouteAnalytics$RouteOptionsErrorButtonName;
        TransportRouteAnalytics$RouteOptionsErrorButtonName transportRouteAnalytics$RouteOptionsErrorButtonName2 = new TransportRouteAnalytics$RouteOptionsErrorButtonName("Back", 1, "back");
        Back = transportRouteAnalytics$RouteOptionsErrorButtonName2;
        TransportRouteAnalytics$RouteOptionsErrorButtonName[] transportRouteAnalytics$RouteOptionsErrorButtonNameArr = {transportRouteAnalytics$RouteOptionsErrorButtonName, transportRouteAnalytics$RouteOptionsErrorButtonName2};
        $VALUES = transportRouteAnalytics$RouteOptionsErrorButtonNameArr;
        $ENTRIES = a.a(transportRouteAnalytics$RouteOptionsErrorButtonNameArr);
    }

    public TransportRouteAnalytics$RouteOptionsErrorButtonName(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$RouteOptionsErrorButtonName valueOf(String str) {
        return (TransportRouteAnalytics$RouteOptionsErrorButtonName) Enum.valueOf(TransportRouteAnalytics$RouteOptionsErrorButtonName.class, str);
    }

    public static TransportRouteAnalytics$RouteOptionsErrorButtonName[] values() {
        return (TransportRouteAnalytics$RouteOptionsErrorButtonName[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
