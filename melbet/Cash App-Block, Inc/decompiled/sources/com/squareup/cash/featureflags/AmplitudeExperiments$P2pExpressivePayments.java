package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$P2pExpressivePayments extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$P2pExpressivePayments INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$P2pExpressivePayments("p2p-expressive-payments", 2);
    }
}
