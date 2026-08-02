package com.squareup.cash.profile.presenters.personalizedads;

/* loaded from: classes7.dex */
public final class RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings {
    public final String description;
    public final boolean isEnabled;

    public RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings(boolean z, String str) {
        this.isEnabled = z;
        this.description = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings)) {
            return false;
        }
        RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings realPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings = (RealPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings) obj;
        return this.isEnabled == realPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings.isEnabled && this.description.equals(realPersonalizedAdsSettingsPresenter$PersonalizedAdsSettings.description);
    }

    public final int hashCode() {
        return this.description.hashCode() + (Boolean.hashCode(this.isEnabled) * 31);
    }

    public final String toString() {
        return "PersonalizedAdsSettings(isEnabled=" + this.isEnabled + ", description=" + this.description + ")";
    }
}
