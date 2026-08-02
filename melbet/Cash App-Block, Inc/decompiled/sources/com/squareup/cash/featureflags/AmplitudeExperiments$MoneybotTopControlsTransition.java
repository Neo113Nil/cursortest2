package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$MoneybotTopControlsTransition extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MoneybotTopControlsTransition INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MoneybotTopControlsTransition("moneybot-top-controls-transition", 2);
    }
}
