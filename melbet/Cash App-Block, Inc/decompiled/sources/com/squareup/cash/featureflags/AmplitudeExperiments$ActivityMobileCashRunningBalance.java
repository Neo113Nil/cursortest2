package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ActivityMobileCashRunningBalance extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ActivityMobileCashRunningBalance INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$ActivityMobileCashRunningBalance("activity-mobile-cash-running-balance", 1);
    }
}
