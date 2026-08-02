package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzage extends zzbjr {
    private static volatile zzblh zzA;
    private static final zzage zzz;
    private int zzb;
    private int zze;
    private long zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private boolean zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private float zzs;
    private float zzt;
    private int zzu;
    private zzbim zzv = zzbim.zza;
    private long zzw;
    private boolean zzx;
    private boolean zzy;

    static {
        zzage zzageVar = new zzage();
        zzz = zzageVar;
        zzbjr.zzbF(zzage.class, zzageVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzz, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001င\u0002\u0002င\u0003\u0003င\u0004\u0004ဇ\u0005\u0005င\u0006\u0006င\u0007\u0007င\b\bင\t\tဇ\n\nင\u000b\u000bင\f\fင\r\rခ\u000e\u000eခ\u000f\u000fင\u0010\u0010᠌\u0000\u0011ဂ\u0001\u0012ည\u0011\u0013ဂ\u0012\u0014ဇ\u0013\u0015ဇ\u0014", new Object[]{"zzb", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zze", zzaa.zza$22, "zzf", "zzv", "zzw", "zzx", "zzy"});
        }
        if (i2 == 3) {
            return new zzage();
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
        synchronized (zzage.class) {
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
