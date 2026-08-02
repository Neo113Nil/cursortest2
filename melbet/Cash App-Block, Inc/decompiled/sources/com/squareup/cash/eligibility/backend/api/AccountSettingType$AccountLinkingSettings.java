package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AccountSettingType$AccountLinkingSettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes6.dex */
    public final class AccountLinkSubSetting {
        public static final /* synthetic */ AccountLinkSubSetting[] $VALUES;
        public static final AccountLinkSubSetting ACCOUNT_LINK;

        static {
            AccountLinkSubSetting accountLinkSubSetting = new AccountLinkSubSetting("ACCOUNT_LINK", 0);
            ACCOUNT_LINK = accountLinkSubSetting;
            $VALUES = new AccountLinkSubSetting[]{accountLinkSubSetting};
        }

        public static AccountLinkSubSetting valueOf(String str) {
            return (AccountLinkSubSetting) Enum.valueOf(AccountLinkSubSetting.class, str);
        }

        public static AccountLinkSubSetting[] values() {
            return (AccountLinkSubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$AccountLinkingSettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$AccountLinkingSettings) && this.cache.equals(((AccountSettingType$AccountLinkingSettings) obj).cache);
    }

    public final SettingVisibility getSettingState() {
        GetAccountSettingsResponse.SettingCollection.Setting setting = (GetAccountSettingsResponse.SettingCollection.Setting) this.cache.get(AccountLinkSubSetting.ACCOUNT_LINK);
        Boolean bool = setting != null ? setting.editable : null;
        return Intrinsics.areEqual(bool, Boolean.FALSE) ? SettingVisibility.DISABLED : Intrinsics.areEqual(bool, Boolean.TRUE) ? SettingVisibility.VISIBLE : SettingVisibility.HIDDEN;
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("AccountLinkingSettings(cache=", ")", this.cache);
    }
}
