package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$MoneybotRespectSystemAppearance extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MoneybotRespectSystemAppearance INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MoneybotRespectSystemAppearance("moneybot-respect-system-appearance", 2);
    }
}
