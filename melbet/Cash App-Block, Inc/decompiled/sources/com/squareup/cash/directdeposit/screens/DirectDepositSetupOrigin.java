package com.squareup.cash.directdeposit.screens;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class DirectDepositSetupOrigin {
    public static final /* synthetic */ DirectDepositSetupOrigin[] $VALUES;
    public static final DirectDepositSetupOrigin ATM_WITHDRAWAL;
    public static final DirectDepositSetupOrigin BALANCE_HOME;
    public static final DirectDepositSetupOrigin BANKING_TAB;
    public static final DirectDepositSetupOrigin BENEFITS_HUB;
    public static final DirectDepositSetupOrigin BORROW;
    public static final DirectDepositSetupOrigin CARD_ONBOARDING;
    public static final DirectDepositSetupOrigin DEEPLINK;
    public static final DirectDepositSetupOrigin EMAIL_CAMPAIGN;
    public static final DirectDepositSetupOrigin IN_APP_CAMPAIGN;
    public static final DirectDepositSetupOrigin MARKETING_CAMPAIGN;
    public static final DirectDepositSetupOrigin OVERDRAFT;
    public static final DirectDepositSetupOrigin PAID_IN_BITCOIN;
    public static final DirectDepositSetupOrigin PAPER_MONEY_DEPOSIT;
    public static final DirectDepositSetupOrigin PAYCHECKS;
    public static final DirectDepositSetupOrigin PAYCHECKS_BENEFITS_BOOKLET;
    public static final DirectDepositSetupOrigin PUSH_CAMPAIGN;
    public static final DirectDepositSetupOrigin RECURRING_DEPOSITS;
    public static final DirectDepositSetupOrigin SAVINGS_YIELD_UPSELL;
    public static final DirectDepositSetupOrigin SMS_CAMPAIGN;
    public static final DirectDepositSetupOrigin UNDETERMINED;

    /* JADX INFO: Fake field, exist only in values array */
    DirectDepositSetupOrigin EF1;

    static {
        DirectDepositSetupOrigin directDepositSetupOrigin = new DirectDepositSetupOrigin("ADD_MONEY", 0);
        DirectDepositSetupOrigin directDepositSetupOrigin2 = new DirectDepositSetupOrigin("BANKING_TAB", 1);
        BANKING_TAB = directDepositSetupOrigin2;
        DirectDepositSetupOrigin directDepositSetupOrigin3 = new DirectDepositSetupOrigin("BALANCE_HOME", 2);
        BALANCE_HOME = directDepositSetupOrigin3;
        DirectDepositSetupOrigin directDepositSetupOrigin4 = new DirectDepositSetupOrigin("DEEPLINK", 3);
        DEEPLINK = directDepositSetupOrigin4;
        DirectDepositSetupOrigin directDepositSetupOrigin5 = new DirectDepositSetupOrigin("PAID_IN_BITCOIN", 4);
        PAID_IN_BITCOIN = directDepositSetupOrigin5;
        DirectDepositSetupOrigin directDepositSetupOrigin6 = new DirectDepositSetupOrigin("RECURRING_DEPOSITS", 5);
        RECURRING_DEPOSITS = directDepositSetupOrigin6;
        DirectDepositSetupOrigin directDepositSetupOrigin7 = new DirectDepositSetupOrigin("PAYCHECKS", 6);
        PAYCHECKS = directDepositSetupOrigin7;
        DirectDepositSetupOrigin directDepositSetupOrigin8 = new DirectDepositSetupOrigin("BENEFITS_HUB", 7);
        BENEFITS_HUB = directDepositSetupOrigin8;
        DirectDepositSetupOrigin directDepositSetupOrigin9 = new DirectDepositSetupOrigin("SAVINGS_YIELD_UPSELL", 8);
        SAVINGS_YIELD_UPSELL = directDepositSetupOrigin9;
        DirectDepositSetupOrigin directDepositSetupOrigin10 = new DirectDepositSetupOrigin("OVERDRAFT", 9);
        OVERDRAFT = directDepositSetupOrigin10;
        DirectDepositSetupOrigin directDepositSetupOrigin11 = new DirectDepositSetupOrigin("PAPER_MONEY_DEPOSIT", 10);
        PAPER_MONEY_DEPOSIT = directDepositSetupOrigin11;
        DirectDepositSetupOrigin directDepositSetupOrigin12 = new DirectDepositSetupOrigin("ATM_WITHDRAWAL", 11);
        ATM_WITHDRAWAL = directDepositSetupOrigin12;
        DirectDepositSetupOrigin directDepositSetupOrigin13 = new DirectDepositSetupOrigin("CARD_ONBOARDING", 12);
        CARD_ONBOARDING = directDepositSetupOrigin13;
        DirectDepositSetupOrigin directDepositSetupOrigin14 = new DirectDepositSetupOrigin("BORROW", 13);
        BORROW = directDepositSetupOrigin14;
        DirectDepositSetupOrigin directDepositSetupOrigin15 = new DirectDepositSetupOrigin("EMAIL_CAMPAIGN", 14);
        EMAIL_CAMPAIGN = directDepositSetupOrigin15;
        DirectDepositSetupOrigin directDepositSetupOrigin16 = new DirectDepositSetupOrigin("PUSH_CAMPAIGN", 15);
        PUSH_CAMPAIGN = directDepositSetupOrigin16;
        DirectDepositSetupOrigin directDepositSetupOrigin17 = new DirectDepositSetupOrigin("IN_APP_CAMPAIGN", 16);
        IN_APP_CAMPAIGN = directDepositSetupOrigin17;
        DirectDepositSetupOrigin directDepositSetupOrigin18 = new DirectDepositSetupOrigin("SMS_CAMPAIGN", 17);
        SMS_CAMPAIGN = directDepositSetupOrigin18;
        DirectDepositSetupOrigin directDepositSetupOrigin19 = new DirectDepositSetupOrigin("MARKETING_CAMPAIGN", 18);
        MARKETING_CAMPAIGN = directDepositSetupOrigin19;
        DirectDepositSetupOrigin directDepositSetupOrigin20 = new DirectDepositSetupOrigin("PAYCHECKS_BENEFITS_BOOKLET", 19);
        PAYCHECKS_BENEFITS_BOOKLET = directDepositSetupOrigin20;
        DirectDepositSetupOrigin directDepositSetupOrigin21 = new DirectDepositSetupOrigin("UNDETERMINED", 20);
        UNDETERMINED = directDepositSetupOrigin21;
        $VALUES = new DirectDepositSetupOrigin[]{directDepositSetupOrigin, directDepositSetupOrigin2, directDepositSetupOrigin3, directDepositSetupOrigin4, directDepositSetupOrigin5, directDepositSetupOrigin6, directDepositSetupOrigin7, directDepositSetupOrigin8, directDepositSetupOrigin9, directDepositSetupOrigin10, directDepositSetupOrigin11, directDepositSetupOrigin12, directDepositSetupOrigin13, directDepositSetupOrigin14, directDepositSetupOrigin15, directDepositSetupOrigin16, directDepositSetupOrigin17, directDepositSetupOrigin18, directDepositSetupOrigin19, directDepositSetupOrigin20, directDepositSetupOrigin21};
    }

    public static DirectDepositSetupOrigin valueOf(String str) {
        return (DirectDepositSetupOrigin) Enum.valueOf(DirectDepositSetupOrigin.class, str);
    }

    public static DirectDepositSetupOrigin[] values() {
        return (DirectDepositSetupOrigin[]) $VALUES.clone();
    }
}
