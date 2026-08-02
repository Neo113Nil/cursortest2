package com.squareup.cash.eligibility.backend.api;

import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import java.util.Map;

/* loaded from: classes.dex */
public final class AccountSettingType$PromotionsAndReferralsSettings {
    public final Map cache;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class PromotionsAndReferralsSubSetting {
        public static final /* synthetic */ PromotionsAndReferralsSubSetting[] $VALUES;
        public static final PromotionsAndReferralsSubSetting ENTER_CODE;
        public static final PromotionsAndReferralsSubSetting INVITE_FRIENDS;

        static {
            PromotionsAndReferralsSubSetting promotionsAndReferralsSubSetting = new PromotionsAndReferralsSubSetting("INVITE_FRIENDS", 0);
            INVITE_FRIENDS = promotionsAndReferralsSubSetting;
            PromotionsAndReferralsSubSetting promotionsAndReferralsSubSetting2 = new PromotionsAndReferralsSubSetting("ENTER_CODE", 1);
            ENTER_CODE = promotionsAndReferralsSubSetting2;
            $VALUES = new PromotionsAndReferralsSubSetting[]{promotionsAndReferralsSubSetting, promotionsAndReferralsSubSetting2};
        }

        public static PromotionsAndReferralsSubSetting valueOf(String str) {
            return (PromotionsAndReferralsSubSetting) Enum.valueOf(PromotionsAndReferralsSubSetting.class, str);
        }

        public static PromotionsAndReferralsSubSetting[] values() {
            return (PromotionsAndReferralsSubSetting[]) $VALUES.clone();
        }
    }

    public AccountSettingType$PromotionsAndReferralsSettings(Map map) {
        this.cache = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AccountSettingType$PromotionsAndReferralsSettings) && this.cache.equals(((AccountSettingType$PromotionsAndReferralsSettings) obj).cache);
    }

    public final int hashCode() {
        return this.cache.hashCode();
    }

    public final String toString() {
        return NavAction$$ExternalSyntheticOutline0.m("PromotionsAndReferralsSettings(cache=", ")", this.cache);
    }
}
