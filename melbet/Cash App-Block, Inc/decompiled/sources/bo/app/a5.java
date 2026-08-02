package bo.app;

import android.content.Context;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.datastore.core.DataStore;
import androidx.datastore.migrations.SharedPreferencesMigration;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;
import com.braze.support.StringUtils;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes3.dex */
public final class a5 extends DataStoreProvider {
    public static final /* synthetic */ int $r8$clinit = 0;
    public final String a;
    public final String b;
    public final Lazy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a5(Context context, String str, String str2) {
        super(context);
        context.getClass();
        this.a = str;
        this.b = str2;
        this.c = LazyKt.lazy(new h$$ExternalSyntheticLambda0(this, 1));
    }

    public static final String a(a5 a5Var) {
        return StringUtils.getCacheFileSuffix(a5Var.getContext(), a5Var.a, a5Var.b);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsKt.listOf((Object[]) new SharedPreferencesMigration[]{SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.appboy.storage.device_cache.v3", (String) this.c.getValue()), SetsKt__SetsJVMKt.setOf(DataStoreKey.CACHED_DEVICE.getKey())), SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), Recorder$$ExternalSyntheticOutline2.m("com.braze.storage.device_cache.metadata", (String) this.c.getValue()), ArraysKt___ArraysKt.toSet(new String[]{DataStoreKey.DEVICE_CACHE_SEND_FULL_ON_NEXT_EXPORT.getKey(), DataStoreKey.DEVICE_CACHE_LAST_OS_VERSION.getKey()}))}));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return Recorder$$ExternalSyntheticOutline2.m("com.braze.device_cache", (String) this.c.getValue());
    }
}
