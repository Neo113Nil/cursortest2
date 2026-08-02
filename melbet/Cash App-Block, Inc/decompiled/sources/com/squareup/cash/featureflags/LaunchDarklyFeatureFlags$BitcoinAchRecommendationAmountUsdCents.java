package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$BitcoinAchRecommendationAmountUsdCents extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$BitcoinAchRecommendationAmountUsdCents INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("10000000");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("100000"), new FeatureFlag$LongFeatureFlag.Value("500000"), new FeatureFlag$LongFeatureFlag.Value("10000000")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$BitcoinAchRecommendationAmountUsdCents("cashclient/bitcoin_ach_recommendation_amount_usd_cents", value, listOf, 0);
    }
}
