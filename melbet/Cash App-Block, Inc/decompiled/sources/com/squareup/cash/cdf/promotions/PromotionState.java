package com.squareup.cash.cdf.promotions;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PromotionState {
    public static final /* synthetic */ PromotionState[] $VALUES;
    public static final PromotionState ACTIVE;
    public static final PromotionState AVAILABLE;

    static {
        PromotionState promotionState = new PromotionState("ACTIVE", 0);
        ACTIVE = promotionState;
        PromotionState promotionState2 = new PromotionState("AVAILABLE", 1);
        AVAILABLE = promotionState2;
        $VALUES = new PromotionState[]{promotionState, promotionState2};
    }

    public static PromotionState valueOf(String str) {
        return (PromotionState) Enum.valueOf(PromotionState.class, str);
    }

    public static PromotionState[] values() {
        return (PromotionState[]) $VALUES.clone();
    }
}
