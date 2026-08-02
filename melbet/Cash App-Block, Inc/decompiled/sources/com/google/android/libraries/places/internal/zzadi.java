package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzadi extends zzbjr {
    private static final zzadi zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private zzbkb zze = zzblk.zzb;
    private int zzf;

    static {
        zzadi zzadiVar = new zzadi();
        zzg = zzadiVar;
        zzbjr.zzbF(zzadi.class, zzadiVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002င\u0000", new Object[]{"zzb", "zze", zzadd.class, "zzf"});
        }
        if (i2 == 3) {
            return new zzadi();
        }
        if (i2 == 4) {
            return new zzac(21, zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzh;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzadi.class) {
            try {
                zzblhVar = zzh;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzg);
                    zzh = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
