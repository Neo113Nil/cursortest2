package com.google.android.gms.internal.wearable;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-wearable@@20.0.1 */
/* loaded from: classes.dex */
abstract class zzfi {
    private static volatile int zza = 100;

    zzfi() {
    }

    abstract void zza(Object obj, int i, long j);

    abstract void zzb(Object obj, int i, int i2);

    abstract void zzc(Object obj, int i, long j);

    abstract void zzd(Object obj, int i, zzcg zzcgVar);

    abstract void zze(Object obj, int i, Object obj2);

    abstract Object zzf();

    abstract Object zzg(Object obj);

    abstract Object zzh(Object obj);

    abstract void zzi(Object obj, Object obj2);

    abstract void zzj(Object obj);

    final boolean zzk(Object obj, zzex zzexVar, int i) throws IOException {
        int zzc = zzexVar.zzc();
        int i2 = zzc >>> 3;
        int i3 = zzc & 7;
        if (i3 == 0) {
            zza(obj, i2, zzexVar.zzg());
            return true;
        }
        if (i3 == 1) {
            zzc(obj, i2, zzexVar.zzi());
            return true;
        }
        if (i3 == 2) {
            zzd(obj, i2, zzexVar.zzp());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                if (i != 0) {
                    return false;
                }
                throw new zzdv("Protocol message end-group tag did not match expected tag.");
            }
            if (i3 != 5) {
                throw new zzdu("Protocol message tag had invalid wire type.");
            }
            zzb(obj, i2, zzexVar.zzj());
            return true;
        }
        Object zzf = zzf();
        int i4 = i2 << 3;
        int i5 = i + 1;
        if (i5 >= zza) {
            throw new zzdv("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
        }
        while (zzexVar.zzb() != Integer.MAX_VALUE && zzk(zzf, zzexVar, i5)) {
        }
        if ((i4 | 4) != zzexVar.zzc()) {
            throw new zzdv("Protocol message end-group tag did not match expected tag.");
        }
        zze(obj, i2, zzg(zzf));
        return true;
    }
}
