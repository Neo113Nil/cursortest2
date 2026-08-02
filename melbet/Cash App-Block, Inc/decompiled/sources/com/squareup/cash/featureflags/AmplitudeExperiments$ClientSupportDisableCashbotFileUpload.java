package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientSupportDisableCashbotFileUpload extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientSupportDisableCashbotFileUpload INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientSupportDisableCashbotFileUpload("client-support-disable-cashbot-file-upload", 2);
    }
}
