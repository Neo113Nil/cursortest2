package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$ClientNavigationLiquidGlass extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientNavigationLiquidGlass INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientNavigationLiquidGlass("client-navigation-liquid-glass", 2);
    }
}
