package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$IsEmployee extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$IsEmployee INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("IS_NOT_EMPLOYEE", "IS_NOT_EMPLOYEE");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("IS_NOT_EMPLOYEE", "IS_NOT_EMPLOYEE"), new FeatureFlag$StringFeatureFlag$Value("IS_EMPLOYEE", "IS_EMPLOYEE")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$IsEmployee("cashclient/is_employee", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
