package com.squareup.cash.cdf.localclient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class BannerLocation {
    public static final /* synthetic */ BannerLocation[] $VALUES;
    public static final BannerLocation BRAND_PROFILE;
    public static final BannerLocation CART;
    public static final BannerLocation ORDER_DETAILS;

    static {
        BannerLocation bannerLocation = new BannerLocation("BRAND_PROFILE", 0);
        BRAND_PROFILE = bannerLocation;
        BannerLocation bannerLocation2 = new BannerLocation("CART", 1);
        CART = bannerLocation2;
        BannerLocation bannerLocation3 = new BannerLocation("ORDER_DETAILS", 2);
        ORDER_DETAILS = bannerLocation3;
        $VALUES = new BannerLocation[]{bannerLocation, bannerLocation2, bannerLocation3};
    }

    public static BannerLocation valueOf(String str) {
        return (BannerLocation) Enum.valueOf(BannerLocation.class, str);
    }

    public static BannerLocation[] values() {
        return (BannerLocation[]) $VALUES.clone();
    }
}
