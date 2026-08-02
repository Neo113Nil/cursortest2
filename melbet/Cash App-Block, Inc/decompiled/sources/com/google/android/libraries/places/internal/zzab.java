package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzab extends zzbjr {
    private static final zzab zzx;
    private static volatile zzblh zzy;
    private int zzb;
    private zzdh zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private long zzl;
    private float zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private zzbkb zzr;
    private zzbkb zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private long zzw;

    static {
        zzab zzabVar = new zzab();
        zzx = zzabVar;
        zzbjr.zzbF(zzab.class, zzabVar);
    }

    public zzab() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzr = zzblkVar;
        this.zzs = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzx, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0002\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tခ\b\nဂ\t\u000bင\n\fဇ\u000b\r᠌\f\u000e\u001b\u000f\u001b\u0010င\r\u0011င\u000e\u0012ဂ\u0010\u0013င\u000f", new Object[]{"zzb", "zze", "zzf", zzaa.zza, "zzg", "zzh", zzc.zza$17, "zzi", zzf.zza$17, "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", zzai.zza, "zzr", zzay.class, "zzs", zzay.class, "zzt", "zzu", "zzw", "zzv"});
        }
        if (i2 == 3) {
            return new zzab();
        }
        if (i2 == 4) {
            return new zze(zzx);
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
        synchronized (zzab.class) {
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
