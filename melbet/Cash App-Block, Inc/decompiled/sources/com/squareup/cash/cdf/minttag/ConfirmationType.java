package com.squareup.cash.cdf.minttag;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ConfirmationType {
    public static final /* synthetic */ ConfirmationType[] $VALUES;
    public static final ConfirmationType FAILURE;
    public static final ConfirmationType SUCCESS;

    static {
        ConfirmationType confirmationType = new ConfirmationType("SUCCESS", 0);
        SUCCESS = confirmationType;
        ConfirmationType confirmationType2 = new ConfirmationType("FAILURE", 1);
        FAILURE = confirmationType2;
        $VALUES = new ConfirmationType[]{confirmationType, confirmationType2};
    }

    public static ConfirmationType valueOf(String str) {
        return (ConfirmationType) Enum.valueOf(ConfirmationType.class, str);
    }

    public static ConfirmationType[] values() {
        return (ConfirmationType[]) $VALUES.clone();
    }
}
