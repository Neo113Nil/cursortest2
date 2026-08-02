package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzed extends zzbjr {
    private static final zzed zzv;
    private static volatile zzblh zzw;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private float zzi;
    private int zzj;
    private int zzk;
    private float zzl;
    private int zzm;
    private int zzn;
    private float zzo;
    private int zzp;
    private float zzq;
    private int zzr;
    private int zzs;
    private float zzt;
    private int zzu;

    static {
        zzed zzedVar = new zzed();
        zzv = zzedVar;
        zzbjr.zzbF(zzed.class, zzedVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzv, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004င\u0003\u0005ခ\u0004\u0006င\u0005\u0007င\u0006\bခ\u0007\tင\b\nင\t\u000bခ\n\fင\u000b\rခ\f\u000eင\r\u000fင\u000e\u0010ခ\u000f\u0011င\u0010", new Object[]{"zzb", "zze", zzf.zza$5, "zzf", zzf.zza$6, "zzg", zzc.zza$28, "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new zzed();
        }
        if (i2 == 4) {
            return new zze(zzv);
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
        synchronized (zzed.class) {
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
