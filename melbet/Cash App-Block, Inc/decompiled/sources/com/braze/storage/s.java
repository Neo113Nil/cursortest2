package com.braze.storage;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes4.dex */
public final class s extends DataStoreProvider {
    public final String a;

    static {
        new TriggerAssetDataStoreProvider$Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.a = str;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsJVMKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.appboy.storage.triggers.local_assets.", this.a), SharedPreferencesMigrationKt.MIGRATE_ALL_KEYS)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.triggers.assets.", this.a);
    }
}
