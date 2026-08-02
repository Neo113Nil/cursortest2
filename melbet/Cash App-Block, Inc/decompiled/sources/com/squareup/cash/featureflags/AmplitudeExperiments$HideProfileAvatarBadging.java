package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$HideProfileAvatarBadging extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$HideProfileAvatarBadging INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$HideProfileAvatarBadging("hide-profile-avatar-badging", 2);
    }
}
