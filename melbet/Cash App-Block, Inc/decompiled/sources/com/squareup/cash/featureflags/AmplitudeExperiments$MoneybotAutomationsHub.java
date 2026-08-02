package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MoneybotAutomationsHub extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MoneybotAutomationsHub INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MoneybotAutomationsHub("moneybot-automations-hub", 2);
    }
}
