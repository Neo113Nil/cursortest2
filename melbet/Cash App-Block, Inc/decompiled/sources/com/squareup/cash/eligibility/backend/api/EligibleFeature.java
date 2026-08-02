package com.squareup.cash.eligibility.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class EligibleFeature {
    public static final /* synthetic */ EligibleFeature[] $VALUES;
    public static final EligibleFeature ACCOUNT_SWITCHER;
    public static final EligibleFeature BITCOIN_AUTO_INVEST;
    public static final EligibleFeature C4B_PROMOTION_VISIBILITY;
    public static final EligibleFeature CASH_CARD_TAB;
    public static final EligibleFeature CASH_OFFERS_TAB;
    public static final EligibleFeature DDA_TAB;
    public static final EligibleFeature DOCUMENTS_BTC;
    public static final EligibleFeature DOCUMENTS_STOCK;
    public static final EligibleFeature DOCUMENTS_TAXES;
    public static final EligibleFeature MONEYBOT_VISIBILITY;
    public static final EligibleFeature MONEY_BTC_APPLET;
    public static final EligibleFeature MONEY_EARNINGS_APPLET;
    public static final EligibleFeature MONEY_FAMILIES_APPLET;
    public static final EligibleFeature MONEY_GLOBAL_BORROW_APPLET;
    public static final EligibleFeature MONEY_INVESTING_APPLET;
    public static final EligibleFeature MONEY_TAXES_APPLET;
    public static final EligibleFeature NEARBY_PAYMENT_FEATURE_VISIBILITY;
    public static final EligibleFeature POOLS_ONBOARDING_VISIBILITY;
    public static final EligibleFeature RECURRING_P2P_PAYMENT_FEATURE_VISIBILITY;
    public static final EligibleFeature REMITTANCE_SEND;
    public static final EligibleFeature SPONSOR_ELIGIBLE;
    public static final EligibleFeature TAP_TO_PAY;
    public static final EligibleFeature WORK_APPLET_VISIBILITY;

    static {
        EligibleFeature eligibleFeature = new EligibleFeature("ACCOUNT_SWITCHER", 0);
        ACCOUNT_SWITCHER = eligibleFeature;
        EligibleFeature eligibleFeature2 = new EligibleFeature("BITCOIN_AUTO_INVEST", 1);
        BITCOIN_AUTO_INVEST = eligibleFeature2;
        EligibleFeature eligibleFeature3 = new EligibleFeature("C4B_PROMOTION_VISIBILITY", 2);
        C4B_PROMOTION_VISIBILITY = eligibleFeature3;
        EligibleFeature eligibleFeature4 = new EligibleFeature("CASH_CARD_TAB", 3);
        CASH_CARD_TAB = eligibleFeature4;
        EligibleFeature eligibleFeature5 = new EligibleFeature("CASH_OFFERS_TAB", 4);
        CASH_OFFERS_TAB = eligibleFeature5;
        EligibleFeature eligibleFeature6 = new EligibleFeature("DDA_TAB", 5);
        DDA_TAB = eligibleFeature6;
        EligibleFeature eligibleFeature7 = new EligibleFeature("DOCUMENTS_BTC", 6);
        DOCUMENTS_BTC = eligibleFeature7;
        EligibleFeature eligibleFeature8 = new EligibleFeature("DOCUMENTS_STOCK", 7);
        DOCUMENTS_STOCK = eligibleFeature8;
        EligibleFeature eligibleFeature9 = new EligibleFeature("DOCUMENTS_TAXES", 8);
        DOCUMENTS_TAXES = eligibleFeature9;
        EligibleFeature eligibleFeature10 = new EligibleFeature("MONEY_BTC_APPLET", 9);
        MONEY_BTC_APPLET = eligibleFeature10;
        EligibleFeature eligibleFeature11 = new EligibleFeature("MONEY_EARNINGS_APPLET", 10);
        MONEY_EARNINGS_APPLET = eligibleFeature11;
        EligibleFeature eligibleFeature12 = new EligibleFeature("MONEY_FAMILIES_APPLET", 11);
        MONEY_FAMILIES_APPLET = eligibleFeature12;
        EligibleFeature eligibleFeature13 = new EligibleFeature("MONEY_GLOBAL_BORROW_APPLET", 12);
        MONEY_GLOBAL_BORROW_APPLET = eligibleFeature13;
        EligibleFeature eligibleFeature14 = new EligibleFeature("MONEY_INVESTING_APPLET", 13);
        MONEY_INVESTING_APPLET = eligibleFeature14;
        EligibleFeature eligibleFeature15 = new EligibleFeature("MONEY_TAXES_APPLET", 14);
        MONEY_TAXES_APPLET = eligibleFeature15;
        EligibleFeature eligibleFeature16 = new EligibleFeature("MONEYBOT_VISIBILITY", 15);
        MONEYBOT_VISIBILITY = eligibleFeature16;
        EligibleFeature eligibleFeature17 = new EligibleFeature("NEARBY_PAYMENT_FEATURE_VISIBILITY", 16);
        NEARBY_PAYMENT_FEATURE_VISIBILITY = eligibleFeature17;
        EligibleFeature eligibleFeature18 = new EligibleFeature("POOLS_ONBOARDING_VISIBILITY", 17);
        POOLS_ONBOARDING_VISIBILITY = eligibleFeature18;
        EligibleFeature eligibleFeature19 = new EligibleFeature("RECURRING_P2P_PAYMENT_FEATURE_VISIBILITY", 18);
        RECURRING_P2P_PAYMENT_FEATURE_VISIBILITY = eligibleFeature19;
        EligibleFeature eligibleFeature20 = new EligibleFeature("REMITTANCE_SEND", 19);
        REMITTANCE_SEND = eligibleFeature20;
        EligibleFeature eligibleFeature21 = new EligibleFeature("SPONSOR_ELIGIBLE", 20);
        SPONSOR_ELIGIBLE = eligibleFeature21;
        EligibleFeature eligibleFeature22 = new EligibleFeature("TAP_TO_PAY", 21);
        TAP_TO_PAY = eligibleFeature22;
        EligibleFeature eligibleFeature23 = new EligibleFeature("WORK_APPLET_VISIBILITY", 22);
        WORK_APPLET_VISIBILITY = eligibleFeature23;
        $VALUES = new EligibleFeature[]{eligibleFeature, eligibleFeature2, eligibleFeature3, eligibleFeature4, eligibleFeature5, eligibleFeature6, eligibleFeature7, eligibleFeature8, eligibleFeature9, eligibleFeature10, eligibleFeature11, eligibleFeature12, eligibleFeature13, eligibleFeature14, eligibleFeature15, eligibleFeature16, eligibleFeature17, eligibleFeature18, eligibleFeature19, eligibleFeature20, eligibleFeature21, eligibleFeature22, eligibleFeature23};
    }

    public static EligibleFeature valueOf(String str) {
        return (EligibleFeature) Enum.valueOf(EligibleFeature.class, str);
    }

    public static EligibleFeature[] values() {
        return (EligibleFeature[]) $VALUES.clone();
    }
}
