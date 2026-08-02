package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcz extends zzbjr {
    private static final zzcz zze;
    private static volatile zzblh zzf;
    private zzbkb zzb = zzblk.zzb;

    static {
        zzcz zzczVar = new zzcz();
        zze = zzczVar;
        zzbjr.zzbF(zzcz.class, zzczVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", zzdf.class});
        }
        if (i2 == 3) {
            return new zzcz();
        }
        if (i2 == 4) {
            return new zze(zze);
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
        synchronized (zzcz.class) {
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
