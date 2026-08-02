package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientTransfersUseInstrumentCardArt extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientTransfersUseInstrumentCardArt INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientTransfersUseInstrumentCardArt("client-transfers-use-instrument-card-art", 2);
    }
}
