package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$BitcoinStablecoinMvp extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$BitcoinStablecoinMvp INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$BitcoinStablecoinMvp("bitcoin-stablecoin-mvp", 2);
    }
}
