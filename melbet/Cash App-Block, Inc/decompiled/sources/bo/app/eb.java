package bo.app;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.storage.DataStoreProvider;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes3.dex */
public final class eb extends DataStoreProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eb(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        Context applicationContext = getContext().getApplicationContext();
        applicationContext.getClass();
        return createOrGetDataStore(CollectionsKt__CollectionsJVMKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration(applicationContext, "com.appboy.offline.storagemap", SharedPreferencesMigrationKt.MIGRATE_ALL_KEYS)));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.offline.user_storage";
    }
}
