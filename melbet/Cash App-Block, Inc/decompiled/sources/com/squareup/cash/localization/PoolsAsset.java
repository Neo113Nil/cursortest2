package com.squareup.cash.localization;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PoolsAsset {
    public static final /* synthetic */ PoolsAsset[] $VALUES;
    public static final PoolsAsset POOLS_NUX_ACTIVITY;
    public static final PoolsAsset POOLS_NUX_DETAILS;

    static {
        PoolsAsset poolsAsset = new PoolsAsset("POOLS_NUX_DETAILS", 0);
        POOLS_NUX_DETAILS = poolsAsset;
        PoolsAsset poolsAsset2 = new PoolsAsset("POOLS_NUX_ACTIVITY", 1);
        POOLS_NUX_ACTIVITY = poolsAsset2;
        $VALUES = new PoolsAsset[]{poolsAsset, poolsAsset2};
    }

    public static PoolsAsset valueOf(String str) {
        return (PoolsAsset) Enum.valueOf(PoolsAsset.class, str);
    }

    public static PoolsAsset[] values() {
        return (PoolsAsset[]) $VALUES.clone();
    }
}
