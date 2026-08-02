package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaed extends zzbjr {
    private static final zzaed zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private int zze;
    private long zzf;
    private long zzg;

    static {
        zzaed zzaedVar = new zzaed();
        zzh = zzaedVar;
        zzbjr.zzbF(zzaed.class, zzaedVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဃ\u0001\u0003ဃ\u0002", new Object[]{"zzb", "zze", zzaa.zza$15, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzaed();
        }
        if (i2 == 4) {
            return new zzag(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzi;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaed.class) {
            try {
                zzblhVar = zzi;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzh);
                    zzi = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
