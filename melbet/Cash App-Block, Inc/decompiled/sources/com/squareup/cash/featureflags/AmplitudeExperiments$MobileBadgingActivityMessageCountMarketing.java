package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MobileBadgingActivityMessageCountMarketing extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MobileBadgingActivityMessageCountMarketing INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$MobileBadgingActivityMessageCountMarketing("mobile-badging-activity-message-count-marketing", 1);
    }
}
