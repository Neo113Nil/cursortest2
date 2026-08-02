package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$InstalledAppletRedesign extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$InstalledAppletRedesign INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$InstalledAppletRedesign("installed-applet-redesign", 2);
    }
}
