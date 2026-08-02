package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaox extends zzbjr {
    private static final zzaox zzx;
    private static volatile zzblh zzy;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private zzbjz zzj = zzbjs.zzb;
    private int zzk;
    private zzaod zzl;
    private zzaot zzm;
    private zzane zzn;
    private zzaon zzo;
    private zzaoj zzp;
    private zzaop zzq;
    private zzanh zzr;
    private zzanm zzs;
    private zzape zzt;
    private zzapl zzu;
    private zzanv zzv;
    private zzanr zzw;

    static {
        zzaox zzaoxVar = new zzaox();
        zzx = zzaoxVar;
        zzbjr.zzbF(zzaox.class, zzaoxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzx, "\u0001\u0013\u0000\u0001\u0001\u0013\u0013\u0000\u0001\u0000\u0001᠌\u0001\u0002᠌\u0002\u0003င\u0003\u0004ဉ\u0006\u0005ဉ\u0007\u0006ဉ\b\u0007ဉ\t\bဇ\u0004\tဉ\n\nဉ\u000b\u000b\u0016\fင\u0005\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011င\u0000\u0012ဉ\u0010\u0013ဉ\u0011", new Object[]{"zzb", "zzf", zzanz.zza$6, "zzg", zzanz.zza$7, "zzh", "zzl", "zzm", "zzn", "zzo", "zzi", "zzp", "zzq", "zzj", "zzk", "zzr", "zzs", "zzt", "zzu", "zze", "zzv", "zzw"});
        }
        if (i2 == 3) {
            return new zzaox();
        }
        if (i2 == 4) {
            return new zzao(zzx);
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
        synchronized (zzaox.class) {
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
