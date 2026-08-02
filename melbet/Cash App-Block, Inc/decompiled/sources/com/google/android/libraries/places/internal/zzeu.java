package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzeu extends zzbjr {
    private static final zzeu zzD;
    private static volatile zzblh zzE;
    private boolean zzA;
    private int zzB;
    private int zzC;
    private int zzb;
    private int zze;
    private int zzf;
    private float zzg;
    private int zzh;
    private int zzi;
    private float zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private float zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private float zzr;
    private float zzs;
    private float zzt;
    private float zzu;
    private float zzv;
    private boolean zzw;
    private int zzx;
    private int zzy;
    private int zzz;

    static {
        zzeu zzeuVar = new zzeu();
        zzD = zzeuVar;
        zzbjr.zzbF(zzeu.class, zzeuVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzD, "\u0001\u0019\u0000\u0001\u0001\u0019\u0019\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004င\u0003\u0005င\u0004\u0006ခ\u0005\u0007င\u0006\bင\u0007\tင\b\nခ\t\u000bင\n\fင\u000b\rင\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012ခ\u0011\u0013ဇ\u0012\u0014င\u0013\u0015င\u0014\u0016᠌\u0015\u0017ဇ\u0016\u0018င\u0017\u0019᠌\u0018", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", zzf.zza$13, "zzA", "zzB", "zzC", zzf.zza$14});
        }
        if (i2 == 3) {
            return new zzeu();
        }
        if (i2 == 4) {
            return new zze(zzD);
        }
        if (i2 == 5) {
            return zzD;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzE;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzeu.class) {
            try {
                zzblhVar = zzE;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzD);
                    zzE = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
