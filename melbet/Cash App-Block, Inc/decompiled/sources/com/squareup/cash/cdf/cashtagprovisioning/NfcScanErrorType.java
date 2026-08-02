package com.squareup.cash.cdf.cashtagprovisioning;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class NfcScanErrorType {
    public static final /* synthetic */ NfcScanErrorType[] $VALUES;
    public static final NfcScanErrorType HARDWARE;

    /* JADX INFO: Fake field, exist only in values array */
    NfcScanErrorType EF0;

    static {
        NfcScanErrorType nfcScanErrorType = new NfcScanErrorType("TIMEOUT", 0);
        NfcScanErrorType nfcScanErrorType2 = new NfcScanErrorType("HARDWARE", 1);
        HARDWARE = nfcScanErrorType2;
        $VALUES = new NfcScanErrorType[]{nfcScanErrorType, nfcScanErrorType2, new NfcScanErrorType("USER_CANCELED", 2), new NfcScanErrorType("NFC_SYSTEM_BUSY", 3), new NfcScanErrorType("COMMAND_ALREADY_IN_PROGRESS", 4), new NfcScanErrorType("UNKNOWN", 5)};
    }

    public static NfcScanErrorType valueOf(String str) {
        return (NfcScanErrorType) Enum.valueOf(NfcScanErrorType.class, str);
    }

    public static NfcScanErrorType[] values() {
        return (NfcScanErrorType[]) $VALUES.clone();
    }
}
