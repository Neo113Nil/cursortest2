package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaky extends zzbjr {
    private static final zzaky zzB;
    private static volatile zzblh zzC;
    private boolean zzA;
    private int zzb;
    private int zze;
    private boolean zzf;
    private boolean zzg;
    private float zzh;
    private float zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private boolean zzp;
    private int zzq;
    private float zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;
    private int zzw;
    private zzbkb zzx = zzblk.zzb;
    private int zzy;
    private float zzz;

    static {
        zzaky zzakyVar = new zzaky();
        zzB = zzakyVar;
        zzbjr.zzbF(zzaky.class, zzakyVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzai zzaiVar = zzai.zza$13;
            zzaa zzaaVar = zzaa.zza$16;
            return new zzbll(zzB, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0001\u0000\u0001င\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ခ\u0003\u0005ခ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b\nင\t\u000bင\n\fဇ\u000b\r᠌\f\u000eခ\r\u000f᠌\u000e\u0010᠌\u000f\u0011᠌\u0010\u0012᠌\u0011\u0013᠌\u0012\u0014\u001b\u0015င\u0013\u0016ခ\u0014\u0017ဇ\u0015", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", zzaiVar, "zzr", "zzs", zzaaVar, "zzt", zzaaVar, "zzu", zzaaVar, "zzv", zzaaVar, "zzw", zzaa.zza$17, "zzx", zzakr.class, "zzy", "zzz", "zzA"});
        }
        if (i2 == 3) {
            return new zzaky();
        }
        if (i2 == 4) {
            return new zzal(zzB);
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
        synchronized (zzaky.class) {
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
