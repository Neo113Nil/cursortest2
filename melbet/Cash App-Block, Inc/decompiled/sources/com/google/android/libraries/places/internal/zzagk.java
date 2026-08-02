package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzagk extends zzbjr {
    private static final zzagk zze;
    private static volatile zzblh zzf;
    private zzbkb zzb = zzblk.zzb;

    static {
        zzagk zzagkVar = new zzagk();
        zze = zzagkVar;
        zzbjr.zzbF(zzagk.class, zzagkVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzagi.class});
        }
        if (i2 == 3) {
            return new zzagk();
        }
        if (i2 == 4) {
            return new zzag(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzf;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzagk.class) {
            try {
                zzblhVar = zzf;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zze);
                    zzf = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
