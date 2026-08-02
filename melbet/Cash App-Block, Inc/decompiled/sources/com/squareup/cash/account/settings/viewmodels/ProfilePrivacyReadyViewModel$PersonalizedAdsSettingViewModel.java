package com.squareup.cash.account.settings.viewmodels;

import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;

/* loaded from: classes5.dex */
public interface ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel {

    /* loaded from: classes7.dex */
    public final class Eligible implements ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel {
        public final String description;
        public final boolean isChecked;

        public Eligible(String str, boolean z) {
            this.description = str;
            this.isChecked = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Eligible)) {
                return false;
            }
            Eligible eligible = (Eligible) obj;
            return this.description.equals(eligible.description) && this.isChecked == eligible.isChecked;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.isChecked) + (this.description.hashCode() * 31);
        }

        public final String toString() {
            return Request$Priority$EnumUnboxingLocalUtility.m("Eligible(description=", this.description, ", isChecked=", ")", this.isChecked);
        }
    }

    /* loaded from: classes7.dex */
    public final class Ineligible implements ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel {
        public static final Ineligible INSTANCE = new Ineligible();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Ineligible);
        }

        public final int hashCode() {
            return 543777405;
        }

        public final String toString() {
            return "Ineligible";
        }
    }

    /* loaded from: classes7.dex */
    public final class None implements ProfilePrivacyReadyViewModel$PersonalizedAdsSettingViewModel {
        public static final None INSTANCE = new None();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof None);
        }

        public final int hashCode() {
            return 1934062713;
        }

        public final String toString() {
            return "None";
        }
    }
}
