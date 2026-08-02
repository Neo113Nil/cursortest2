package com.google.android.gms.internal.mlkit_vision_face;

import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.service.zat;
import com.google.android.gms.common.internal.zzae;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.internal.http1.HeadersReader;

/* loaded from: classes4.dex */
public final class zzoe {
    public final zat zza;
    public final AtomicLong zzb;

    public zzoe(Context context, int i) {
        switch (i) {
            case 1:
                this.zzb = new AtomicLong(-1L);
                this.zza = zzae.getClient(context, new TelemetryLoggingOptions("mlkit:vision"));
                break;
            default:
                this.zzb = new AtomicLong(-1L);
                this.zza = zzae.getClient(context, new TelemetryLoggingOptions("mlkit:vision"));
                break;
        }
    }

    public synchronized void zzc(long j, long j2, int i, int i2) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.zzb.get() != -1 && elapsedRealtime - this.zzb.get() <= 1800000) {
            return;
        }
        this.zza.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(i, i2, 0, j, j2, null, null, 0, -1)))).addOnFailureListener(new HeadersReader(this, elapsedRealtime, 8));
    }
}
