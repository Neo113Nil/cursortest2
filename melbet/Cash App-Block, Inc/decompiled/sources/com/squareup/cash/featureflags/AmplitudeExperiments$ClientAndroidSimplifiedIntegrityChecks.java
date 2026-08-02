package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientAndroidSimplifiedIntegrityChecks extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientAndroidSimplifiedIntegrityChecks INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientAndroidSimplifiedIntegrityChecks("client-android-simplified-integrity-checks", 2);
    }
}
