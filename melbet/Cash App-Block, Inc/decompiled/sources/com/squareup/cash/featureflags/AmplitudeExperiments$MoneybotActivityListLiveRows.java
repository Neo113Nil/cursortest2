package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MoneybotActivityListLiveRows extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MoneybotActivityListLiveRows INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MoneybotActivityListLiveRows("moneybot-activity-list-live-rows", 2);
    }
}
