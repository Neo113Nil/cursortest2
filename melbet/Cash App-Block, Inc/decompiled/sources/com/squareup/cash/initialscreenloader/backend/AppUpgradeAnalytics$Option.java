package com.squareup.cash.initialscreenloader.backend;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class AppUpgradeAnalytics$Option {
    public static final /* synthetic */ AppUpgradeAnalytics$Option[] $VALUES;
    public static final AppUpgradeAnalytics$Option DISMISS;
    public static final AppUpgradeAnalytics$Option OPEN_WEB_VERSION;
    public static final AppUpgradeAnalytics$Option VISIT_APP_STORE;

    static {
        AppUpgradeAnalytics$Option appUpgradeAnalytics$Option = new AppUpgradeAnalytics$Option("VISIT_APP_STORE", 0);
        VISIT_APP_STORE = appUpgradeAnalytics$Option;
        AppUpgradeAnalytics$Option appUpgradeAnalytics$Option2 = new AppUpgradeAnalytics$Option("DISMISS", 1);
        DISMISS = appUpgradeAnalytics$Option2;
        AppUpgradeAnalytics$Option appUpgradeAnalytics$Option3 = new AppUpgradeAnalytics$Option("OPEN_WEB_VERSION", 2);
        OPEN_WEB_VERSION = appUpgradeAnalytics$Option3;
        $VALUES = new AppUpgradeAnalytics$Option[]{appUpgradeAnalytics$Option, appUpgradeAnalytics$Option2, appUpgradeAnalytics$Option3};
    }

    public static AppUpgradeAnalytics$Option valueOf(String str) {
        return (AppUpgradeAnalytics$Option) Enum.valueOf(AppUpgradeAnalytics$Option.class, str);
    }

    public static AppUpgradeAnalytics$Option[] values() {
        return (AppUpgradeAnalytics$Option[]) $VALUES.clone();
    }
}
