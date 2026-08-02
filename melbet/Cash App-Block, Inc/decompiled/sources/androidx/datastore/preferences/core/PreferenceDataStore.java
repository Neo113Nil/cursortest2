package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes.dex */
public final class PreferenceDataStore implements DataStore {
    public final DataStore delegate;

    public PreferenceDataStore(DataStore dataStore) {
        this.delegate = dataStore;
    }

    @Override // androidx.datastore.core.DataStore
    public final Flow getData() {
        return this.delegate.getData();
    }

    @Override // androidx.datastore.core.DataStore
    public final Object updateData(Function2 function2, ContinuationImpl continuationImpl) {
        return this.delegate.updateData(new PreferencesKt$edit$2(function2, null, 1), continuationImpl);
    }
}
