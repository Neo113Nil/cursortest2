package com.google.android.libraries.places.internal;

import bo.app.a$$ExternalSyntheticBUOutline0;
import java.util.Arrays;
import java.util.Optional;

/* loaded from: classes4.dex */
public final class zzfz implements zzboh {
    public final /* synthetic */ int $r8$classId;
    public final Object zza;

    public /* synthetic */ zzfz(Object obj, int i) {
        this.$r8$classId = i;
        this.zza = obj;
    }

    public static zzfz zza(Object obj) {
        if (obj != null) {
            return new zzfz(obj, 1);
        }
        a$$ExternalSyntheticBUOutline0.m$2("instance cannot be null");
        return null;
    }

    @Override // com.google.android.libraries.places.internal.zzcli
    public final Object zzb() {
        int i = this.$r8$classId;
        Object obj = this.zza;
        switch (i) {
            case 0:
                Optional optional = (Optional) ((zzbok) obj).zzb();
                zzchm zze = zzchm.zze("mapsmobilesdks-pa.googleapis.com");
                zze.zzl = 1;
                zzbsn zzbsnVar = new zzbsn();
                zzbsnVar.zzc(new zzbsh("X-Goog-Api-Key", zzbsn.zza), (String) optional.orElse("AIzaSyDgmW4ZMvNblSXqMOgsbY8uRrTnfR3E7pY"));
                zzayi[] zzayiVarArr = {new zzayi(zzbsnVar, 1)};
                zzccd zzccdVar = zze.zzd;
                zzccdVar.zzu.addAll(Arrays.asList(zzayiVarArr));
                return zze.zzd();
            default:
                return obj;
        }
    }
}
