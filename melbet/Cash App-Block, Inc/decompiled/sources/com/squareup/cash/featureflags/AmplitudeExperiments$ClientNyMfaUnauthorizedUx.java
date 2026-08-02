package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$ClientNyMfaUnauthorizedUx extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientNyMfaUnauthorizedUx INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientNyMfaUnauthorizedUx("client-ny-mfa-unauthorized-ux", 2);
    }
}
