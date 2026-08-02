package com.google.android.libraries.places.internal;

import androidx.tracing.Trace;
import com.google.common.collect.ImmutableList;

/* loaded from: classes4.dex */
public final class zzcac implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzcaf zza;

    public /* synthetic */ zzcac(zzcaf zzcafVar, int i) {
        this.$r8$classId = i;
        this.zza = zzcafVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                zzcaf zzcafVar = this.zza;
                zzcah zzcahVar = (zzcah) zzcafVar.zzc;
                zzcahVar.zzB = null;
                if (zzcahVar.zzx == null) {
                    zzbzz zzbzzVar = (zzbzz) zzcafVar.zza;
                    if (zzcahVar.zzu == zzbzzVar) {
                        zzcahVar.zzv = zzbzzVar;
                        zzcahVar.zzu = null;
                        zzcahVar.zzm.zzf();
                        zzcahVar.zzh(zzbpq.zzb);
                        String zzg = zzcaf.zzg(zzcahVar.zzm.zzf(), zzbtf.zza);
                        String zzg2 = zzcaf.zzg(zzcahVar.zzm.zzf(), zzbqd.zzb);
                        String zzf = zzcaf.zzf((zzbtq) zzcahVar.zzm.zzf().zzb.get(zzjn.zza));
                        String str = zzcahVar.zzA;
                        zzfv zzfvVar = zzcahVar.zzz.zze;
                        zzfvVar.zza(zzcgl.zzb, ImmutableList.of((Object) str), ImmutableList.of((Object) zzg, (Object) zzg2));
                        zzfvVar.zzb(zzcgl.zzd, ImmutableList.of((Object) str), ImmutableList.of((Object) zzf, (Object) zzg, (Object) zzg2));
                        break;
                    }
                } else {
                    Trace.checkState("Unexpected non-null activeTransport", zzcahVar.zzv == null);
                    ((zzbzz) zzcafVar.zza).zzd(zzcahVar.zzx);
                    break;
                }
                break;
            default:
                zzcaf zzcafVar2 = this.zza;
                zzcah zzcahVar2 = (zzcah) zzcafVar2.zzc;
                zzcahVar2.zzs.remove((zzbzz) zzcafVar2.zza);
                if (zzcahVar2.zzw.zza == zzbpq.zze && zzcahVar2.zzs.isEmpty()) {
                    zzbzp zzbzpVar = new zzbzp(zzcahVar2, 2);
                    zzbuf zzbufVar = zzcahVar2.zzl;
                    zzbufVar.zzb(zzbzpVar);
                    zzbufVar.zza();
                    break;
                }
                break;
        }
    }
}
