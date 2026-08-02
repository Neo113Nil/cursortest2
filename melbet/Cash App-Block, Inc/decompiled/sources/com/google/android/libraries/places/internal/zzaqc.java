package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaqc extends zzbjr {
    private static final zzaqc zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private zzbjz zze = zzbjs.zzb;
    private int zzf;

    static {
        zzaqc zzaqcVar = new zzaqc();
        zzg = zzaqcVar;
        zzbjr.zzbF(zzaqc.class, zzaqcVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ࠞ\u0002င\u0000", new Object[]{"zzb", "zze", zzanz.zza$17, "zzf"});
        }
        if (i2 == 3) {
            return new zzaqc();
        }
        if (i2 == 4) {
            return new zzaq(zzg);
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
        synchronized (zzaqc.class) {
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
