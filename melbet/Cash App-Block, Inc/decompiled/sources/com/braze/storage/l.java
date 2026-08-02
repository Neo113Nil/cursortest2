package com.braze.storage;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import bo.app.nc;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes4.dex */
public final class l extends DataStoreProvider {
    public static final PushMaxDataStoreProvider$Companion d = new PushMaxDataStoreProvider$Companion(null);
    public final String a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = LazyKt.lazy(new a$$ExternalSyntheticLambda0(13, context, this));
    }

    public static final String a(Context context, l lVar) {
        return StringUtils.getCacheFileSuffix(context, lVar.a, lVar.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.braze.storage.braze_push_max_metadata", (String) this.c.getValue()), SetsKt__SetsJVMKt.setOf(DataStoreKey.PUSH_MAX_LAST_UPDATE.getKey())), new SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.braze.storage.braze_push_max_storage", (String) this.c.getValue()), (RealGcmRegistrar$unregister$2) null, new nc(d), 12)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.pushmax", (String) this.c.getValue());
    }
}
