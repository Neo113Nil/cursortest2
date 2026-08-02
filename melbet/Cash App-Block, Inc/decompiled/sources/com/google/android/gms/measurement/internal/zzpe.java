package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.zzae;

/* loaded from: classes4.dex */
public final class zzpe {
    public final zzpg zza;
    public int zzb = 1;
    public long zzc = zzd();

    public zzpe(zzpg zzpgVar) {
        this.zza = zzpgVar;
    }

    public final boolean zzb() {
        this.zza.zzba().getClass();
        return System.currentTimeMillis() >= this.zzc;
    }

    public final long zzd() {
        zzpg zzpgVar = this.zza;
        zzae.checkNotNull(zzpgVar);
        long longValue = ((Long) zzfy.zzu.zzb(null)).longValue();
        long longValue2 = ((Long) zzfy.zzv.zzb(null)).longValue();
        for (int i = 1; i < this.zzb; i++) {
            longValue += longValue;
            if (longValue >= longValue2) {
                break;
            }
        }
        zzpgVar.zzba().getClass();
        return Math.min(longValue, longValue2) + System.currentTimeMillis();
    }
}
