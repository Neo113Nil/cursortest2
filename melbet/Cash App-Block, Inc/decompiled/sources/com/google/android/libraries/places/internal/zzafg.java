package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzafg extends zzbjr {
    private static volatile zzblh zzA;
    private static final zzafg zzz;
    private int zzb;
    private int zze;
    private int zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;
    private int zzl;
    private long zzm;
    private zzbim zzn;
    private long zzo;
    private zzbim zzp;
    private long zzq;
    private zzbim zzr;
    private long zzs;
    private zzbim zzt;
    private zzbkb zzu;
    private zzbkb zzv;
    private zzbkb zzw;
    private boolean zzx;
    private int zzy;

    static {
        zzafg zzafgVar = new zzafg();
        zzz = zzafgVar;
        zzbjr.zzbF(zzafg.class, zzafgVar);
    }

    public zzafg() {
        zzbil zzbilVar = zzbim.zza;
        this.zzn = zzbilVar;
        this.zzp = zzbilVar;
        this.zzr = zzbilVar;
        this.zzt = zzbilVar;
        zzblk zzblkVar = zzblk.zzb;
        this.zzu = zzblkVar;
        this.zzv = zzblkVar;
        this.zzw = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzaa zzaaVar = zzaa.zza$21;
            zzaa zzaaVar2 = zzaa.zza$20;
            return new zzbll(zzz, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0003\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဇ\u0002\u0004င\u0003\u0005᠌\u0004\u0006᠌\u0005\u0007ဇ\u0006\bင\u0007\tဂ\b\nည\t\u000bဂ\n\fည\u000b\rဂ\f\u000eည\r\u000fဂ\u000e\u0010ည\u000f\u0011\u001b\u0012\u001b\u0013\u001b\u0014ဇ\u0010\u0015င\u0011", new Object[]{"zzb", "zze", zzaaVar, "zzf", "zzg", "zzh", "zzi", zzaaVar2, "zzj", zzaaVar2, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", zzaff.class, "zzv", zzaff.class, "zzw", zzafd.class, "zzx", "zzy"});
        }
        if (i2 == 3) {
            return new zzafg();
        }
        if (i2 == 4) {
            return new zzag(zzz);
        }
        if (i2 == 5) {
            return zzz;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzA;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzafg.class) {
            try {
                zzblhVar = zzA;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzz);
                    zzA = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
