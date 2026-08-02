package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$MoneybotCachedSessionIdTimeoutSeconds extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$MoneybotCachedSessionIdTimeoutSeconds INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("300");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("600"), new FeatureFlag$LongFeatureFlag.Value("0"), new FeatureFlag$LongFeatureFlag.Value("300"), new FeatureFlag$LongFeatureFlag.Value("10")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$MoneybotCachedSessionIdTimeoutSeconds("cashclient/moneybot_cached_session_id_timeout_seconds", value, listOf, 0);
    }
}
