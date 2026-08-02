package com.google.android.libraries.places.internal;

import com.google.common.base.Stopwatch;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public final class zzcdz implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzceb zza;

    public /* synthetic */ zzcdz(zzceb zzcebVar, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                Objects.requireNonNull(zzcebVar);
                this.zza = zzcebVar;
                break;
            default:
                Objects.requireNonNull(zzcebVar);
                this.zza = zzcebVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        long j;
        int i = this.$r8$classId;
        int i2 = 0;
        zzceb zzcebVar = this.zza;
        switch (i) {
            case 0:
                if (!zzcebVar.zzf) {
                    zzcebVar.zzg = null;
                    break;
                } else {
                    long j2 = zzcebVar.zze;
                    Stopwatch stopwatch = zzcebVar.zzd;
                    if (stopwatch.isRunning) {
                        stopwatch.ticker.getClass();
                        j = System.nanoTime() - stopwatch.startTick;
                    } else {
                        j = 0;
                    }
                    if (j2 - j <= 0) {
                        zzcebVar.zzf = false;
                        zzcebVar.zzg = null;
                        zzcebVar.zzc.run();
                        break;
                    } else {
                        zzcebVar.zzg = zzcebVar.zza.schedule(new zzcdz(zzcebVar, 1), zzcebVar.zze - j, TimeUnit.NANOSECONDS);
                        break;
                    }
                }
            default:
                zzcdz zzcdzVar = new zzcdz(zzcebVar, i2);
                zzbuf zzbufVar = (zzbuf) zzcebVar.zzb;
                zzbufVar.zzb(zzcdzVar);
                zzbufVar.zza();
                break;
        }
    }
}
