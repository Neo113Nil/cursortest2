package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$AfterpayStatementDocuments extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$AfterpayStatementDocuments INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$AfterpayStatementDocuments("afterpay-statement-documents", 2);
    }
}
