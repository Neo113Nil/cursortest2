package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$ClientArcadeMigrationSplashScreen extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientArcadeMigrationSplashScreen INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientArcadeMigrationSplashScreen("client-arcade-migration-splash-screen", 2);
    }
}
