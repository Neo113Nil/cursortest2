package com.squareup.cash.cdf.stock;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class Sort {
    public static final /* synthetic */ Sort[] $VALUES;
    public static final Sort DAILY_PERCENT_CHANGE;
    public static final Sort MARKET_CAP;
    public static final Sort MY_DAILY_RETURN;
    public static final Sort MY_TOTAL_INVESTMENT_VALUE;
    public static final Sort MY_TOTAL_RETURN;
    public static final Sort SHARE_PRICE;

    static {
        Sort sort = new Sort("DAILY_PERCENT_CHANGE", 0);
        DAILY_PERCENT_CHANGE = sort;
        Sort sort2 = new Sort("MY_DAILY_RETURN", 1);
        MY_DAILY_RETURN = sort2;
        Sort sort3 = new Sort("MY_TOTAL_RETURN", 2);
        MY_TOTAL_RETURN = sort3;
        Sort sort4 = new Sort("MY_TOTAL_INVESTMENT_VALUE", 3);
        MY_TOTAL_INVESTMENT_VALUE = sort4;
        Sort sort5 = new Sort("SHARE_PRICE", 4);
        SHARE_PRICE = sort5;
        Sort sort6 = new Sort("MARKET_CAP", 5);
        MARKET_CAP = sort6;
        $VALUES = new Sort[]{sort, sort2, sort3, sort4, sort5, sort6};
    }

    public static Sort valueOf(String str) {
        return (Sort) Enum.valueOf(Sort.class, str);
    }

    public static Sort[] values() {
        return (Sort[]) $VALUES.clone();
    }
}
