package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$EarningsApplet extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$EarningsApplet INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$EarningsApplet("earnings-applet", 2);
    }
}
