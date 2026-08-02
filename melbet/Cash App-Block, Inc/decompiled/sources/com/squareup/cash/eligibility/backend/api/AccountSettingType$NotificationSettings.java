package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.Map;

/* loaded from: classes.dex */
public final class AccountSettingType$NotificationSettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class NotificationSubSetting {
        public static final /* synthetic */ NotificationSubSetting[] $VALUES;
        public static final NotificationSubSetting MESSAGES;
        public static final NotificationSubSetting NOTIFICATIONS_AND_RECEIPTS;

        static {
            NotificationSubSetting notificationSubSetting = new NotificationSubSetting("NOTIFICATIONS_AND_RECEIPTS", 0);
            NOTIFICATIONS_AND_RECEIPTS = notificationSubSetting;
            NotificationSubSetting notificationSubSetting2 = new NotificationSubSetting("MESSAGES", 1);
            MESSAGES = notificationSubSetting2;
            $VALUES = new NotificationSubSetting[]{notificationSubSetting, notificationSubSetting2};
        }

        public static NotificationSubSetting valueOf(String str) {
            return (NotificationSubSetting) Enum.valueOf(NotificationSubSetting.class, str);
        }

        public static NotificationSubSetting[] values() {
            return (NotificationSubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$NotificationSettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$NotificationSettings) && this.cache.equals(((AccountSettingType$NotificationSettings) obj).cache);
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("NotificationSettings(cache=", ")", this.cache);
    }
}
