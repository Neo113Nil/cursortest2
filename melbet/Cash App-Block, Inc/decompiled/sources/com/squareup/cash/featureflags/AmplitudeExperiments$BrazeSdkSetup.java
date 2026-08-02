package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$BrazeSdkSetup extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$BrazeSdkSetup INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$BrazeSdkSetup("braze-sdk-setup", 2);
    }
}
