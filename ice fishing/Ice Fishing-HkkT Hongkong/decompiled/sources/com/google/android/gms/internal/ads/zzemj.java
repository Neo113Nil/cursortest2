package com.google.android.gms.internal.ads;

import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-ads@@23.0.0 */
/* loaded from: classes2.dex */
public final class zzemj {
    private final zzfhz zza;
    private final zzdtx zzb;
    private final zzdwf zzc;
    private final zzflw zzd;

    public zzemj(zzfhz zzfhzVar, zzdtx zzdtxVar, zzdwf zzdwfVar, zzflw zzflwVar) {
        this.zza = zzfhzVar;
        this.zzb = zzdtxVar;
        this.zzc = zzdwfVar;
        this.zzd = zzflwVar;
    }

    public final void zza(zzfgp zzfgpVar, zzfgm zzfgmVar, int i, @Nullable zzeir zzeirVar, long j) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzba.zzc().zza(zzbgc.zziz)).booleanValue()) {
            zzflv zzb = zzflv.zzb("adapter_status");
            zzb.zzg(zzfgpVar);
            zzb.zzf(zzfgmVar);
            zzb.zza("adapter_l", String.valueOf(j));
            zzb.zza("sc", Integer.toString(i));
            if (zzeirVar != null) {
                zzb.zza("arec", Integer.toString(zzeirVar.zzb().zza));
                String zza = this.zza.zza(zzeirVar.getMessage());
                if (zza != null) {
                    zzb.zza("areec", zza);
                }
            }
            zzdtw zzb2 = this.zzb.zzb(zzfgmVar.zzu);
            if (zzb2 != null) {
                zzb.zza("ancn", zzb2.zza);
                zzbvg zzbvgVar = zzb2.zzb;
                if (zzbvgVar != null) {
                    zzb.zza("adapter_v", zzbvgVar.toString());
                }
                zzbvg zzbvgVar2 = zzb2.zzc;
                if (zzbvgVar2 != null) {
                    zzb.zza("adapter_sv", zzbvgVar2.toString());
                }
            }
            this.zzd.zzb(zzb);
            return;
        }
        zzdwe zza2 = this.zzc.zza();
        zza2.zze(zzfgpVar);
        zza2.zzd(zzfgmVar);
        zza2.zzb("action", "adapter_status");
        zza2.zzb("adapter_l", String.valueOf(j));
        zza2.zzb("sc", Integer.toString(i));
        if (zzeirVar != null) {
            zza2.zzb("arec", Integer.toString(zzeirVar.zzb().zza));
            String zza3 = this.zza.zza(zzeirVar.getMessage());
            if (zza3 != null) {
                zza2.zzb("areec", zza3);
            }
        }
        zzdtw zzb3 = this.zzb.zzb(zzfgmVar.zzu);
        if (zzb3 != null) {
            zza2.zzb("ancn", zzb3.zza);
            zzbvg zzbvgVar3 = zzb3.zzb;
            if (zzbvgVar3 != null) {
                zza2.zzb("adapter_v", zzbvgVar3.toString());
            }
            zzbvg zzbvgVar4 = zzb3.zzc;
            if (zzbvgVar4 != null) {
                zza2.zzb("adapter_sv", zzbvgVar4.toString());
            }
        }
        zza2.zzg();
    }
}
