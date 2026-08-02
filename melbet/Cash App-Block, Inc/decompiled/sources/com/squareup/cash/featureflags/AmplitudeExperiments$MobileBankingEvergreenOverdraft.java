package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MobileBankingEvergreenOverdraft extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MobileBankingEvergreenOverdraft INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MobileBankingEvergreenOverdraft("mobile-banking-evergreen-overdraft", 2);
    }
}
