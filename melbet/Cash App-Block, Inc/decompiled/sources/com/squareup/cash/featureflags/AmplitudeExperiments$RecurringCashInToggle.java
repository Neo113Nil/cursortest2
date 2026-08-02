package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$RecurringCashInToggle extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$RecurringCashInToggle INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$RecurringCashInToggle("recurring-cash-in-toggle", 1);
    }
}
