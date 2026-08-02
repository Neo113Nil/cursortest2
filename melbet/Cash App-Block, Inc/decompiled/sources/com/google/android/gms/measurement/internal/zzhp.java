package com.google.android.gms.measurement.internal;

import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.internal.measurement.zzn;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: classes4.dex */
public final /* synthetic */ class zzhp implements Callable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ zzht zza;
    public final /* synthetic */ String zzb;

    public /* synthetic */ zzhp(zzht zzhtVar, String str, int i) {
        this.$r8$classId = i;
        this.zza = zzhtVar;
        this.zzb = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.$r8$classId;
        String str = this.zzb;
        zzht zzhtVar = this.zza;
        switch (i) {
            case 0:
                return new com.google.android.gms.internal.measurement.zzk(new zzhp(zzhtVar, str, 1));
            case 1:
                zzaw zzawVar = zzhtVar.zzg.zze;
                zzpg.zzaT(zzawVar);
                zzh zzu = zzawVar.zzu(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                ((zzic) zzhtVar.$$delegate_0).zzg.zzi();
                hashMap.put("gmp_version", 161000L);
                if (zzu != null) {
                    String zzr = zzu.zzr();
                    if (zzr != null) {
                        hashMap.put("app_version", zzr);
                    }
                    hashMap.put("app_version_int", Long.valueOf(zzu.zzt()));
                    hashMap.put("dynamite_version", Long.valueOf(zzu.zzB()));
                }
                return hashMap;
            default:
                zbc zbcVar = new zbc((Object) zzhtVar, (Object) str, false, 15);
                zzn zznVar = new zzn("internal.remoteConfig", 0);
                zznVar.zze.put("getValue", new com.google.android.gms.internal.measurement.zzk(zznVar, zbcVar));
                return zznVar;
        }
    }
}
