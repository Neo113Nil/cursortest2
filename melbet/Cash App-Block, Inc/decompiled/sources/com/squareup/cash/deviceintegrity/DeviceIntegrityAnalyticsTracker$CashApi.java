package com.squareup.cash.deviceintegrity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class DeviceIntegrityAnalyticsTracker$CashApi {
    public static final /* synthetic */ DeviceIntegrityAnalyticsTracker$CashApi[] $VALUES;
    public static final DeviceIntegrityAnalyticsTracker$CashApi VALIDATE_ATTESTATION;

    /* JADX INFO: Fake field, exist only in values array */
    DeviceIntegrityAnalyticsTracker$CashApi EF0;

    static {
        DeviceIntegrityAnalyticsTracker$CashApi deviceIntegrityAnalyticsTracker$CashApi = new DeviceIntegrityAnalyticsTracker$CashApi("VERIFY_DEVICE", 0);
        DeviceIntegrityAnalyticsTracker$CashApi deviceIntegrityAnalyticsTracker$CashApi2 = new DeviceIntegrityAnalyticsTracker$CashApi("VALIDATE_ATTESTATION", 1);
        VALIDATE_ATTESTATION = deviceIntegrityAnalyticsTracker$CashApi2;
        $VALUES = new DeviceIntegrityAnalyticsTracker$CashApi[]{deviceIntegrityAnalyticsTracker$CashApi, deviceIntegrityAnalyticsTracker$CashApi2};
    }

    public static DeviceIntegrityAnalyticsTracker$CashApi valueOf(String str) {
        return (DeviceIntegrityAnalyticsTracker$CashApi) Enum.valueOf(DeviceIntegrityAnalyticsTracker$CashApi.class, str);
    }

    public static DeviceIntegrityAnalyticsTracker$CashApi[] values() {
        return (DeviceIntegrityAnalyticsTracker$CashApi[]) $VALUES.clone();
    }
}
