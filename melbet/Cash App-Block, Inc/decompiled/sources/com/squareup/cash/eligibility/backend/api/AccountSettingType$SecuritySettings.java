package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import java.util.Map;

/* loaded from: classes.dex */
public final class AccountSettingType$SecuritySettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class SecuritySubSetting {
        public static final /* synthetic */ SecuritySubSetting[] $VALUES;
        public static final SecuritySubSetting CASHTAG;
        public static final SecuritySubSetting CONTACTS_SYNC_CONTACTS;
        public static final SecuritySubSetting INVESTING_TRUSTED_CONTACT;
        public static final SecuritySubSetting REQUESTS_INCOMING_REQUESTS;
        public static final SecuritySubSetting SEARCH_PRIVACY;
        public static final SecuritySubSetting SECURITY_DEVICES;
        public static final SecuritySubSetting SECURITY_LOCK;
        public static final SecuritySubSetting SECURITY_PASSKEYS;
        public static final SecuritySubSetting SECURITY_PIN;
        public static final SecuritySubSetting TAXES_AUTH_APP;
        public static final SecuritySubSetting TAXES_PASSWORD;

        static {
            SecuritySubSetting securitySubSetting = new SecuritySubSetting("SECURITY_LOCK", 0);
            SECURITY_LOCK = securitySubSetting;
            SecuritySubSetting securitySubSetting2 = new SecuritySubSetting("SECURITY_DEVICES", 1);
            SECURITY_DEVICES = securitySubSetting2;
            SecuritySubSetting securitySubSetting3 = new SecuritySubSetting("CASHTAG", 2);
            CASHTAG = securitySubSetting3;
            SecuritySubSetting securitySubSetting4 = new SecuritySubSetting("REQUESTS_INCOMING_REQUESTS", 3);
            REQUESTS_INCOMING_REQUESTS = securitySubSetting4;
            SecuritySubSetting securitySubSetting5 = new SecuritySubSetting("CONTACTS_SYNC_CONTACTS", 4);
            CONTACTS_SYNC_CONTACTS = securitySubSetting5;
            SecuritySubSetting securitySubSetting6 = new SecuritySubSetting("INVESTING_TRUSTED_CONTACT", 5);
            INVESTING_TRUSTED_CONTACT = securitySubSetting6;
            SecuritySubSetting securitySubSetting7 = new SecuritySubSetting("TAXES_PASSWORD", 6);
            TAXES_PASSWORD = securitySubSetting7;
            SecuritySubSetting securitySubSetting8 = new SecuritySubSetting("TAXES_AUTH_APP", 7);
            TAXES_AUTH_APP = securitySubSetting8;
            SecuritySubSetting securitySubSetting9 = new SecuritySubSetting("SECURITY_PIN", 8);
            SECURITY_PIN = securitySubSetting9;
            SecuritySubSetting securitySubSetting10 = new SecuritySubSetting("SEARCH_PRIVACY", 9);
            SEARCH_PRIVACY = securitySubSetting10;
            SecuritySubSetting securitySubSetting11 = new SecuritySubSetting("SECURITY_PASSKEYS", 10);
            SECURITY_PASSKEYS = securitySubSetting11;
            $VALUES = new SecuritySubSetting[]{securitySubSetting, securitySubSetting2, securitySubSetting3, securitySubSetting4, securitySubSetting5, securitySubSetting6, securitySubSetting7, securitySubSetting8, securitySubSetting9, securitySubSetting10, securitySubSetting11};
        }

        public static SecuritySubSetting valueOf(String str) {
            return (SecuritySubSetting) Enum.valueOf(SecuritySubSetting.class, str);
        }

        public static SecuritySubSetting[] values() {
            return (SecuritySubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$SecuritySettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$SecuritySettings) && this.cache.equals(((AccountSettingType$SecuritySettings) obj).cache);
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final boolean isSubSettingEnabled(SecuritySubSetting securitySubSetting) {
        Boolean bool;
        Map map = this.cache;
        if (map.get(securitySubSetting) != null) {
            GetAccountSettingsResponse.SettingCollection.Setting setting = (GetAccountSettingsResponse.SettingCollection.Setting) map.get(securitySubSetting);
            if ((setting == null || (bool = setting.editable) == null) ? false : bool.booleanValue()) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("SecuritySettings(cache=", ")", this.cache);
    }
}
