package com.squareup.cash.cdf.offers;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Screen {
    public static final /* synthetic */ Screen[] $VALUES;
    public static final Screen AP_APPLET_HOME;
    public static final Screen AP_APPLET_SEARCH;
    public static final Screen OFFERS_HOME_V2;

    /* JADX INFO: Fake field, exist only in values array */
    Screen EF0;

    static {
        Screen screen = new Screen("OFFERS_HOME", 0);
        Screen screen2 = new Screen("OFFERS_HOME_V2", 1);
        OFFERS_HOME_V2 = screen2;
        Screen screen3 = new Screen("OFFERS_SEARCH", 2);
        Screen screen4 = new Screen("OFFERS_COLLECTION", 3);
        Screen screen5 = new Screen("AP_APPLET_HOME", 4);
        AP_APPLET_HOME = screen5;
        Screen screen6 = new Screen("AP_APPLET_SEARCH", 5);
        AP_APPLET_SEARCH = screen6;
        $VALUES = new Screen[]{screen, screen2, screen3, screen4, screen5, screen6, new Screen("HOMEPAGE", 6), new Screen("SEARCH", 7), new Screen("COLLECTION", 8), new Screen("OFFER_DETAILS", 9)};
    }

    public static Screen valueOf(String str) {
        return (Screen) Enum.valueOf(Screen.class, str);
    }

    public static Screen[] values() {
        return (Screen[]) $VALUES.clone();
    }
}
