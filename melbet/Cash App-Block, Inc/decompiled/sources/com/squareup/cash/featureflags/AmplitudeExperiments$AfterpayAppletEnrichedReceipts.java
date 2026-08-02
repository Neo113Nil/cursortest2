package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$AfterpayAppletEnrichedReceipts extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$AfterpayAppletEnrichedReceipts INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$AfterpayAppletEnrichedReceipts("afterpay-applet-enriched-receipts", 1);
    }
}
