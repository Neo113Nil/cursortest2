package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzbzp implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzcah zza;

    public zzbzp(zzcah zzcahVar) {
        this.$r8$classId = 0;
        Objects.requireNonNull(zzcahVar);
        this.zza = zzcahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                zzcah zzcahVar = this.zza;
                zzcahVar.zzp = null;
                zzcahVar.zzi.zza(2, "CONNECTING after backoff");
                zzcahVar.zzh(zzbpq.zza);
                zzcahVar.zzf();
                break;
            case 1:
                zzcah zzcahVar2 = this.zza;
                if (zzcahVar2.zzw.zza == zzbpq.zzd) {
                    zzcahVar2.zzi.zza(2, "CONNECTING as requested");
                    zzcahVar2.zzh(zzbpq.zza);
                    zzcahVar2.zzf();
                    break;
                }
                break;
            default:
                zzcah zzcahVar3 = this.zza;
                zzcahVar3.zzi.zza(2, "Terminated");
                zzcby zzcbyVar = zzcahVar3.zzd.zzb.zzj;
                zzcbyVar.zzH.remove(zzcahVar3);
                zzcbyVar.zzq();
                break;
        }
    }

    public /* synthetic */ zzbzp(zzcah zzcahVar, int i) {
        this.$r8$classId = i;
        this.zza = zzcahVar;
    }
}
