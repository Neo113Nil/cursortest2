package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzahe extends zzbjr {
    private static final zzahe zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzahe zzaheVar = new zzahe();
        zzg = zzaheVar;
        zzbjr.zzbF(zzahe.class, zzaheVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", zzaa.zza$27, "zzf", zzaa.zza$28});
        }
        if (i2 == 3) {
            return new zzahe();
        }
        if (i2 == 4) {
            return new zzaj(zzg);
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
        synchronized (zzahe.class) {
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
