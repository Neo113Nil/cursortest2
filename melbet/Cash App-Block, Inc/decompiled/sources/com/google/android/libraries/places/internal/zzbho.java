package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbho extends zzbjr {
    private static final zzbho zzg;
    private static volatile zzblh zzh;
    private double zzb;
    private zzbjz zze = zzbjs.zzb;
    private zzbkb zzf = zzblk.zzb;

    static {
        zzbho zzbhoVar = new zzbho();
        zzg = zzbhoVar;
        zzbjr.zzbF(zzbho.class, zzbhoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0000\u0002,\u0003Ț", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbho();
        }
        if (i2 == 4) {
            return new zzbh(zzg);
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
        synchronized (zzbho.class) {
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
