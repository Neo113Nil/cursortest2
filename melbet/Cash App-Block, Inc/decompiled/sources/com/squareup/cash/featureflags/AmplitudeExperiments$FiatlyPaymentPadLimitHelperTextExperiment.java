package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$FiatlyPaymentPadLimitHelperTextExperiment extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$FiatlyPaymentPadLimitHelperTextExperiment INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$FiatlyPaymentPadLimitHelperTextExperiment("fiatly-payment-pad-limit-helper-text-experiment", 1);
    }
}
