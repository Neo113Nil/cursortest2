package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$BankingCashGreenRelease extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$BankingCashGreenRelease INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$BankingCashGreenRelease("banking-cash-green-release", 2);
    }
}
