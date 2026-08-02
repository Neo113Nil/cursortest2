package com.squareup.cash.bitcoin.screens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class StablecoinOnboardingType {
    public static final /* synthetic */ StablecoinOnboardingType[] $VALUES;
    public static final StablecoinOnboardingType RECEIVE;
    public static final StablecoinOnboardingType WITHDRAWAL;

    static {
        StablecoinOnboardingType stablecoinOnboardingType = new StablecoinOnboardingType("RECEIVE", 0);
        RECEIVE = stablecoinOnboardingType;
        StablecoinOnboardingType stablecoinOnboardingType2 = new StablecoinOnboardingType("WITHDRAWAL", 1);
        WITHDRAWAL = stablecoinOnboardingType2;
        $VALUES = new StablecoinOnboardingType[]{stablecoinOnboardingType, stablecoinOnboardingType2};
    }

    public static StablecoinOnboardingType valueOf(String str) {
        return (StablecoinOnboardingType) Enum.valueOf(StablecoinOnboardingType.class, str);
    }

    public static StablecoinOnboardingType[] values() {
        return (StablecoinOnboardingType[]) $VALUES.clone();
    }
}
