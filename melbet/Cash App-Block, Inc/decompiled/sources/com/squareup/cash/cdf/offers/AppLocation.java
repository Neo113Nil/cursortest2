package com.squareup.cash.cdf.offers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AppLocation {
    public static final /* synthetic */ AppLocation[] $VALUES;
    public static final AppLocation ActivityTab;
    public static final AppLocation Browser;
    public static final AppLocation CardTab;
    public static final AppLocation Discover;
    public static final AppLocation DiscoverSearch;
    public static final AppLocation MerchantProfile;
    public static final AppLocation OffersTab;

    static {
        AppLocation appLocation = new AppLocation("Browser", 0);
        Browser = appLocation;
        AppLocation appLocation2 = new AppLocation("CardTab", 1);
        CardTab = appLocation2;
        AppLocation appLocation3 = new AppLocation("DiscoverSearch", 2);
        DiscoverSearch = appLocation3;
        AppLocation appLocation4 = new AppLocation("Discover", 3);
        Discover = appLocation4;
        AppLocation appLocation5 = new AppLocation("MerchantProfile", 4);
        MerchantProfile = appLocation5;
        AppLocation appLocation6 = new AppLocation("OffersTab", 5);
        OffersTab = appLocation6;
        AppLocation appLocation7 = new AppLocation("OffersView", 6);
        AppLocation appLocation8 = new AppLocation("ActivityTab", 7);
        ActivityTab = appLocation8;
        $VALUES = new AppLocation[]{appLocation, appLocation2, appLocation3, appLocation4, appLocation5, appLocation6, appLocation7, appLocation8};
    }

    public static AppLocation valueOf(String str) {
        return (AppLocation) Enum.valueOf(AppLocation.class, str);
    }

    public static AppLocation[] values() {
        return (AppLocation[]) $VALUES.clone();
    }
}
