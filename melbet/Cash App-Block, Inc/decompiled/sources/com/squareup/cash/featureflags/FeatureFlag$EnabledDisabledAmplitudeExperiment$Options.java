package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public enum FeatureFlag$EnabledDisabledAmplitudeExperiment$Options implements FeatureFlag$Option {
    Disabled("disabled"),
    Enabled("enabled");

    public final String identifier;

    FeatureFlag$EnabledDisabledAmplitudeExperiment$Options(String str) {
        this.identifier = str;
    }

    public final boolean enabled() {
        return this == Enabled;
    }

    @Override // com.squareup.cash.featureflags.FeatureFlag$Option
    public final String getIdentifier() {
        return this.identifier;
    }
}
