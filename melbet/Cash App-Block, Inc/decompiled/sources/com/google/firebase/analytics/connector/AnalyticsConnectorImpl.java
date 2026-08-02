package com.google.firebase.analytics.connector;

import android.os.Bundle;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.connector.internal.zzc;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class AnalyticsConnectorImpl implements AnalyticsConnector {
    public static volatile AnalyticsConnectorImpl zzc;
    public final AppMeasurementSdk zza;

    public AnalyticsConnectorImpl(AppMeasurementSdk appMeasurementSdk) {
        zzae.checkNotNull(appMeasurementSdk);
        this.zza = appMeasurementSdk;
        new ConcurrentHashMap();
    }

    public final void logEvent(Bundle bundle, String str) {
        if (zzc.zza() && zzc.zzb(bundle, str) && zzc.zze(bundle, str)) {
            this.zza.logEvent("fcm", str, bundle);
        }
    }
}
