package com.google.android.gms.internal.measurement;

import android.os.Build;
import android.util.Log;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;

/* loaded from: classes.dex */
public final class zzaao extends zzaag {
    public static final boolean zza;
    public static final boolean zzb;
    public static final boolean zzc;
    public static final AtomicReference zzd;
    public static final AtomicLong zzf;
    public static final ConcurrentLinkedQueue zzg;
    public volatile zzaag zze;

    static {
        String str = Build.FINGERPRINT;
        zza = str == null || "robolectric".equals(str);
        String str2 = Build.HARDWARE;
        zzb = "goldfish".equals(str2) || "ranchu".equals(str2);
        String str3 = Build.TYPE;
        zzc = "eng".equals(str3) || "userdebug".equals(str3);
        zzd = new AtomicReference();
        zzf = new AtomicLong();
        zzg = new ConcurrentLinkedQueue();
    }

    public static void zzf() {
        while (true) {
            zzaan zzaanVar = (zzaan) zzg.poll();
            if (zzaanVar == null) {
                return;
            }
            zzf.getAndDecrement();
            zzaag zza2 = zzaanVar.zza();
            zzxq zzb2 = zzaanVar.zzb();
            zzxy zzxyVar = zzb2.zzd;
            if ((zzxyVar != null && Boolean.TRUE.equals(zzxyVar.zzd(zzxx.zzg))) || zza2.zzb(zzb2.zzb)) {
                zza2.zzc(zzb2);
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaag
    public final boolean zzb(Level level) {
        return this.zze == null || this.zze.zzb(level);
    }

    @Override // com.google.android.gms.internal.measurement.zzaag
    public final void zzc(zzxq zzxqVar) {
        if (this.zze != null) {
            this.zze.zzc(zzxqVar);
            return;
        }
        if (zzf.incrementAndGet() > 20) {
            zzg.poll();
            Log.w("ProxyAndroidLoggerBackend", "Too many Flogger logs received before configuration. Dropping old logs.");
        }
        zzg.offer(new zzaan(this, zzxqVar));
        if (this.zze != null) {
            zzf();
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzaag
    public final void zzd(RuntimeException runtimeException, zzxq zzxqVar) {
        if (this.zze != null) {
            this.zze.zzd(runtimeException, zzxqVar);
        } else {
            Log.e("ProxyAndroidLoggerBackend", "Internal logging error before configuration", runtimeException);
        }
    }
}
