package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaod extends zzbjr {
    private static final zzaod zzn;
    private static volatile zzblh zzo;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzapb zzi;
    private zzaol zzj;
    private zzaoz zzk;
    private int zzl;
    private int zzm;

    static {
        zzaod zzaodVar = new zzaod();
        zzn = zzaodVar;
        zzbjr.zzbF(zzaod.class, zzaodVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\b᠌\u0007\t᠌\b", new Object[]{"zzb", "zze", zzanz.zza$1, "zzf", zzanz.zza$3, "zzg", "zzh", zzanz.zza, "zzi", "zzj", "zzk", "zzl", zzai.zza$29, "zzm", zzanz.zza$2});
        }
        if (i2 == 3) {
            return new zzaod();
        }
        if (i2 == 4) {
            return new zzao(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzo;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaod.class) {
            try {
                zzblhVar = zzo;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzn);
                    zzo = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
