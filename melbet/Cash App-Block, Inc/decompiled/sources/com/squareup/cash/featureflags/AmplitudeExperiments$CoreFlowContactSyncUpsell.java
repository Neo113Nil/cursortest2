package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$CoreFlowContactSyncUpsell extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$CoreFlowContactSyncUpsell INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$CoreFlowContactSyncUpsell("core-flow-contact-sync-upsell", 2);
    }
}
