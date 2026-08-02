package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MobileBankingEvergreenProgressBar extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MobileBankingEvergreenProgressBar INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MobileBankingEvergreenProgressBar("mobile-banking-evergreen-progress-bar", 2);
    }
}
