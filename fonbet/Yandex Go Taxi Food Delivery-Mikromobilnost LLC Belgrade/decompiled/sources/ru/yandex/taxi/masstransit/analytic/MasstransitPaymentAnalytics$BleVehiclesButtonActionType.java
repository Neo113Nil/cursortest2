package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"ru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$BleVehiclesButtonActionType", "", "Lru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$BleVehiclesButtonActionType;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "Back", "Qr", "Refresh", "OpenSettings", "VehicleItem", "Other", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MasstransitPaymentAnalytics$BleVehiclesButtonActionType {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitPaymentAnalytics$BleVehiclesButtonActionType[] $VALUES;
    public static final MasstransitPaymentAnalytics$BleVehiclesButtonActionType Back;
    public static final MasstransitPaymentAnalytics$BleVehiclesButtonActionType OpenSettings;
    public static final MasstransitPaymentAnalytics$BleVehiclesButtonActionType Other;
    public static final MasstransitPaymentAnalytics$BleVehiclesButtonActionType Qr;
    public static final MasstransitPaymentAnalytics$BleVehiclesButtonActionType Refresh;
    public static final MasstransitPaymentAnalytics$BleVehiclesButtonActionType VehicleItem;
    private final String eventValue;

    static {
        MasstransitPaymentAnalytics$BleVehiclesButtonActionType masstransitPaymentAnalytics$BleVehiclesButtonActionType = new MasstransitPaymentAnalytics$BleVehiclesButtonActionType("Back", 0, "back");
        Back = masstransitPaymentAnalytics$BleVehiclesButtonActionType;
        MasstransitPaymentAnalytics$BleVehiclesButtonActionType masstransitPaymentAnalytics$BleVehiclesButtonActionType2 = new MasstransitPaymentAnalytics$BleVehiclesButtonActionType("Qr", 1, "qr");
        Qr = masstransitPaymentAnalytics$BleVehiclesButtonActionType2;
        MasstransitPaymentAnalytics$BleVehiclesButtonActionType masstransitPaymentAnalytics$BleVehiclesButtonActionType3 = new MasstransitPaymentAnalytics$BleVehiclesButtonActionType("Refresh", 2, "refresh");
        Refresh = masstransitPaymentAnalytics$BleVehiclesButtonActionType3;
        MasstransitPaymentAnalytics$BleVehiclesButtonActionType masstransitPaymentAnalytics$BleVehiclesButtonActionType4 = new MasstransitPaymentAnalytics$BleVehiclesButtonActionType("OpenSettings", 3, "open_settings");
        OpenSettings = masstransitPaymentAnalytics$BleVehiclesButtonActionType4;
        MasstransitPaymentAnalytics$BleVehiclesButtonActionType masstransitPaymentAnalytics$BleVehiclesButtonActionType5 = new MasstransitPaymentAnalytics$BleVehiclesButtonActionType("VehicleItem", 4, "vehicle_item");
        VehicleItem = masstransitPaymentAnalytics$BleVehiclesButtonActionType5;
        MasstransitPaymentAnalytics$BleVehiclesButtonActionType masstransitPaymentAnalytics$BleVehiclesButtonActionType6 = new MasstransitPaymentAnalytics$BleVehiclesButtonActionType("Other", 5, "other");
        Other = masstransitPaymentAnalytics$BleVehiclesButtonActionType6;
        MasstransitPaymentAnalytics$BleVehiclesButtonActionType[] masstransitPaymentAnalytics$BleVehiclesButtonActionTypeArr = {masstransitPaymentAnalytics$BleVehiclesButtonActionType, masstransitPaymentAnalytics$BleVehiclesButtonActionType2, masstransitPaymentAnalytics$BleVehiclesButtonActionType3, masstransitPaymentAnalytics$BleVehiclesButtonActionType4, masstransitPaymentAnalytics$BleVehiclesButtonActionType5, masstransitPaymentAnalytics$BleVehiclesButtonActionType6};
        $VALUES = masstransitPaymentAnalytics$BleVehiclesButtonActionTypeArr;
        $ENTRIES = a.a(masstransitPaymentAnalytics$BleVehiclesButtonActionTypeArr);
    }

    public MasstransitPaymentAnalytics$BleVehiclesButtonActionType(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MasstransitPaymentAnalytics$BleVehiclesButtonActionType valueOf(String str) {
        return (MasstransitPaymentAnalytics$BleVehiclesButtonActionType) Enum.valueOf(MasstransitPaymentAnalytics$BleVehiclesButtonActionType.class, str);
    }

    public static MasstransitPaymentAnalytics$BleVehiclesButtonActionType[] values() {
        return (MasstransitPaymentAnalytics$BleVehiclesButtonActionType[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
