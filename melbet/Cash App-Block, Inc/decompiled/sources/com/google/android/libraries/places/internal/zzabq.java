package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzabq extends zzbjr {
    private static final zzabq zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private zzdq zze;
    private zzbkb zzf = zzblk.zzb;

    static {
        zzabq zzabqVar = new zzabq();
        zzg = zzabqVar;
        zzbjr.zzbF(zzabq.class, zzabqVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", zzabt.class});
        }
        if (i2 == 3) {
            return new zzabq();
        }
        if (i2 == 4) {
            return new zzac(4, zzg);
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
        synchronized (zzabq.class) {
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
