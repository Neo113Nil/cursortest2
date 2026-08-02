package com.google.android.gms.measurement.internal;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes4.dex */
public final class zzka implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzlj zzb;

    public zzka(zzlj zzljVar, long j, int i) {
        this.$r8$classId = i;
        switch (i) {
            case 1:
                this.zza = j;
                this.zzb = zzljVar;
                break;
            default:
                this.zza = j;
                Objects.requireNonNull(zzljVar);
                this.zzb = zzljVar;
                break;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.$r8$classId;
        long j = this.zza;
        zzlj zzljVar = this.zzb;
        switch (i) {
            case 0:
                zzic zzicVar = (zzic) zzljVar.$$delegate_0;
                zzhh zzhhVar = zzicVar.zzh;
                zzic.zzN(zzhhVar);
                zzhhVar.zzf.zzb(j);
                zzgu zzguVar = zzicVar.zzi;
                zzic.zzP(zzguVar);
                zzguVar.zzk.zzb(Long.valueOf(j), "Session timeout duration set");
                break;
            default:
                zzljVar.zzg();
                zzljVar.zzb$1();
                zzic zzicVar2 = (zzic) zzljVar.$$delegate_0;
                zzgu zzguVar2 = zzicVar2.zzi;
                zzic.zzP(zzguVar2);
                zzguVar2.zzk.zza("Resetting analytics data (FE)");
                zzoc zzocVar = zzicVar2.zzk;
                zzic.zzO(zzocVar);
                zzocVar.zzg();
                zzoa zzoaVar = zzocVar.zzb;
                zzoaVar.zzd.zzd();
                ((zzic) zzoaVar.zzc.$$delegate_0).zzn.getClass();
                long elapsedRealtime = SystemClock.elapsedRealtime();
                zzoaVar.zza = elapsedRealtime;
                zzoaVar.zzb = elapsedRealtime;
                zzicVar2.zzv().zzi$1();
                boolean z = !zzicVar2.zzB();
                zzhh zzhhVar2 = zzicVar2.zzh;
                zzic.zzN(zzhhVar2);
                zzhhVar2.zzc.zzb(j);
                zzic zzicVar3 = (zzic) zzhhVar2.$$delegate_0;
                zzhh zzhhVar3 = zzicVar3.zzh;
                zzic.zzN(zzhhVar3);
                if (!TextUtils.isEmpty(zzhhVar3.zzq.zza())) {
                    zzhhVar2.zzq.zzb(null);
                }
                zzhhVar2.zzk.zzb(0L);
                zzhhVar2.zzl.zzb(0L);
                if (!zzicVar3.zzg.zzt()) {
                    zzhhVar2.zzm(z);
                }
                zzhhVar2.zzr.zzb(null);
                zzhhVar2.zzs.zzb(0L);
                zzhhVar2.zzt.zzb(null);
                zznl zzt = zzicVar2.zzt();
                zzt.zzg();
                zzt.zzb$1();
                zzr zzah = zzt.zzah(false);
                zzt.zzad$1();
                ((zzic) zzt.$$delegate_0).zzm().zzh();
                zzt.zzaf(new zzmh(zzt, zzah, 0));
                zzic.zzO(zzocVar);
                zzocVar.zza.zza();
                zzljVar.zzc = z;
                zzicVar2.zzt().zzC(new AtomicReference());
                break;
        }
    }
}
