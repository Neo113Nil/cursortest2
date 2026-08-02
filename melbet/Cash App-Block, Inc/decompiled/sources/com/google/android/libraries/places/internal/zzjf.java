package com.google.android.libraries.places.internal;

import com.google.android.libraries.places.api.model.zzcy;
import com.google.android.libraries.places.api.model.zzem;
import com.google.common.collect.ImmutableSet;
import java.util.function.Function;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzjf implements Function {
    public static final /* synthetic */ zzjf zza = new zzjf(1);
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ zzjf(int i) {
        this.$r8$classId = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i;
        int i2 = this.$r8$classId;
        zzabg zzabgVar = zzabg.zza;
        switch (i2) {
            case 0:
                zzbbv zzbbvVar = (zzbbv) obj;
                String zzk = zzjm.zzk(zzbbvVar.zza());
                String zzk2 = zzjm.zzk(zzbbvVar.zzc());
                String zzk3 = zzjm.zzk(zzbbvVar.zzd().zzc());
                String zzk4 = zzjm.zzk(zzbbvVar.zzd().zze());
                int zzf = zzbbvVar.zzf() - 2;
                return new zzcy(zzk, zzf != 1 ? zzf != 2 ? zzf != 3 ? 1 : 4 : 3 : 2, zzk2, zzk3, zzk4);
            case 1:
                String str = (String) obj;
                return str.substring(str.lastIndexOf("places/") + 7);
            case 2:
                zzbcb zzbcbVar = (zzbcb) obj;
                String zzc = zzbcbVar.zzc();
                if (zzc.startsWith("//")) {
                    zzc = "https:".concat(zzc);
                }
                String zza2 = zzbcbVar.zza();
                zzabe zzabeVar = new zzabe();
                ImmutableSet immutableSet = zzabh.zzb;
                zzabeVar.zza(zzabh.zza(zzc, zzabgVar));
                zzabeVar.zzb(zza2);
                return zzabeVar.zzc().zza;
            case 3:
                zzbex zzbexVar = (zzbex) obj;
                String zzc2 = zzbexVar.zzc();
                if (zzc2.startsWith("//")) {
                    zzc2 = "https:".concat(zzc2);
                }
                String zza3 = zzbexVar.zza();
                zzabe zzabeVar2 = new zzabe();
                ImmutableSet immutableSet2 = zzabh.zzb;
                zzabeVar2.zza(zzabh.zza(zzc2, zzabgVar));
                zzabeVar2.zzb(zza3);
                return zzabeVar2.zzc().zza;
            default:
                zzbby zzbbyVar = (zzbby) obj;
                Float valueOf = zzbbyVar.zzf() ? Float.valueOf(zzbbyVar.zzg()) : null;
                float zze = zzbbyVar.zze();
                String zzk5 = zzjm.zzk(zzbbyVar.zza());
                String zzk6 = zzjm.zzk(zzbbyVar.zzc());
                String zzk7 = zzjm.zzk(zzbbyVar.zzd().zzc());
                String zzk8 = zzjm.zzk(zzbbyVar.zzd().zze());
                int zzi = zzbbyVar.zzi() - 2;
                if (zzi == 0) {
                    i = 1;
                } else if (zzi == 1) {
                    i = 2;
                } else if (zzi == 2) {
                    i = 3;
                } else if (zzi == 3) {
                    i = 4;
                } else if (zzi != 4) {
                    i = zzi == 5 ? 6 : 7;
                } else {
                    i = 5;
                }
                return new zzem(zzk5, zzk6, zzk7, zzk8, null, i, Double.valueOf(zze), valueOf == null ? null : Double.valueOf(valueOf.doubleValue()));
        }
    }
}
