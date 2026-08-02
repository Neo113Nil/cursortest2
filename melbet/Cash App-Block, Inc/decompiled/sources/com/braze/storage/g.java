package com.braze.storage;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import bo.app.n7;
import com.braze.support.StringUtils;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes4.dex */
public final class g extends DataStoreProvider {
    public static final EventDuplicationValidatorDataStoreProvider$Companion d = new EventDuplicationValidatorDataStoreProvider$Companion(null);
    public final String a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = LazyKt.lazy(new a$$ExternalSyntheticLambda0(9, context, this));
    }

    public static final String a(Context context, g gVar) {
        return StringUtils.getCacheFileSuffix(context, gVar.a, gVar.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsJVMKt.listOf(new SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.appboy.storage.event_data_validator", (String) this.c.getValue()), (RealGcmRegistrar$unregister$2) null, new n7(d), 12)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.storage.event_data_validator", (String) this.c.getValue());
    }
}
