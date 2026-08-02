package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientSupportChatBotIndicatorDelayAfterTyping extends FeatureFlag$StringAmplitudeExperiment {
    public static final AmplitudeExperiments$ClientSupportChatBotIndicatorDelayAfterTyping INSTANCE;

    static {
        FeatureFlag$StringAmplitudeExperiment.Value value = new FeatureFlag$StringAmplitudeExperiment.Value("5000", "5000");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringAmplitudeExperiment.Value[]{new FeatureFlag$StringAmplitudeExperiment.Value("5000", "5000"), new FeatureFlag$StringAmplitudeExperiment.Value("2000", "2000"), new FeatureFlag$StringAmplitudeExperiment.Value("3000", "3000"), new FeatureFlag$StringAmplitudeExperiment.Value("4000", "4000"), new FeatureFlag$StringAmplitudeExperiment.Value("10000", "10000"), new FeatureFlag$StringAmplitudeExperiment.Value("1000", "1000")});
        listOf.getClass();
        INSTANCE = new AmplitudeExperiments$ClientSupportChatBotIndicatorDelayAfterTyping("client-support-chat-bot-indicator-delay-after-typing", value, listOf);
    }
}
