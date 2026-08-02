package bo.app;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.SetsKt__SetsJVMKt;

/* loaded from: classes3.dex */
public final class ge extends DataStoreProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ge(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        Context applicationContext = getContext().getApplicationContext();
        applicationContext.getClass();
        return createOrGetDataStore(CollectionsKt__CollectionsJVMKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration(applicationContext, "persistent.com.appboy.storage.sdk_enabled_cache", SetsKt__SetsJVMKt.setOf(DataStoreKey.SDK_ENABLEMENT.getKey()))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.sdk_enablement";
    }
}
