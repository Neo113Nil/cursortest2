package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MobilePrepurchaseCashCardPilot extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MobilePrepurchaseCashCardPilot INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MobilePrepurchaseCashCardPilot("mobile-prepurchase-cash-card-pilot", 2);
    }
}
