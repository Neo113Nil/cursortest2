package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MobileCashCreditScoreApplet extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MobileCashCreditScoreApplet INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MobileCashCreditScoreApplet("mobile-cash-credit-score-applet", 2);
    }
}
