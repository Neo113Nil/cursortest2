package com.google.android.gms.internal.measurement;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.common.base.Function;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzqp implements Function {
    public static final /* synthetic */ zzqp zza = new zzqp(0);
    public static final /* synthetic */ zzqp zza$1 = new zzqp(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzqp(int i) {
        this.$r8$classId = i;
    }

    @Override // com.google.common.base.Function
    public final Object apply(Object obj) {
        switch (this.$r8$classId) {
            case 0:
                zzmg zzmgVar = (zzmg) obj;
                zzqu zzh = zzqv.zzh();
                if (zzmgVar == null) {
                    return (zzqv) zzh.zzbd();
                }
                for (zzmi zzmiVar : zzmgVar.zze()) {
                    zzqw zzh2 = zzqx.zzh();
                    String zza2 = zzmiVar.zza();
                    zzh2.zzaY();
                    ((zzqx) zzh2.zza).zzi(zza2);
                    int zzq = zzmiVar.zzq();
                    int i = zzq - 1;
                    if (zzq == 0) {
                        throw null;
                    }
                    if (i == 0) {
                        long zzb = zzmiVar.zzb();
                        zzh2.zzaY();
                        ((zzqx) zzh2.zza).zzj(zzb);
                    } else if (i == 1) {
                        boolean zzc = zzmiVar.zzc();
                        zzh2.zzaY();
                        ((zzqx) zzh2.zza).zzk(zzc);
                    } else if (i == 2) {
                        double zzd = zzmiVar.zzd();
                        zzh2.zzaY();
                        ((zzqx) zzh2.zza).zzl(zzd);
                    } else if (i == 3) {
                        String zze = zzmiVar.zze();
                        zzh2.zzaY();
                        ((zzqx) zzh2.zza).zzm$1(zze);
                    } else {
                        if (i != 4) {
                            a$$ExternalSyntheticBUOutline0.m$1("No known flag type");
                            return null;
                        }
                        zzacr zzf = zzmiVar.zzf();
                        zzh2.zzaY();
                        ((zzqx) zzh2.zza).zzn(zzf);
                    }
                    zzqx zzqxVar = (zzqx) zzh2.zzbd();
                    zzh.zzaY();
                    ((zzqv) zzh.zza).zzn(zzqxVar);
                }
                String zzd2 = zzmgVar.zzd();
                zzh.zzaY();
                ((zzqv) zzh.zza).zzl$1(zzd2);
                String zza3 = zzmgVar.zza();
                zzh.zzaY();
                ((zzqv) zzh.zza).zzj$1(zza3);
                long zzf2 = zzmgVar.zzf();
                zzh.zzaY();
                ((zzqv) zzh.zza).zzm(zzf2);
                if (zzmgVar.zzb()) {
                    zzacr zzc2 = zzmgVar.zzc();
                    zzh.zzaY();
                    ((zzqv) zzh.zza).zzk(zzc2);
                }
                return (zzqv) zzh.zzbd();
            default:
                zzmk zzmkVar = (zzmk) obj;
                if (zzmkVar.zza != 29514) {
                    throw zzmkVar;
                }
                zznn zzd3 = zzno.zzd();
                zznh zzo = zzni.zzo();
                long currentTimeMillis = System.currentTimeMillis();
                zzo.zzaY();
                ((zzni) zzo.zza).zzq$1(currentTimeMillis);
                zzd3.zzaY();
                ((zzno) zzd3.zza).zze((zzni) zzo.zzbd());
                return (zzno) zzd3.zzbd();
        }
    }
}
