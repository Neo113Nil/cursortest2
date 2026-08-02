package com.google.android.gms.measurement.internal;

import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final class zzij implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ String zzc;
    public final /* synthetic */ zzjd zzd;

    public /* synthetic */ zzij(zzjd zzjdVar, String str, String str2, String str3, int i) {
        this.$r8$classId = i;
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzjdVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.$r8$classId;
        String str = this.zzc;
        String str2 = this.zzb;
        String str3 = this.zza;
        zzjd zzjdVar = this.zzd;
        switch (i) {
            case 0:
                zzjdVar.zza.zzaa$1();
                zzaw zzawVar = zzjdVar.zza.zze;
                zzpg.zzaT(zzawVar);
                return zzawVar.zzo(str3, str2, str);
            case 1:
                zzjdVar.zza.zzaa$1();
                zzaw zzawVar2 = zzjdVar.zza.zze;
                zzpg.zzaT(zzawVar2);
                return zzawVar2.zzo(str3, str2, str);
            case 2:
                zzjdVar.zza.zzaa$1();
                zzaw zzawVar3 = zzjdVar.zza.zze;
                zzpg.zzaT(zzawVar3);
                return zzawVar3.zzs(str3, str2, str);
            default:
                zzjdVar.zza.zzaa$1();
                zzaw zzawVar4 = zzjdVar.zza.zze;
                zzpg.zzaT(zzawVar4);
                return zzawVar4.zzs(str3, str2, str);
        }
    }
}
