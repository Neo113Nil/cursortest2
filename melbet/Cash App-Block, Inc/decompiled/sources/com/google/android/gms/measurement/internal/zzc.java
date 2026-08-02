package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import androidx.work.impl.WorkLauncherImpl;
import coil3.memory.MemoryCacheService;
import com.google.android.gms.common.util.DefaultClock;
import java.util.Objects;

/* loaded from: classes.dex */
public final class zzc implements Runnable {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzf zzb;

    public zzc(zzd zzdVar, long j) {
        this.zza = j;
        Objects.requireNonNull(zzdVar);
        this.zzb = zzdVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r3.zzn.zza() != false) goto L15;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int i = this.$r8$classId;
        long j = this.zza;
        zzf zzfVar = this.zzb;
        switch (i) {
            case 0:
                ((zzd) zzfVar).zzj(j);
                break;
            default:
                zzoc zzocVar = (zzoc) zzfVar;
                zzoa zzoaVar = zzocVar.zzb;
                zzocVar.zzg();
                zzocVar.zzn$1();
                zzic zzicVar = (zzic) zzocVar.$$delegate_0;
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzl.zzb(Long.valueOf(j), "Activity resumed, time");
                zzal zzalVar = zzicVar.zzg;
                if (!zzalVar.zzp(null, zzfy.zzaS)) {
                    if (!zzalVar.zzv()) {
                        zzhh zzhhVar = zzicVar.zzh;
                        zzic.zzN(zzhhVar);
                        break;
                    }
                    zzoaVar.zzc.zzg();
                    zzoaVar.zzd.zzd();
                    zzoaVar.zza = j;
                    zzoaVar.zzb = j;
                } else if (zzalVar.zzv() || zzocVar.zze) {
                    zzoaVar.zzc.zzg();
                    zzoaVar.zzd.zzd();
                    zzoaVar.zza = j;
                    zzoaVar.zzb = j;
                }
                WorkLauncherImpl workLauncherImpl = zzocVar.zzc;
                zzoc zzocVar2 = (zzoc) workLauncherImpl.workTaskExecutor;
                zzocVar2.zzg();
                zznx zznxVar = (zznx) workLauncherImpl.processor;
                if (zznxVar != null) {
                    zzocVar2.zzd.removeCallbacks(zznxVar);
                }
                zzhh zzhhVar2 = ((zzic) zzocVar2.$$delegate_0).zzh;
                zzic.zzN(zzhhVar2);
                zzhhVar2.zzn.zzb(false);
                zzocVar2.zzg();
                zzocVar2.zze = false;
                MemoryCacheService memoryCacheService = zzocVar.zza;
                zzoc zzocVar3 = (zzoc) memoryCacheService.imageLoader;
                zzocVar3.zzg();
                zzic zzicVar2 = (zzic) zzocVar3.$$delegate_0;
                boolean zzB = zzicVar2.zzB();
                DefaultClock defaultClock = zzicVar2.zzn;
                if (zzB) {
                    defaultClock.getClass();
                    memoryCacheService.zzb(System.currentTimeMillis(), zzicVar2.zzg.zzp(null, zzfy.zzbe) ? SystemClock.elapsedRealtime() : 0L);
                    break;
                }
                break;
        }
    }

    public zzc(zzoc zzocVar, long j) {
        this.zza = j;
        Objects.requireNonNull(zzocVar);
        this.zzb = zzocVar;
    }
}
