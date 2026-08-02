package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbnw extends zzbjr {
    private static final zzbnw zzf;
    private static volatile zzblh zzg;
    private double zzb;
    private double zze;

    static {
        zzbnw zzbnwVar = new zzbnw();
        zzf = zzbnwVar;
        zzbjr.zzbF(zzbnw.class, zzbnwVar);
    }

    public static zzbnw zzg() {
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
            return new zzbll(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0000\u0002\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzbnw();
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
        synchronized (zzbnw.class) {
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

    public final double zzc() {
        return this.zzb;
    }

    public final double zze() {
        return this.zze;
    }
}
