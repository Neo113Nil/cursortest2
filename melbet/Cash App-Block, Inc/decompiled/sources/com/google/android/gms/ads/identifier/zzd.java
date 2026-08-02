package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.TelemetryLoggingOptions;
import com.google.android.gms.common.internal.service.zat;
import com.google.android.gms.common.internal.zzae;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class zzd {
    public static volatile zzd zza;
    public static final Object zzc = new Object();
    public final zat zzb;
    public final AtomicLong zzd = new AtomicLong(-1);

    public zzd(Context context) {
        this.zzb = zzae.getClient(context, new TelemetryLoggingOptions("ads_identifier:api"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r2 - r0.get()) > 1800000) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void zzb(long j, long j2, int i, int i2) {
        AtomicLong atomicLong = this.zzd;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j3 = atomicLong.get();
        StringBuilder sb = new StringBuilder(String.valueOf(j3).length() + 14);
        sb.append("shouldSendLog ");
        sb.append(j3);
        Log.i("AdvertisingIdClient", sb.toString());
        if (atomicLong.get() != -1) {
        }
        zat zatVar = this.zzb;
        if (zatVar == null) {
            return;
        }
        zatVar.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(35401, i, 0, j, j2, null, null, 0, i2)))).addOnFailureListener(new zzc(this, elapsedRealtime));
    }
}
