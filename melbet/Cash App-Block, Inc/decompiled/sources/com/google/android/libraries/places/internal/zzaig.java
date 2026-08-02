package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaig extends zzbjr {
    private static final zzaig zzB;
    private static volatile zzblh zzC;
    private int zzA;
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
    private zzain zzt;
    private zzaip zzu;
    private zzaid zzv;
    private zzaii zzw;
    private zzaik zzx;
    private int zzy;
    private int zzz;

    static {
        zzaig zzaigVar = new zzaig();
        zzB = zzaigVar;
        zzbjr.zzbF(zzaig.class, zzaigVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzB, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0000\u0001ဋ\u0001\u0002ဋ\u0002\u0003ဋ\u0003\u0004ဋ\u0004\u0005ဋ\u0005\u0006ဋ\u0006\u0007ဋ\u0007\bဋ\b\tဋ\t\nဋ\n\u000bဋ\u000b\fဋ\f\rဋ\r\u000eဋ\u000e\u000fဉ\u000f\u0010ဋ\u0000\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015᠌\u0014\u0016ဋ\u0015\u0017ဋ\u0016", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zze", "zzu", "zzv", "zzw", "zzx", "zzy", zzai.zza$3, "zzz", "zzA"});
        }
        if (i2 == 3) {
            return new zzaig();
        }
        if (i2 == 4) {
            return new zzaj(zzB);
        }
        if (i2 == 5) {
            return zzB;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzC;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaig.class) {
            try {
                zzblhVar = zzC;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzB);
                    zzC = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
