package com.braze.storage;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import bo.app.df;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes4.dex */
public final class q extends DataStoreProvider {
    public static final SessionStorageDataStoreProvider$Companion d = new SessionStorageDataStoreProvider$Companion(null);
    public final String a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = LazyKt.lazy(new a$$ExternalSyntheticLambda0(16, context, this));
    }

    public static final String a(Context context, q qVar) {
        return StringUtils.getCacheFileSuffix(context, qVar.a, qVar.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.appboy.storage.session_storage", (String) this.c.getValue()), SetsKt__SetsJVMKt.setOf(DataStoreKey.CURRENT_OPEN_SESSION_ID.getKey())), new SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.appboy.storage.session_storage", (String) this.c.getValue()), (RealGcmRegistrar$unregister$2) null, new df(d), 12)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.session_storage", (String) this.c.getValue());
    }
}
