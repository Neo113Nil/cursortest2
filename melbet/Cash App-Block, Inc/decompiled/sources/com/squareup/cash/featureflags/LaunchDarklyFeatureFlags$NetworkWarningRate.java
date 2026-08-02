package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class LaunchDarklyFeatureFlags$NetworkWarningRate extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$NetworkWarningRate INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("TWO_PERCENT", "TWO_PERCENT");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("ZERO", "ZERO"), new FeatureFlag$StringFeatureFlag$Value("FIVE_PERCENT", "FIVE_PERCENT"), new FeatureFlag$StringFeatureFlag$Value("TWO_PERCENT", "TWO_PERCENT"), new FeatureFlag$StringFeatureFlag$Value("TWENTY_PERCENT", "TWENTY_PERCENT"), new FeatureFlag$StringFeatureFlag$Value("FULL", "FULL")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$NetworkWarningRate("cashclient/network_warning_rate", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
