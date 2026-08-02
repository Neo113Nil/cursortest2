package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$EnforceSecurityScreens extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$EnforceSecurityScreens INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("ENFORCE", "ENFORCE");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("ENFORCE", "ENFORCE"), new FeatureFlag$StringFeatureFlag$Value("DISABLE", "DISABLE")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$EnforceSecurityScreens("cashclient/enforce_security_screens", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
