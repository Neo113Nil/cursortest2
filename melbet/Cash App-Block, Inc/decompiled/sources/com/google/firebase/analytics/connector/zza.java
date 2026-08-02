package com.google.firebase.analytics.connector;

import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.internal.measurement.zzeh;
import com.google.android.gms.internal.measurement.zzez;
import com.google.firebase.DataCollectionDefaultChange;
import com.google.firebase.events.Event;
import com.google.firebase.events.EventHandler;

/* loaded from: classes.dex */
public final /* synthetic */ class zza implements EventHandler {
    public static final /* synthetic */ zza zza = new zza();

    @Override // com.google.firebase.events.EventHandler
    public final void handle(Event event) {
        boolean z = ((DataCollectionDefaultChange) event.getPayload()).enabled;
        synchronized (AnalyticsConnectorImpl.class) {
            AnalyticsConnectorImpl analyticsConnectorImpl = AnalyticsConnectorImpl.zzc;
            zzae.checkNotNull(analyticsConnectorImpl);
            zzez zzezVar = analyticsConnectorImpl.zza.zza;
            zzezVar.zzV(new zzeh(zzezVar, z));
        }
    }
}
