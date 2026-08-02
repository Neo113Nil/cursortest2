package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$DefaultQrCodeTab extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$DefaultQrCodeTab INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$DefaultQrCodeTab("default-qr-code-tab", 2);
    }
}
