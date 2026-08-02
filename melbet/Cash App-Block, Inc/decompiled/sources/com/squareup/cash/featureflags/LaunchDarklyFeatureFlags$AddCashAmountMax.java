package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$AddCashAmountMax extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$AddCashAmountMax INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("0");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("99999999"), new FeatureFlag$LongFeatureFlag.Value("2500000"), new FeatureFlag$LongFeatureFlag.Value("9999999"), new FeatureFlag$LongFeatureFlag.Value("0")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$AddCashAmountMax("cashclient/add_cash_amount_max", value, listOf, 0);
    }
}
