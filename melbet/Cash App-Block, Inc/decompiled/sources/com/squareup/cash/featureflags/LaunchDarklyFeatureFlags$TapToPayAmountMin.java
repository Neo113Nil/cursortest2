package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$TapToPayAmountMin extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$TapToPayAmountMin INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("1");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("50"), new FeatureFlag$LongFeatureFlag.Value("0"), new FeatureFlag$LongFeatureFlag.Value("100"), new FeatureFlag$LongFeatureFlag.Value("1")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$TapToPayAmountMin("cashclient/tap_to_pay_amount_min", value, listOf, 0);
    }
}
