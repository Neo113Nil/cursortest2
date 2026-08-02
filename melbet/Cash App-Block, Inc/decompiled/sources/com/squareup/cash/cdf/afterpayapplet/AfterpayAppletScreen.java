package com.squareup.cash.cdf.afterpayapplet;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class AfterpayAppletScreen {
    public static final /* synthetic */ AfterpayAppletScreen[] $VALUES;
    public static final AfterpayAppletScreen ENTRYPOINT;
    public static final AfterpayAppletScreen HOME;
    public static final AfterpayAppletScreen PURCHASES;
    public static final AfterpayAppletScreen RETRO_ORDER_SELECTION;

    static {
        AfterpayAppletScreen afterpayAppletScreen = new AfterpayAppletScreen("ENTRYPOINT", 0);
        ENTRYPOINT = afterpayAppletScreen;
        AfterpayAppletScreen afterpayAppletScreen2 = new AfterpayAppletScreen("HOME", 1);
        HOME = afterpayAppletScreen2;
        AfterpayAppletScreen afterpayAppletScreen3 = new AfterpayAppletScreen("PURCHASES", 2);
        PURCHASES = afterpayAppletScreen3;
        AfterpayAppletScreen afterpayAppletScreen4 = new AfterpayAppletScreen("RETRO_ORDER_SELECTION", 3);
        RETRO_ORDER_SELECTION = afterpayAppletScreen4;
        $VALUES = new AfterpayAppletScreen[]{afterpayAppletScreen, afterpayAppletScreen2, afterpayAppletScreen3, afterpayAppletScreen4};
    }

    public static AfterpayAppletScreen valueOf(String str) {
        return (AfterpayAppletScreen) Enum.valueOf(AfterpayAppletScreen.class, str);
    }

    public static AfterpayAppletScreen[] values() {
        return (AfterpayAppletScreen[]) $VALUES.clone();
    }
}
