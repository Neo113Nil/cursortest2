package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.Map;

/* loaded from: classes.dex */
public final class AccountSettingType$SecurityHubSettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SecurityHubSubSetting {
        public static final /* synthetic */ SecurityHubSubSetting[] $VALUES;
        public static final SecurityHubSubSetting VIEW_SECURITY_HUB;

        static {
            SecurityHubSubSetting securityHubSubSetting = new SecurityHubSubSetting("VIEW_SECURITY_HUB", 0);
            VIEW_SECURITY_HUB = securityHubSubSetting;
            $VALUES = new SecurityHubSubSetting[]{securityHubSubSetting};
        }

        public static SecurityHubSubSetting valueOf(String str) {
            return (SecurityHubSubSetting) Enum.valueOf(SecurityHubSubSetting.class, str);
        }

        public static SecurityHubSubSetting[] values() {
            return (SecurityHubSubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$SecurityHubSettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$SecurityHubSettings) && this.cache.equals(((AccountSettingType$SecurityHubSettings) obj).cache);
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("SecurityHubSettings(cache=", ")", this.cache);
    }
}
