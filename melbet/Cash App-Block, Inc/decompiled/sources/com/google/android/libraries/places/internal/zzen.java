package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzen extends zzbjr {
    private static final zzen zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;

    static {
        zzen zzenVar = new zzen();
        zzi = zzenVar;
        zzbjr.zzbF(zzen.class, zzenVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003", new Object[]{"zzb", "zze", zzf.zza$12, "zzf", zzf.zza$11, "zzg", zzf.zza$10, "zzh"});
        }
        if (i2 == 3) {
            return new zzen();
        }
        if (i2 == 4) {
            return new zze(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzj;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzen.class) {
            try {
                zzblhVar = zzj;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzi);
                    zzj = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
