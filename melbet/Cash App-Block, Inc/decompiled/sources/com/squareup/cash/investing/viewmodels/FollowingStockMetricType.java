package com.squareup.cash.investing.viewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class FollowingStockMetricType {
    public static final /* synthetic */ FollowingStockMetricType[] $VALUES;
    public static final FollowingStockMetricType DAILY_PERCENT_CHANGE;
    public static final FollowingStockMetricType DEFAULT;

    static {
        FollowingStockMetricType followingStockMetricType = new FollowingStockMetricType("DEFAULT", 0);
        DEFAULT = followingStockMetricType;
        FollowingStockMetricType followingStockMetricType2 = new FollowingStockMetricType("DAILY_PERCENT_CHANGE", 1);
        DAILY_PERCENT_CHANGE = followingStockMetricType2;
        $VALUES = new FollowingStockMetricType[]{followingStockMetricType, followingStockMetricType2, new FollowingStockMetricType("SHARE_PRICE", 2), new FollowingStockMetricType("MARKET_CAP", 3)};
    }

    public static FollowingStockMetricType valueOf(String str) {
        return (FollowingStockMetricType) Enum.valueOf(FollowingStockMetricType.class, str);
    }

    public static FollowingStockMetricType[] values() {
        return (FollowingStockMetricType[]) $VALUES.clone();
    }
}
