package com.squareup.cash.money.core.ids;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SectionId {
    public static final /* synthetic */ SectionId[] $VALUES;
    public static final SectionId APPLET_INSTALLED_BALANCE;
    public static final SectionId APPLET_INSTALLED_BANKING_GROUPED;
    public static final SectionId APPLET_INSTALLED_SERVICE;
    public static final SectionId APPLET_UNINSTALLED_BANKING;
    public static final SectionId APPLET_UNINSTALLED_EXPLORE;
    public static final SectionId APPLET_UNINSTALLED_EXPLORE_BUSINESS;
    public static final SectionId BANNERS;
    public static final SectionId CARD_INSTALLED;
    public static final SectionId CARD_UNINSTALLED;
    public static final SectionId DEPOSIT;
    public static final SectionId DISCLOSURE;
    public static final SectionId MANAGED_ACCOUNT_SETTINGS;
    public static final SectionId MANAGED_ACCOUNT_SUPPORT;

    static {
        SectionId sectionId = new SectionId("BANNERS", 0);
        BANNERS = sectionId;
        SectionId sectionId2 = new SectionId("CARD_INSTALLED", 1);
        CARD_INSTALLED = sectionId2;
        SectionId sectionId3 = new SectionId("CARD_UNINSTALLED", 2);
        CARD_UNINSTALLED = sectionId3;
        SectionId sectionId4 = new SectionId("APPLET_INSTALLED_BANKING_GROUPED", 3);
        APPLET_INSTALLED_BANKING_GROUPED = sectionId4;
        SectionId sectionId5 = new SectionId("APPLET_INSTALLED_BANKING", 4);
        SectionId sectionId6 = new SectionId("APPLET_UNINSTALLED_BANKING", 5);
        APPLET_UNINSTALLED_BANKING = sectionId6;
        SectionId sectionId7 = new SectionId("APPLET_INSTALLED_BALANCE", 6);
        APPLET_INSTALLED_BALANCE = sectionId7;
        SectionId sectionId8 = new SectionId("APPLET_INSTALLED_SERVICE", 7);
        APPLET_INSTALLED_SERVICE = sectionId8;
        SectionId sectionId9 = new SectionId("APPLET_UNINSTALLED_EXPLORE_BUSINESS", 8);
        APPLET_UNINSTALLED_EXPLORE_BUSINESS = sectionId9;
        SectionId sectionId10 = new SectionId("APPLET_UNINSTALLED_EXPLORE", 9);
        APPLET_UNINSTALLED_EXPLORE = sectionId10;
        SectionId sectionId11 = new SectionId("DEPOSIT", 10);
        DEPOSIT = sectionId11;
        SectionId sectionId12 = new SectionId("WITHDRAW", 11);
        SectionId sectionId13 = new SectionId("MANAGED_ACCOUNT_SETTINGS", 12);
        MANAGED_ACCOUNT_SETTINGS = sectionId13;
        SectionId sectionId14 = new SectionId("MANAGED_ACCOUNT_SUPPORT", 13);
        MANAGED_ACCOUNT_SUPPORT = sectionId14;
        SectionId sectionId15 = new SectionId("DISCLOSURE", 14);
        DISCLOSURE = sectionId15;
        $VALUES = new SectionId[]{sectionId, sectionId2, sectionId3, sectionId4, sectionId5, sectionId6, sectionId7, sectionId8, sectionId9, sectionId10, sectionId11, sectionId12, sectionId13, sectionId14, sectionId15};
    }

    public static SectionId valueOf(String str) {
        return (SectionId) Enum.valueOf(SectionId.class, str);
    }

    public static SectionId[] values() {
        return (SectionId[]) $VALUES.clone();
    }
}
