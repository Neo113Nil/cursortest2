package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MobileBadgingActivityMessageCountTransactional extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MobileBadgingActivityMessageCountTransactional INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$MobileBadgingActivityMessageCountTransactional("mobile-badging-activity-message-count-transactional", 1);
    }
}
