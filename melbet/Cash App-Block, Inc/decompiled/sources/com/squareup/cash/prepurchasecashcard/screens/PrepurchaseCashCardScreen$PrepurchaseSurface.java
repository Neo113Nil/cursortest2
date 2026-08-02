package com.squareup.cash.prepurchasecashcard.screens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class PrepurchaseCashCardScreen$PrepurchaseSurface {
    public static final /* synthetic */ PrepurchaseCashCardScreen$PrepurchaseSurface[] $VALUES;
    public static final PrepurchaseCashCardScreen$PrepurchaseSurface AFTERPAY_APPLET;
    public static final PrepurchaseCashCardScreen$PrepurchaseSurface CARD_TAB;

    static {
        PrepurchaseCashCardScreen$PrepurchaseSurface prepurchaseCashCardScreen$PrepurchaseSurface = new PrepurchaseCashCardScreen$PrepurchaseSurface("CARD_TAB", 0);
        CARD_TAB = prepurchaseCashCardScreen$PrepurchaseSurface;
        PrepurchaseCashCardScreen$PrepurchaseSurface prepurchaseCashCardScreen$PrepurchaseSurface2 = new PrepurchaseCashCardScreen$PrepurchaseSurface("AFTERPAY_APPLET", 1);
        AFTERPAY_APPLET = prepurchaseCashCardScreen$PrepurchaseSurface2;
        $VALUES = new PrepurchaseCashCardScreen$PrepurchaseSurface[]{prepurchaseCashCardScreen$PrepurchaseSurface, prepurchaseCashCardScreen$PrepurchaseSurface2};
    }

    public static PrepurchaseCashCardScreen$PrepurchaseSurface valueOf(String str) {
        return (PrepurchaseCashCardScreen$PrepurchaseSurface) Enum.valueOf(PrepurchaseCashCardScreen$PrepurchaseSurface.class, str);
    }

    public static PrepurchaseCashCardScreen$PrepurchaseSurface[] values() {
        return (PrepurchaseCashCardScreen$PrepurchaseSurface[]) $VALUES.clone();
    }
}
