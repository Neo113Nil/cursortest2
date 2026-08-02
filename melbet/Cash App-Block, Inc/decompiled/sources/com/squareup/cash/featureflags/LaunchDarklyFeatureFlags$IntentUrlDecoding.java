package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$IntentUrlDecoding extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$IntentUrlDecoding INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("Legacy", "Legacy");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("Legacy", "Legacy"), new FeatureFlag$StringFeatureFlag$Value("LegacyWithValidation", "LegacyWithValidation"), new FeatureFlag$StringFeatureFlag$Value("Modern", "Modern"), new FeatureFlag$StringFeatureFlag$Value("ModernWithValidation", "ModernWithValidation")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$IntentUrlDecoding("cashclient/intent_url_decoding", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
