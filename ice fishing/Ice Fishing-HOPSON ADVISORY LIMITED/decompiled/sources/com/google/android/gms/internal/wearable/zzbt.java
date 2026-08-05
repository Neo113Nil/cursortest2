package com.google.android.gms.internal.wearable;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
public abstract class zzbt implements zzes {
    static {
        int i = zzcs.zzb;
        int i2 = zzbv.zza;
    }

    @Override // com.google.android.gms.internal.wearable.zzes
    public final /* synthetic */ Object zza(zzcg zzcgVar, zzcs zzcsVar) throws zzdv {
        zzfh zzfhVar;
        zzcj zzh = zzcgVar.zzh();
        zzel zzelVar = (zzel) zzb(zzh, zzcsVar);
        zzh.zzb(0);
        if (zzelVar == null || zzelVar.zzaf()) {
            return zzelVar;
        }
        if (zzelVar instanceof zzbr) {
            zzfhVar = new zzfh((zzbr) zzelVar);
        } else {
            if (zzelVar instanceof zzbs) {
                throw null;
            }
            zzfhVar = new zzfh(zzelVar);
        }
        throw zzfhVar.zza();
    }
}
