package ru.yandex.taxi.masstransit.geopayment.analytics;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"ru/yandex/taxi/masstransit/geopayment/analytics/TransportPaymentAnalytics$VehicleType", "", "Lru/yandex/taxi/masstransit/geopayment/analytics/TransportPaymentAnalytics$VehicleType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Bus", "Trolley", "Tram", "Water", "Electrobus", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TransportPaymentAnalytics$VehicleType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ TransportPaymentAnalytics$VehicleType[] $VALUES;
    public static final TransportPaymentAnalytics$VehicleType Bus;
    public static final TransportPaymentAnalytics$VehicleType Electrobus;
    public static final TransportPaymentAnalytics$VehicleType Tram;
    public static final TransportPaymentAnalytics$VehicleType Trolley;
    public static final TransportPaymentAnalytics$VehicleType Water;
    private final String eventValue;

    static {
        TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType = new TransportPaymentAnalytics$VehicleType("Bus", 0, "bus");
        Bus = transportPaymentAnalytics$VehicleType;
        TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType2 = new TransportPaymentAnalytics$VehicleType("Trolley", 1, "trolley");
        Trolley = transportPaymentAnalytics$VehicleType2;
        TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType3 = new TransportPaymentAnalytics$VehicleType("Tram", 2, "tram");
        Tram = transportPaymentAnalytics$VehicleType3;
        TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType4 = new TransportPaymentAnalytics$VehicleType("Water", 3, "water");
        Water = transportPaymentAnalytics$VehicleType4;
        TransportPaymentAnalytics$VehicleType transportPaymentAnalytics$VehicleType5 = new TransportPaymentAnalytics$VehicleType("Electrobus", 4, "electrobus");
        Electrobus = transportPaymentAnalytics$VehicleType5;
        TransportPaymentAnalytics$VehicleType[] transportPaymentAnalytics$VehicleTypeArr = {transportPaymentAnalytics$VehicleType, transportPaymentAnalytics$VehicleType2, transportPaymentAnalytics$VehicleType3, transportPaymentAnalytics$VehicleType4, transportPaymentAnalytics$VehicleType5};
        $VALUES = transportPaymentAnalytics$VehicleTypeArr;
        $ENTRIES = a.a(transportPaymentAnalytics$VehicleTypeArr);
    }

    public TransportPaymentAnalytics$VehicleType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static TransportPaymentAnalytics$VehicleType valueOf(String str) {
        return (TransportPaymentAnalytics$VehicleType) Enum.valueOf(TransportPaymentAnalytics$VehicleType.class, str);
    }

    public static TransportPaymentAnalytics$VehicleType[] values() {
        return (TransportPaymentAnalytics$VehicleType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
