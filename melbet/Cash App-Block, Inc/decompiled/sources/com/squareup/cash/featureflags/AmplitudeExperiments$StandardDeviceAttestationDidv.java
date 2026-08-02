package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$StandardDeviceAttestationDidv extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$StandardDeviceAttestationDidv INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$StandardDeviceAttestationDidv("standard_device_attestation_didv", 2);
    }
}
