package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$ClientTransfersThreedsPreInitialization extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientTransfersThreedsPreInitialization INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientTransfersThreedsPreInitialization("client-transfers-threeds-pre-initialization", 2);
    }
}
