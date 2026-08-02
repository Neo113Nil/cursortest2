package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$ClientTransfers_3dsPreAuthentication extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientTransfers_3dsPreAuthentication INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$ClientTransfers_3dsPreAuthentication("client-transfers-3ds-pre-authentication", 1);
    }
}
