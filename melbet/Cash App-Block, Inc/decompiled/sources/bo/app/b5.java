package bo.app;

import android.content.Context;
import androidx.datastore.core.DataStore;
import androidx.datastore.preferences.SharedPreferencesMigrationKt;
import com.braze.enums.DataStoreKey;
import com.braze.storage.DataStoreProvider;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;

/* loaded from: classes3.dex */
public final class b5 extends DataStoreProvider {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b5(Context context) {
        super(context);
        context.getClass();
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return createOrGetDataStore(CollectionsKt__CollectionsJVMKt.listOf(SharedPreferencesMigrationKt.SharedPreferencesMigration(getContext(), "com.appboy.managers.device_data_provider", ArraysKt___ArraysKt.toSet(new String[]{DataStoreKey.GOOGLE_ADVERTISING_ID.getKey(), DataStoreKey.AD_TRACKING_ENABLED.getKey()}))));
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return "com.braze.device_data";
    }
}
