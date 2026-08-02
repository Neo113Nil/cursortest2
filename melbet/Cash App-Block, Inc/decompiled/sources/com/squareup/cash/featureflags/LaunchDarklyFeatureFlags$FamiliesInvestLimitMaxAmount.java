package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$FamiliesInvestLimitMaxAmount extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$FamiliesInvestLimitMaxAmount INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("40000");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("0"), new FeatureFlag$LongFeatureFlag.Value("40000")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$FamiliesInvestLimitMaxAmount("cashclient/families_invest_limit_max_amount", value, listOf, 0);
    }
}
