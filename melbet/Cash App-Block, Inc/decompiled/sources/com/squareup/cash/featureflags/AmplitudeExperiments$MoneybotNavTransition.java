package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$MoneybotNavTransition extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MoneybotNavTransition INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MoneybotNavTransition("moneybot-nav-transition", 2);
    }
}
