package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MoneybotCanvasBackground extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MoneybotCanvasBackground INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MoneybotCanvasBackground("moneybot-canvas-background", 2);
    }
}
