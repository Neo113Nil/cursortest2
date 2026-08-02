package com.ionspin.kotlin.bignum.decimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class BigDecimal$Companion$SignificantDecider {
    public static final /* synthetic */ BigDecimal$Companion$SignificantDecider[] $VALUES;
    public static final BigDecimal$Companion$SignificantDecider FIVE;
    public static final BigDecimal$Companion$SignificantDecider LESS_THAN_FIVE;
    public static final BigDecimal$Companion$SignificantDecider MORE_THAN_FIVE;

    static {
        BigDecimal$Companion$SignificantDecider bigDecimal$Companion$SignificantDecider = new BigDecimal$Companion$SignificantDecider("FIVE", 0);
        FIVE = bigDecimal$Companion$SignificantDecider;
        BigDecimal$Companion$SignificantDecider bigDecimal$Companion$SignificantDecider2 = new BigDecimal$Companion$SignificantDecider("LESS_THAN_FIVE", 1);
        LESS_THAN_FIVE = bigDecimal$Companion$SignificantDecider2;
        BigDecimal$Companion$SignificantDecider bigDecimal$Companion$SignificantDecider3 = new BigDecimal$Companion$SignificantDecider("MORE_THAN_FIVE", 2);
        MORE_THAN_FIVE = bigDecimal$Companion$SignificantDecider3;
        $VALUES = new BigDecimal$Companion$SignificantDecider[]{bigDecimal$Companion$SignificantDecider, bigDecimal$Companion$SignificantDecider2, bigDecimal$Companion$SignificantDecider3};
    }

    public static BigDecimal$Companion$SignificantDecider valueOf(String str) {
        return (BigDecimal$Companion$SignificantDecider) Enum.valueOf(BigDecimal$Companion$SignificantDecider.class, str);
    }

    public static BigDecimal$Companion$SignificantDecider[] values() {
        return (BigDecimal$Companion$SignificantDecider[]) $VALUES.clone();
    }
}
