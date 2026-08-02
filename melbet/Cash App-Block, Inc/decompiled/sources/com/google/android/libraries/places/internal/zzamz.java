package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzamz extends zzbjr {
    private static final zzamz zzf;
    private static volatile zzblh zzg;
    private int zzb = 0;
    private Object zze;

    static {
        zzamz zzamzVar = new zzamz();
        zzf = zzamzVar;
        zzbjr.zzbF(zzamz.class, zzamzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzf, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001<\u0000", new Object[]{"zze", "zzb", zzaht.class});
        }
        if (i2 == 3) {
            return new zzamz();
        }
        if (i2 == 4) {
            return new zzao(zzf);
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
        synchronized (zzamz.class) {
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
