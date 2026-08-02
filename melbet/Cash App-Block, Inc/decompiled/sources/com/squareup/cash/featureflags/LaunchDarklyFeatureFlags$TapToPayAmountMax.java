package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$TapToPayAmountMax extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$TapToPayAmountMax INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("100000");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("100"), new FeatureFlag$LongFeatureFlag.Value("1000"), new FeatureFlag$LongFeatureFlag.Value("2000"), new FeatureFlag$LongFeatureFlag.Value("0"), new FeatureFlag$LongFeatureFlag.Value("10000"), new FeatureFlag$LongFeatureFlag.Value("100000")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$TapToPayAmountMax("cashclient/tap_to_pay_amount_max", value, listOf, 0);
    }
}
