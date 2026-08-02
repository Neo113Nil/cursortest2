package com.braze.storage;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import bo.app.cc;
import com.braze.support.StringUtils;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes4.dex */
public final class j extends DataStoreProvider {
    public static final PushDeliveryDataStoreProvider$Companion c = new PushDeliveryDataStoreProvider$Companion(null);
    public final String a;
    public final Lazy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.a = str;
        this.b = LazyKt.lazy(new a$$ExternalSyntheticLambda0(11, context, this));
    }

    public static final String a(Context context, j jVar) {
        return StringUtils.getCacheFileSuffix(context, null, jVar.a);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsJVMKt.listOf(new SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.braze.storage.braze_push_delivery_storage", (String) this.b.getValue()), (RealGcmRegistrar$unregister$2) null, new cc(c), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.push_delivery.", this.a);
    }
}
