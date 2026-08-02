package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$CashCardRewardsTiles extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$CashCardRewardsTiles INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$CashCardRewardsTiles("cash-card-rewards-tiles", 2);
    }
}
