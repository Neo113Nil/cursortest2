package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MobileMoneybotChat extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MobileMoneybotChat INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MobileMoneybotChat("mobile-moneybot-chat", 2);
    }
}
