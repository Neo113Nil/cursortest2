package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzajq extends zzbjr {
    private static final zzajq zzu;
    private static volatile zzblh zzv;
    private int zzb;
    private long zze;
    private zzabz zzf;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private boolean zzn;
    private int zzo;
    private long zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;

    static {
        zzajq zzajqVar = new zzajq();
        zzu = zzajqVar;
        zzbjr.zzbF(zzajq.class, zzajqVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzu, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001စ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဇ\t\u000bင\n\fဂ\u000b\rင\f\u000eင\r\u000fင\u000e\u0010င\u000f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt"});
        }
        if (i2 == 3) {
            return new zzajq();
        }
        if (i2 == 4) {
            return new zzal(zzu);
        }
        if (i2 == 5) {
            return zzu;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzv;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzajq.class) {
            try {
                zzblhVar = zzv;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzu);
                    zzv = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
