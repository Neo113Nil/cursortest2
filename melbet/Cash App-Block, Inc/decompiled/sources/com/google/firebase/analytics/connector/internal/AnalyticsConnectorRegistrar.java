package com.google.firebase.analytics.connector.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.tracing.Trace;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.measurement.zzez;
import com.google.android.gms.tasks.zzt;
import com.google.firebase.FirebaseApp;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.analytics.connector.AnalyticsConnectorImpl;
import com.google.firebase.analytics.connector.zza;
import com.google.firebase.components.Component;
import com.google.firebase.components.ComponentContainer;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.components.Dependency;
import com.google.firebase.components.EventBus;
import com.google.firebase.events.Subscriber;
import com.google.firebase.internal.DataCollectionConfigStorage;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes.dex */
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static AnalyticsConnector lambda$getComponents$0(ComponentContainer componentContainer) {
        boolean z;
        FirebaseApp firebaseApp = (FirebaseApp) componentContainer.get(FirebaseApp.class);
        Context context = (Context) componentContainer.get(Context.class);
        Subscriber subscriber = (Subscriber) componentContainer.get(Subscriber.class);
        zzae.checkNotNull(firebaseApp);
        zzae.checkNotNull(context);
        zzae.checkNotNull(subscriber);
        zzae.checkNotNull(context.getApplicationContext());
        if (AnalyticsConnectorImpl.zzc == null) {
            synchronized (AnalyticsConnectorImpl.class) {
                if (AnalyticsConnectorImpl.zzc == null) {
                    Bundle bundle = new Bundle(1);
                    firebaseApp.checkNotDeleted();
                    if ("[DEFAULT]".equals(firebaseApp.name)) {
                        ((EventBus) subscriber).subscribe(zzt.zza, zza.zza);
                        firebaseApp.checkNotDeleted();
                        DataCollectionConfigStorage dataCollectionConfigStorage = (DataCollectionConfigStorage) firebaseApp.dataCollectionConfigStorage.get();
                        synchronized (dataCollectionConfigStorage) {
                            z = dataCollectionConfigStorage.dataCollectionDefaultEnabled;
                        }
                        bundle.putBoolean("dataCollectionDefaultEnabled", z);
                    }
                    AnalyticsConnectorImpl.zzc = new AnalyticsConnectorImpl(zzez.zza(context, bundle).zze);
                }
            }
        }
        return AnalyticsConnectorImpl.zzc;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<Component> getComponents() {
        Component.Builder builder = Component.builder(AnalyticsConnector.class);
        builder.add(Dependency.required(FirebaseApp.class));
        builder.add(Dependency.required(Context.class));
        builder.add(Dependency.required(Subscriber.class));
        builder.factory = com.google.mlkit.common.internal.zza.zza$6;
        if (builder.instantiation == 0) {
            builder.instantiation = 2;
            return Arrays.asList(builder.build(), Trace.create("fire-analytics", "23.2.0"));
        }
        a$$ExternalSyntheticBUOutline0.m$1("Instantiation type has already been set.");
        return null;
    }
}
