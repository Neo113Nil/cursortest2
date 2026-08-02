package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class LaunchDarklyFeatureFlags$FavoritesAfterPaymentUpsellPullDelaySeconds extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$FavoritesAfterPaymentUpsellPullDelaySeconds INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("5");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("1"), new FeatureFlag$LongFeatureFlag.Value("2"), new FeatureFlag$LongFeatureFlag.Value("3"), new FeatureFlag$LongFeatureFlag.Value("5"), new FeatureFlag$LongFeatureFlag.Value("10"), new FeatureFlag$LongFeatureFlag.Value("30"), new FeatureFlag$LongFeatureFlag.Value("0")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$FavoritesAfterPaymentUpsellPullDelaySeconds("cashclient/favorites_after_payment_upsell_pull_delay_seconds", value, listOf, 0);
    }
}
