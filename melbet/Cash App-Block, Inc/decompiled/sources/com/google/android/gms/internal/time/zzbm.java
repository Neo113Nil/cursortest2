package com.google.android.gms.internal.time;

import android.os.SystemClock;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.service.zat;
import com.google.android.gms.time.TrustedTimeClient;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.internal.http1.HeadersReader;

/* loaded from: classes4.dex */
public final class zzbm implements TrustedTimeClient {
    public final zzbt zza;
    public final zzbw zzb;

    public zzbm(zzbt zzbtVar, zzbw zzbwVar) {
        this.zza = zzbtVar;
        this.zzb = zzbwVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        if ((r3 - r2.zzb.get()) > 1800000) goto L14;
     */
    @Override // com.google.android.gms.time.TrustedTimeClient
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Long computeCurrentUnixEpochMillis() {
        zzbt zzbtVar = this.zza;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long currentTimeMillis = System.currentTimeMillis();
        Long computeCurrentUnixEpochMillis = zzbtVar.computeCurrentUnixEpochMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
        int i = computeCurrentUnixEpochMillis != null ? 2 : 1;
        zzbw zzbwVar = this.zzb;
        int i2 = (int) elapsedRealtime2;
        synchronized (zzbwVar) {
            AtomicLong atomicLong = zzbwVar.zzb;
            long elapsedRealtime3 = SystemClock.elapsedRealtime();
            if (atomicLong.get() != -1) {
            }
            zat zatVar = zzbwVar.zza;
            if (zatVar == null) {
                return computeCurrentUnixEpochMillis;
            }
            zatVar.log(new TelemetryData(0, Arrays.asList(new MethodInvocation(29814, i, 0, currentTimeMillis, currentTimeMillis2, null, null, 0, i2)))).addOnFailureListener(new HeadersReader(zzbwVar, elapsedRealtime3, 10));
            return computeCurrentUnixEpochMillis;
        }
    }

    public final String toString() {
        return Boxes$$ExternalSyntheticOutline1.m("TelemetryTrustedTimeClientImpl{delegate=", String.valueOf(this.zza), ", trustedTimeTelemetryLogger=", String.valueOf(this.zzb), "}");
    }
}
