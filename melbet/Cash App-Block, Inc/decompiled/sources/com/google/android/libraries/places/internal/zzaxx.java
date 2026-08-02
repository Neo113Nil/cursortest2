package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaxx extends zzbjr {
    private static final zzaxx zzm;
    private static volatile zzblh zzn;
    private int zzb;
    private int zze;
    private int zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzaxx zzaxxVar = new zzaxx();
        zzm = zzaxxVar;
        zzbjr.zzbF(zzaxx.class, zzaxxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzaxx();
        }
        if (i2 == 4) {
            return new zzba(zzm);
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
        synchronized (zzaxx.class) {
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
