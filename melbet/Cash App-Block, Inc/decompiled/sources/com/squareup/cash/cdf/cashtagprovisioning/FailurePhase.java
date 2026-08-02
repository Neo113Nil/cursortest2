package com.squareup.cash.cdf.cashtagprovisioning;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FailurePhase {
    public static final /* synthetic */ FailurePhase[] $VALUES;
    public static final FailurePhase DEVICE_PROVISIONING;
    public static final FailurePhase ELIGIBILITY;
    public static final FailurePhase NFC_SCAN;

    static {
        FailurePhase failurePhase = new FailurePhase("NFC_SCAN", 0);
        NFC_SCAN = failurePhase;
        FailurePhase failurePhase2 = new FailurePhase("ELIGIBILITY", 1);
        ELIGIBILITY = failurePhase2;
        FailurePhase failurePhase3 = new FailurePhase("DEVICE_PROVISIONING", 2);
        DEVICE_PROVISIONING = failurePhase3;
        $VALUES = new FailurePhase[]{failurePhase, failurePhase2, failurePhase3, new FailurePhase("POST_DETECTION_TIMEOUT", 3), new FailurePhase("NFC_RECONNECTION_FAILURE", 4)};
    }

    public static FailurePhase valueOf(String str) {
        return (FailurePhase) Enum.valueOf(FailurePhase.class, str);
    }

    public static FailurePhase[] values() {
        return (FailurePhase[]) $VALUES.clone();
    }
}
