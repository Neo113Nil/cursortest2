package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MoneybotHomeWidgets extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MoneybotHomeWidgets INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MoneybotHomeWidgets("moneybot-home-widgets", 2);
    }
}
