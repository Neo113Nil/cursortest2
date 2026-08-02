package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzagi extends zzbjr {
    private static final zzagi zzk;
    private static volatile zzblh zzl;
    private int zzb;
    private long zze;
    private zzbim zzf;
    private double zzg;
    private zzbim zzh;
    private double zzi;
    private zzbim zzj;

    static {
        zzagi zzagiVar = new zzagi();
        zzk = zzagiVar;
        zzbjr.zzbF(zzagi.class, zzagiVar);
    }

    public zzagi() {
        zzbil zzbilVar = zzbim.zza;
        this.zzf = zzbilVar;
        this.zzh = zzbilVar;
        this.zzj = zzbilVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003က\u0002\u0004ည\u0003\u0005က\u0004\u0006ည\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzagi();
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
        synchronized (zzagi.class) {
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
