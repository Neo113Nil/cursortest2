package com.squareup.cash.cdf.boost;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AppLocation {
    public static final /* synthetic */ AppLocation[] $VALUES;
    public static final AppLocation CardTab;
    public static final AppLocation Directory;
    public static final AppLocation MerchantProfile;
    public static final AppLocation OffersCollection;
    public static final AppLocation OffersDetail;

    static {
        AppLocation appLocation = new AppLocation("CardTab", 0);
        CardTab = appLocation;
        AppLocation appLocation2 = new AppLocation("Directory", 1);
        Directory = appLocation2;
        AppLocation appLocation3 = new AppLocation("MerchantProfile", 2);
        MerchantProfile = appLocation3;
        AppLocation appLocation4 = new AppLocation("DiscoverSearch", 3);
        AppLocation appLocation5 = new AppLocation("OffersDetail", 4);
        OffersDetail = appLocation5;
        AppLocation appLocation6 = new AppLocation("OffersCollection", 5);
        OffersCollection = appLocation6;
        $VALUES = new AppLocation[]{appLocation, appLocation2, appLocation3, appLocation4, appLocation5, appLocation6};
    }

    public static AppLocation valueOf(String str) {
        return (AppLocation) Enum.valueOf(AppLocation.class, str);
    }

    public static AppLocation[] values() {
        return (AppLocation[]) $VALUES.clone();
    }
}
