package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaee extends zzbjr {
    private static final zzaee zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private int zze;
    private zzaed zzf;

    static {
        zzaee zzaeeVar = new zzaee();
        zzg = zzaeeVar;
        zzbjr.zzbF(zzaee.class, zzaeeVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", zzaa.zza$14, "zzf"});
        }
        if (i2 == 3) {
            return new zzaee();
        }
        if (i2 == 4) {
            return new zzac(28, zzg);
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
        synchronized (zzaee.class) {
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
