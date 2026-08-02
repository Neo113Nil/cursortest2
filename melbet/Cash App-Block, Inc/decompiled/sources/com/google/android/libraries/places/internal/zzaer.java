package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaer extends zzbjr {
    private static final zzaer zzv;
    private static volatile zzblh zzw;
    private int zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private boolean zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private int zzn;
    private zzbim zzo;
    private zzbim zzp;
    private zzbim zzq;
    private long zzr;
    private double zzs;
    private zzbim zzt;
    private zzbim zzu;

    static {
        zzaer zzaerVar = new zzaer();
        zzv = zzaerVar;
        zzbjr.zzbF(zzaer.class, zzaerVar);
    }

    public zzaer() {
        zzbil zzbilVar = zzbim.zza;
        this.zzo = zzbilVar;
        this.zzp = zzbilVar;
        this.zzq = zzbilVar;
        this.zzt = zzbilVar;
        this.zzu = zzbilVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzv, "\u0001\u0011\u0000\u0001\u0001\u0012\u0011\u0000\u0000\u0000\u0001င\u0002\u0002င\u0003\u0003ဇ\u0004\u0004ဇ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\bဂ\b\tင\t\nည\n\u000bည\u000b\fည\f\rဂ\r\u000eက\u000e\u000fည\u000f\u0010ည\u0010\u0011᠌\u0000\u0012ဂ\u0001", new Object[]{"zzb", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zze", zzaa.zza$22, "zzf"});
        }
        if (i2 == 3) {
            return new zzaer();
        }
        if (i2 == 4) {
            return new zzag(zzv);
        }
        if (i2 == 5) {
            return zzv;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzw;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaer.class) {
            try {
                zzblhVar = zzw;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzv);
                    zzw = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
