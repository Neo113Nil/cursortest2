package com.squareup.cash.cdf.asset;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PoolViewerType {
    public static final /* synthetic */ PoolViewerType[] $VALUES;
    public static final PoolViewerType CONTRIBUTOR;
    public static final PoolViewerType OWNER;

    static {
        PoolViewerType poolViewerType = new PoolViewerType("OWNER", 0);
        OWNER = poolViewerType;
        PoolViewerType poolViewerType2 = new PoolViewerType("CONTRIBUTOR", 1);
        CONTRIBUTOR = poolViewerType2;
        $VALUES = new PoolViewerType[]{poolViewerType, poolViewerType2};
    }

    public static PoolViewerType valueOf(String str) {
        return (PoolViewerType) Enum.valueOf(PoolViewerType.class, str);
    }

    public static PoolViewerType[] values() {
        return (PoolViewerType[]) $VALUES.clone();
    }
}
