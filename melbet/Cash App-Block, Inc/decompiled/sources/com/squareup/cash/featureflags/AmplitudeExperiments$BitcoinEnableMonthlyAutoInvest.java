package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$BitcoinEnableMonthlyAutoInvest extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$BitcoinEnableMonthlyAutoInvest INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$BitcoinEnableMonthlyAutoInvest("bitcoin-enable-monthly-auto-invest", 2);
    }
}
