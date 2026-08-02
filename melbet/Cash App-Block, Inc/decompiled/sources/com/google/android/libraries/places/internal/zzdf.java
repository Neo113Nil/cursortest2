package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzdf extends zzbjr {
    private static final zzdf zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private int zze = 0;
    private Object zzf;
    private zzcc zzg;

    static {
        zzdf zzdfVar = new zzdf();
        zzh = zzdfVar;
        zzbjr.zzbF(zzdf.class, zzdfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"zzf", "zze", "zzb", "zzg", zzdc.class, zzde.class});
        }
        if (i2 == 3) {
            return new zzdf();
        }
        if (i2 == 4) {
            return new zze(zzh);
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
        synchronized (zzdf.class) {
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
