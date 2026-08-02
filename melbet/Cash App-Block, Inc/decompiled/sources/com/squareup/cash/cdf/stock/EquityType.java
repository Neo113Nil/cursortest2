package com.squareup.cash.cdf.stock;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class EquityType {
    public static final /* synthetic */ EquityType[] $VALUES;
    public static final EquityType ETF;
    public static final EquityType STOCK;

    static {
        EquityType equityType = new EquityType("STOCK", 0);
        STOCK = equityType;
        EquityType equityType2 = new EquityType("ETF", 1);
        ETF = equityType2;
        $VALUES = new EquityType[]{equityType, equityType2};
    }

    public static EquityType valueOf(String str) {
        return (EquityType) Enum.valueOf(EquityType.class, str);
    }

    public static EquityType[] values() {
        return (EquityType[]) $VALUES.clone();
    }
}
