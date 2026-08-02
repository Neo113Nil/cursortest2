package com.google.android.gms.internal.time;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes4.dex */
public final class zzga extends zzef {
    public static final boolean zza;
    public static final boolean zzb;
    public static final boolean zzc;
    public static final AtomicReference zzd;
    public static final AtomicLong zze;
    public static final ConcurrentLinkedQueue zzf;
    public volatile zzef zzg;

    static {
        String str = Build.FINGERPRINT;
        zza = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        zzb = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        zzc = "eng".equals(str3) || "userdebug".equals(str3);
        zzd = new AtomicReference();
        zze = new AtomicLong();
        zzf = new ConcurrentLinkedQueue();
    }

    public static void zzf() {
        while (true) {
            zzfz zzfzVar = (zzfz) zzf.poll();
            if (zzfzVar == null) {
                return;
            }
            zze.getAndDecrement();
            zzga zzgaVar = zzfzVar.zza;
            zzd zzdVar = zzfzVar.zzb;
            zzde zzdeVar = zzdVar.zzd;
            if ((zzdeVar != null && Boolean.TRUE.equals(zzdeVar.zzc(zzdd.zzg))) || zzgaVar.zzc(zzdVar.zzb)) {
                zzgaVar.zzb(zzdVar);
            }
        }
    }

    @Override // com.google.android.gms.internal.time.zzef
    public final void zza(RuntimeException runtimeException, zzd zzdVar) {
        if (this.zzg != null) {
            this.zzg.zza(runtimeException, zzdVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }

    @Override // com.google.android.gms.internal.time.zzef
    public final void zzb(zzd zzdVar) {
        if (this.zzg != null) {
            this.zzg.zzb(zzdVar);
            return;
        }
        if (zze.incrementAndGet() > 20) {
            zzf.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        zzf.offer(new zzfz(this, zzdVar));
        if (this.zzg != null) {
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.time.zzef
    public final boolean zzc(Level level) {
        return this.zzg == null || this.zzg.zzc(level);
    }
}
