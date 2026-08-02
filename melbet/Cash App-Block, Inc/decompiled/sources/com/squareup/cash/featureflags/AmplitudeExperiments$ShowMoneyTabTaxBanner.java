package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ShowMoneyTabTaxBanner extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ShowMoneyTabTaxBanner INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ShowMoneyTabTaxBanner("show-money-tab-tax-banner", 2);
    }
}
