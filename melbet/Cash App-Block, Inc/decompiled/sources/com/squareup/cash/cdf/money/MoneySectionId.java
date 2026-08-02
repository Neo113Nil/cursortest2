package com.squareup.cash.cdf.money;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class MoneySectionId {
    public static final /* synthetic */ MoneySectionId[] $VALUES;
    public static final MoneySectionId APPLET_BALANCE;
    public static final MoneySectionId APPLET_BANKING;
    public static final MoneySectionId APPLET_BANKING_UNINSTALLED;
    public static final MoneySectionId APPLET_TOOLS;
    public static final MoneySectionId APPLET_UNINSTALLED;
    public static final MoneySectionId AUTO_DEPOSITS;
    public static final MoneySectionId BANNERS;
    public static final MoneySectionId DISCLOSURES;
    public static final MoneySectionId MANAGEDACCOUNT_SETTINGS;
    public static final MoneySectionId MANAGEDACCOUNT_SUPPORT;
    public static final MoneySectionId MORE_WAYS_TO_ADD_MONEY;

    /* JADX INFO: Fake field, exist only in values array */
    MoneySectionId EF0;

    static {
        MoneySectionId moneySectionId = new MoneySectionId("BALANCE", 0);
        MoneySectionId moneySectionId2 = new MoneySectionId("APPLETS", 1);
        MoneySectionId moneySectionId3 = new MoneySectionId("APPLET_BANKING", 2);
        APPLET_BANKING = moneySectionId3;
        MoneySectionId moneySectionId4 = new MoneySectionId("APPLET_BANKING_UNINSTALLED", 3);
        APPLET_BANKING_UNINSTALLED = moneySectionId4;
        MoneySectionId moneySectionId5 = new MoneySectionId("APPLET_BALANCE", 4);
        APPLET_BALANCE = moneySectionId5;
        MoneySectionId moneySectionId6 = new MoneySectionId("APPLET_TOOLS", 5);
        APPLET_TOOLS = moneySectionId6;
        MoneySectionId moneySectionId7 = new MoneySectionId("APPLET_INSTALLED", 6);
        MoneySectionId moneySectionId8 = new MoneySectionId("APPLET_UNINSTALLED", 7);
        APPLET_UNINSTALLED = moneySectionId8;
        MoneySectionId moneySectionId9 = new MoneySectionId("MORE_WAYS_TO_ADD_MONEY", 8);
        MORE_WAYS_TO_ADD_MONEY = moneySectionId9;
        MoneySectionId moneySectionId10 = new MoneySectionId("AUTO_DEPOSITS", 9);
        AUTO_DEPOSITS = moneySectionId10;
        MoneySectionId moneySectionId11 = new MoneySectionId("DISCLOSURES", 10);
        DISCLOSURES = moneySectionId11;
        MoneySectionId moneySectionId12 = new MoneySectionId("BANNERS", 11);
        BANNERS = moneySectionId12;
        MoneySectionId moneySectionId13 = new MoneySectionId("MANAGEDACCOUNT_SETTINGS", 12);
        MANAGEDACCOUNT_SETTINGS = moneySectionId13;
        MoneySectionId moneySectionId14 = new MoneySectionId("MANAGEDACCOUNT_SUPPORT", 13);
        MANAGEDACCOUNT_SUPPORT = moneySectionId14;
        $VALUES = new MoneySectionId[]{moneySectionId, moneySectionId2, moneySectionId3, moneySectionId4, moneySectionId5, moneySectionId6, moneySectionId7, moneySectionId8, moneySectionId9, moneySectionId10, moneySectionId11, moneySectionId12, moneySectionId13, moneySectionId14};
    }

    public static MoneySectionId valueOf(String str) {
        return (MoneySectionId) Enum.valueOf(MoneySectionId.class, str);
    }

    public static MoneySectionId[] values() {
        return (MoneySectionId[]) $VALUES.clone();
    }
}
