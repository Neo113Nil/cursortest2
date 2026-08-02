package com.squareup.cash.cdf.shophub;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Origin {
    public static final /* synthetic */ Origin[] $VALUES;
    public static final Origin SHOP_HUB_PRODUCTS_SEARCH;

    /* JADX INFO: Fake field, exist only in values array */
    Origin EF0;

    static {
        Origin origin = new Origin("DISCOVER", 0);
        Origin origin2 = new Origin("MERCHANT_PROFILE", 1);
        Origin origin3 = new Origin("SHOP_HUB", 2);
        Origin origin4 = new Origin("SHOP_HUB_SEARCH", 3);
        Origin origin5 = new Origin("SHOP_HUB_PRODUCTS_SEARCH", 4);
        SHOP_HUB_PRODUCTS_SEARCH = origin5;
        $VALUES = new Origin[]{origin, origin2, origin3, origin4, origin5, new Origin("SHOP_HUB_SEARCH_FILTER", 5)};
    }

    public static Origin valueOf(String str) {
        return (Origin) Enum.valueOf(Origin.class, str);
    }

    public static Origin[] values() {
        return (Origin[]) $VALUES.clone();
    }
}
