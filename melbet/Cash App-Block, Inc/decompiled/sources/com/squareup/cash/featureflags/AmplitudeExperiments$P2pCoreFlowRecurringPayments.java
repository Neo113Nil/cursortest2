package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$P2pCoreFlowRecurringPayments extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$P2pCoreFlowRecurringPayments INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$P2pCoreFlowRecurringPayments("p2p-core-flow-recurring-payments", 2);
    }
}
