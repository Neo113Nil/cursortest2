package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MoneybotPinMessageAsWidget extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MoneybotPinMessageAsWidget INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MoneybotPinMessageAsWidget("moneybot-pin-message-as-widget", 2);
    }
}
