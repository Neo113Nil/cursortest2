package com.squareup.cash.cdf.stock;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class StockSource {
    public static final /* synthetic */ StockSource[] $VALUES;
    public static final StockSource FOLLOW;
    public static final StockSource STOCKS_I_OWN;

    static {
        StockSource stockSource = new StockSource("STOCKS_I_OWN", 0);
        STOCKS_I_OWN = stockSource;
        StockSource stockSource2 = new StockSource("FOLLOW", 1);
        FOLLOW = stockSource2;
        $VALUES = new StockSource[]{stockSource, stockSource2};
    }

    public static StockSource valueOf(String str) {
        return (StockSource) Enum.valueOf(StockSource.class, str);
    }

    public static StockSource[] values() {
        return (StockSource[]) $VALUES.clone();
    }
}
