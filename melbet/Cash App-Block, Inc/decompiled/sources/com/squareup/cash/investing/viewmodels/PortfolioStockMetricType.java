package com.squareup.cash.investing.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PortfolioStockMetricType {
    public static final /* synthetic */ PortfolioStockMetricType[] $VALUES;
    public static final PortfolioStockMetricType DAILY_PERCENT_CHANGE;
    public static final PortfolioStockMetricType TOTAL_INVESTMENT_VALUE;
    public static final PortfolioStockMetricType TOTAL_PERCENT_RETURN;

    static {
        PortfolioStockMetricType portfolioStockMetricType = new PortfolioStockMetricType("DAILY_PERCENT_CHANGE", 0);
        DAILY_PERCENT_CHANGE = portfolioStockMetricType;
        PortfolioStockMetricType portfolioStockMetricType2 = new PortfolioStockMetricType("DAILY_RETURN", 1);
        PortfolioStockMetricType portfolioStockMetricType3 = new PortfolioStockMetricType("TOTAL_RETURN", 2);
        PortfolioStockMetricType portfolioStockMetricType4 = new PortfolioStockMetricType("TOTAL_PERCENT_RETURN", 3);
        TOTAL_PERCENT_RETURN = portfolioStockMetricType4;
        PortfolioStockMetricType portfolioStockMetricType5 = new PortfolioStockMetricType("TOTAL_INVESTMENT_VALUE", 4);
        TOTAL_INVESTMENT_VALUE = portfolioStockMetricType5;
        $VALUES = new PortfolioStockMetricType[]{portfolioStockMetricType, portfolioStockMetricType2, portfolioStockMetricType3, portfolioStockMetricType4, portfolioStockMetricType5, new PortfolioStockMetricType("SHARE_PRICE", 5), new PortfolioStockMetricType("MARKET_CAP", 6)};
    }

    public static PortfolioStockMetricType valueOf(String str) {
        return (PortfolioStockMetricType) Enum.valueOf(PortfolioStockMetricType.class, str);
    }

    public static PortfolioStockMetricType[] values() {
        return (PortfolioStockMetricType[]) $VALUES.clone();
    }
}
