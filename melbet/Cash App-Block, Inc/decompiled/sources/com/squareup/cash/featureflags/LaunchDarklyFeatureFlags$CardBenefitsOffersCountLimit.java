package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$CardBenefitsOffersCountLimit extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$CardBenefitsOffersCountLimit INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("5");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("5"), new FeatureFlag$LongFeatureFlag.Value("10")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$CardBenefitsOffersCountLimit("cashclient/card_benefits_offers_count_limit", value, listOf, 0);
    }
}
