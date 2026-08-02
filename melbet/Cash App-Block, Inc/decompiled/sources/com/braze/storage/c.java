package com.braze.storage;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import bo.app.d5;
import bo.app.e5;
import com.braze.support.StringUtils;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* loaded from: classes4.dex */
public final class c extends DataStoreProvider {
    public static final d5 b = new d5();
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.a = str;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.braze.device_id", StringUtils.getCacheFileSuffix(getContext(), null, this.a)), SharedPreferencesMigrationKt.MIGRATE_ALL_KEYS), new SharedPreferencesMigration(getContext(), "com.appboy.device", (RealGcmRegistrar$unregister$2) null, new e5(), 12)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.device_id", StringUtils.getCacheFileSuffix(getContext(), null, this.a));
    }
}
