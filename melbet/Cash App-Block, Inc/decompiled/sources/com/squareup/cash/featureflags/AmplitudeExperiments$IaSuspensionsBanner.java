package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$IaSuspensionsBanner extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$IaSuspensionsBanner INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$IaSuspensionsBanner("ia_suspensions_banner", 2);
    }
}
