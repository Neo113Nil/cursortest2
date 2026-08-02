package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaux extends zzbjr {
    private static final zzaux zzf;
    private static volatile zzblh zzg;
    private int zzb;
    private int zze;

    static {
        zzaux zzauxVar = new zzaux();
        zzf = zzauxVar;
        zzbjr.zzbF(zzaux.class, zzauxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzaux();
        }
        if (i2 == 4) {
            return new zzaw(zzf);
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
        synchronized (zzaux.class) {
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
}
