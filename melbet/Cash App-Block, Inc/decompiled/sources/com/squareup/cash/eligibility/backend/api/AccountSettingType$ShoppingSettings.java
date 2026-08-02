package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.Map;

/* loaded from: classes.dex */
public final class AccountSettingType$ShoppingSettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ShoppingSubSetting {
        public static final /* synthetic */ ShoppingSubSetting[] $VALUES;
        public static final ShoppingSubSetting VIEW_SHOPPING;

        static {
            ShoppingSubSetting shoppingSubSetting = new ShoppingSubSetting("VIEW_SHOPPING", 0);
            VIEW_SHOPPING = shoppingSubSetting;
            $VALUES = new ShoppingSubSetting[]{shoppingSubSetting};
        }

        public static ShoppingSubSetting valueOf(String str) {
            return (ShoppingSubSetting) Enum.valueOf(ShoppingSubSetting.class, str);
        }

        public static ShoppingSubSetting[] values() {
            return (ShoppingSubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$ShoppingSettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$ShoppingSettings) && this.cache.equals(((AccountSettingType$ShoppingSettings) obj).cache);
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("ShoppingSettings(cache=", ")", this.cache);
    }
}
