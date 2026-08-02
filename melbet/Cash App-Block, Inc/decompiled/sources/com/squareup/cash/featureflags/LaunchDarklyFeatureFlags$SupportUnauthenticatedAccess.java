package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$SupportUnauthenticatedAccess extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$SupportUnauthenticatedAccess INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("UNASSIGNED", "UNASSIGNED");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("LOGIN_ISSUE_CONTACT", "LOGIN_ISSUE_CONTACT"), new FeatureFlag$StringFeatureFlag$Value("DISABLED", "DISABLED"), new FeatureFlag$StringFeatureFlag$Value("UNASSIGNED", "UNASSIGNED")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$SupportUnauthenticatedAccess("cashclient/support_unauthenticated_access", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
