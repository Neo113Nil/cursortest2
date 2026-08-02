package com.squareup.cash.money.core.ids;

import kotlin.enums.EnumEntriesList;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AppletId {
    public static final /* synthetic */ EnumEntriesList $ENTRIES;
    public static final /* synthetic */ AppletId[] $VALUES;
    public static final AppletId AFTERPAY;
    public static final AppletId AGENTS;
    public static final AppletId ALLOWANCE;
    public static final AppletId APPROVED_CONTACTS;
    public static final AppletId BALANCE;
    public static final AppletId BANKING_BENEFITS;
    public static final AppletId BITCOIN;
    public static final AppletId BORROW;
    public static final AppletId CARD;
    public static final AppletId EARNER;
    public static final AppletId EARNINGS;
    public static final AppletId FAMILY;
    public static final AppletId FINISH_SETUP;
    public static final AppletId KIDS_ACTIVITY;
    public static final AppletId KYC;
    public static final AppletId LITE_ACTIVITY;
    public static final AppletId LITE_UNINSTALLED_BALANCE;
    public static final AppletId LITE_UNINSTALLED_CARD;
    public static final AppletId PAYCHECKS;
    public static final AppletId PHONE_PLANS;
    public static final AppletId POOLS;
    public static final AppletId PROMOTED_BANKING_BENEFITS;
    public static final AppletId PROMOTED_CARD;
    public static final AppletId SAVINGS;
    public static final AppletId SCORE;
    public static final AppletId STOCKS;
    public static final AppletId TAXES;
    public static final AppletId WORK;

    static {
        AppletId appletId = new AppletId("AFTERPAY", 0);
        AFTERPAY = appletId;
        AppletId appletId2 = new AppletId("BALANCE", 1);
        BALANCE = appletId2;
        AppletId appletId3 = new AppletId("BANKING_BENEFITS", 2);
        BANKING_BENEFITS = appletId3;
        AppletId appletId4 = new AppletId("SAVINGS", 3);
        SAVINGS = appletId4;
        AppletId appletId5 = new AppletId("STOCKS", 4);
        STOCKS = appletId5;
        AppletId appletId6 = new AppletId("BITCOIN", 5);
        BITCOIN = appletId6;
        AppletId appletId7 = new AppletId("BORROW", 6);
        BORROW = appletId7;
        AppletId appletId8 = new AppletId("SCORE", 7);
        SCORE = appletId8;
        AppletId appletId9 = new AppletId("PAYCHECKS", 8);
        PAYCHECKS = appletId9;
        AppletId appletId10 = new AppletId("EARNER", 9);
        EARNER = appletId10;
        AppletId appletId11 = new AppletId("TAXES", 10);
        TAXES = appletId11;
        AppletId appletId12 = new AppletId("FAMILY", 11);
        FAMILY = appletId12;
        AppletId appletId13 = new AppletId("AGENTS", 12);
        AGENTS = appletId13;
        AppletId appletId14 = new AppletId("EARNINGS", 13);
        EARNINGS = appletId14;
        AppletId appletId15 = new AppletId("PROMOTED_BANKING_BENEFITS", 14);
        PROMOTED_BANKING_BENEFITS = appletId15;
        AppletId appletId16 = new AppletId("PROMOTED_CARD", 15);
        PROMOTED_CARD = appletId16;
        AppletId appletId17 = new AppletId("LITE_UNINSTALLED_CARD", 16);
        LITE_UNINSTALLED_CARD = appletId17;
        AppletId appletId18 = new AppletId("PROMOTED_TAXES", 17);
        AppletId appletId19 = new AppletId("CARD", 18);
        CARD = appletId19;
        AppletId appletId20 = new AppletId("SPENDING", 19);
        AppletId appletId21 = new AppletId("POOLS", 20);
        POOLS = appletId21;
        AppletId appletId22 = new AppletId("MONEYBOT", 21);
        AppletId appletId23 = new AppletId("KIDS_ACTIVITY", 22);
        KIDS_ACTIVITY = appletId23;
        AppletId appletId24 = new AppletId("ALLOWANCE", 23);
        ALLOWANCE = appletId24;
        AppletId appletId25 = new AppletId("APPROVED_CONTACTS", 24);
        APPROVED_CONTACTS = appletId25;
        AppletId appletId26 = new AppletId("WORK", 25);
        WORK = appletId26;
        AppletId appletId27 = new AppletId("PHONE_PLANS", 26);
        PHONE_PLANS = appletId27;
        AppletId appletId28 = new AppletId("KYC", 27);
        KYC = appletId28;
        AppletId appletId29 = new AppletId("LITE_ACTIVITY", 28);
        LITE_ACTIVITY = appletId29;
        AppletId appletId30 = new AppletId("FINISH_SETUP", 29);
        FINISH_SETUP = appletId30;
        AppletId appletId31 = new AppletId("LITE_UNINSTALLED_BALANCE", 30);
        LITE_UNINSTALLED_BALANCE = appletId31;
        AppletId[] appletIdArr = {appletId, appletId2, appletId3, appletId4, appletId5, appletId6, appletId7, appletId8, appletId9, appletId10, appletId11, appletId12, appletId13, appletId14, appletId15, appletId16, appletId17, appletId18, appletId19, appletId20, appletId21, appletId22, appletId23, appletId24, appletId25, appletId26, appletId27, appletId28, appletId29, appletId30, appletId31};
        $VALUES = appletIdArr;
        $ENTRIES = new EnumEntriesList(appletIdArr);
    }

    public static AppletId valueOf(String str) {
        return (AppletId) Enum.valueOf(AppletId.class, str);
    }

    public static AppletId[] values() {
        return (AppletId[]) $VALUES.clone();
    }
}
