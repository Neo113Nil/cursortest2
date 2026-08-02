package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzadg extends zzbjr {
    private static final zzadg zzj;
    private static volatile zzblh zzk;
    private int zzb;
    private int zze;
    private zzadi zzf;
    private zzadq zzg;
    private zzadl zzh;
    private zzado zzi;

    static {
        zzadg zzadgVar = new zzadg();
        zzj = zzadgVar;
        zzbjr.zzbF(zzadg.class, zzadgVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004", new Object[]{"zzb", "zze", zzaa.zza$9, "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzadg();
        }
        if (i2 == 4) {
            return new zzac(20, zzj);
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
        synchronized (zzadg.class) {
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
