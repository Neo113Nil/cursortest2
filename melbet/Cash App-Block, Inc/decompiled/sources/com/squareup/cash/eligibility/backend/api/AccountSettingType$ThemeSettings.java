package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.Map;

/* loaded from: classes.dex */
public final class AccountSettingType$ThemeSettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ThemeSubSetting {
        public static final /* synthetic */ ThemeSubSetting[] $VALUES;
        public static final ThemeSubSetting MANAGE_THEME;

        static {
            ThemeSubSetting themeSubSetting = new ThemeSubSetting("MANAGE_THEME", 0);
            MANAGE_THEME = themeSubSetting;
            $VALUES = new ThemeSubSetting[]{themeSubSetting};
        }

        public static ThemeSubSetting valueOf(String str) {
            return (ThemeSubSetting) Enum.valueOf(ThemeSubSetting.class, str);
        }

        public static ThemeSubSetting[] values() {
            return (ThemeSubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$ThemeSettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$ThemeSettings) && this.cache.equals(((AccountSettingType$ThemeSettings) obj).cache);
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("ThemeSettings(cache=", ")", this.cache);
    }
}
