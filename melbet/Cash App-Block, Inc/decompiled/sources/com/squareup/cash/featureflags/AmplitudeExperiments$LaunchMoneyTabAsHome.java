package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$LaunchMoneyTabAsHome extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$LaunchMoneyTabAsHome INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$LaunchMoneyTabAsHome("launch-money-tab-as-home", 2);
    }
}
