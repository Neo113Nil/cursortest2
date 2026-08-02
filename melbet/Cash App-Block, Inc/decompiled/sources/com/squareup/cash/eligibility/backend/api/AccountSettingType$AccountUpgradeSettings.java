package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.Map;

/* loaded from: classes.dex */
public final class AccountSettingType$AccountUpgradeSettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes5.dex */
    public final class AccountUpgradeSubSetting {
        public static final /* synthetic */ AccountUpgradeSubSetting[] $VALUES;
        public static final AccountUpgradeSubSetting UPGRADE_TO_BUSINESS;

        static {
            AccountUpgradeSubSetting accountUpgradeSubSetting = new AccountUpgradeSubSetting("UPGRADE_TO_BUSINESS", 0);
            UPGRADE_TO_BUSINESS = accountUpgradeSubSetting;
            $VALUES = new AccountUpgradeSubSetting[]{accountUpgradeSubSetting};
        }

        public static AccountUpgradeSubSetting valueOf(String str) {
            return (AccountUpgradeSubSetting) Enum.valueOf(AccountUpgradeSubSetting.class, str);
        }

        public static AccountUpgradeSubSetting[] values() {
            return (AccountUpgradeSubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$AccountUpgradeSettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$AccountUpgradeSettings) && this.cache.equals(((AccountSettingType$AccountUpgradeSettings) obj).cache);
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("AccountUpgradeSettings(cache=", ")", this.cache);
    }
}
