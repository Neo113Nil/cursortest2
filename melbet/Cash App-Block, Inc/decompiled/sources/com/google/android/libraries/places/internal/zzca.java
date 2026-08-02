package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzca extends zzbjr {
    private static final zzca zzm;
    private static volatile zzblh zzn;
    private int zzb;
    private zzdh zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;

    static {
        zzca zzcaVar = new zzca();
        zzm = zzcaVar;
        zzbjr.zzbF(zzca.class, zzcaVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006ဇ\u0005\u0007င\u0007\bင\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzl", "zzk"});
        }
        if (i2 == 3) {
            return new zzca();
        }
        if (i2 == 4) {
            return new zzbk(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzn;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzca.class) {
            try {
                zzblhVar = zzn;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzm);
                    zzn = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
