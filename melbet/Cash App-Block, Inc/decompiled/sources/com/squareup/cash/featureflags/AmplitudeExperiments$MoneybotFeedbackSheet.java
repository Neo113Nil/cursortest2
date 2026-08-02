package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MoneybotFeedbackSheet extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MoneybotFeedbackSheet INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MoneybotFeedbackSheet("moneybot-feedback-sheet", 2);
    }
}
