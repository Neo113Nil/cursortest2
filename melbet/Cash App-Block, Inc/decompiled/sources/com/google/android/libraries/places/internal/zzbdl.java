package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbdl extends zzbjr {
    private static final zzbdl zzf;
    private static volatile zzblh zzg;
    private int zzb;
    private int zze;

    static {
        zzbdl zzbdlVar = new zzbdl();
        zzf = zzbdlVar;
        zzbjr.zzbF(zzbdl.class, zzbdlVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0004\u0002\u0004", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzbdl();
        }
        if (i2 == 4) {
            return new zzbe(zzf);
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
        synchronized (zzbdl.class) {
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
}
