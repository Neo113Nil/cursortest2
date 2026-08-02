package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MobileBankingEvergreenEligibleTransactionExperience extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MobileBankingEvergreenEligibleTransactionExperience INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MobileBankingEvergreenEligibleTransactionExperience("mobile-banking-evergreen-eligible-transaction-experience", 2);
    }
}
