package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzamd extends zzbjr {
    private static final zzamd zzs;
    private static volatile zzblh zzt;
    private int zzb;
    private long zze;
    private zzals zzf;
    private zzals zzg;
    private zzamm zzh;
    private zzaly zzi;
    private zzali zzj;
    private zzamp zzk;
    private zzamr zzl;
    private zzamf zzm;
    private zzale zzn;
    private zzalk zzo;
    private zzamb zzp;
    private zzamh zzq;
    private zzamj zzr;

    static {
        zzamd zzamdVar = new zzamd();
        zzs = zzamdVar;
        zzbjr.zzbF(zzamd.class, zzamdVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new zzamd();
        }
        if (i2 == 4) {
            return new zzao(zzs);
        }
        if (i2 == 5) {
            return zzs;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzt;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzamd.class) {
            try {
                zzblhVar = zzt;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzs);
                    zzt = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
