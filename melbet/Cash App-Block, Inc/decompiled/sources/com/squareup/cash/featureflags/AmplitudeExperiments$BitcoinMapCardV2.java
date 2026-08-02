package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$BitcoinMapCardV2 extends FeatureFlag$StringAmplitudeExperiment {
    public static final AmplitudeExperiments$BitcoinMapCardV2 INSTANCE;

    static {
        FeatureFlag$StringAmplitudeExperiment.Value value = new FeatureFlag$StringAmplitudeExperiment.Value("disabled", "disabled");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringAmplitudeExperiment.Value[]{new FeatureFlag$StringAmplitudeExperiment.Value("disabled", "disabled"), new FeatureFlag$StringAmplitudeExperiment.Value("enabled-above-grow-tools", "enabled-above-grow-tools"), new FeatureFlag$StringAmplitudeExperiment.Value("enabled-below-grow-tools", "enabled-below-grow-tools")});
        listOf.getClass();
        INSTANCE = new AmplitudeExperiments$BitcoinMapCardV2("bitcoin-map-card-v2", value, listOf);
    }
}
