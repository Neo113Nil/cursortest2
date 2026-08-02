package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ClientSupportChatExitPromptCopy extends FeatureFlag$StringAmplitudeExperiment {
    public static final AmplitudeExperiments$ClientSupportChatExitPromptCopy INSTANCE;

    static {
        FeatureFlag$StringAmplitudeExperiment.Value value = new FeatureFlag$StringAmplitudeExperiment.Value("control", "control");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringAmplitudeExperiment.Value[]{new FeatureFlag$StringAmplitudeExperiment.Value("control", "control"), new FeatureFlag$StringAmplitudeExperiment.Value("alt-1", "alt-1"), new FeatureFlag$StringAmplitudeExperiment.Value("alt-2", "alt-2")});
        listOf.getClass();
        INSTANCE = new AmplitudeExperiments$ClientSupportChatExitPromptCopy("client-support-chat-exit-prompt-copy", value, listOf);
    }
}
