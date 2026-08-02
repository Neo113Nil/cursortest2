package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientSupportUploadImageCompat extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientSupportUploadImageCompat INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientSupportUploadImageCompat("client-support-upload-image-compat", 2);
    }
}
