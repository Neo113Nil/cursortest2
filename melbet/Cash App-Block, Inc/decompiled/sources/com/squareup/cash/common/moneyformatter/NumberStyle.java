package com.squareup.cash.common.moneyformatter;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class NumberStyle {
    public static final /* synthetic */ NumberStyle[] $VALUES;
    public static final NumberStyle CURRENCY;
    public static final NumberStyle CURRENCY_ACCOUNTING;
    public static final NumberStyle NUMBER;

    static {
        NumberStyle numberStyle = new NumberStyle("CURRENCY", 0);
        CURRENCY = numberStyle;
        NumberStyle numberStyle2 = new NumberStyle("CURRENCY_ACCOUNTING", 1);
        CURRENCY_ACCOUNTING = numberStyle2;
        NumberStyle numberStyle3 = new NumberStyle("NUMBER", 2);
        NUMBER = numberStyle3;
        $VALUES = new NumberStyle[]{numberStyle, numberStyle2, numberStyle3};
    }

    public static NumberStyle valueOf(String str) {
        return (NumberStyle) Enum.valueOf(NumberStyle.class, str);
    }

    public static NumberStyle[] values() {
        return (NumberStyle[]) $VALUES.clone();
    }
}
