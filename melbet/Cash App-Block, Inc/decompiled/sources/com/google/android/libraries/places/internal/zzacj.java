package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzacj extends zzbjr {
    private static final zzacj zzt;
    private static volatile zzblh zzu;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;

    static {
        zzacj zzacjVar = new zzacj();
        zzt = zzacjVar;
        zzbjr.zzbF(zzacj.class, zzacjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzt, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0000\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ဋ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဋ\u0006\bဋ\u0007\tဋ\b\nဋ\t\u000bဋ\n\fဋ\u000b\rဋ\f\u000eဋ\r\u000fဋ\u000e", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new zzacj();
        }
        if (i2 == 4) {
            return new zzac(10, zzt);
        }
        if (i2 == 5) {
            return zzt;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzu;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzacj.class) {
            try {
                zzblhVar = zzu;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzt);
                    zzu = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
