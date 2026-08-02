package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaoj extends zzbjr {
    private static final zzaoj zzm;
    private static volatile zzblh zzn;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;

    static {
        zzaoj zzaojVar = new zzaoj();
        zzm = zzaojVar;
        zzbjr.zzbF(zzaoj.class, zzaojVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006ဇ\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzanz.zza$5, "zzl", zzanz.zza$4});
        }
        if (i2 == 3) {
            return new zzaoj();
        }
        if (i2 == 4) {
            return new zzao(zzm);
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
        synchronized (zzaoj.class) {
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
