package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$CardStudioPortraitMode extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$CardStudioPortraitMode INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$CardStudioPortraitMode("card-studio-portrait-mode", 2);
    }
}
