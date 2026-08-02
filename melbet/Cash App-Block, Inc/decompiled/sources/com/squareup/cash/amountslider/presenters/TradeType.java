package com.squareup.cash.amountslider.presenters;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class TradeType {
    public static final /* synthetic */ TradeType[] $VALUES;
    public static final TradeType BUY_BITCOIN;
    public static final TradeType BUY_STOCK;
    public static final TradeType SELL_BITCOIN;
    public static final TradeType SELL_STOCK;

    static {
        TradeType tradeType = new TradeType("BUY_BITCOIN", 0);
        BUY_BITCOIN = tradeType;
        TradeType tradeType2 = new TradeType("BUY_STOCK", 1);
        BUY_STOCK = tradeType2;
        TradeType tradeType3 = new TradeType("SELL_BITCOIN", 2);
        SELL_BITCOIN = tradeType3;
        TradeType tradeType4 = new TradeType("SELL_STOCK", 3);
        SELL_STOCK = tradeType4;
        $VALUES = new TradeType[]{tradeType, tradeType2, tradeType3, tradeType4};
    }

    public static TradeType valueOf(String str) {
        return (TradeType) Enum.valueOf(TradeType.class, str);
    }

    public static TradeType[] values() {
        return (TradeType[]) $VALUES.clone();
    }
}
