package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ExpressivePaymentsDrafts extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ExpressivePaymentsDrafts INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$ExpressivePaymentsDrafts("expressive-payments-drafts", 1);
    }
}
