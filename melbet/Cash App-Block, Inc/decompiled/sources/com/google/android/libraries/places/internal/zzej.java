package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzej extends zzbjr {
    private static final zzej zzm;
    private static volatile zzblh zzn;
    private int zzb;
    private float zze;
    private float zzf;
    private float zzg;
    private float zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzej zzejVar = new zzej();
        zzm = zzejVar;
        zzbjr.zzbF(zzej.class, zzejVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007᠌\u0006\bင\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzf.zza$12, "zzj", zzf.zza$11, "zzk", zzf.zza$10, "zzl"});
        }
        if (i2 == 3) {
            return new zzej();
        }
        if (i2 == 4) {
            return new zze(zzm);
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
        synchronized (zzej.class) {
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
