package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientP2pPlatformPay extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientP2pPlatformPay INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientP2pPlatformPay("client-p2p-platform-pay", 2);
    }
}
