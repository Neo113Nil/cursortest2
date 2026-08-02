package com.squareup.cash.blockers.presenters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class EarnerOnboardingScreen {
    public static final /* synthetic */ EarnerOnboardingScreen[] $VALUES;
    public static final EarnerOnboardingScreen CATEGORY_PICKER;
    public static final EarnerOnboardingScreen CATEGORY_SELECTION;
    public static final EarnerOnboardingScreen SUCCESS;
    public static final EarnerOnboardingScreen UPSELL;

    static {
        EarnerOnboardingScreen earnerOnboardingScreen = new EarnerOnboardingScreen("UPSELL", 0);
        UPSELL = earnerOnboardingScreen;
        EarnerOnboardingScreen earnerOnboardingScreen2 = new EarnerOnboardingScreen("CATEGORY_SELECTION", 1);
        CATEGORY_SELECTION = earnerOnboardingScreen2;
        EarnerOnboardingScreen earnerOnboardingScreen3 = new EarnerOnboardingScreen("CATEGORY_PICKER", 2);
        CATEGORY_PICKER = earnerOnboardingScreen3;
        EarnerOnboardingScreen earnerOnboardingScreen4 = new EarnerOnboardingScreen("SUCCESS", 3);
        SUCCESS = earnerOnboardingScreen4;
        $VALUES = new EarnerOnboardingScreen[]{earnerOnboardingScreen, earnerOnboardingScreen2, earnerOnboardingScreen3, earnerOnboardingScreen4};
    }

    public static EarnerOnboardingScreen valueOf(String str) {
        return (EarnerOnboardingScreen) Enum.valueOf(EarnerOnboardingScreen.class, str);
    }

    public static EarnerOnboardingScreen[] values() {
        return (EarnerOnboardingScreen[]) $VALUES.clone();
    }
}
