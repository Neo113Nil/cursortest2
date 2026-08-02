package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$MobileDiscoverablePasskeysEnabled extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MobileDiscoverablePasskeysEnabled INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MobileDiscoverablePasskeysEnabled("mobile-discoverable-passkeys-enabled", 2);
    }
}
