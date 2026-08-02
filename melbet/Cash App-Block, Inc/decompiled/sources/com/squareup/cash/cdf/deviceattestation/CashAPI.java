package com.squareup.cash.cdf.deviceattestation;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class CashAPI {
    public static final /* synthetic */ CashAPI[] $VALUES;
    public static final CashAPI VALIDATE_ATTESTATION;
    public static final CashAPI VERIFY_DEVICE;

    static {
        CashAPI cashAPI = new CashAPI("VERIFY_DEVICE", 0);
        VERIFY_DEVICE = cashAPI;
        CashAPI cashAPI2 = new CashAPI("VALIDATE_ATTESTATION", 1);
        VALIDATE_ATTESTATION = cashAPI2;
        $VALUES = new CashAPI[]{cashAPI, cashAPI2};
    }

    public static CashAPI valueOf(String str) {
        return (CashAPI) Enum.valueOf(CashAPI.class, str);
    }

    public static CashAPI[] values() {
        return (CashAPI[]) $VALUES.clone();
    }
}
