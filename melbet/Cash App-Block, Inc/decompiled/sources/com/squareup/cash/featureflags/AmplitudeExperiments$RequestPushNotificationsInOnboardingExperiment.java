package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$RequestPushNotificationsInOnboardingExperiment extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$RequestPushNotificationsInOnboardingExperiment INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$RequestPushNotificationsInOnboardingExperiment("request-push-notifications-in-onboarding-experiment", 1);
    }
}
