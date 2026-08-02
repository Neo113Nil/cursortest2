package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$VehicleType", "", "Lru/yandex/taxi/masstransit/analytic/TransportRouteAnalytics$VehicleType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Bus", "Aeroexpress", "Suburban", "Ground", "Underground", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportRouteAnalytics$VehicleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportRouteAnalytics$VehicleType[] $VALUES;
    public static final TransportRouteAnalytics$VehicleType Aeroexpress;
    public static final TransportRouteAnalytics$VehicleType Bus;
    public static final TransportRouteAnalytics$VehicleType Ground;
    public static final TransportRouteAnalytics$VehicleType Suburban;
    public static final TransportRouteAnalytics$VehicleType Underground;
    private final String eventValue;

    static {
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType = new TransportRouteAnalytics$VehicleType("Bus", 0, "bus");
        Bus = transportRouteAnalytics$VehicleType;
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType2 = new TransportRouteAnalytics$VehicleType("Aeroexpress", 1, "aeroexpress");
        Aeroexpress = transportRouteAnalytics$VehicleType2;
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType3 = new TransportRouteAnalytics$VehicleType("Suburban", 2, "suburban");
        Suburban = transportRouteAnalytics$VehicleType3;
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType4 = new TransportRouteAnalytics$VehicleType("Ground", 3, "ground");
        Ground = transportRouteAnalytics$VehicleType4;
        TransportRouteAnalytics$VehicleType transportRouteAnalytics$VehicleType5 = new TransportRouteAnalytics$VehicleType("Underground", 4, "underground");
        Underground = transportRouteAnalytics$VehicleType5;
        TransportRouteAnalytics$VehicleType[] transportRouteAnalytics$VehicleTypeArr = {transportRouteAnalytics$VehicleType, transportRouteAnalytics$VehicleType2, transportRouteAnalytics$VehicleType3, transportRouteAnalytics$VehicleType4, transportRouteAnalytics$VehicleType5};
        $VALUES = transportRouteAnalytics$VehicleTypeArr;
        $ENTRIES = a.a(transportRouteAnalytics$VehicleTypeArr);
    }

    public TransportRouteAnalytics$VehicleType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportRouteAnalytics$VehicleType valueOf(String str) {
        return (TransportRouteAnalytics$VehicleType) Enum.valueOf(TransportRouteAnalytics$VehicleType.class, str);
    }

    public static TransportRouteAnalytics$VehicleType[] values() {
        return (TransportRouteAnalytics$VehicleType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
