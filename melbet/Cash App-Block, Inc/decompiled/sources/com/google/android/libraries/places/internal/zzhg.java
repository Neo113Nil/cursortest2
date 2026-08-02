package com.google.android.libraries.places.internal;

import com.fillr.e0;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.auth.zzd;
import com.google.android.libraries.places.api.net.zzi;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzhg implements Continuation {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ e0 zza;

    public /* synthetic */ zzhg(e0 e0Var, zznk zznkVar, zzgb zzgbVar, int i) {
        this.$r8$classId = i;
        this.zza = e0Var;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public final Object then(Task task) {
        int i = this.$r8$classId;
        zznj zznjVar = Places.zza;
        zzd zzdVar = zzd.zza;
        zzns zznsVar = zzns.zzc;
        e0 e0Var = this.zza;
        switch (i) {
            case 0:
                zbc zbcVar = (zbc) e0Var.i;
                zzauy zza = zzava.zza();
                zza.zzy();
                ((zzava) zza.zza).zzd(2);
                zzava zzavaVar = (zzava) zza.zzD();
                zzatp zzb = zzey.zzb((zznq) zbcVar.zbb, 2, zznsVar, zzdVar);
                zzb.zzp$2(5);
                zzb.zzy();
                ((zzatw) zzb.zza).zze(zzavaVar);
                zzb.zzj(zznjVar.zze());
                ((zbc) zbcVar.zba).zzb(zzb);
                "FetchPhoto".concat("Duration");
                "FetchPhoto".concat("Battery");
                return (com.google.android.libraries.places.api.net.zzc) task.getResult();
            default:
                zbc zbcVar2 = (zbc) e0Var.i;
                zzauy zza2 = zzava.zza();
                zza2.zzy();
                ((zzava) zza2.zza).zzd(2);
                zzava zzavaVar2 = (zzava) zza2.zzD();
                zzatp zzb2 = zzey.zzb((zznq) zbcVar2.zbb, 3, zznsVar, zzdVar);
                zzb2.zzp$2(5);
                zzb2.zzy();
                ((zzatw) zzb2.zza).zze(zzavaVar2);
                zzb2.zzj(zznjVar.zze());
                ((zbc) zbcVar2.zba).zzb(zzb2);
                "GetPhotoMedia".concat("Duration");
                "GetPhotoMedia".concat("Battery");
                return (zzi) task.getResult();
        }
    }
}
