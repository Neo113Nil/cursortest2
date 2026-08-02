package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.caverock.androidsvg.SVG;
import com.google.android.datatransport.runtime.TransportRuntime_Factory;
import com.google.android.datatransport.runtime.backends.MetadataBackendRegistry;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.gms.maps.zzai;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzc;
import java.util.concurrent.Executor;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class Uploader_Factory implements Factory {
    public final Provider backendRegistryProvider;
    public final Provider clientHealthMetricsStoreProvider;
    public final Provider contextProvider;
    public final Provider eventStoreProvider;
    public final Provider executorProvider;
    public final Provider guardProvider;
    public final TransportRuntime_Factory workSchedulerProvider;

    public Uploader_Factory(Provider provider, Provider provider2, Provider provider3, TransportRuntime_Factory transportRuntime_Factory, Provider provider4, Provider provider5, Provider provider6) {
        this.contextProvider = provider;
        this.backendRegistryProvider = provider2;
        this.eventStoreProvider = provider3;
        this.workSchedulerProvider = transportRuntime_Factory;
        this.executorProvider = provider4;
        this.guardProvider = provider5;
        this.clientHealthMetricsStoreProvider = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Context context = (Context) this.contextProvider.get();
        MetadataBackendRegistry metadataBackendRegistry = (MetadataBackendRegistry) this.backendRegistryProvider.get();
        SQLiteEventStore sQLiteEventStore = (SQLiteEventStore) this.eventStoreProvider.get();
        SVG svg = (SVG) this.workSchedulerProvider.get();
        Executor executor = (Executor) this.executorProvider.get();
        SQLiteEventStore sQLiteEventStore2 = (SQLiteEventStore) this.guardProvider.get();
        zzc zzcVar = new zzc(5);
        zzb zzbVar = new zzb(5);
        SQLiteEventStore sQLiteEventStore3 = (SQLiteEventStore) this.clientHealthMetricsStoreProvider.get();
        zzai zzaiVar = new zzai();
        zzaiVar.zzc = context;
        zzaiVar.zaa = metadataBackendRegistry;
        zzaiVar.zab = sQLiteEventStore;
        zzaiVar.zac = svg;
        zzaiVar.zad = executor;
        zzaiVar.zza = sQLiteEventStore2;
        zzaiVar.zzb = zzcVar;
        zzaiVar.zzd = zzbVar;
        zzaiVar.zze = sQLiteEventStore3;
        return zzaiVar;
    }
}
