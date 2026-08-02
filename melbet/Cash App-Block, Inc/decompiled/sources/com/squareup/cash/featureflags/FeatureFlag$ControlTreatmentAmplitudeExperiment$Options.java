package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public enum FeatureFlag$ControlTreatmentAmplitudeExperiment$Options implements FeatureFlag$Option {
    Control("control"),
    Treatment("treatment");

    public final String identifier;

    FeatureFlag$ControlTreatmentAmplitudeExperiment$Options(String str) {
        this.identifier = str;
    }

    public final boolean disabled() {
        return this == Control;
    }

    public final boolean enabled() {
        return this == Treatment;
    }

    @Override // com.squareup.cash.featureflags.FeatureFlag$Option
    public final String getIdentifier() {
        return this.identifier;
    }
}
