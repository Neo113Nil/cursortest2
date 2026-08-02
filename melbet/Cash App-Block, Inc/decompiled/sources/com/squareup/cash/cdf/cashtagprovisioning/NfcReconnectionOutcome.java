package com.squareup.cash.cdf.cashtagprovisioning;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class NfcReconnectionOutcome {
    public static final /* synthetic */ NfcReconnectionOutcome[] $VALUES;
    public static final NfcReconnectionOutcome ABORTED;
    public static final NfcReconnectionOutcome SUCCESS;

    static {
        NfcReconnectionOutcome nfcReconnectionOutcome = new NfcReconnectionOutcome("SUCCESS", 0);
        SUCCESS = nfcReconnectionOutcome;
        NfcReconnectionOutcome nfcReconnectionOutcome2 = new NfcReconnectionOutcome("TIMEOUT", 1);
        NfcReconnectionOutcome nfcReconnectionOutcome3 = new NfcReconnectionOutcome("ABORTED", 2);
        ABORTED = nfcReconnectionOutcome3;
        $VALUES = new NfcReconnectionOutcome[]{nfcReconnectionOutcome, nfcReconnectionOutcome2, nfcReconnectionOutcome3, new NfcReconnectionOutcome("NFC_MANAGER_NIL", 3)};
    }

    public static NfcReconnectionOutcome valueOf(String str) {
        return (NfcReconnectionOutcome) Enum.valueOf(NfcReconnectionOutcome.class, str);
    }

    public static NfcReconnectionOutcome[] values() {
        return (NfcReconnectionOutcome[]) $VALUES.clone();
    }
}
