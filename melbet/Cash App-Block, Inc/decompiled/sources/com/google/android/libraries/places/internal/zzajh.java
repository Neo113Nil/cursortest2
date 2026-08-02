package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzajh extends zzbjr {
    private static final zzajh zzs;
    private static volatile zzblh zzt;
    private int zzb;
    private long zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private zzbka zzk = zzbkn.zzb;
    private long zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private long zzp;
    private int zzq;
    private long zzr;

    static {
        zzajh zzajhVar = new zzajh();
        zzs = zzajhVar;
        zzbjr.zzbF(zzajh.class, zzajhVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzai zzaiVar = zzai.zza$8;
            zzai zzaiVar2 = zzai.zza$7;
            zzai zzaiVar3 = zzai.zza$6;
            return new zzbll(zzs, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0001\u0000\u0001ဂ\u0000\u0002င\u0001\u0003᠌\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006င\u0005\u0007\u0014\bဂ\u0006\t᠌\u0007\n᠌\b\u000b᠌\t\fဂ\n\rင\u000b\u000eဂ\f", new Object[]{"zzb", "zze", "zzf", "zzg", zzaiVar, "zzh", zzaiVar2, "zzi", zzaiVar3, "zzj", "zzk", "zzl", "zzm", zzaiVar, "zzn", zzaiVar2, "zzo", zzaiVar3, "zzp", "zzq", "zzr"});
        }
        if (i2 == 3) {
            return new zzajh();
        }
        if (i2 == 4) {
            return new zzaj(zzs);
        }
        if (i2 == 5) {
            return zzs;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzt;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzajh.class) {
            try {
                zzblhVar = zzt;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzs);
                    zzt = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
