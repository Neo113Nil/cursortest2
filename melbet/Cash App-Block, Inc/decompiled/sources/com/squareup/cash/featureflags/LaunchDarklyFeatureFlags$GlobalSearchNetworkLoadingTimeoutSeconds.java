package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$GlobalSearchNetworkLoadingTimeoutSeconds extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$GlobalSearchNetworkLoadingTimeoutSeconds INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("3");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("3"), new FeatureFlag$LongFeatureFlag.Value("0")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$GlobalSearchNetworkLoadingTimeoutSeconds("cashclient/global_search_network_loading_timeout_seconds", value, listOf, 0);
    }
}
