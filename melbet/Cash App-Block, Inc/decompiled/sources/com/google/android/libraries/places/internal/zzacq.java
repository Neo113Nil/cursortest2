package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzacq extends zzbjr {
    private static final zzacq zzj;
    private static volatile zzblh zzk;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private zzacz zzi;

    static {
        zzacq zzacqVar = new zzacq();
        zzj = zzacqVar;
        zzbjr.zzbF(zzacq.class, zzacqVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004᠌\u0003\u0005ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzaa.zza$7, "zzi"});
        }
        if (i2 == 3) {
            return new zzacq();
        }
        if (i2 == 4) {
            return new zzac(13, zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzk;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzacq.class) {
            try {
                zzblhVar = zzk;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzj);
                    zzk = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
