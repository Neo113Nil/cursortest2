package com.squareup.cash.cdf.cashtagprovisioning;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DeprovisionFailurePhase {
    public static final /* synthetic */ DeprovisionFailurePhase[] $VALUES;
    public static final DeprovisionFailurePhase DEVICE_DEPROVISIONING;
    public static final DeprovisionFailurePhase NFC_SCAN;
    public static final DeprovisionFailurePhase SERVER_REQUEST;

    static {
        DeprovisionFailurePhase deprovisionFailurePhase = new DeprovisionFailurePhase("NFC_SCAN", 0);
        NFC_SCAN = deprovisionFailurePhase;
        DeprovisionFailurePhase deprovisionFailurePhase2 = new DeprovisionFailurePhase("SERVER_REQUEST", 1);
        SERVER_REQUEST = deprovisionFailurePhase2;
        DeprovisionFailurePhase deprovisionFailurePhase3 = new DeprovisionFailurePhase("DEVICE_DEPROVISIONING", 2);
        DEVICE_DEPROVISIONING = deprovisionFailurePhase3;
        $VALUES = new DeprovisionFailurePhase[]{deprovisionFailurePhase, deprovisionFailurePhase2, deprovisionFailurePhase3, new DeprovisionFailurePhase("POST_DETECTION_TIMEOUT", 3), new DeprovisionFailurePhase("NFC_RECONNECTION_FAILURE", 4)};
    }

    public static DeprovisionFailurePhase valueOf(String str) {
        return (DeprovisionFailurePhase) Enum.valueOf(DeprovisionFailurePhase.class, str);
    }

    public static DeprovisionFailurePhase[] values() {
        return (DeprovisionFailurePhase[]) $VALUES.clone();
    }
}
