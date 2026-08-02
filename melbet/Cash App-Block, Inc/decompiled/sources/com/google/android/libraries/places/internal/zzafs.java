package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzafs extends zzbjr {
    private static final zzafs zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private int zze;
    private zzael zzf;
    private long zzg;

    static {
        zzafs zzafsVar = new zzafs();
        zzh = zzafsVar;
        zzbjr.zzbF(zzafs.class, zzafsVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဂ\u0002", new Object[]{"zzb", "zze", zzaa.zza$23, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzafs();
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
        synchronized (zzafs.class) {
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
