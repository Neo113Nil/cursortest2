package com.squareup.cash.featureflags;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes6.dex */
public final class LaunchDarklyFeatureFlags$ClientsyncMultiplatformDatabaseMigration extends FeatureFlag$LongFeatureFlag {
    public static final LaunchDarklyFeatureFlags$ClientsyncMultiplatformDatabaseMigration INSTANCE;

    static {
        FeatureFlag$StringFeatureFlag$Value featureFlag$StringFeatureFlag$Value = new FeatureFlag$StringFeatureFlag$Value("NATIVE", "NATIVE");
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new FeatureFlag$StringFeatureFlag$Value[]{new FeatureFlag$StringFeatureFlag$Value("NATIVE", "NATIVE"), new FeatureFlag$StringFeatureFlag$Value("MULTIPLATFORM_SHADOWED", "MULTIPLATFORM_SHADOWED"), new FeatureFlag$StringFeatureFlag$Value("MULTIPLATFORM_MIGRATED", "MULTIPLATFORM_MIGRATED"), new FeatureFlag$StringFeatureFlag$Value("MULTIPLATFORM", "MULTIPLATFORM")});
        listOf.getClass();
        INSTANCE = new LaunchDarklyFeatureFlags$ClientsyncMultiplatformDatabaseMigration("cashclient/clientsync_multiplatform_database_migration", featureFlag$StringFeatureFlag$Value, listOf, 5);
    }
}
