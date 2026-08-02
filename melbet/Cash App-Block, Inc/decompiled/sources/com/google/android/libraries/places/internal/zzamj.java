package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzamj extends zzbjr {
    private static final zzamj zzl;
    private static volatile zzblh zzm;
    private int zzb;
    private float zze;
    private float zzf;
    private zzamf zzg;
    private zzamf zzh;
    private zzalk zzi;
    private zzalk zzj;
    private long zzk;

    static {
        zzamj zzamjVar = new zzamj();
        zzl = zzamjVar;
        zzbjr.zzbF(zzamj.class, zzamjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0007ဂ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzamj();
        }
        if (i2 == 4) {
            return new zzao(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzm;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzamj.class) {
            try {
                zzblhVar = zzm;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzl);
                    zzm = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
