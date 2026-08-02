package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$TripType", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$TripType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "OneWay", "RoundTrip", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$TripType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$TripType[] $VALUES;
    public static final TransportRouteAnalytics$TripType OneWay;
    public static final TransportRouteAnalytics$TripType RoundTrip;
    private final String eventValue;

    static {
        TransportRouteAnalytics$TripType transportRouteAnalytics$TripType = new TransportRouteAnalytics$TripType("OneWay", 0, "one_way");
        OneWay = transportRouteAnalytics$TripType;
        TransportRouteAnalytics$TripType transportRouteAnalytics$TripType2 = new TransportRouteAnalytics$TripType("RoundTrip", 1, "round_trip");
        RoundTrip = transportRouteAnalytics$TripType2;
        TransportRouteAnalytics$TripType[] transportRouteAnalytics$TripTypeArr = {transportRouteAnalytics$TripType, transportRouteAnalytics$TripType2};
        $VALUES = transportRouteAnalytics$TripTypeArr;
        $ENTRIES = a.a(transportRouteAnalytics$TripTypeArr);
    }

    public TransportRouteAnalytics$TripType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$TripType valueOf(String str) {
        return (TransportRouteAnalytics$TripType) Enum.valueOf(TransportRouteAnalytics$TripType.class, str);
    }

    public static TransportRouteAnalytics$TripType[] values() {
        return (TransportRouteAnalytics$TripType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
