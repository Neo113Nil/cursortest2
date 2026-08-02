package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes4.dex */
public final class r extends DataStoreProvider {
    static {
        new StringUtilsDataStoreProvider$Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsJVMKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), "com.appboy.support.stringutils.cachefilesuffix", SharedPreferencesMigrationKt.MIGRATE_ALL_KEYS)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.appboy.support.stringutils.cachefilesuffix";
    }
}
