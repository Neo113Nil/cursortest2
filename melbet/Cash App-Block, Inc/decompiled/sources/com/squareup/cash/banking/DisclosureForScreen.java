package com.squareup.cash.banking;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class DisclosureForScreen {
    public static final /* synthetic */ DisclosureForScreen[] $VALUES;
    public static final DisclosureForScreen ACCOUNT_PROFILE;
    public static final DisclosureForScreen BALANCE_HOME;
    public static final DisclosureForScreen BENEFITS_BOOKLET;
    public static final DisclosureForScreen BENEFITS_HOME;
    public static final DisclosureForScreen CARDS_HOME;
    public static final DisclosureForScreen MONEY_TAB;
    public static final DisclosureForScreen PAYCHECKS;
    public static final DisclosureForScreen SAVINGS_HOME;

    static {
        DisclosureForScreen disclosureForScreen = new DisclosureForScreen("ACCOUNT_PROFILE", 0);
        ACCOUNT_PROFILE = disclosureForScreen;
        DisclosureForScreen disclosureForScreen2 = new DisclosureForScreen("BALANCE_HOME", 1);
        BALANCE_HOME = disclosureForScreen2;
        DisclosureForScreen disclosureForScreen3 = new DisclosureForScreen("BENEFITS_BOOKLET", 2);
        BENEFITS_BOOKLET = disclosureForScreen3;
        DisclosureForScreen disclosureForScreen4 = new DisclosureForScreen("BENEFITS_HOME", 3);
        BENEFITS_HOME = disclosureForScreen4;
        DisclosureForScreen disclosureForScreen5 = new DisclosureForScreen("CARDS_HOME", 4);
        CARDS_HOME = disclosureForScreen5;
        DisclosureForScreen disclosureForScreen6 = new DisclosureForScreen("SAVINGS_HOME", 5);
        SAVINGS_HOME = disclosureForScreen6;
        DisclosureForScreen disclosureForScreen7 = new DisclosureForScreen("PAYCHECKS", 6);
        PAYCHECKS = disclosureForScreen7;
        DisclosureForScreen disclosureForScreen8 = new DisclosureForScreen("MONEY_TAB", 7);
        MONEY_TAB = disclosureForScreen8;
        $VALUES = new DisclosureForScreen[]{disclosureForScreen, disclosureForScreen2, disclosureForScreen3, disclosureForScreen4, disclosureForScreen5, disclosureForScreen6, disclosureForScreen7, disclosureForScreen8};
    }

    public static DisclosureForScreen valueOf(String str) {
        return (DisclosureForScreen) Enum.valueOf(DisclosureForScreen.class, str);
    }

    public static DisclosureForScreen[] values() {
        return (DisclosureForScreen[]) $VALUES.clone();
    }
}
