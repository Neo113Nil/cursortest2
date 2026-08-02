package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.Map;

/* loaded from: classes.dex */
public final class AccountSettingType$PersonalSettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PersonalSubSetting {
        public static final /* synthetic */ PersonalSubSetting[] $VALUES;
        public static final PersonalSubSetting ADDRESS;
        public static final PersonalSubSetting YOUR_INFO;

        static {
            PersonalSubSetting personalSubSetting = new PersonalSubSetting("YOUR_INFO", 0);
            YOUR_INFO = personalSubSetting;
            PersonalSubSetting personalSubSetting2 = new PersonalSubSetting("ADDRESS", 1);
            ADDRESS = personalSubSetting2;
            $VALUES = new PersonalSubSetting[]{personalSubSetting, personalSubSetting2};
        }

        public static PersonalSubSetting valueOf(String str) {
            return (PersonalSubSetting) Enum.valueOf(PersonalSubSetting.class, str);
        }

        public static PersonalSubSetting[] values() {
            return (PersonalSubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$PersonalSettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$PersonalSettings) && this.cache.equals(((AccountSettingType$PersonalSettings) obj).cache);
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("PersonalSettings(cache=", ")", this.cache);
    }
}
