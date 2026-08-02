package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbw extends zzbjr {
    private static final zzbw zzk;
    private static volatile zzblh zzl;
    private int zzb;
    private int zze = 1;
    private zzby zzf;
    private zzbr zzg;
    private zzdq zzh;
    private zzbt zzi;
    private zzca zzj;

    static {
        zzbw zzbwVar = new zzbw();
        zzk = zzbwVar;
        zzbjr.zzbF(zzbw.class, zzbwVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005", new Object[]{"zzb", "zze", zzc.zza$29, "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzbw();
        }
        if (i2 == 4) {
            return new zzbk(zzk);
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
        synchronized (zzbw.class) {
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
