package com.squareup.cash.money.core.ids;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AppletTileUninstallationSectionId {
    public static final /* synthetic */ AppletTileUninstallationSectionId[] $VALUES;
    public static final AppletTileUninstallationSectionId BANKING;
    public static final AppletTileUninstallationSectionId BUSINESS;
    public static final AppletTileUninstallationSectionId CARD_UNINSTALLED;
    public static final AppletTileUninstallationSectionId DEFAULT;

    static {
        AppletTileUninstallationSectionId appletTileUninstallationSectionId = new AppletTileUninstallationSectionId("CARD_UNINSTALLED", 0);
        CARD_UNINSTALLED = appletTileUninstallationSectionId;
        AppletTileUninstallationSectionId appletTileUninstallationSectionId2 = new AppletTileUninstallationSectionId("BANKING", 1);
        BANKING = appletTileUninstallationSectionId2;
        AppletTileUninstallationSectionId appletTileUninstallationSectionId3 = new AppletTileUninstallationSectionId("BUSINESS", 2);
        BUSINESS = appletTileUninstallationSectionId3;
        AppletTileUninstallationSectionId appletTileUninstallationSectionId4 = new AppletTileUninstallationSectionId("DEFAULT", 3);
        DEFAULT = appletTileUninstallationSectionId4;
        $VALUES = new AppletTileUninstallationSectionId[]{appletTileUninstallationSectionId, appletTileUninstallationSectionId2, appletTileUninstallationSectionId3, appletTileUninstallationSectionId4};
    }

    public static AppletTileUninstallationSectionId valueOf(String str) {
        return (AppletTileUninstallationSectionId) Enum.valueOf(AppletTileUninstallationSectionId.class, str);
    }

    public static AppletTileUninstallationSectionId[] values() {
        return (AppletTileUninstallationSectionId[]) $VALUES.clone();
    }
}
