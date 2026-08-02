package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzahh extends zzbjr {
    private static final zzahh zzv;
    private static volatile zzblh zzw;
    private int zzb;
    private int zze = 0;
    private Object zzf;
    private zzaha zzg;
    private zzagx zzh;
    private zzahe zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private int zzm;
    private int zzn;
    private long zzo;
    private int zzp;
    private long zzq;
    private long zzr;
    private zzbka zzs;
    private zzbka zzt;
    private zzbkb zzu;

    static {
        zzahh zzahhVar = new zzahh();
        zzv = zzahhVar;
        zzbjr.zzbF(zzahh.class, zzahhVar);
    }

    public zzahh() {
        zzbkn zzbknVar = zzbkn.zzb;
        this.zzs = zzbknVar;
        this.zzt = zzbknVar;
        this.zzu = zzblk.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzai zzaiVar = zzai.zza$1;
            zzaa zzaaVar = zzaa.zza$29;
            return new zzbll(zzv, "\u0001\u0012\u0001\u0001\u0001\u0012\u0012\u0000\u0003\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u00035\u0000\u0004᠌\u0003\u0005᠌\u0004\u0006\u083f\u0000\u00077\u0000\bဂ\u0005\t᠌\u0006\n᠌\u0007\u000bဂ\b\fင\t\rဂ\n\u000eဂ\u000b\u000f%\u0010%\u0011\u001b\u0012ဉ\u0002", new Object[]{"zzf", "zze", "zzb", "zzg", "zzh", "zzj", zzaiVar, "zzk", zzaaVar, zzc.zza, "zzl", "zzm", zzaiVar, "zzn", zzaaVar, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", zzahg.class, "zzi"});
        }
        if (i2 == 3) {
            return new zzahh();
        }
        if (i2 == 4) {
            return new zzaj(zzv);
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
        synchronized (zzahh.class) {
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
