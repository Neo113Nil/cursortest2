package com.braze.storage;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import bo.app.c8;
import bo.app.d8;
import com.braze.enums.DataStoreKey;
import com.braze.support.StringUtils;
import com.squareup.cash.ui.gcm.RealGcmRegistrar$unregister$2;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes4.dex */
public final class h extends DataStoreProvider {
    public static final FeatureFlagsDataStoreProvider$Companion d = new FeatureFlagsDataStoreProvider$Companion(null);
    public final String a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(Context context, String str, String str2) {
        super(context);
        context.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = LazyKt.lazy(new a$$ExternalSyntheticLambda0(10, context, this));
    }

    public static final String a(Context context, h hVar) {
        return StringUtils.getCacheFileSuffix(context, hVar.a, hVar.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        SharedPreferencesMigration SharedPreferencesMigration = SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.braze.managers.featureflags.eligibility", (String) this.c.getValue()), SetsKt__SetsJVMKt.setOf(DataStoreKey.LAST_REFRESH_IN_SECONDS.getKey()));
        Context context = getContext();
        String m = Recorder$$ExternalSyntheticOutline2.m("com.braze.managers.featureflags.storage", (String) this.c.getValue());
        FeatureFlagsDataStoreProvider$Companion featureFlagsDataStoreProvider$Companion = d;
        return createOrGetDataStore(CollectionsKt__CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigration, new SharedPreferencesMigration(context, m, (RealGcmRegistrar$unregister$2) null, new c8(featureFlagsDataStoreProvider$Companion), 12), new SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.braze.managers.featureflags.impressions", (String) this.c.getValue()), (RealGcmRegistrar$unregister$2) null, new d8(featureFlagsDataStoreProvider$Companion), 12)}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.featureflags.", (String) this.c.getValue());
    }
}
