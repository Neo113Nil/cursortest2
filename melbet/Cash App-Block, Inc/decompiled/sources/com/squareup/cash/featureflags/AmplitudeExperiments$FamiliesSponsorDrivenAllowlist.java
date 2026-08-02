package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$FamiliesSponsorDrivenAllowlist extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$FamiliesSponsorDrivenAllowlist INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$FamiliesSponsorDrivenAllowlist("families-sponsor-driven-allowlist", 1);
    }
}
