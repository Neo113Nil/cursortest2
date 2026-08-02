package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientCommerceArcadeMigrationAutofill extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientCommerceArcadeMigrationAutofill INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientCommerceArcadeMigrationAutofill("client-commerce-arcade-migration-autofill", 2);
    }
}
