package bo.app;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes3.dex */
public final class uc extends DataStoreProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uc(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsJVMKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), "com.braze.push_registration", ArraysKt___ArraysKt.toSet(new String[]{DataStoreKey.PUSH_REGISTRATION_VERSION_CODE.getKey(), DataStoreKey.PUSH_REGISTRATION_PERSISTENT_DEVICE_ID.getKey(), DataStoreKey.PUSH_REGISTRATION_ID_KEY.getKey()}))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.push_storage";
    }
}
