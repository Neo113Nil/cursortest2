package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbgz extends zzbjr {
    private static final zzbgz zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private zzbnw zze;
    private int zzf;
    private zzbgx zzg;
    private int zzh;

    static {
        zzbgz zzbgzVar = new zzbgz();
        zzi = zzbgzVar;
        zzbjr.zzbF(zzbgz.class, zzbgzVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဉ\u0001\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbgz();
        }
        if (i2 == 4) {
            return new zzbh(zzi);
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
        synchronized (zzbgz.class) {
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
