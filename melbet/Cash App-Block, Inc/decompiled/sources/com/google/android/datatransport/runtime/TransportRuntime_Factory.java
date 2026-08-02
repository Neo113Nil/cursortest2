package com.google.android.datatransport.runtime;

import android.content.Context;
import com.caverock.androidsvg.SVG;
import com.fillr.n;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler;
import com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AutoValue_SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.gms.maps.zzai;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzc;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class TransportRuntime_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Factory initializerProvider;
    public final Provider schedulerProvider;
    public final Provider uploaderProvider;

    public /* synthetic */ TransportRuntime_Factory(Provider provider, Provider provider2, Factory factory, int i) {
        this.$r8$classId = i;
        this.schedulerProvider = provider;
        this.uploaderProvider = provider2;
        this.initializerProvider = factory;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Factory factory = this.initializerProvider;
        Provider provider = this.uploaderProvider;
        Provider provider2 = this.schedulerProvider;
        switch (i) {
            case 0:
                return new TransportRuntime(new zzc(5), new zzb(5), (DefaultScheduler) ((DefaultScheduler_Factory) provider2).get(), (zzai) ((Uploader_Factory) provider).get(), (n) ((WorkInitializer_Factory) factory).get());
            default:
                return new SVG((Context) provider2.get(), (SQLiteEventStore) provider.get(), (AutoValue_SchedulerConfig) ((ExecutionModule_ExecutorFactory) factory).get(), false, 27);
        }
    }
}
