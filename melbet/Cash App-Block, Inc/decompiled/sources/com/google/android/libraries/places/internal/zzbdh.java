package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbdh extends zzbjr {
    private static final zzbdh zzg;
    private static volatile zzblh zzh;
    private boolean zzb;
    private boolean zze;
    private boolean zzf;

    static {
        zzbdh zzbdhVar = new zzbdh();
        zzg = zzbdhVar;
        zzbjr.zzbF(zzbdh.class, zzbdhVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbdh();
        }
        if (i2 == 4) {
            return new zzbe(zzg);
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
        synchronized (zzbdh.class) {
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
}
