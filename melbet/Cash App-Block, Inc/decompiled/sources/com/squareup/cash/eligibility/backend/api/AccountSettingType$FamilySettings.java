package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.Map;

/* loaded from: classes.dex */
public final class AccountSettingType$FamilySettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class FamilySubSetting {
        public static final /* synthetic */ FamilySubSetting[] $VALUES;
        public static final FamilySubSetting INVITE_TEEN;

        static {
            FamilySubSetting familySubSetting = new FamilySubSetting("INVITE_TEEN", 0);
            INVITE_TEEN = familySubSetting;
            $VALUES = new FamilySubSetting[]{familySubSetting};
        }

        public static FamilySubSetting valueOf(String str) {
            return (FamilySubSetting) Enum.valueOf(FamilySubSetting.class, str);
        }

        public static FamilySubSetting[] values() {
            return (FamilySubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$FamilySettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$FamilySettings) && this.cache.equals(((AccountSettingType$FamilySettings) obj).cache);
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("FamilySettings(cache=", ")", this.cache);
    }
}
