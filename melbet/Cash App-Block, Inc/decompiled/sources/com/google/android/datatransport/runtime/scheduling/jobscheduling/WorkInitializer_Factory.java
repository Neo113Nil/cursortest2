package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.google.android.datatransport.runtime.TransportRuntime_Factory;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class WorkInitializer_Factory implements Factory {
    public final Provider executorProvider;
    public final Provider guardProvider;
    public final TransportRuntime_Factory schedulerProvider;
    public final Provider storeProvider;

    public WorkInitializer_Factory(Provider provider, Provider provider2, TransportRuntime_Factory transportRuntime_Factory, Provider provider3) {
        this.executorProvider = provider;
        this.storeProvider = provider2;
        this.schedulerProvider = transportRuntime_Factory;
        this.guardProvider = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new n((Executor) this.executorProvider.get(), (SQLiteEventStore) this.storeProvider.get(), (SVG) this.schedulerProvider.get(), (SQLiteEventStore) this.guardProvider.get());
    }
}
