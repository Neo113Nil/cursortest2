package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import com.caverock.androidsvg.SVG;
import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.InstanceFactory;
import com.google.android.datatransport.runtime.scheduling.persistence.AutoValue_EventStoreConfig;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager;
import com.google.mlkit.vision.text.zzb;
import com.google.mlkit.vision.text.zzc;
import javax.inject.Provider;

/* loaded from: classes4.dex */
public final class MetadataBackendRegistry_Factory implements Factory {
    public final /* synthetic */ int $r8$classId;
    public final Provider applicationContextProvider;
    public final Provider creationContextFactoryProvider;

    public /* synthetic */ MetadataBackendRegistry_Factory(Provider provider, Provider provider2, int i) {
        this.$r8$classId = i;
        this.applicationContextProvider = provider;
        this.creationContextFactoryProvider = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        int i = this.$r8$classId;
        Provider provider = this.applicationContextProvider;
        switch (i) {
            case 0:
                return new MetadataBackendRegistry((Context) ((InstanceFactory) provider).instance, (SVG) ((InstanceFactory) this.creationContextFactoryProvider).get());
            default:
                return new SQLiteEventStore(new zzc(5), new zzb(5), AutoValue_EventStoreConfig.DEFAULT, (SchemaManager) provider.get(), this.creationContextFactoryProvider);
        }
    }
}
