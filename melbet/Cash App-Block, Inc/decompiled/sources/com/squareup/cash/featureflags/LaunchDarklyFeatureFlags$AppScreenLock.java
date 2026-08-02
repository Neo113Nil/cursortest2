package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class LaunchDarklyFeatureFlags$AppScreenLock extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$AppScreenLock INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("UNASSIGNED", "UNASSIGNED");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("300", "300"), new FeatureFlag$StringFeatureFlag$Value("DISABLED", "DISABLED"), new FeatureFlag$StringFeatureFlag$Value("10", "10"), new FeatureFlag$StringFeatureFlag$Value("UNASSIGNED", "UNASSIGNED")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$AppScreenLock("cashclient/app_screen_lock", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
