package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AccountSettingType$AccountCreationSettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class AccountCreationSubSetting {
        public static final /* synthetic */ AccountCreationSubSetting[] $VALUES;
        public static final AccountCreationSubSetting CREATE_BUSINESS_ACCOUNT;
        public static final AccountCreationSubSetting CREATE_PERSONAL_ACCOUNT;

        static {
            AccountCreationSubSetting accountCreationSubSetting = new AccountCreationSubSetting("CREATE_BUSINESS_ACCOUNT", 0);
            CREATE_BUSINESS_ACCOUNT = accountCreationSubSetting;
            AccountCreationSubSetting accountCreationSubSetting2 = new AccountCreationSubSetting("CREATE_PERSONAL_ACCOUNT", 1);
            CREATE_PERSONAL_ACCOUNT = accountCreationSubSetting2;
            $VALUES = new AccountCreationSubSetting[]{accountCreationSubSetting, accountCreationSubSetting2};
        }

        public static AccountCreationSubSetting valueOf(String str) {
            return (AccountCreationSubSetting) Enum.valueOf(AccountCreationSubSetting.class, str);
        }

        public static AccountCreationSubSetting[] values() {
            return (AccountCreationSubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$AccountCreationSettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$AccountCreationSettings) && this.cache.equals(((AccountSettingType$AccountCreationSettings) obj).cache);
    }

    public final SettingVisibility getSettingsState(AccountCreationSubSetting accountCreationSubSetting) {
        Map map = this.cache;
        GetAccountSettingsResponse.SettingCollection.Setting setting = (GetAccountSettingsResponse.SettingCollection.Setting) map.get(accountCreationSubSetting);
        return setting != null ? Intrinsics.areEqual(setting.editable, Boolean.FALSE) : false ? SettingVisibility.DISABLED : map.get(accountCreationSubSetting) != null ? SettingVisibility.VISIBLE : SettingVisibility.HIDDEN;
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("AccountCreationSettings(cache=", ")", this.cache);
    }
}
