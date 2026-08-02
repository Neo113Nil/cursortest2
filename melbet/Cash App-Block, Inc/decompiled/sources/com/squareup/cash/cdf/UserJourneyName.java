package com.squareup.cash.cdf;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class UserJourneyName {
    public static final /* synthetic */ UserJourneyName[] $VALUES;
    public static final UserJourneyName ADD_MONEY;
    public static final UserJourneyName BITCOIN_BUY;
    public static final UserJourneyName BITCOIN_SELL;
    public static final UserJourneyName CONTROL_SPENDING;
    public static final UserJourneyName IDENTITY_VERIFICATION;
    public static final UserJourneyName INITIATE_DISPUTE_CLAIM;
    public static final UserJourneyName LINK_INSTRUMENT;
    public static final UserJourneyName LOGIN;
    public static final UserJourneyName MINT_PRODUCT_DETAIL;
    public static final UserJourneyName MINT_TAG_LOCK;
    public static final UserJourneyName MONEYBOT_CHAT;
    public static final UserJourneyName NEARBY_PAYMENT;
    public static final UserJourneyName NEIGHBORHOODS_CREATE_ORDER;
    public static final UserJourneyName OPEN_THE_APP;
    public static final UserJourneyName REQUEST_MONEY;
    public static final UserJourneyName SAM_ACCOUNT_LINKING;
    public static final UserJourneyName SAVINGS_TRANSFER_IN;
    public static final UserJourneyName SAVINGS_TRANSFER_OUT;
    public static final UserJourneyName SEND_MONEY;
    public static final UserJourneyName SEND_MONEY_OON;
    public static final UserJourneyName STOCK_BUY;
    public static final UserJourneyName STOCK_SALE;
    public static final UserJourneyName TEEN_LED_SPONSORSHIP_REQUEST;
    public static final UserJourneyName VIEW_PAPER_MONEY_DEPOSIT_BARCODE;
    public static final UserJourneyName WITHDRAW_MONEY;

    static {
        UserJourneyName userJourneyName = new UserJourneyName("ADD_MONEY", 0);
        ADD_MONEY = userJourneyName;
        UserJourneyName userJourneyName2 = new UserJourneyName("BITCOIN_BUY", 1);
        BITCOIN_BUY = userJourneyName2;
        UserJourneyName userJourneyName3 = new UserJourneyName("BITCOIN_SELL", 2);
        BITCOIN_SELL = userJourneyName3;
        UserJourneyName userJourneyName4 = new UserJourneyName("CONTROL_SPENDING", 3);
        CONTROL_SPENDING = userJourneyName4;
        UserJourneyName userJourneyName5 = new UserJourneyName("IDENTITY_VERIFICATION", 4);
        IDENTITY_VERIFICATION = userJourneyName5;
        UserJourneyName userJourneyName6 = new UserJourneyName("INITIATE_DISPUTE_CLAIM", 5);
        INITIATE_DISPUTE_CLAIM = userJourneyName6;
        UserJourneyName userJourneyName7 = new UserJourneyName("LINK_INSTRUMENT", 6);
        LINK_INSTRUMENT = userJourneyName7;
        UserJourneyName userJourneyName8 = new UserJourneyName("LOGIN", 7);
        LOGIN = userJourneyName8;
        UserJourneyName userJourneyName9 = new UserJourneyName("MINT_PRODUCT_DETAIL", 8);
        MINT_PRODUCT_DETAIL = userJourneyName9;
        UserJourneyName userJourneyName10 = new UserJourneyName("MINT_TAG_LOCK", 9);
        MINT_TAG_LOCK = userJourneyName10;
        UserJourneyName userJourneyName11 = new UserJourneyName("MONEYBOT_CHAT", 10);
        MONEYBOT_CHAT = userJourneyName11;
        UserJourneyName userJourneyName12 = new UserJourneyName("NEARBY_PAYMENT", 11);
        NEARBY_PAYMENT = userJourneyName12;
        UserJourneyName userJourneyName13 = new UserJourneyName("NEIGHBORHOODS_CREATE_ORDER", 12);
        NEIGHBORHOODS_CREATE_ORDER = userJourneyName13;
        UserJourneyName userJourneyName14 = new UserJourneyName("OPEN_THE_APP", 13);
        OPEN_THE_APP = userJourneyName14;
        UserJourneyName userJourneyName15 = new UserJourneyName("REQUEST_MONEY", 14);
        REQUEST_MONEY = userJourneyName15;
        UserJourneyName userJourneyName16 = new UserJourneyName("SAM_ACCOUNT_LINKING", 15);
        SAM_ACCOUNT_LINKING = userJourneyName16;
        UserJourneyName userJourneyName17 = new UserJourneyName("SAVINGS_TRANSFER_IN", 16);
        SAVINGS_TRANSFER_IN = userJourneyName17;
        UserJourneyName userJourneyName18 = new UserJourneyName("SAVINGS_TRANSFER_OUT", 17);
        SAVINGS_TRANSFER_OUT = userJourneyName18;
        UserJourneyName userJourneyName19 = new UserJourneyName("SEND_MONEY", 18);
        SEND_MONEY = userJourneyName19;
        UserJourneyName userJourneyName20 = new UserJourneyName("SEND_MONEY_OON", 19);
        SEND_MONEY_OON = userJourneyName20;
        UserJourneyName userJourneyName21 = new UserJourneyName("STOCK_BUY", 20);
        STOCK_BUY = userJourneyName21;
        UserJourneyName userJourneyName22 = new UserJourneyName("STOCK_SALE", 21);
        STOCK_SALE = userJourneyName22;
        UserJourneyName userJourneyName23 = new UserJourneyName("TEEN_LED_SPONSORSHIP_REQUEST", 22);
        TEEN_LED_SPONSORSHIP_REQUEST = userJourneyName23;
        UserJourneyName userJourneyName24 = new UserJourneyName("VIEW_PAPER_MONEY_DEPOSIT_BARCODE", 23);
        VIEW_PAPER_MONEY_DEPOSIT_BARCODE = userJourneyName24;
        UserJourneyName userJourneyName25 = new UserJourneyName("WITHDRAW_MONEY", 24);
        WITHDRAW_MONEY = userJourneyName25;
        $VALUES = new UserJourneyName[]{userJourneyName, userJourneyName2, userJourneyName3, userJourneyName4, userJourneyName5, userJourneyName6, userJourneyName7, userJourneyName8, userJourneyName9, userJourneyName10, userJourneyName11, userJourneyName12, userJourneyName13, userJourneyName14, userJourneyName15, userJourneyName16, userJourneyName17, userJourneyName18, userJourneyName19, userJourneyName20, userJourneyName21, userJourneyName22, userJourneyName23, userJourneyName24, userJourneyName25};
    }

    public static UserJourneyName valueOf(String str) {
        return (UserJourneyName) Enum.valueOf(UserJourneyName.class, str);
    }

    public static UserJourneyName[] values() {
        return (UserJourneyName[]) $VALUES.clone();
    }
}
