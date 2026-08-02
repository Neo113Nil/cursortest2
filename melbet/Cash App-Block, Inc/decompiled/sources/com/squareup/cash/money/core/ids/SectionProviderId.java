package com.squareup.cash.money.core.ids;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class SectionProviderId {
    public static final /* synthetic */ SectionProviderId[] $VALUES;
    public static final SectionProviderId APPLET;
    public static final SectionProviderId BANNER;
    public static final SectionProviderId DEPOSIT;
    public static final SectionProviderId DISCLOSURE;
    public static final SectionProviderId MANAGED_ACCOUNT_SETTINGS;

    static {
        SectionProviderId sectionProviderId = new SectionProviderId("APPLET", 0);
        APPLET = sectionProviderId;
        SectionProviderId sectionProviderId2 = new SectionProviderId("DEPOSIT", 1);
        DEPOSIT = sectionProviderId2;
        SectionProviderId sectionProviderId3 = new SectionProviderId("DISCLOSURE", 2);
        DISCLOSURE = sectionProviderId3;
        SectionProviderId sectionProviderId4 = new SectionProviderId("BANNER", 3);
        BANNER = sectionProviderId4;
        SectionProviderId sectionProviderId5 = new SectionProviderId("MANAGED_ACCOUNT_SETTINGS", 4);
        MANAGED_ACCOUNT_SETTINGS = sectionProviderId5;
        $VALUES = new SectionProviderId[]{sectionProviderId, sectionProviderId2, sectionProviderId3, sectionProviderId4, sectionProviderId5};
    }

    public static SectionProviderId valueOf(String str) {
        return (SectionProviderId) Enum.valueOf(SectionProviderId.class, str);
    }

    public static SectionProviderId[] values() {
        return (SectionProviderId[]) $VALUES.clone();
    }
}
