package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientTransfersMultiLinkingUxButtons extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientTransfersMultiLinkingUxButtons INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientTransfersMultiLinkingUxButtons("client-transfers-multi-linking-ux-buttons", 2);
    }
}
