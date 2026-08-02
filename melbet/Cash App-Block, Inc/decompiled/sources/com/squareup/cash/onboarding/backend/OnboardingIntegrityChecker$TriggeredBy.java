package com.squareup.cash.onboarding.backend;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class OnboardingIntegrityChecker$TriggeredBy {
    public static final /* synthetic */ OnboardingIntegrityChecker$TriggeredBy[] $VALUES;
    public static final OnboardingIntegrityChecker$TriggeredBy ACCOUNT_SWITCH;
    public static final OnboardingIntegrityChecker$TriggeredBy END_OF_ONBOARDING;

    static {
        OnboardingIntegrityChecker$TriggeredBy onboardingIntegrityChecker$TriggeredBy = new OnboardingIntegrityChecker$TriggeredBy("END_OF_ONBOARDING", 0);
        END_OF_ONBOARDING = onboardingIntegrityChecker$TriggeredBy;
        OnboardingIntegrityChecker$TriggeredBy onboardingIntegrityChecker$TriggeredBy2 = new OnboardingIntegrityChecker$TriggeredBy("ACCOUNT_SWITCH", 1);
        ACCOUNT_SWITCH = onboardingIntegrityChecker$TriggeredBy2;
        $VALUES = new OnboardingIntegrityChecker$TriggeredBy[]{onboardingIntegrityChecker$TriggeredBy, onboardingIntegrityChecker$TriggeredBy2};
    }

    public static OnboardingIntegrityChecker$TriggeredBy valueOf(String str) {
        return (OnboardingIntegrityChecker$TriggeredBy) Enum.valueOf(OnboardingIntegrityChecker$TriggeredBy.class, str);
    }

    public static OnboardingIntegrityChecker$TriggeredBy[] values() {
        return (OnboardingIntegrityChecker$TriggeredBy[]) $VALUES.clone();
    }
}
