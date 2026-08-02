package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbiz extends zzbjr {
    private static final zzbiz zzf;
    private static volatile zzblh zzg;
    private long zzb;
    private int zze;

    static {
        zzbiz zzbizVar = new zzbiz();
        zzf = zzbizVar;
        zzbjr.zzbF(zzbiz.class, zzbizVar);
    }

    public static zzbiz zzf() {
        return zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzbiz();
        }
        if (i2 == 4) {
            return new zzbk(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzg;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbiz.class) {
            try {
                zzblhVar = zzg;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzf);
                    zzg = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final int zze() {
        return this.zze;
    }
}
