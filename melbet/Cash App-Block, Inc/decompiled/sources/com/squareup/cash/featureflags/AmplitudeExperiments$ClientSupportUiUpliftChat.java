package com.squareup.cash.featureflags;

/* loaded from: classes.dex */
public final class AmplitudeExperiments$ClientSupportUiUpliftChat extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientSupportUiUpliftChat INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientSupportUiUpliftChat("client-support-ui-uplift-chat", 2);
    }
}
