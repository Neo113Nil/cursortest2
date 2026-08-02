package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MoneybotImageAttachments extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$MoneybotImageAttachments INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$MoneybotImageAttachments("moneybot-image-attachments", 2);
    }
}
