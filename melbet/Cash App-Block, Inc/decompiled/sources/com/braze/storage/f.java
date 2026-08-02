package com.braze.storage;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import bo.app.g7;
import bo.app.h7;
import bo.app.n$$ExternalSyntheticLambda1;
import com.braze.support.StringUtils;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes4.dex */
public final class f extends DataStoreProvider {
    public static final g7 b = new g7();
    public final Lazy a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context, String str, String str2) {
        super(context);
        context.getClass();
        this.a = LazyKt.lazy(new n$$ExternalSyntheticLambda1(26, context, str, str2));
    }

    public static final String a(Context context, String str, String str2) {
        return StringUtils.getCacheFileSuffix(context, str, str2);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsJVMKt.listOf(new SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.appboy.storage.appboy_event_storage", (String) this.a.getValue()), (RealGcmRegistrar$unregister$2) null, new h7(), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.events", (String) this.a.getValue());
    }
}
