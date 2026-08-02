package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$BitcoinBasicsTagId extends FeatureFlag$StringAmplitudeExperiment {
    public static final AmplitudeExperiments$BitcoinBasicsTagId INSTANCE;

    static {
        FeatureFlag$StringAmplitudeExperiment.Value value = new FeatureFlag$StringAmplitudeExperiment.Value("71289629-727e-11ee-ae5a-c72ea0803740", "71289629-727e-11ee-ae5a-c72ea0803740");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringAmplitudeExperiment.Value[]{new FeatureFlag$StringAmplitudeExperiment.Value("71289629-727e-11ee-ae5a-c72ea0803740", "71289629-727e-11ee-ae5a-c72ea0803740"), new FeatureFlag$StringAmplitudeExperiment.Value("cb0552d4-2db0-11ef-837b-8a8a216a96df", "cb0552d4-2db0-11ef-837b-8a8a216a96df")});
        listOf.getClass();
        INSTANCE = new AmplitudeExperiments$BitcoinBasicsTagId("bitcoin-basics-tag-id", value, listOf);
    }
}
