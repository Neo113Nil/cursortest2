package ru.yandex.taxi.masstransit.analytic;

import defpackage.k4o;
import kotlin.Metadata;
import kotlin.enums.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"ru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$BlePermissionRequestReason", "", "Lru/yandex/taxi/masstransit/analytic/MasstransitPaymentAnalytics$BlePermissionRequestReason;", "", "eventValue", "Ljava/lang/String;", "a", "()Ljava/lang/String;", "LocationPermission", "BluetoothPermission", "BluetoothDisabled", "Other", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class MasstransitPaymentAnalytics$BlePermissionRequestReason {
    private static final /* synthetic */ k4o $ENTRIES;
    private static final /* synthetic */ MasstransitPaymentAnalytics$BlePermissionRequestReason[] $VALUES;
    public static final MasstransitPaymentAnalytics$BlePermissionRequestReason BluetoothDisabled;
    public static final MasstransitPaymentAnalytics$BlePermissionRequestReason BluetoothPermission;
    public static final MasstransitPaymentAnalytics$BlePermissionRequestReason LocationPermission;
    public static final MasstransitPaymentAnalytics$BlePermissionRequestReason Other;
    private final String eventValue;

    static {
        MasstransitPaymentAnalytics$BlePermissionRequestReason masstransitPaymentAnalytics$BlePermissionRequestReason = new MasstransitPaymentAnalytics$BlePermissionRequestReason("LocationPermission", 0, "location_permission");
        LocationPermission = masstransitPaymentAnalytics$BlePermissionRequestReason;
        MasstransitPaymentAnalytics$BlePermissionRequestReason masstransitPaymentAnalytics$BlePermissionRequestReason2 = new MasstransitPaymentAnalytics$BlePermissionRequestReason("BluetoothPermission", 1, "bluetooth_permission");
        BluetoothPermission = masstransitPaymentAnalytics$BlePermissionRequestReason2;
        MasstransitPaymentAnalytics$BlePermissionRequestReason masstransitPaymentAnalytics$BlePermissionRequestReason3 = new MasstransitPaymentAnalytics$BlePermissionRequestReason("BluetoothDisabled", 2, "bluetooth_disabled");
        BluetoothDisabled = masstransitPaymentAnalytics$BlePermissionRequestReason3;
        MasstransitPaymentAnalytics$BlePermissionRequestReason masstransitPaymentAnalytics$BlePermissionRequestReason4 = new MasstransitPaymentAnalytics$BlePermissionRequestReason("Other", 3, "other");
        Other = masstransitPaymentAnalytics$BlePermissionRequestReason4;
        MasstransitPaymentAnalytics$BlePermissionRequestReason[] masstransitPaymentAnalytics$BlePermissionRequestReasonArr = {masstransitPaymentAnalytics$BlePermissionRequestReason, masstransitPaymentAnalytics$BlePermissionRequestReason2, masstransitPaymentAnalytics$BlePermissionRequestReason3, masstransitPaymentAnalytics$BlePermissionRequestReason4};
        $VALUES = masstransitPaymentAnalytics$BlePermissionRequestReasonArr;
        $ENTRIES = a.a(masstransitPaymentAnalytics$BlePermissionRequestReasonArr);
    }

    public MasstransitPaymentAnalytics$BlePermissionRequestReason(String str, int i, String str2) {
        this.eventValue = str2;
    }

    public static MasstransitPaymentAnalytics$BlePermissionRequestReason valueOf(String str) {
        return (MasstransitPaymentAnalytics$BlePermissionRequestReason) Enum.valueOf(MasstransitPaymentAnalytics$BlePermissionRequestReason.class, str);
    }

    public static MasstransitPaymentAnalytics$BlePermissionRequestReason[] values() {
        return (MasstransitPaymentAnalytics$BlePermissionRequestReason[]) $VALUES.clone();
    }

    /* renamed from: a, reason: from getter */
    public final String getEventValue() {
        return this.eventValue;
    }
}
