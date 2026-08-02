package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzay extends zzbjr {
    private static final zzay zzA;
    private static volatile zzblh zzB;
    private int zzb;
    private boolean zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private float zzi;
    private float zzj;
    private boolean zzk;
    private float zzl;
    private double zzm;
    private int zzn;
    private long zzo;
    private float zzp;
    private float zzq;
    private float zzr;
    private float zzs;
    private float zzt;
    private float zzu;
    private float zzv;
    private float zzw;
    private boolean zzx;
    private boolean zzy;
    private boolean zzz;

    static {
        zzay zzayVar = new zzay();
        zzA = zzayVar;
        zzbjr.zzbF(zzay.class, zzayVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzc zzcVar = zzc.zza$14;
            return new zzbll(zzA, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005ခ\u0004\u0006ခ\u0005\u0007ဇ\u0006\bခ\u0007\tက\b\n᠌\t\u000bဂ\n\fခ\u000b\rခ\f\u000eခ\r\u000fခ\u000e\u0010ခ\u000f\u0011ခ\u0010\u0012ခ\u0011\u0013ခ\u0012\u0014ဇ\u0013\u0015ဇ\u0014\u0016ဇ\u0015", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzcVar, "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", zzcVar, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i2 == 3) {
            return new zzay();
        }
        if (i2 == 4) {
            return new zzaw(zzA);
        }
        if (i2 == 5) {
            return zzA;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzB;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzay.class) {
            try {
                zzblhVar = zzB;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzA);
                    zzB = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
