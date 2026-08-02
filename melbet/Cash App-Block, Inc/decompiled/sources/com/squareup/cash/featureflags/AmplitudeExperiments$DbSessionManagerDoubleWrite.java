package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$DbSessionManagerDoubleWrite extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$DbSessionManagerDoubleWrite INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$DbSessionManagerDoubleWrite("db-session-manager-double-write", 1);
    }
}
