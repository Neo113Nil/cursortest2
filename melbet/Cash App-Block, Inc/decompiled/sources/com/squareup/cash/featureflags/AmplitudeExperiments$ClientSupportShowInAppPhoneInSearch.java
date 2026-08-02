package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientSupportShowInAppPhoneInSearch extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientSupportShowInAppPhoneInSearch INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientSupportShowInAppPhoneInSearch("client-support-show-in-app-phone-in-search", 2);
    }
}
