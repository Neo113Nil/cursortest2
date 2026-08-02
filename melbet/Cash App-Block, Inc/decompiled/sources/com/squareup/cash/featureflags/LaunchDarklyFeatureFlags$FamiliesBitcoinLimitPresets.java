package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$FamiliesBitcoinLimitPresets extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$FamiliesBitcoinLimitPresets INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("2500, 5000, 15000, 20000, 40000", "2500, 5000, 15000, 20000, 40000");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("2500, 5000, 15000, 20000, 40000", "2500, 5000, 15000, 20000, 40000"), new FeatureFlag$StringFeatureFlag$Value("", "")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$FamiliesBitcoinLimitPresets("cashclient/families_bitcoin_limit_presets", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
