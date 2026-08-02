package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ProjectMintHypeAnimations extends FeatureFlag$StringAmplitudeExperiment {
    public static final AmplitudeExperiments$ProjectMintHypeAnimations INSTANCE;

    static {
        FeatureFlag$StringAmplitudeExperiment.Value value = new FeatureFlag$StringAmplitudeExperiment.Value("none", "none");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringAmplitudeExperiment.Value[]{new FeatureFlag$StringAmplitudeExperiment.Value("none", "none"), new FeatureFlag$StringAmplitudeExperiment.Value("moneytab", "moneytab"), new FeatureFlag$StringAmplitudeExperiment.Value("paymentpad", "paymentpad"), new FeatureFlag$StringAmplitudeExperiment.Value("all", "all")});
        listOf.getClass();
        INSTANCE = new AmplitudeExperiments$ProjectMintHypeAnimations("project-mint-hype-animations", value, listOf);
    }
}
