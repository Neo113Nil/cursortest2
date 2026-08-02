package com.google.android.libraries.places.internal;

import java.util.List;

/* loaded from: classes4.dex */
public final class zzbhd extends zzbjr {
    private static final zzbhd zzf;
    private static volatile zzblh zzg;
    private zzbkb zzb = zzblk.zzb;
    private String zze = "";

    static {
        zzbhd zzbhdVar = new zzbhd();
        zzf = zzbhdVar;
        zzbjr.zzbF(zzbhd.class, zzbhdVar);
    }

    public final List zza() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002Ȉ", new Object[]{"zzb", zzbhc.class, "zze"});
        }
        if (i2 == 3) {
            return new zzbhd();
        }
        if (i2 == 4) {
            return new zzbh(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzg;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbhd.class) {
            try {
                zzblhVar = zzg;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzf);
                    zzg = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final String zzc() {
        return this.zze;
    }
}
