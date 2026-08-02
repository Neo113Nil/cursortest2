package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.Map;

/* loaded from: classes.dex */
public final class AccountSettingType$IdvSettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class IdvSubSetting {
        public static final /* synthetic */ IdvSubSetting[] $VALUES;
        public static final IdvSubSetting IDENTITIY_VERIFICATION_IDV;

        static {
            IdvSubSetting idvSubSetting = new IdvSubSetting("IDENTITIY_VERIFICATION_IDV", 0);
            IDENTITIY_VERIFICATION_IDV = idvSubSetting;
            $VALUES = new IdvSubSetting[]{idvSubSetting};
        }

        public static IdvSubSetting valueOf(String str) {
            return (IdvSubSetting) Enum.valueOf(IdvSubSetting.class, str);
        }

        public static IdvSubSetting[] values() {
            return (IdvSubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$IdvSettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$IdvSettings) && this.cache.equals(((AccountSettingType$IdvSettings) obj).cache);
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("IdvSettings(cache=", ")", this.cache);
    }
}
