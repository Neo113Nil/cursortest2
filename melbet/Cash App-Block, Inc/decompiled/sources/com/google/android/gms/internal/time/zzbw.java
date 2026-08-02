package com.google.android.gms.internal.time;

import android.content.Context;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.service.zat;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes4.dex */
public final class zzbw {
    public final zat zza;
    public final AtomicLong zzb;

    public zzbw(Context context, int i) {
        switch (i) {
            case 1:
                this.zzb = new AtomicLong(-1L);
                this.zza = com.google.android.gms.common.internal.zzae.getClient(context, new TelemetryLoggingOptions("mlkit:vision"));
                break;
            default:
                this.zzb = new AtomicLong(-1L);
                this.zza = com.google.android.gms.common.internal.zzae.getClient(context, new TelemetryLoggingOptions("trusted_time"));
                break;
        }
    }
}
