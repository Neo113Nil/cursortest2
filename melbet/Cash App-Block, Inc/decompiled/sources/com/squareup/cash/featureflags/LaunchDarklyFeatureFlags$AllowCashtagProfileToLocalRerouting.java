package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$AllowCashtagProfileToLocalRerouting extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$AllowCashtagProfileToLocalRerouting INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("DISABLED", "DISABLED");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("BRAND_PROFILE_MAP_REROUTING", "BRAND_PROFILE_MAP_REROUTING"), new FeatureFlag$StringFeatureFlag$Value("DISABLED", "DISABLED"), new FeatureFlag$StringFeatureFlag$Value("CASHTAG_RESOLUTION_ENDPOINT_REROUTING", "CASHTAG_RESOLUTION_ENDPOINT_REROUTING")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$AllowCashtagProfileToLocalRerouting("cashclient/allow_cashtag_profile_to_local_rerouting", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
