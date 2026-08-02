package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaep extends zzbjr {
    private static final zzaep zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private float zzh;

    static {
        zzaep zzaepVar = new zzaep();
        zzi = zzaepVar;
        zzbjr.zzbF(zzaep.class, zzaepVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzi, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0004င\u0002\u0005ခ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzaep();
        }
        if (i2 == 4) {
            return new zzag(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzj;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaep.class) {
            try {
                zzblhVar = zzj;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzi);
                    zzj = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
