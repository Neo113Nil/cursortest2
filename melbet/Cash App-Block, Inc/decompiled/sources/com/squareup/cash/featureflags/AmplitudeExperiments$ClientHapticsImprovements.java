package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$ClientHapticsImprovements extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientHapticsImprovements INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientHapticsImprovements("client-haptics-improvements", 2);
    }
}
