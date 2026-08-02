package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class AmplitudeExperiments$ProvisioningStarLocationVariant extends FeatureFlag$StringAmplitudeExperiment {
    public static final AmplitudeExperiments$ProvisioningStarLocationVariant INSTANCE;

    static {
        FeatureFlag$StringAmplitudeExperiment.Value value = new FeatureFlag$StringAmplitudeExperiment.Value("default", "default");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringAmplitudeExperiment.Value[]{new FeatureFlag$StringAmplitudeExperiment.Value("default", "default"), new FeatureFlag$StringAmplitudeExperiment.Value("top-left", "top-left"), new FeatureFlag$StringAmplitudeExperiment.Value("vertical-animation", "vertical-animation"), new FeatureFlag$StringAmplitudeExperiment.Value("bounce-animation", "bounce-animation"), new FeatureFlag$StringAmplitudeExperiment.Value("center", "center"), new FeatureFlag$StringAmplitudeExperiment.Value("nfc-api", "nfc-api")});
        listOf.getClass();
        INSTANCE = new AmplitudeExperiments$ProvisioningStarLocationVariant("provisioning-star-location-variant", value, listOf);
    }
}
