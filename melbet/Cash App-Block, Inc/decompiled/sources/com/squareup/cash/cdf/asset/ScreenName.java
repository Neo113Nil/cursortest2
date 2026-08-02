package com.squareup.cash.cdf.asset;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class ScreenName {
    public static final /* synthetic */ ScreenName[] $VALUES;
    public static final ScreenName AMOUNT_ENTRY;
    public static final ScreenName INPUT_NOTE;
    public static final ScreenName LOADING;
    public static final ScreenName RECIPIENT_SELECTION;
    public static final ScreenName REVIEW_PAYMENT;
    public static final ScreenName SHARE_OPTIONS;
    public static final ScreenName STABLECOIN_NETWORK_SELECTION;

    static {
        ScreenName screenName = new ScreenName("RECIPIENT_SELECTION", 0);
        RECIPIENT_SELECTION = screenName;
        ScreenName screenName2 = new ScreenName("INPUT_NOTE", 1);
        INPUT_NOTE = screenName2;
        ScreenName screenName3 = new ScreenName("REVIEW_PAYMENT", 2);
        REVIEW_PAYMENT = screenName3;
        ScreenName screenName4 = new ScreenName("SHARE_OPTIONS", 3);
        SHARE_OPTIONS = screenName4;
        ScreenName screenName5 = new ScreenName("LOADING", 4);
        LOADING = screenName5;
        ScreenName screenName6 = new ScreenName("STABLECOIN_NETWORK_SELECTION", 5);
        STABLECOIN_NETWORK_SELECTION = screenName6;
        ScreenName screenName7 = new ScreenName("AMOUNT_ENTRY", 6);
        AMOUNT_ENTRY = screenName7;
        $VALUES = new ScreenName[]{screenName, screenName2, screenName3, screenName4, screenName5, screenName6, screenName7};
    }

    public static ScreenName valueOf(String str) {
        return (ScreenName) Enum.valueOf(ScreenName.class, str);
    }

    public static ScreenName[] values() {
        return (ScreenName[]) $VALUES.clone();
    }
}
