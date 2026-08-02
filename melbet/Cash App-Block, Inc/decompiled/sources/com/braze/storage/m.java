package com.braze.storage;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import bo.app.ld;
import bo.app.md;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes4.dex */
public final class m extends DataStoreProvider {
    public static final ld a = new ld();

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsJVMKt.listOf(new SharedPreferencesMigration(getContext(), "com.appboy.override.configuration.cache", (RealGcmRegistrar$unregister$2) null, new md(), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.override.runtime_config";
    }
}
