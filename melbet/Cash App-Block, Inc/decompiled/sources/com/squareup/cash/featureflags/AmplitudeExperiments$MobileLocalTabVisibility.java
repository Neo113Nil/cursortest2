package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$MobileLocalTabVisibility extends FeatureFlag$StringAmplitudeExperiment {
    public static final AmplitudeExperiments$MobileLocalTabVisibility INSTANCE;

    static {
        FeatureFlag$StringAmplitudeExperiment.Value value = new FeatureFlag$StringAmplitudeExperiment.Value("force_off", "force_off");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringAmplitudeExperiment.Value[]{new FeatureFlag$StringAmplitudeExperiment.Value("force_off", "force_off"), new FeatureFlag$StringAmplitudeExperiment.Value("data_driven", "data_driven"), new FeatureFlag$StringAmplitudeExperiment.Value("force_on", "force_on")});
        listOf.getClass();
        INSTANCE = new AmplitudeExperiments$MobileLocalTabVisibility("mobile-local-tab-visibility", value, listOf);
    }
}
