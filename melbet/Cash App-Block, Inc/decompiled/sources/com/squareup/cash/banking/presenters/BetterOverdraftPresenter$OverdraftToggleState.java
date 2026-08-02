package com.squareup.cash.banking.presenters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BetterOverdraftPresenter$OverdraftToggleState {
    public static final /* synthetic */ BetterOverdraftPresenter$OverdraftToggleState[] $VALUES;
    public static final BetterOverdraftPresenter$OverdraftToggleState Disabled;
    public static final BetterOverdraftPresenter$OverdraftToggleState NeedsEnrollment;
    public static final BetterOverdraftPresenter$OverdraftToggleState Off;
    public static final BetterOverdraftPresenter$OverdraftToggleState On;

    static {
        BetterOverdraftPresenter$OverdraftToggleState betterOverdraftPresenter$OverdraftToggleState = new BetterOverdraftPresenter$OverdraftToggleState("On", 0);
        On = betterOverdraftPresenter$OverdraftToggleState;
        BetterOverdraftPresenter$OverdraftToggleState betterOverdraftPresenter$OverdraftToggleState2 = new BetterOverdraftPresenter$OverdraftToggleState("Off", 1);
        Off = betterOverdraftPresenter$OverdraftToggleState2;
        BetterOverdraftPresenter$OverdraftToggleState betterOverdraftPresenter$OverdraftToggleState3 = new BetterOverdraftPresenter$OverdraftToggleState("NeedsEnrollment", 2);
        NeedsEnrollment = betterOverdraftPresenter$OverdraftToggleState3;
        BetterOverdraftPresenter$OverdraftToggleState betterOverdraftPresenter$OverdraftToggleState4 = new BetterOverdraftPresenter$OverdraftToggleState("Disabled", 3);
        Disabled = betterOverdraftPresenter$OverdraftToggleState4;
        $VALUES = new BetterOverdraftPresenter$OverdraftToggleState[]{betterOverdraftPresenter$OverdraftToggleState, betterOverdraftPresenter$OverdraftToggleState2, betterOverdraftPresenter$OverdraftToggleState3, betterOverdraftPresenter$OverdraftToggleState4};
    }

    public static BetterOverdraftPresenter$OverdraftToggleState valueOf(String str) {
        return (BetterOverdraftPresenter$OverdraftToggleState) Enum.valueOf(BetterOverdraftPresenter$OverdraftToggleState.class, str);
    }

    public static BetterOverdraftPresenter$OverdraftToggleState[] values() {
        return (BetterOverdraftPresenter$OverdraftToggleState[]) $VALUES.clone();
    }
}
