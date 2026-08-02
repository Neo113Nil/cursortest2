package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzalp extends zzbjr {
    private static final zzalp zzm;
    private static volatile zzblh zzn;
    private int zzb;
    private int zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzl;
    private String zze = "";
    private zzbkb zzk = zzblk.zzb;

    static {
        zzalp zzalpVar = new zzalp();
        zzm = zzalpVar;
        zzbjr.zzbF(zzalp.class, zzalpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဈ\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005\u0007\u001b\bင\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzalm.class, "zzl"});
        }
        if (i2 == 3) {
            return new zzalp();
        }
        if (i2 == 4) {
            return new zzal(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzn;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzalp.class) {
            try {
                zzblhVar = zzn;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzm);
                    zzn = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
