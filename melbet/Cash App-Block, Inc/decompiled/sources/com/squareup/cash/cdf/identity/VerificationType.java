package com.squareup.cash.cdf.identity;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class VerificationType {
    public static final /* synthetic */ VerificationType[] $VALUES;
    public static final VerificationType KYC;

    /* JADX INFO: Fake field, exist only in values array */
    VerificationType EF0;

    static {
        VerificationType verificationType = new VerificationType("EIdv", 0);
        VerificationType verificationType2 = new VerificationType("KYC", 1);
        KYC = verificationType2;
        $VALUES = new VerificationType[]{verificationType, verificationType2};
    }

    public static VerificationType valueOf(String str) {
        return (VerificationType) Enum.valueOf(VerificationType.class, str);
    }

    public static VerificationType[] values() {
        return (VerificationType[]) $VALUES.clone();
    }
}
