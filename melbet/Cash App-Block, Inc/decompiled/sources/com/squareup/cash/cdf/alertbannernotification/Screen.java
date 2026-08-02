package com.squareup.cash.cdf.alertbannernotification;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes9.dex */
public final class Screen {
    public static final /* synthetic */ Screen[] $VALUES;
    public static final Screen ACTIVITY_TAB;
    public static final Screen MONEY_TAB;
    public static final Screen PAYMENT_PAD;

    static {
        Screen screen = new Screen("MONEY_TAB", 0);
        MONEY_TAB = screen;
        Screen screen2 = new Screen("ACTIVITY_TAB", 1);
        ACTIVITY_TAB = screen2;
        Screen screen3 = new Screen("PAYMENT_PAD", 2);
        PAYMENT_PAD = screen3;
        $VALUES = new Screen[]{screen, screen2, screen3};
    }

    public static Screen valueOf(String str) {
        return (Screen) Enum.valueOf(Screen.class, str);
    }

    public static Screen[] values() {
        return (Screen[]) $VALUES.clone();
    }
}
