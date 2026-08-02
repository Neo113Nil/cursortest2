package com.squareup.cash.offers.viewmodels.itemviewmodels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class HomeContentType {
    public static final /* synthetic */ HomeContentType[] $VALUES;
    public static final HomeContentType CATEGORY;

    /* JADX INFO: Fake field, exist only in values array */
    HomeContentType EF0;

    static {
        HomeContentType homeContentType = new HomeContentType("PILLS", 0);
        HomeContentType homeContentType2 = new HomeContentType("HERO", 1);
        HomeContentType homeContentType3 = new HomeContentType("CLUSTER", 2);
        HomeContentType homeContentType4 = new HomeContentType("CATEGORY", 3);
        CATEGORY = homeContentType4;
        $VALUES = new HomeContentType[]{homeContentType, homeContentType2, homeContentType3, homeContentType4, new HomeContentType("HEADER", 4), new HomeContentType("LEGAL", 5)};
    }

    public static HomeContentType valueOf(String str) {
        return (HomeContentType) Enum.valueOf(HomeContentType.class, str);
    }

    public static HomeContentType[] values() {
        return (HomeContentType[]) $VALUES.clone();
    }
}
