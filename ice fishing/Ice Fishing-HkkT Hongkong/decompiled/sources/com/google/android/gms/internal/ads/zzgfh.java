package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
final class zzgfh implements Runnable {

    @CheckForNull
    zzgfk zza;

    zzgfh(zzgfk zzgfkVar) {
        this.zza = zzgfkVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
    
        r2 = r1.zza;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        ListenableFuture listenableFuture;
        ScheduledFuture scheduledFuture;
        zzgfk zzgfkVar = this.zza;
        if (zzgfkVar == null || listenableFuture == null) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isDone()) {
            zzgfkVar.zzs(listenableFuture);
            return;
        }
        try {
            scheduledFuture = zzgfkVar.zzb;
            zzgfkVar.zzb = null;
            String str = "Timed out";
            if (scheduledFuture != null) {
                try {
                    long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (abs > 10) {
                        str = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                    }
                } catch (Throwable th) {
                    zzgfkVar.zzd(new zzgfj(str, null));
                    throw th;
                }
            }
            zzgfkVar.zzd(new zzgfj(str + ": " + listenableFuture.toString(), null));
        } finally {
            listenableFuture.cancel(true);
        }
    }
}
