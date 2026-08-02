package com.squareup.cash.money.core.ids;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AppletTileInstallationSectionId {
    public static final /* synthetic */ AppletTileInstallationSectionId[] $VALUES;
    public static final AppletTileInstallationSectionId BALANCE;
    public static final AppletTileInstallationSectionId BANKING_GROUPED;
    public static final AppletTileInstallationSectionId CARD_INSTALLED;
    public static final AppletTileInstallationSectionId SERVICE;

    static {
        AppletTileInstallationSectionId appletTileInstallationSectionId = new AppletTileInstallationSectionId("CARD_INSTALLED", 0);
        CARD_INSTALLED = appletTileInstallationSectionId;
        AppletTileInstallationSectionId appletTileInstallationSectionId2 = new AppletTileInstallationSectionId("BANKING_GROUPED", 1);
        BANKING_GROUPED = appletTileInstallationSectionId2;
        AppletTileInstallationSectionId appletTileInstallationSectionId3 = new AppletTileInstallationSectionId("BALANCE", 2);
        BALANCE = appletTileInstallationSectionId3;
        AppletTileInstallationSectionId appletTileInstallationSectionId4 = new AppletTileInstallationSectionId("SERVICE", 3);
        SERVICE = appletTileInstallationSectionId4;
        $VALUES = new AppletTileInstallationSectionId[]{appletTileInstallationSectionId, appletTileInstallationSectionId2, appletTileInstallationSectionId3, appletTileInstallationSectionId4};
    }

    public static AppletTileInstallationSectionId valueOf(String str) {
        return (AppletTileInstallationSectionId) Enum.valueOf(AppletTileInstallationSectionId.class, str);
    }

    public static AppletTileInstallationSectionId[] values() {
        return (AppletTileInstallationSectionId[]) $VALUES.clone();
    }
}
