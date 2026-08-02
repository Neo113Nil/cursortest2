package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.Map;

/* loaded from: classes.dex */
public final class AccountSettingType$AccountDowngradeSettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class AccountDowngradeSubSetting {
        public static final /* synthetic */ AccountDowngradeSubSetting[] $VALUES;
        public static final AccountDowngradeSubSetting DOWNGRADE_TO_P2P;

        static {
            AccountDowngradeSubSetting accountDowngradeSubSetting = new AccountDowngradeSubSetting("DOWNGRADE_TO_P2P", 0);
            DOWNGRADE_TO_P2P = accountDowngradeSubSetting;
            $VALUES = new AccountDowngradeSubSetting[]{accountDowngradeSubSetting};
        }

        public static AccountDowngradeSubSetting valueOf(String str) {
            return (AccountDowngradeSubSetting) Enum.valueOf(AccountDowngradeSubSetting.class, str);
        }

        public static AccountDowngradeSubSetting[] values() {
            return (AccountDowngradeSubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$AccountDowngradeSettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$AccountDowngradeSettings) && this.cache.equals(((AccountSettingType$AccountDowngradeSettings) obj).cache);
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("AccountDowngradeSettings(cache=", ")", this.cache);
    }
}
