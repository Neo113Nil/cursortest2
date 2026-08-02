package com.google.android.datatransport.runtime.scheduling;

import com.caverock.androidsvg.SVG;
import com.google.android.datatransport.runtime.TransportRuntime_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class DefaultScheduler_Factory implements Factory {
    public final Provider backendRegistryProvider;
    public final Provider eventStoreProvider;
    public final Provider executorProvider;
    public final Provider guardProvider;
    public final TransportRuntime_Factory workSchedulerProvider;

    public DefaultScheduler_Factory(Provider provider, Provider provider2, TransportRuntime_Factory transportRuntime_Factory, Provider provider3, Provider provider4) {
        this.executorProvider = provider;
        this.backendRegistryProvider = provider2;
        this.workSchedulerProvider = transportRuntime_Factory;
        this.eventStoreProvider = provider3;
        this.guardProvider = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new DefaultScheduler((Executor) this.executorProvider.get(), (MetadataBackendRegistry) this.backendRegistryProvider.get(), (SVG) this.workSchedulerProvider.get(), (SQLiteEventStore) this.eventStoreProvider.get(), (SQLiteEventStore) this.guardProvider.get());
    }
}
