package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$BitcoinBuyEnableCashInBankAccountInstrument extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$BitcoinBuyEnableCashInBankAccountInstrument INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$BitcoinBuyEnableCashInBankAccountInstrument("bitcoin-buy-enable-cash-in-bank-account-instrument", 2);
    }
}
