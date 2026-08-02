package com.squareup.cash.onboarding.backend;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class OnboardingFlowType {
    public static final /* synthetic */ OnboardingFlowType[] $VALUES;
    public static final OnboardingFlowType CLASSIC;
    public static final OnboardingFlowType RETURNING_CUSTOMER;

    static {
        OnboardingFlowType onboardingFlowType = new OnboardingFlowType("CLASSIC", 0);
        CLASSIC = onboardingFlowType;
        OnboardingFlowType onboardingFlowType2 = new OnboardingFlowType("RETURNING_CUSTOMER", 1);
        RETURNING_CUSTOMER = onboardingFlowType2;
        $VALUES = new OnboardingFlowType[]{onboardingFlowType, onboardingFlowType2};
    }

    public static OnboardingFlowType valueOf(String str) {
        return (OnboardingFlowType) Enum.valueOf(OnboardingFlowType.class, str);
    }

    public static OnboardingFlowType[] values() {
        return (OnboardingFlowType[]) $VALUES.clone();
    }
}
