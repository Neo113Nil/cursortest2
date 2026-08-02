package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$P2pNearbyBle extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$P2pNearbyBle INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$P2pNearbyBle("p2p-nearby-ble", 2);
    }
}
