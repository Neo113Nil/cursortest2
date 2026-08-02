package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class BrowserOrigin {
    public static final /* synthetic */ BrowserOrigin[] $VALUES;
    public static final BrowserOrigin CardTabBoost;
    public static final BrowserOrigin DirectoryBoost;
    public static final BrowserOrigin DiscoverSearch;
    public static final BrowserOrigin MerchantProfileBoost;
    public static final BrowserOrigin MerchantProfileDiscover;
    public static final BrowserOrigin OffersTab;
    public static final BrowserOrigin ShopHubSearch;

    /* JADX INFO: Fake field, exist only in values array */
    BrowserOrigin EF0;

    static {
        BrowserOrigin browserOrigin = new BrowserOrigin("ActivityHistory", 0);
        BrowserOrigin browserOrigin2 = new BrowserOrigin("AfterpayApplet", 1);
        BrowserOrigin browserOrigin3 = new BrowserOrigin("CardTabBoost", 2);
        CardTabBoost = browserOrigin3;
        BrowserOrigin browserOrigin4 = new BrowserOrigin("DirectoryBoost", 3);
        DirectoryBoost = browserOrigin4;
        BrowserOrigin browserOrigin5 = new BrowserOrigin("DirectorySearch", 4);
        BrowserOrigin browserOrigin6 = new BrowserOrigin("DirectoryCarousel", 5);
        BrowserOrigin browserOrigin7 = new BrowserOrigin("DiscoverSearch", 6);
        DiscoverSearch = browserOrigin7;
        BrowserOrigin browserOrigin8 = new BrowserOrigin("MerchantProfileBoost", 7);
        MerchantProfileBoost = browserOrigin8;
        BrowserOrigin browserOrigin9 = new BrowserOrigin("MerchantProfileDiscover", 8);
        MerchantProfileDiscover = browserOrigin9;
        BrowserOrigin browserOrigin10 = new BrowserOrigin("ShopHubBrowse", 9);
        BrowserOrigin browserOrigin11 = new BrowserOrigin("ShopHubSearch", 10);
        ShopHubSearch = browserOrigin11;
        BrowserOrigin browserOrigin12 = new BrowserOrigin("ShopHubCarousel", 11);
        BrowserOrigin browserOrigin13 = new BrowserOrigin("OffersTab", 12);
        OffersTab = browserOrigin13;
        $VALUES = new BrowserOrigin[]{browserOrigin, browserOrigin2, browserOrigin3, browserOrigin4, browserOrigin5, browserOrigin6, browserOrigin7, browserOrigin8, browserOrigin9, browserOrigin10, browserOrigin11, browserOrigin12, browserOrigin13};
    }

    public static BrowserOrigin valueOf(String str) {
        return (BrowserOrigin) Enum.valueOf(BrowserOrigin.class, str);
    }

    public static BrowserOrigin[] values() {
        return (BrowserOrigin[]) $VALUES.clone();
    }
}
