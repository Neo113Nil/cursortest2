package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientTransfersInstrumentLinkProfileStripeEnabled extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientTransfersInstrumentLinkProfileStripeEnabled INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientTransfersInstrumentLinkProfileStripeEnabled("client-transfers-instrument-link-profile-stripe-enabled", 2);
    }
}
