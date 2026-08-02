package com.squareup.cash.appupdate.backend.api;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes4.dex */
public final class AppUpdateAvailability {
    public static final /* synthetic */ AppUpdateAvailability[] $VALUES;
    public static final AppUpdateAvailability DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS;
    public static final AppUpdateAvailability UNKNOWN;
    public static final AppUpdateAvailability UPDATE_AVAILABLE;
    public static final AppUpdateAvailability UPDATE_NOT_AVAILABLE;

    static {
        AppUpdateAvailability appUpdateAvailability = new AppUpdateAvailability("UNKNOWN", 0);
        UNKNOWN = appUpdateAvailability;
        AppUpdateAvailability appUpdateAvailability2 = new AppUpdateAvailability("UPDATE_NOT_AVAILABLE", 1);
        UPDATE_NOT_AVAILABLE = appUpdateAvailability2;
        AppUpdateAvailability appUpdateAvailability3 = new AppUpdateAvailability("UPDATE_AVAILABLE", 2);
        UPDATE_AVAILABLE = appUpdateAvailability3;
        AppUpdateAvailability appUpdateAvailability4 = new AppUpdateAvailability("DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS", 3);
        DEVELOPER_TRIGGERED_UPDATE_IN_PROGRESS = appUpdateAvailability4;
        $VALUES = new AppUpdateAvailability[]{appUpdateAvailability, appUpdateAvailability2, appUpdateAvailability3, appUpdateAvailability4};
    }

    public static AppUpdateAvailability valueOf(String str) {
        return (AppUpdateAvailability) Enum.valueOf(AppUpdateAvailability.class, str);
    }

    public static AppUpdateAvailability[] values() {
        return (AppUpdateAvailability[]) $VALUES.clone();
    }
}
