package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$CashAgentsMobile extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$CashAgentsMobile INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$CashAgentsMobile("cash-agents-mobile", 1);
    }
}
