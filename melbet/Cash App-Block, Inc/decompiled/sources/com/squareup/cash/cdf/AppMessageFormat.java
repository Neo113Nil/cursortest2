package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AppMessageFormat {
    public static final /* synthetic */ AppMessageFormat[] $VALUES;
    public static final AppMessageFormat CARD;
    public static final AppMessageFormat FULL_SCREEN;
    public static final AppMessageFormat HALF_SHEET;
    public static final AppMessageFormat INLINE_V2;
    public static final AppMessageFormat TOOLTIP;

    /* JADX INFO: Fake field, exist only in values array */
    AppMessageFormat EF0;

    static {
        AppMessageFormat appMessageFormat = new AppMessageFormat("BOOST", 0);
        AppMessageFormat appMessageFormat2 = new AppMessageFormat("FULL_SCREEN", 1);
        FULL_SCREEN = appMessageFormat2;
        AppMessageFormat appMessageFormat3 = new AppMessageFormat("IN_APP_NOTIFICATION", 2);
        AppMessageFormat appMessageFormat4 = new AppMessageFormat("INLINE", 3);
        AppMessageFormat appMessageFormat5 = new AppMessageFormat("POPUP", 4);
        AppMessageFormat appMessageFormat6 = new AppMessageFormat("STATUS_RESULT", 5);
        AppMessageFormat appMessageFormat7 = new AppMessageFormat("TOOLTIP", 6);
        TOOLTIP = appMessageFormat7;
        AppMessageFormat appMessageFormat8 = new AppMessageFormat("HALF_SHEET", 7);
        HALF_SHEET = appMessageFormat8;
        AppMessageFormat appMessageFormat9 = new AppMessageFormat("HERO_TILE", 8);
        AppMessageFormat appMessageFormat10 = new AppMessageFormat("DETAILS_PAGE", 9);
        AppMessageFormat appMessageFormat11 = new AppMessageFormat("CARD", 10);
        CARD = appMessageFormat11;
        AppMessageFormat appMessageFormat12 = new AppMessageFormat("INLINE_V2", 11);
        INLINE_V2 = appMessageFormat12;
        $VALUES = new AppMessageFormat[]{appMessageFormat, appMessageFormat2, appMessageFormat3, appMessageFormat4, appMessageFormat5, appMessageFormat6, appMessageFormat7, appMessageFormat8, appMessageFormat9, appMessageFormat10, appMessageFormat11, appMessageFormat12, new AppMessageFormat("MONEYBOT_SUGGESTION", 12)};
    }

    public static AppMessageFormat valueOf(String str) {
        return (AppMessageFormat) Enum.valueOf(AppMessageFormat.class, str);
    }

    public static AppMessageFormat[] values() {
        return (AppMessageFormat[]) $VALUES.clone();
    }
}
