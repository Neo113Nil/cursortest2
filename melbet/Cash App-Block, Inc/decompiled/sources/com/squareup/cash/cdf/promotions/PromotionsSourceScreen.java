package com.squareup.cash.cdf.promotions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class PromotionsSourceScreen {
    public static final /* synthetic */ PromotionsSourceScreen[] $VALUES;
    public static final PromotionsSourceScreen PROMOTIONS_HOME;

    static {
        PromotionsSourceScreen promotionsSourceScreen = new PromotionsSourceScreen("PROMOTIONS_HOME", 0);
        PROMOTIONS_HOME = promotionsSourceScreen;
        $VALUES = new PromotionsSourceScreen[]{promotionsSourceScreen};
    }

    public static PromotionsSourceScreen valueOf(String str) {
        return (PromotionsSourceScreen) Enum.valueOf(PromotionsSourceScreen.class, str);
    }

    public static PromotionsSourceScreen[] values() {
        return (PromotionsSourceScreen[]) $VALUES.clone();
    }
}
