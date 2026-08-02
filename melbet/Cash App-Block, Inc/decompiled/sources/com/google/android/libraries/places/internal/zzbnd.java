package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbnd extends zzbjr {
    private static final zzbnd zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private int zze;
    private zzblx zzf;

    static {
        zzbnd zzbndVar = new zzbnd();
        zzg = zzbndVar;
        zzbjr.zzbF(zzbnd.class, zzbndVar);
    }

    public static zzbnd zzf() {
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
            return new zzbll(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002ဉ\u0000", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbnd();
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
        synchronized (zzbnd.class) {
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
        return this.zze;
    }

    public final zzblx zze() {
        zzblx zzblxVar = this.zzf;
        return zzblxVar == null ? zzblx.zzg() : zzblxVar;
    }
}
