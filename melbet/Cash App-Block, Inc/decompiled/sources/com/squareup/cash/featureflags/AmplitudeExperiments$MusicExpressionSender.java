package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MusicExpressionSender extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MusicExpressionSender INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MusicExpressionSender("music-expression-sender", 2);
    }
}
