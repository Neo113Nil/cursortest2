package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcx extends zzbjr {
    private static final zzcx zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private int zze = 0;
    private Object zzf;
    private zzcc zzg;

    static {
        zzcx zzcxVar = new zzcx();
        zzh = zzcxVar;
        zzbjr.zzbF(zzcx.class, zzcxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzb", "zzg", zzcu.class, zzcw.class});
        }
        if (i2 == 3) {
            return new zzcx();
        }
        if (i2 == 4) {
            return new zzbk(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzi;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzcx.class) {
            try {
                zzblhVar = zzi;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzh);
                    zzi = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
