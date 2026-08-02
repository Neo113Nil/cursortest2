package com.squareup.cash.cdf.taptopay;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class ScreenID {
    public static final /* synthetic */ ScreenID[] $VALUES;
    public static final ScreenID AndroidReadCardScreen;
    public static final ScreenID CashPad;
    public static final ScreenID FirstTimeScreen;
    public static final ScreenID LoadingScreen;
    public static final ScreenID PaymentCompleteScreen;
    public static final ScreenID PaymentFailedScreen;
    public static final ScreenID PurchaseDescriptionScreen;

    static {
        ScreenID screenID = new ScreenID("CashPad", 0);
        CashPad = screenID;
        ScreenID screenID2 = new ScreenID("LoadingScreen", 1);
        LoadingScreen = screenID2;
        ScreenID screenID3 = new ScreenID("AppleTermsAndConditionsScreen", 2);
        ScreenID screenID4 = new ScreenID("SettingUpDeviceScreen", 3);
        ScreenID screenID5 = new ScreenID("SetUpCompleteScreen", 4);
        ScreenID screenID6 = new ScreenID("PurchaseDescriptionScreen", 5);
        PurchaseDescriptionScreen = screenID6;
        ScreenID screenID7 = new ScreenID("AndroidReadCardScreen", 6);
        AndroidReadCardScreen = screenID7;
        ScreenID screenID8 = new ScreenID("ApplePresentCardScreen", 7);
        ScreenID screenID9 = new ScreenID("AppleReadCardDoneScreen", 8);
        ScreenID screenID10 = new ScreenID("PaymentCompleteScreen", 9);
        PaymentCompleteScreen = screenID10;
        ScreenID screenID11 = new ScreenID("PaymentFailedScreen", 10);
        PaymentFailedScreen = screenID11;
        ScreenID screenID12 = new ScreenID("InstructionsScreen", 11);
        ScreenID screenID13 = new ScreenID("FirstTimeScreen", 12);
        FirstTimeScreen = screenID13;
        $VALUES = new ScreenID[]{screenID, screenID2, screenID3, screenID4, screenID5, screenID6, screenID7, screenID8, screenID9, screenID10, screenID11, screenID12, screenID13};
    }

    public static ScreenID valueOf(String str) {
        return (ScreenID) Enum.valueOf(ScreenID.class, str);
    }

    public static ScreenID[] values() {
        return (ScreenID[]) $VALUES.clone();
    }
}
