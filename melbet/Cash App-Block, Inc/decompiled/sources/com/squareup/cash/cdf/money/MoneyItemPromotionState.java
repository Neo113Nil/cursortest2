package com.squareup.cash.cdf.money;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MoneyItemPromotionState {
    public static final /* synthetic */ MoneyItemPromotionState[] $VALUES;
    public static final MoneyItemPromotionState DEFAULT;
    public static final MoneyItemPromotionState PROMOTED;

    static {
        MoneyItemPromotionState moneyItemPromotionState = new MoneyItemPromotionState("DEFAULT", 0);
        DEFAULT = moneyItemPromotionState;
        MoneyItemPromotionState moneyItemPromotionState2 = new MoneyItemPromotionState("PROMOTED", 1);
        PROMOTED = moneyItemPromotionState2;
        $VALUES = new MoneyItemPromotionState[]{moneyItemPromotionState, moneyItemPromotionState2};
    }

    public static MoneyItemPromotionState valueOf(String str) {
        return (MoneyItemPromotionState) Enum.valueOf(MoneyItemPromotionState.class, str);
    }

    public static MoneyItemPromotionState[] values() {
        return (MoneyItemPromotionState[]) $VALUES.clone();
    }
}
