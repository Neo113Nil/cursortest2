package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.Map;

/* loaded from: classes.dex */
public final class AccountSettingType$FavoritesSettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FavoritesSubSetting {
        public static final /* synthetic */ FavoritesSubSetting[] $VALUES;
        public static final FavoritesSubSetting MANAGE_FAVORITES;

        static {
            FavoritesSubSetting favoritesSubSetting = new FavoritesSubSetting("MANAGE_FAVORITES", 0);
            MANAGE_FAVORITES = favoritesSubSetting;
            $VALUES = new FavoritesSubSetting[]{favoritesSubSetting};
        }

        public static FavoritesSubSetting valueOf(String str) {
            return (FavoritesSubSetting) Enum.valueOf(FavoritesSubSetting.class, str);
        }

        public static FavoritesSubSetting[] values() {
            return (FavoritesSubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$FavoritesSettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$FavoritesSettings) && this.cache.equals(((AccountSettingType$FavoritesSettings) obj).cache);
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("FavoritesSettings(cache=", ")", this.cache);
    }
}
