package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzayb extends zzbjr {
    private static final zzayb zzl;
    private static volatile zzblh zzm;
    private int zzb;
    private boolean zze;
    private long zzf;
    private long zzg;
    private float zzh;
    private long zzi;
    private long zzj;
    private int zzk;

    static {
        zzayb zzaybVar = new zzayb();
        zzl = zzaybVar;
        zzbjr.zzbF(zzayb.class, zzaybVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007င\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzayb();
        }
        if (i2 == 4) {
            return new zzba(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzm;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzayb.class) {
            try {
                zzblhVar = zzm;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzl);
                    zzm = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
