package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$AfterpayAppletV3OptimizationExperiment extends FeatureFlag$StringAmplitudeExperiment {
    public static final AmplitudeExperiments$AfterpayAppletV3OptimizationExperiment INSTANCE;

    static {
        FeatureFlag$StringAmplitudeExperiment.Value value = new FeatureFlag$StringAmplitudeExperiment.Value("control", "control");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringAmplitudeExperiment.Value[]{new FeatureFlag$StringAmplitudeExperiment.Value("control", "control"), new FeatureFlag$StringAmplitudeExperiment.Value("treatment-a", "treatment-a"), new FeatureFlag$StringAmplitudeExperiment.Value("treatment-b", "treatment-b")});
        listOf.getClass();
        INSTANCE = new AmplitudeExperiments$AfterpayAppletV3OptimizationExperiment("afterpay-applet-v3-optimization-experiment", value, listOf);
    }
}
