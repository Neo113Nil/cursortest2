package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientSupportConsistentCsatOrder extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientSupportConsistentCsatOrder INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientSupportConsistentCsatOrder("client-support-consistent-csat-order", 2);
    }
}
