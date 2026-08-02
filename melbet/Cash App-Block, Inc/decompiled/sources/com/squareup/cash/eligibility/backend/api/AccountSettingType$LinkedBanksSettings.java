package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import com.squareup.protos.cash.janus.api.GetAccountSettingsResponse;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AccountSettingType$LinkedBanksSettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LinkedBanksSubSetting {
        public static final /* synthetic */ LinkedBanksSubSetting[] $VALUES;
        public static final LinkedBanksSubSetting LINK_BANKS;

        static {
            LinkedBanksSubSetting linkedBanksSubSetting = new LinkedBanksSubSetting("LINK_BANKS", 0);
            LINK_BANKS = linkedBanksSubSetting;
            $VALUES = new LinkedBanksSubSetting[]{linkedBanksSubSetting};
        }

        public static LinkedBanksSubSetting valueOf(String str) {
            return (LinkedBanksSubSetting) Enum.valueOf(LinkedBanksSubSetting.class, str);
        }

        public static LinkedBanksSubSetting[] values() {
            return (LinkedBanksSubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$LinkedBanksSettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$LinkedBanksSettings) && this.cache.equals(((AccountSettingType$LinkedBanksSettings) obj).cache);
    }

    public final SettingVisibility getSettingState() {
        GetAccountSettingsResponse.SettingCollection.Setting setting = (GetAccountSettingsResponse.SettingCollection.Setting) this.cache.get(LinkedBanksSubSetting.LINK_BANKS);
        Boolean bool = setting != null ? setting.editable : null;
        return Intrinsics.areEqual(bool, Boolean.FALSE) ? SettingVisibility.DISABLED : Intrinsics.areEqual(bool, Boolean.TRUE) ? SettingVisibility.VISIBLE : SettingVisibility.HIDDEN;
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("LinkedBanksSettings(cache=", ")", this.cache);
    }
}
