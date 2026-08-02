package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzs extends zzbjr {
    private static final zzs zzj;
    private static volatile zzblh zzk;
    private int zzb;
    private zzdh zze;
    private long zzf;
    private int zzg;
    private boolean zzh;
    private zzay zzi;

    static {
        zzs zzsVar = new zzs();
        zzj = zzsVar;
        zzbjr.zzbF(zzs.class, zzsVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", zzf.zza$17, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzs();
        }
        if (i2 == 4) {
            return new zze(zzj);
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
        synchronized (zzs.class) {
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
