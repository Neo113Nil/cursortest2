package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzajl extends zzbjr {
    private static final zzajl zzm;
    private static volatile zzblh zzn;
    private int zzb;
    private int zze;
    private int zzf;
    private long zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private zzabz zzk;
    private zzbkb zzl = zzblk.zzb;

    static {
        zzajl zzajlVar = new zzajl();
        zzm = zzajlVar;
        zzbjr.zzbF(zzajl.class, zzajlVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဇ\u0004\u0006ဂ\u0005\u0007ဉ\u0006\b\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", zzabz.class});
        }
        if (i2 == 3) {
            return new zzajl();
        }
        if (i2 == 4) {
            return new zzaj(zzm);
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
        synchronized (zzajl.class) {
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
