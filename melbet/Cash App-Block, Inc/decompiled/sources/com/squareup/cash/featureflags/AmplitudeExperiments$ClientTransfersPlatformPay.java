package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientTransfersPlatformPay extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientTransfersPlatformPay INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientTransfersPlatformPay("client-transfers-platform-pay", 2);
    }
}
