package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$BitcoinBuyEnableCashInInstrumentSelection extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$BitcoinBuyEnableCashInInstrumentSelection INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$BitcoinBuyEnableCashInInstrumentSelection("bitcoin-buy-enable-cash-in-instrument-selection", 2);
    }
}
