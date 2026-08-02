package bo.app;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes.dex */
public final class t4 extends DataStoreProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t4(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsJVMKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), "persistent.com.braze.storage.delayed_initialization_cache", ArraysKt___ArraysKt.toSet(new String[]{DataStoreKey.DELAYED_INIT_ENABLED.getKey(), DataStoreKey.DELAYED_INIT_SET_DURING_RUNTIME_FLAG.getKey(), DataStoreKey.DELAYED_INIT_ANALYTICS_BEHAVIOR_FLAG.getKey()}))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.delayed_initialization";
    }
}
