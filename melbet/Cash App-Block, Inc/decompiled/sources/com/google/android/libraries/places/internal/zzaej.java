package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaej extends zzbjr {
    private static final zzaej zzu;
    private static volatile zzblh zzv;
    private int zzb;
    private zzaev zzf;
    private zzaex zzg;
    private zzbao zzh;
    private zzage zzi;
    private zzagp zzj;
    private zzagg zzk;
    private zzafk zzl;
    private zzaet zzm;
    private zzafx zzn;
    private zzafz zzo;
    private zzafq zzp;
    private zzaen zzq;
    private zzagk zzr;
    private zzafi zzs;
    private byte zzt = 2;
    private int zze = 1;

    static {
        zzaej zzaejVar = new zzaej();
        zzu = zzaejVar;
        zzbjr.zzbF(zzaej.class, zzaejVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzt);
        }
        if (i2 == 2) {
            return new zzbll(zzu, "\u0001\u000f\u0000\u0001\u0001\u000f\u000f\u0000\u0000\u0001\u0001᠌\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ᐉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဉ\u0006\bဉ\u0007\tဉ\b\nဉ\t\u000bဉ\n\fဉ\u000b\rဉ\f\u000eဉ\r\u000fဉ\u000e", new Object[]{"zzb", "zze", zzaa.zza$18, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs"});
        }
        if (i2 == 3) {
            return new zzaej();
        }
        if (i2 == 4) {
            return new zzag(zzu);
        }
        if (i2 == 5) {
            return zzu;
        }
        if (i2 != 6) {
            this.zzt = zzbjrVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzblh zzblhVar2 = zzv;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaej.class) {
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
