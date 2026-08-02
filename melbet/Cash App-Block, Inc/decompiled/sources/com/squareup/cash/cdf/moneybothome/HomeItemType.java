package com.squareup.cash.cdf.moneybothome;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HomeItemType {
    public static final /* synthetic */ HomeItemType[] $VALUES;
    public static final HomeItemType NEXT_BEST_ACTION;
    public static final HomeItemType WIDGET;

    static {
        HomeItemType homeItemType = new HomeItemType("NEXT_BEST_ACTION", 0);
        NEXT_BEST_ACTION = homeItemType;
        HomeItemType homeItemType2 = new HomeItemType("WIDGET", 1);
        WIDGET = homeItemType2;
        $VALUES = new HomeItemType[]{homeItemType, homeItemType2};
    }

    public static HomeItemType valueOf(String str) {
        return (HomeItemType) Enum.valueOf(HomeItemType.class, str);
    }

    public static HomeItemType[] values() {
        return (HomeItemType[]) $VALUES.clone();
    }
}
