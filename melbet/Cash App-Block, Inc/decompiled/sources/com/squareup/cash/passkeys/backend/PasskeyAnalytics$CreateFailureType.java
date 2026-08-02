package com.squareup.cash.passkeys.backend;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PasskeyAnalytics$CreateFailureType {
    public static final /* synthetic */ PasskeyAnalytics$CreateFailureType[] $VALUES;
    public static final PasskeyAnalytics$CreateFailureType AUTH_FINISH_FAILED;
    public static final PasskeyAnalytics$CreateFailureType AUTH_START_FAILED;
    public static final PasskeyAnalytics$CreateFailureType AUTH_START_INVALID;
    public static final PasskeyAnalytics$CreateFailureType DEVICE_CREDENTIAL_DUPLICATE;
    public static final PasskeyAnalytics$CreateFailureType DEVICE_CREDENTIAL_FAILED;
    public static final PasskeyAnalytics$CreateFailureType DEVICE_NOT_SUPPORTED;

    static {
        PasskeyAnalytics$CreateFailureType passkeyAnalytics$CreateFailureType = new PasskeyAnalytics$CreateFailureType("AUTH_START_FAILED", 0);
        AUTH_START_FAILED = passkeyAnalytics$CreateFailureType;
        PasskeyAnalytics$CreateFailureType passkeyAnalytics$CreateFailureType2 = new PasskeyAnalytics$CreateFailureType("AUTH_START_INVALID", 1);
        AUTH_START_INVALID = passkeyAnalytics$CreateFailureType2;
        PasskeyAnalytics$CreateFailureType passkeyAnalytics$CreateFailureType3 = new PasskeyAnalytics$CreateFailureType("DEVICE_CREDENTIAL_DUPLICATE", 2);
        DEVICE_CREDENTIAL_DUPLICATE = passkeyAnalytics$CreateFailureType3;
        PasskeyAnalytics$CreateFailureType passkeyAnalytics$CreateFailureType4 = new PasskeyAnalytics$CreateFailureType("DEVICE_CREDENTIAL_FAILED", 3);
        DEVICE_CREDENTIAL_FAILED = passkeyAnalytics$CreateFailureType4;
        PasskeyAnalytics$CreateFailureType passkeyAnalytics$CreateFailureType5 = new PasskeyAnalytics$CreateFailureType("DEVICE_NOT_SUPPORTED", 4);
        DEVICE_NOT_SUPPORTED = passkeyAnalytics$CreateFailureType5;
        PasskeyAnalytics$CreateFailureType passkeyAnalytics$CreateFailureType6 = new PasskeyAnalytics$CreateFailureType("AUTH_FINISH_FAILED", 5);
        AUTH_FINISH_FAILED = passkeyAnalytics$CreateFailureType6;
        $VALUES = new PasskeyAnalytics$CreateFailureType[]{passkeyAnalytics$CreateFailureType, passkeyAnalytics$CreateFailureType2, passkeyAnalytics$CreateFailureType3, passkeyAnalytics$CreateFailureType4, passkeyAnalytics$CreateFailureType5, passkeyAnalytics$CreateFailureType6, new PasskeyAnalytics$CreateFailureType("OTHER", 6)};
    }

    public static PasskeyAnalytics$CreateFailureType valueOf(String str) {
        return (PasskeyAnalytics$CreateFailureType) Enum.valueOf(PasskeyAnalytics$CreateFailureType.class, str);
    }

    public static PasskeyAnalytics$CreateFailureType[] values() {
        return (PasskeyAnalytics$CreateFailureType[]) $VALUES.clone();
    }
}
