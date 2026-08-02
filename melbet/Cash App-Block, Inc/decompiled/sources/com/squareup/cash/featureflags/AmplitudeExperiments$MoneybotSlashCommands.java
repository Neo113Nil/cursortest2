package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MoneybotSlashCommands extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MoneybotSlashCommands INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MoneybotSlashCommands("moneybot-slash-commands", 2);
    }
}
