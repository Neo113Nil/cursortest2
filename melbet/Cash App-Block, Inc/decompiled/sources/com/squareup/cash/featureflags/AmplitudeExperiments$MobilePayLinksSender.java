package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MobilePayLinksSender extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MobilePayLinksSender INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MobilePayLinksSender("mobile-pay-links-sender", 2);
    }
}
