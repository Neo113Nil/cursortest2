package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzakh extends zzbjr {
    private static final zzakh zzv;
    private static volatile zzblh zzw;
    private int zzb;
    private zzake zze;
    private zzbkb zzf;
    private zzajq zzg;
    private zzajq zzh;
    private zzady zzi;
    private int zzj;
    private zzajs zzk;
    private zzajo zzl;
    private zzajl zzm;
    private zzaju zzn;
    private zzbkb zzo;
    private zzajj zzp;
    private zzajw zzq;
    private zzaiy zzr;
    private zzaky zzs;
    private zzala zzt;
    private zzakp zzu;

    static {
        zzakh zzakhVar = new zzakh();
        zzv = zzakhVar;
        zzbjr.zzbF(zzakh.class, zzakhVar);
    }

    public zzakh() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzf = zzblkVar;
        this.zzo = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzv, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0002\u0000\u0001ဉ\u0000\u0002\u001b\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006᠌\u0004\u0007ဉ\u0005\bဉ\u0006\tဉ\u0007\nဉ\b\u000b\u001b\fဉ\t\rဉ\n\u000eဉ\u000b\u000fဉ\f\u0010ဉ\r\u0011ဉ\u000e", new Object[]{"zzb", "zze", "zzf", zzakj.class, "zzg", "zzh", "zzi", "zzj", zzai.zza$12, "zzk", "zzl", "zzm", "zzn", "zzo", zzaka.class, "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new zzakh();
        }
        if (i2 == 4) {
            return new zzal(zzv);
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
        synchronized (zzakh.class) {
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
