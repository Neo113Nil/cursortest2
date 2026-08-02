package com.squareup.cash.featureflags;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientSupportChatUnifiedTransactionPicker extends FeatureFlag$LongFeatureFlag {
    public static final AmplitudeExperiments$ClientSupportChatUnifiedTransactionPicker INSTANCE;

    static {
        FeatureFlag$EnabledDisabledAmplitudeExperiment$Options featureFlag$EnabledDisabledAmplitudeExperiment$Options = FeatureFlag$EnabledDisabledAmplitudeExperiment$Options.Disabled;
        INSTANCE = new AmplitudeExperiments$ClientSupportChatUnifiedTransactionPicker("client-support-chat-unified-transaction-picker", 2);
    }
}
