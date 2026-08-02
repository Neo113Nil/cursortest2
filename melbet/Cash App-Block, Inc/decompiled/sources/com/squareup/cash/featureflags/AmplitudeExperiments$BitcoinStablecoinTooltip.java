package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$BitcoinStablecoinTooltip extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$BitcoinStablecoinTooltip INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$BitcoinStablecoinTooltip("bitcoin-stablecoin-tooltip", 2);
    }
}
