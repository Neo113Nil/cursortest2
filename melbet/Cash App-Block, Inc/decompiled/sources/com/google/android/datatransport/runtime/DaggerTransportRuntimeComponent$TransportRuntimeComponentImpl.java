package com.google.android.datatransport.runtime;

import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory;
import java.io.Closeable;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class DaggerTransportRuntimeComponent$TransportRuntimeComponentImpl implements Closeable {
    public Provider executorProvider;
    public Provider metadataBackendRegistryProvider;
    public Provider sQLiteEventStoreProvider;
    public SchemaManager_Factory schemaManagerProvider;
    public InstanceFactory setApplicationContextProvider;
    public Provider transportRuntimeProvider;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ((SQLiteEventStore) this.sQLiteEventStoreProvider.get()).close();
    }
}
