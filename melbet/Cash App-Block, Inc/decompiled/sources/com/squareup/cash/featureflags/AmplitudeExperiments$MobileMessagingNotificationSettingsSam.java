package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MobileMessagingNotificationSettingsSam extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MobileMessagingNotificationSettingsSam INSTANCE;

    static {
        FeatureFlag$ControlTreatmentAmplitudeExperiment$Options featureFlag$ControlTreatmentAmplitudeExperiment$Options = FeatureFlag$ControlTreatmentAmplitudeExperiment$Options.Control;
        INSTANCE = new AmplitudeExperiments$MobileMessagingNotificationSettingsSam("mobile-messaging-notification-settings-sam", 1);
    }
}
