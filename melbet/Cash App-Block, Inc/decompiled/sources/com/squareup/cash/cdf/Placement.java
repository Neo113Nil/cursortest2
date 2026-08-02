package com.squareup.cash.cdf;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class Placement {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ Placement[] $VALUES;
    public static final Placement ACTIVITY_TAB;
    public static final Placement FAMILY_APPLET;

    static {
        Placement placement = new Placement("PLACEMENT_UNSPECIFIED", 0);
        Placement placement2 = new Placement("TEST_PLACEMENT", 1);
        Placement placement3 = new Placement("BOOST_CAROUSEL", 2);
        Placement placement4 = new Placement("BOTTOM_NAV_MONEY_TAB", 3);
        Placement placement5 = new Placement("BOTTOM_NAV_ACTIVITY_TAB", 4);
        Placement placement6 = new Placement("BOTTOM_NAV_DISCOVER_TAB", 5);
        Placement placement7 = new Placement("BOTTOM_NAV_WALLET_TAB", 6);
        Placement placement8 = new Placement("TOOLBAR_NAV_QR_TAB", 7);
        Placement placement9 = new Placement("TOOLBAR_NAV_GLOBE_TAB", 8);
        Placement placement10 = new Placement("TOOLBAR_NAV_SETTING_TAB", 9);
        Placement placement11 = new Placement("TOOLBAR_NAV_PROFILE_TAB", 10);
        Placement placement12 = new Placement("RECIPIENT_SELECTOR_PERSONALIZE_PAYMENT_BUTTON", 11);
        Placement placement13 = new Placement("TOOLBAR_NAV_DISCOVER_TAB", 12);
        Placement placement14 = new Placement("BALANCE_APPLET_TILE", 13);
        Placement placement15 = new Placement("KEYPAD_TAB_PAY_BUTTON", 14);
        Placement placement16 = new Placement("KEYPAD_TAB_TAP_TO_PAY_BUTTON", 15);
        Placement placement17 = new Placement("KEYPAD_TAB_REQUEST_BUTTON", 16);
        Placement placement18 = new Placement("ACCOUNT_SETTINGS_CASHTAG_DROPDOWN", 17);
        Placement placement19 = new Placement("KEYPAD_TAB_POOL_BUTTON", 18);
        Placement placement20 = new Placement("CARD_HOME_DESIGN_UPSELL", 19);
        Placement placement21 = new Placement("DISCOVER_HERO_SECTION", 20);
        Placement placement22 = new Placement("MONEYBOT_CHAT", 21);
        Placement placement23 = new Placement("FAMILY_APPLET", 22);
        FAMILY_APPLET = placement23;
        Placement placement24 = new Placement("SEND_P2P_FIAT_SUCCESS", 23);
        Placement placement25 = new Placement("SPONSOR_ALLOWANCES_COMPLETION_FLOW", 24);
        Placement placement26 = new Placement("KEYPAD_TAB_QR_BUTTON", 25);
        Placement placement27 = new Placement("KEYPAD_TAB_NEARBY_BUTTON", 26);
        Placement placement28 = new Placement("MONEYBOT_SAVED_TO_MEMORY_LABEL", 27);
        Placement placement29 = new Placement("MANUAL_SAVINGS_CASH_IN_SUCCESS", 28);
        Placement placement30 = new Placement("MANUAL_CASH_IN_SUCCESS", 29);
        Placement placement31 = new Placement("MANUAL_CASH_IN_FAILURE", 30);
        Placement placement32 = new Placement("CASH_CARD_TRANSACTION_FAILURE_RECEIPT", 31);
        Placement placement33 = new Placement("ATM_WITHDRAWAL_SUCCESS_RECEIPT", 32);
        Placement placement34 = new Placement("PAPER_MONEY_DEPOSIT_SUCCESS_RECEIPT", 33);
        Placement placement35 = new Placement("SAVINGS_INTEREST_PAYMENT_SUCCESS_RECEIPT", 34);
        Placement placement36 = new Placement("SPONSOR_APPROVAL_FLOW", 35);
        Placement placement37 = new Placement("MONEY_TAB", 36);
        Placement placement38 = new Placement("CARD_APPLET", 37);
        Placement placement39 = new Placement("PAYMENT_PAD_TAB", 38);
        Placement placement40 = new Placement("INVESTING_APPLET", 39);
        Placement placement41 = new Placement("ACTIVITY_TAB", 40);
        ACTIVITY_TAB = placement41;
        Placement[] placementArr = {placement, placement2, placement3, placement4, placement5, placement6, placement7, placement8, placement9, placement10, placement11, placement12, placement13, placement14, placement15, placement16, placement17, placement18, placement19, placement20, placement21, placement22, placement23, placement24, placement25, placement26, placement27, placement28, placement29, placement30, placement31, placement32, placement33, placement34, placement35, placement36, placement37, placement38, placement39, placement40, placement41, new Placement("BITCOIN_APPLET", 41), new Placement("PROFILE_SCREEN", 42), new Placement("P2P_SUCCESS_RECEIPT", 43), new Placement("REQUEST_P2P_FIAT_SUCCESS", 44)};
        $VALUES = placementArr;
        $ENTRIES = new EnumEntriesList(placementArr);
    }

    public static Placement valueOf(String str) {
        return (Placement) Enum.valueOf(Placement.class, str);
    }

    public static Placement[] values() {
        return (Placement[]) $VALUES.clone();
    }
}
