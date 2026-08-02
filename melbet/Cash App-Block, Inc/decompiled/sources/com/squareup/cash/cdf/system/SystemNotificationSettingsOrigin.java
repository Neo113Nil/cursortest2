package com.squareup.cash.cdf.system;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes7.dex */
public final class SystemNotificationSettingsOrigin {
    public static final /* synthetic */ SystemNotificationSettingsOrigin[] $VALUES;
    public static final SystemNotificationSettingsOrigin NOTIFICATION_SETTINGS_BANNER;
    public static final SystemNotificationSettingsOrigin NOTIFICATION_SETTINGS_CHANNEL;

    static {
        SystemNotificationSettingsOrigin systemNotificationSettingsOrigin = new SystemNotificationSettingsOrigin("NOTIFICATION_SETTINGS_BANNER", 0);
        NOTIFICATION_SETTINGS_BANNER = systemNotificationSettingsOrigin;
        SystemNotificationSettingsOrigin systemNotificationSettingsOrigin2 = new SystemNotificationSettingsOrigin("NOTIFICATION_SETTINGS_CHANNEL", 1);
        NOTIFICATION_SETTINGS_CHANNEL = systemNotificationSettingsOrigin2;
        $VALUES = new SystemNotificationSettingsOrigin[]{systemNotificationSettingsOrigin, systemNotificationSettingsOrigin2, new SystemNotificationSettingsOrigin("SUPPORT_INCIDENT_DETAILS_PROMPT", 2), new SystemNotificationSettingsOrigin("SUPPORT_CHAT_PROMPT", 3)};
    }

    public static SystemNotificationSettingsOrigin valueOf(String str) {
        return (SystemNotificationSettingsOrigin) Enum.valueOf(SystemNotificationSettingsOrigin.class, str);
    }

    public static SystemNotificationSettingsOrigin[] values() {
        return (SystemNotificationSettingsOrigin[]) $VALUES.clone();
    }
}
