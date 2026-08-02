package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcj extends zzbjr {
    private static final zzcj zzu;
    private static volatile zzblh zzv;
    private int zzb;
    private zzdh zze;
    private zzcc zzf;
    private zzbkb zzg;
    private zzbkb zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private long zzp;
    private long zzq;
    private int zzr;
    private boolean zzs;
    private boolean zzt;

    static {
        zzcj zzcjVar = new zzcj();
        zzu = zzcjVar;
        zzbjr.zzbF(zzcj.class, zzcjVar);
    }

    public zzcj() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzg = zzblkVar;
        this.zzh = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzu, "\u0001\u0010\u0000\u0001\u0001\u0010\u0010\u0000\u0002\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b\u0004\u001b\u0005င\u0002\u0006င\u0003\u0007င\u0004\bင\u0005\tဂ\u0006\nဂ\u0007\u000bဂ\b\fဂ\t\rဂ\n\u000e᠌\u000b\u000fဇ\f\u0010ဇ\r", new Object[]{"zzb", "zze", "zzf", "zzg", zzch.class, "zzh", zzch.class, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", zzf.zza$1, "zzs", "zzt"});
        }
        if (i2 == 3) {
            return new zzcj();
        }
        if (i2 == 4) {
            return new zzbk(zzu);
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
        synchronized (zzcj.class) {
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
