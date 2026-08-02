package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbzo extends zzbzl {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzbqz zza;

    public /* synthetic */ zzbzo(zzbqz zzbqzVar, int i) {
        this.$r8$classId = i;
        this.zza = zzbqzVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbzl
    public final void zzd() {
        int i = this.$r8$classId;
        zzbqz zzbqzVar = this.zza;
        switch (i) {
            case 0:
                zzcah zzcahVar = (zzcah) zzbqzVar;
                zzcahVar.zzd.zzb.zzj.zzf.zza(zzcahVar, true);
                break;
            case 1:
                ((zzcby) zzbqzVar).zze();
                break;
            default:
                ((zzchy) zzbqzVar).zzp.zzc(true);
                break;
        }
    }

    @Override // com.google.android.libraries.places.internal.zzbzl
    public final void zze() {
        int i = this.$r8$classId;
        zzbqz zzbqzVar = this.zza;
        switch (i) {
            case 0:
                zzcah zzcahVar = (zzcah) zzbqzVar;
                zzcahVar.zzd.zzb.zzj.zzf.zza(zzcahVar, false);
                break;
            case 1:
                zzcby zzcbyVar = (zzcby) zzbqzVar;
                if (!zzcbyVar.zzM.get()) {
                    zzcbyVar.zzap();
                    break;
                }
                break;
            default:
                ((zzchy) zzbqzVar).zzp.zzc(false);
                break;
        }
    }
}
