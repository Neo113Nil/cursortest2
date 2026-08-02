package com.squareup.cash.multiplatform.investing;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class CustomOrderPriceTickCalculator$RoundingRule {
    public static final /* synthetic */ CustomOrderPriceTickCalculator$RoundingRule[] $VALUES;
    public static final CustomOrderPriceTickCalculator$RoundingRule DOWN;
    public static final CustomOrderPriceTickCalculator$RoundingRule UP;

    static {
        CustomOrderPriceTickCalculator$RoundingRule customOrderPriceTickCalculator$RoundingRule = new CustomOrderPriceTickCalculator$RoundingRule("UP", 0);
        UP = customOrderPriceTickCalculator$RoundingRule;
        CustomOrderPriceTickCalculator$RoundingRule customOrderPriceTickCalculator$RoundingRule2 = new CustomOrderPriceTickCalculator$RoundingRule("DOWN", 1);
        DOWN = customOrderPriceTickCalculator$RoundingRule2;
        $VALUES = new CustomOrderPriceTickCalculator$RoundingRule[]{customOrderPriceTickCalculator$RoundingRule, customOrderPriceTickCalculator$RoundingRule2, new CustomOrderPriceTickCalculator$RoundingRule("AWAY_FROM_ZERO", 2), new CustomOrderPriceTickCalculator$RoundingRule("NEAREST", 3)};
    }

    public static CustomOrderPriceTickCalculator$RoundingRule valueOf(String str) {
        return (CustomOrderPriceTickCalculator$RoundingRule) Enum.valueOf(CustomOrderPriceTickCalculator$RoundingRule.class, str);
    }

    public static CustomOrderPriceTickCalculator$RoundingRule[] values() {
        return (CustomOrderPriceTickCalculator$RoundingRule[]) $VALUES.clone();
    }
}
