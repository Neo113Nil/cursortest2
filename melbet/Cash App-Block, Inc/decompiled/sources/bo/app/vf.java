package bo.app;

import android.content.Context;
import androidx.datastore.core.DataStore;
import com.braze.storage.DataStoreProvider;

/* loaded from: classes3.dex */
public final class vf extends DataStoreProvider {
    public final String a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vf(Context context, String str) {
        super(context);
        context.getClass();
        str.getClass();
        this.a = str;
    }

    @Override // com.braze.storage.DataStoreProvider
    public final DataStore getDataStore() {
        return DataStoreProvider.createOrGetDataStore$default(this, null, 1, null);
    }

    @Override // com.braze.storage.DataStoreProvider
    public final String getDataStoreFileName() {
        return this.a;
    }
}
