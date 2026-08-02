package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzalq extends zzbjr {
    private static final zzalq zzv;
    private static volatile zzblh zzw;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zzbkb zzj = zzblk.zzb;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;

    static {
        zzalq zzalqVar = new zzalq();
        zzv = zzalqVar;
        zzbjr.zzbF(zzalq.class, zzalqVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzv, "\u0001\u0011\u0000\u0001\u0001\u0011\u0011\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006\u001b\u0007င\u0005\bင\u0006\tင\u0007\nင\b\u000bင\t\fင\n\rင\u000b\u000eင\f\u000fင\r\u0010င\u000e\u0011င\u000f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzalp.class, "zzk", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu"});
        }
        if (i2 == 3) {
            return new zzalq();
        }
        if (i2 == 4) {
            return new zzal(zzv);
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
        synchronized (zzalq.class) {
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
