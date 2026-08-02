package com.google.android.libraries.places.internal;

import com.google.android.filament.Box;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzbzt implements Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzbtx zza;
    public final /* synthetic */ zzcah zzb;

    public /* synthetic */ zzbzt(zzcah zzcahVar, zzbtx zzbtxVar, int i) {
        this.$r8$classId = i;
        this.zza = zzbtxVar;
        this.zzb = zzcahVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                zzcah zzcahVar = this.zzb;
                zzbpq zzbpqVar = zzcahVar.zzw.zza;
                zzbpq zzbpqVar2 = zzbpq.zze;
                if (zzbpqVar != zzbpqVar2) {
                    zzbtx zzbtxVar = this.zza;
                    zzcahVar.zzx = zzbtxVar;
                    zzbzz zzbzzVar = zzcahVar.zzv;
                    zzcahVar.zzv = null;
                    zzcahVar.zzu = null;
                    zzcahVar.zzh(zzbpqVar2);
                    zzcahVar.zzm.zzd();
                    if (zzcahVar.zzs.isEmpty()) {
                        zzbzp zzbzpVar = new zzbzp(zzcahVar, 2);
                        zzbuf zzbufVar = zzcahVar.zzl;
                        zzbufVar.zzb(zzbzpVar);
                        zzbufVar.zza();
                    }
                    zzcahVar.zzl.zzc();
                    Box box = zzcahVar.zzp;
                    if (box != null) {
                        box.zza();
                        zzcahVar.zzp = null;
                        zzcahVar.zzB = null;
                    }
                    Box box2 = zzcahVar.zzq;
                    if (box2 != null) {
                        box2.zza();
                        zzcahVar.zzr.zzd(zzbtxVar);
                        zzcahVar.zzq = null;
                        zzcahVar.zzr = null;
                    }
                    if (zzbzzVar != null) {
                        zzbzzVar.zzd(zzbtxVar);
                    }
                    zzbzz zzbzzVar2 = zzcahVar.zzu;
                    if (zzbzzVar2 != null) {
                        zzbzzVar2.zzd(zzbtxVar);
                        break;
                    }
                }
                break;
            default:
                ArrayList arrayList = new ArrayList(this.zzb.zzs);
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((zzcck) arrayList.get(i)).zze(this.zza);
                }
                break;
        }
    }
}
