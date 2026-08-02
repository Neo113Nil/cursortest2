package com.squareup.cash.cdf.localclient;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BannerType {
    public static final /* synthetic */ BannerType[] $VALUES;
    public static final BannerType LOCAL_CASH;
    public static final BannerType LOYALTY;
    public static final BannerType OFFER;

    static {
        BannerType bannerType = new BannerType("LOCAL_CASH", 0);
        LOCAL_CASH = bannerType;
        BannerType bannerType2 = new BannerType("OFFER", 1);
        OFFER = bannerType2;
        BannerType bannerType3 = new BannerType("LOYALTY", 2);
        LOYALTY = bannerType3;
        $VALUES = new BannerType[]{bannerType, bannerType2, bannerType3};
    }

    public static BannerType valueOf(String str) {
        return (BannerType) Enum.valueOf(BannerType.class, str);
    }

    public static BannerType[] values() {
        return (BannerType[]) $VALUES.clone();
    }
}
