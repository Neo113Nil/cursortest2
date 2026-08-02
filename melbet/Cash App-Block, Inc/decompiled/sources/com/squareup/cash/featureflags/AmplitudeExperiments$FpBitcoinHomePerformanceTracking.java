package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$FpBitcoinHomePerformanceTracking extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$FpBitcoinHomePerformanceTracking INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$FpBitcoinHomePerformanceTracking("fp_bitcoin_home_performance_tracking", 2);
    }
}
