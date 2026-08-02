package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class RetroEligibilityStatus {
    public static final /* synthetic */ RetroEligibilityStatus[] $VALUES;
    public static final RetroEligibilityStatus CONVERTED;
    public static final RetroEligibilityStatus ELIGIBLE;
    public static final RetroEligibilityStatus INELIGIBLE;

    static {
        RetroEligibilityStatus retroEligibilityStatus = new RetroEligibilityStatus("CONVERTED", 0);
        CONVERTED = retroEligibilityStatus;
        RetroEligibilityStatus retroEligibilityStatus2 = new RetroEligibilityStatus("ELIGIBLE", 1);
        ELIGIBLE = retroEligibilityStatus2;
        RetroEligibilityStatus retroEligibilityStatus3 = new RetroEligibilityStatus("INELIGIBLE", 2);
        INELIGIBLE = retroEligibilityStatus3;
        $VALUES = new RetroEligibilityStatus[]{retroEligibilityStatus, retroEligibilityStatus2, retroEligibilityStatus3};
    }

    public static RetroEligibilityStatus valueOf(String str) {
        return (RetroEligibilityStatus) Enum.valueOf(RetroEligibilityStatus.class, str);
    }

    public static RetroEligibilityStatus[] values() {
        return (RetroEligibilityStatus[]) $VALUES.clone();
    }
}
