package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzafv extends zzbjr {
    private static final zzafv zzk;
    private static volatile zzblh zzl;
    private int zzb;
    private double zze;
    private long zzf;
    private zzbim zzg;
    private zzbim zzh;
    private int zzi;
    private long zzj;

    static {
        zzafv zzafvVar = new zzafv();
        zzk = zzafvVar;
        zzbjr.zzbF(zzafv.class, zzafvVar);
    }

    public zzafv() {
        zzbil zzbilVar = zzbim.zza;
        this.zzg = zzbilVar;
        this.zzh = zzbilVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001က\u0000\u0002ဂ\u0001\u0003ည\u0002\u0004ည\u0003\u0005᠌\u0004\u0006ဂ\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzaa.zza$24, "zzj"});
        }
        if (i2 == 3) {
            return new zzafv();
        }
        if (i2 == 4) {
            return new zzag(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzl;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzafv.class) {
            try {
                zzblhVar = zzl;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzk);
                    zzl = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
