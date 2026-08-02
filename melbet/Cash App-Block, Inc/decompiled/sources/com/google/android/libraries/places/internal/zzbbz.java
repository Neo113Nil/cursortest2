package com.google.android.libraries.places.internal;

import java.util.List;

/* loaded from: classes4.dex */
public final class zzbbz extends zzbjr {
    private static final zzbbz zzf;
    private static volatile zzblh zzg;
    private zzbkb zzb;
    private zzbkb zze;

    static {
        zzbbz zzbbzVar = new zzbbz();
        zzf = zzbbzVar;
        zzbjr.zzbF(zzbbz.class, zzbbzVar);
    }

    public zzbbz() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzb = zzblkVar;
        this.zze = zzblkVar;
    }

    public static zzbbz zzd() {
        return zzf;
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
            return new zzbll(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"zzb", zzbby.class, "zze", zzbbv.class});
        }
        if (i2 == 3) {
            return new zzbbz();
        }
        if (i2 == 4) {
            return new zzba(zzf);
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
        synchronized (zzbbz.class) {
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

    public final zzbkb zzc() {
        return this.zze;
    }
}
