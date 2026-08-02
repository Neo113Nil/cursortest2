package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MobilePasskeysEnabled extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MobilePasskeysEnabled INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MobilePasskeysEnabled("mobile-passkeys-enabled", 2);
    }
}
