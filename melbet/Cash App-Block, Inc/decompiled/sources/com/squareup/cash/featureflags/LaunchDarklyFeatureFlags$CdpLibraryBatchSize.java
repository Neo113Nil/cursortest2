package com.squareup.cash.featureflags;

import com.squareup.cash.featureflags.FeatureFlag$LongFeatureFlag;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class LaunchDarklyFeatureFlags$CdpLibraryBatchSize extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$CdpLibraryBatchSize INSTANCE;

    static {
        FeatureFlag$LongFeatureFlag.Value value = new FeatureFlag$LongFeatureFlag.Value("50");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$LongFeatureFlag.Value[]{new FeatureFlag$LongFeatureFlag.Value("100"), new FeatureFlag$LongFeatureFlag.Value("101"), new FeatureFlag$LongFeatureFlag.Value("5"), new FeatureFlag$LongFeatureFlag.Value("50"), new FeatureFlag$LongFeatureFlag.Value("10")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$CdpLibraryBatchSize("cashclient/cdp_library_batch_size", value, listOf, 0);
    }
}
