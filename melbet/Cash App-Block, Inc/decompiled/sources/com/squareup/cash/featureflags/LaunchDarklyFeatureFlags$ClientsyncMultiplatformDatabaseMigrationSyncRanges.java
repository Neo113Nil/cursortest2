package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes.dex */
public final class LaunchDarklyFeatureFlags$ClientsyncMultiplatformDatabaseMigrationSyncRanges extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$ClientsyncMultiplatformDatabaseMigrationSyncRanges INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("NATIVE_ONLY", "NATIVE_ONLY");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("NATIVE_ONLY", "NATIVE_ONLY"), new FeatureFlag$StringFeatureFlag$Value("NATIVE_SHADOWED", "NATIVE_SHADOWED"), new FeatureFlag$StringFeatureFlag$Value("MULTIPLATFORM_SHADOWED", "MULTIPLATFORM_SHADOWED"), new FeatureFlag$StringFeatureFlag$Value("MULTIPLATFORM_ONLY", "MULTIPLATFORM_ONLY")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$ClientsyncMultiplatformDatabaseMigrationSyncRanges("cashclient/clientsync_multiplatform_database_migration_sync_ranges", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
