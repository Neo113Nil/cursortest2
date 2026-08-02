package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbd extends zzbjr {
    private static final zzbd zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private zzdq zze;
    private zzan zzf;
    private zzbg zzg;

    static {
        zzbd zzbdVar = new zzbd();
        zzh = zzbdVar;
        zzbjr.zzbF(zzbd.class, zzbdVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0000", new Object[]{"zzb", "zzf", "zzg", "zze"});
        }
        if (i2 == 3) {
            return new zzbd();
        }
        if (i2 == 4) {
            return new zzba(zzh);
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
        synchronized (zzbd.class) {
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
