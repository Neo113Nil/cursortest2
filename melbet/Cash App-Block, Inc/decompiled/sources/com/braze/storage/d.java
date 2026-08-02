package com.braze.storage;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes4.dex */
public final class d extends DataStoreProvider {
    public final String a;
    public final String b;
    public final Lazy c;

    static {
        new DustDataStoreProvider$Companion(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = LazyKt.lazy(new a$$ExternalSyntheticLambda0(8, context, this));
    }

    public static final String a(Context context, d dVar) {
        return StringUtils.getCacheFileSuffix(context, dVar.a, dVar.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsJVMKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.braze.managers.dust.metadata", (String) this.c.getValue()), SetsKt__SetsJVMKt.setOf(DataStoreKey.MITE_KEY.getKey()))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.dust", (String) this.c.getValue());
    }
}
