package com.squareup.cash.cdf.stock;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ScreenSource {
    public static final /* synthetic */ ScreenSource[] $VALUES;
    public static final ScreenSource ACTIVITY;
    public static final ScreenSource INVEST_SEARCH;
    public static final ScreenSource PORTFOLIO;
    public static final ScreenSource STOCK_DETAIL;

    static {
        ScreenSource screenSource = new ScreenSource("STOCK_DETAIL", 0);
        STOCK_DETAIL = screenSource;
        ScreenSource screenSource2 = new ScreenSource("PORTFOLIO", 1);
        PORTFOLIO = screenSource2;
        ScreenSource screenSource3 = new ScreenSource("SEARCH", 2);
        ScreenSource screenSource4 = new ScreenSource("INVEST_SEARCH", 3);
        INVEST_SEARCH = screenSource4;
        ScreenSource screenSource5 = new ScreenSource("ACTIVITY", 4);
        ACTIVITY = screenSource5;
        $VALUES = new ScreenSource[]{screenSource, screenSource2, screenSource3, screenSource4, screenSource5};
    }

    public static ScreenSource valueOf(String str) {
        return (ScreenSource) Enum.valueOf(ScreenSource.class, str);
    }

    public static ScreenSource[] values() {
        return (ScreenSource[]) $VALUES.clone();
    }
}
