package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientAccessTrustHub extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientAccessTrustHub INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$ClientAccessTrustHub("client-access-trust-hub", 1);
    }
}
