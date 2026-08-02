package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$SupportSearchDebounce extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$SupportSearchDebounce INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("1000");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("600"), new FeatureFlag$LongFeatureFlag.Value("1000")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$SupportSearchDebounce("cashclient/support_search_debounce", value, listOf, 0);
    }
}
