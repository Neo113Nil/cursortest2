package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MobileDirectDepositSetupManualFlow extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MobileDirectDepositSetupManualFlow INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MobileDirectDepositSetupManualFlow("mobile-direct-deposit-setup-manual-flow", 2);
    }
}
