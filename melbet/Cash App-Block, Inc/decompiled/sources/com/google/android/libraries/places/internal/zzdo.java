package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzdo extends zzbjr {
    private static volatile zzblh zzA;
    private static final zzdo zzz;
    private int zzb;
    private int zze;
    private int zzf;
    private float zzg;
    private int zzh;
    private int zzi;
    private float zzj;
    private int zzk;
    private int zzl;
    private float zzm;
    private int zzn;
    private int zzo;
    private float zzp;
    private int zzq;
    private float zzr;
    private float zzs;
    private double zzt;
    private int zzu;
    private boolean zzv;
    private int zzw;
    private boolean zzx;
    private int zzy;

    static {
        zzdo zzdoVar = new zzdo();
        zzz = zzdoVar;
        zzbjr.zzbF(zzdo.class, zzdoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzz, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003\u0005င\u0004\u0006ခ\u0005\u0007င\u0006\bင\u0007\tခ\b\nင\t\u000bင\n\fခ\u000b\rင\f\u000eခ\r\u000fခ\u000e\u0010က\u000f\u0011᠌\u0010\u0012ဇ\u0011\u0013᠌\u0012\u0014ဇ\u0013\u0015᠌\u0014", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", zzf.zza$4, "zzv", "zzw", zzf.zza$2, "zzx", "zzy", zzf.zza$3});
        }
        if (i2 == 3) {
            return new zzdo();
        }
        if (i2 == 4) {
            return new zze(zzz);
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
        synchronized (zzdo.class) {
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
