package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class LaunchDarklyFeatureFlags$ClientsyncSyncValueReaderImpl extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$ClientsyncSyncValueReaderImpl INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("V1", "V1");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("V1", "V1"), new FeatureFlag$StringFeatureFlag$Value("V2", "V2")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$ClientsyncSyncValueReaderImpl("cashclient/clientsync_sync_value_reader_impl", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
