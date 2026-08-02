package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaxg extends zzbjr {
    private static final zzaxg zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private zzbim zze;
    private zzbim zzf;
    private zzbim zzg;

    static {
        zzaxg zzaxgVar = new zzaxg();
        zzh = zzaxgVar;
        zzbjr.zzbF(zzaxg.class, zzaxgVar);
    }

    public zzaxg() {
        zzbil zzbilVar = zzbim.zza;
        this.zze = zzbilVar;
        this.zzf = zzbilVar;
        this.zzg = zzbilVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzaxg();
        }
        if (i2 == 4) {
            return new zzaw(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzi;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaxg.class) {
            try {
                zzblhVar = zzi;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzh);
                    zzi = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
