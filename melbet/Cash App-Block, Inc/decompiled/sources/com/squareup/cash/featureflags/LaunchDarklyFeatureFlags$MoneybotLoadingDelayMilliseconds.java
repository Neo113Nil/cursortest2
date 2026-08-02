package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$MoneybotLoadingDelayMilliseconds extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$MoneybotLoadingDelayMilliseconds INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("300");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("500"), new FeatureFlag$LongFeatureFlag.Value("0"), new FeatureFlag$LongFeatureFlag.Value("5000"), new FeatureFlag$LongFeatureFlag.Value("2000"), new FeatureFlag$LongFeatureFlag.Value("300")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$MoneybotLoadingDelayMilliseconds("cashclient/moneybot_loading_delay_milliseconds", value, listOf, 0);
    }
}
