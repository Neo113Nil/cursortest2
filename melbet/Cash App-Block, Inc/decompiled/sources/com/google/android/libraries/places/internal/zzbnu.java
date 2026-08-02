package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbnu extends zzbjr {
    private static final zzbnu zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzbnu zzbnuVar = new zzbnu();
        zzg = zzbnuVar;
        zzbjr.zzbF(zzbnu.class, zzbnuVar);
    }

    public static zzbnu zzg() {
        return zzg;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003\u0004", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbnu();
        }
        if (i2 == 4) {
            return new zzbk(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzh;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbnu.class) {
            try {
                zzblhVar = zzh;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzg);
                    zzh = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zze() {
        return this.zze;
    }

    public final int zzf() {
        return this.zzf;
    }
}
