package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$AccountForceProfileSync extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$AccountForceProfileSync INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$AccountForceProfileSync("account-force-profile-sync", 2);
    }
}
