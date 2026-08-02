package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcc extends zzbjr {
    private static final zzcc zzk;
    private static volatile zzblh zzl;
    private int zzb;
    private float zze;
    private int zzf;
    private int zzg;
    private long zzh;
    private long zzi;
    private long zzj;

    static {
        zzcc zzccVar = new zzcc();
        zzk = zzccVar;
        zzbjr.zzbF(zzcc.class, zzccVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzk, "\u0001\u0006\u0000\u0001\u0002\b\u0006\u0000\u0000\u0000\u0002ခ\u0000\u0003င\u0001\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\bင\u0002", new Object[]{"zzb", "zze", "zzf", "zzh", "zzi", "zzj", "zzg"});
        }
        if (i2 == 3) {
            return new zzcc();
        }
        if (i2 == 4) {
            return new zzbk(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzl;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzcc.class) {
            try {
                zzblhVar = zzl;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzk);
                    zzl = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
