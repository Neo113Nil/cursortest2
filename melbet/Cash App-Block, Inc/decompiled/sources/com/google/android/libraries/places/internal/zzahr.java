package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzahr extends zzbjr {
    private static final zzahr zzb;
    private static volatile zzblh zze;

    static {
        zzahr zzahrVar = new zzahr();
        zzb = zzahrVar;
        zzbjr.zzbF(zzahr.class, zzahrVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzb, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new zzahr();
        }
        if (i2 == 4) {
            return new zzaj(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zze;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzahr.class) {
            try {
                zzblhVar = zze;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzb);
                    zze = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
