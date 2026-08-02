package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$DetailCardSource", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$DetailCardSource;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Transport", "Hub", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$DetailCardSource {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$DetailCardSource[] $VALUES;
    public static final TransportRouteAnalytics$DetailCardSource Hub;
    public static final TransportRouteAnalytics$DetailCardSource Transport;
    private final String eventValue;

    static {
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource = new TransportRouteAnalytics$DetailCardSource("Transport", 0, "transport");
        Transport = transportRouteAnalytics$DetailCardSource;
        TransportRouteAnalytics$DetailCardSource transportRouteAnalytics$DetailCardSource2 = new TransportRouteAnalytics$DetailCardSource("Hub", 1, "hub");
        Hub = transportRouteAnalytics$DetailCardSource2;
        TransportRouteAnalytics$DetailCardSource[] transportRouteAnalytics$DetailCardSourceArr = {transportRouteAnalytics$DetailCardSource, transportRouteAnalytics$DetailCardSource2};
        $VALUES = transportRouteAnalytics$DetailCardSourceArr;
        $ENTRIES = a.a(transportRouteAnalytics$DetailCardSourceArr);
    }

    public TransportRouteAnalytics$DetailCardSource(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$DetailCardSource valueOf(String str) {
        return (TransportRouteAnalytics$DetailCardSource) Enum.valueOf(TransportRouteAnalytics$DetailCardSource.class, str);
    }

    public static TransportRouteAnalytics$DetailCardSource[] values() {
        return (TransportRouteAnalytics$DetailCardSource[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
