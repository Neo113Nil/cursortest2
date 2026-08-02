package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzagr extends zzbjr {
    private static final zzagr zzx;
    private static volatile zzblh zzy;
    private int zzb;
    private long zze;
    private boolean zzf;
    private long zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private long zzr;
    private long zzs;
    private long zzt;
    private int zzu;
    private zzabo zzv;
    private zzabo zzw;

    static {
        zzagr zzagrVar = new zzagr();
        zzx = zzagrVar;
        zzbjr.zzbF(zzagr.class, zzagrVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzx, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဂ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011င\u0010\u0012ဉ\u0011\u0013ဉ\u0012", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw"});
        }
        if (i2 == 3) {
            return new zzagr();
        }
        if (i2 == 4) {
            return new zzag(zzx);
        }
        if (i2 == 5) {
            return zzx;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzy;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzagr.class) {
            try {
                zzblhVar = zzy;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzx);
                    zzy = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
