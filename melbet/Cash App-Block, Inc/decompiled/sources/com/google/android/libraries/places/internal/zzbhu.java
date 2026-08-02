package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbhu extends zzbjr {
    private static final zzbhu zzk;
    private static volatile zzblh zzl;
    private int zzb;
    private zzbgo zze;
    private int zzf;
    private zzbiz zzg;
    private zzbiz zzh;
    private zzbiz zzi;
    private int zzj;

    static {
        zzbhu zzbhuVar = new zzbhu();
        zzk = zzbhuVar;
        zzbjr.zzbF(zzbhu.class, zzbhuVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဉ\u0003\u0004ဉ\u0004\u0005င\u0005\u0006ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzh", "zzi", "zzj", "zzg"});
        }
        if (i2 == 3) {
            return new zzbhu();
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
        synchronized (zzbhu.class) {
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
