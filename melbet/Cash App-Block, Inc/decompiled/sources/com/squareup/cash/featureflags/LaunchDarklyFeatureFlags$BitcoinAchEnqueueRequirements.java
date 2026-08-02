package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$BitcoinAchEnqueueRequirements extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$BitcoinAchEnqueueRequirements INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("disabled", "disabled");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("disabled", "disabled"), new FeatureFlag$StringFeatureFlag$Value("enabled_tab", "enabled_tab"), new FeatureFlag$StringFeatureFlag$Value("enabled_sheet", "enabled_sheet")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$BitcoinAchEnqueueRequirements("cashclient/bitcoin_ach_enqueue_requirements", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
