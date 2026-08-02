package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ShowCashAppIconInSponsorSelection extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ShowCashAppIconInSponsorSelection INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ShowCashAppIconInSponsorSelection("show-cash-app-icon-in-sponsor-selection", 2);
    }
}
