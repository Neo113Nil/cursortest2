package com.squareup.cash.cdf.cashtagprovisioning;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class EligibilityDecision {
    public static final /* synthetic */ EligibilityDecision[] $VALUES;
    public static final EligibilityDecision ALLOWED;
    public static final EligibilityDecision DENIED;
    public static final EligibilityDecision UNSET;

    static {
        EligibilityDecision eligibilityDecision = new EligibilityDecision("ALLOWED", 0);
        ALLOWED = eligibilityDecision;
        EligibilityDecision eligibilityDecision2 = new EligibilityDecision("DENIED", 1);
        DENIED = eligibilityDecision2;
        EligibilityDecision eligibilityDecision3 = new EligibilityDecision("UNSET", 2);
        UNSET = eligibilityDecision3;
        $VALUES = new EligibilityDecision[]{eligibilityDecision, eligibilityDecision2, eligibilityDecision3};
    }

    public static EligibilityDecision valueOf(String str) {
        return (EligibilityDecision) Enum.valueOf(EligibilityDecision.class, str);
    }

    public static EligibilityDecision[] values() {
        return (EligibilityDecision[]) $VALUES.clone();
    }
}
