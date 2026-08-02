package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientSupportChatImmediateCsat extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientSupportChatImmediateCsat INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientSupportChatImmediateCsat("client-support-chat-immediate-csat", 2);
    }
}
