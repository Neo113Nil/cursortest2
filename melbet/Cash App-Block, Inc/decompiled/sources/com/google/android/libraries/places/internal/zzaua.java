package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaua extends zzbjr {
    private static final zzaua zze;
    private static volatile zzblh zzf;
    private zzbjz zzb = zzbjs.zzb;

    static {
        zzaua zzauaVar = new zzaua();
        zze = zzauaVar;
        zzbjr.zzbF(zzaua.class, zzauaVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zze, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001ࠞ", new Object[]{"zzb", zzanz.zza$13});
        }
        if (i2 == 3) {
            return new zzaua();
        }
        if (i2 == 4) {
            return new zzaq(zze);
        }
        if (i2 == 5) {
            return zze;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzf;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaua.class) {
            try {
                zzblhVar = zzf;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zze);
                    zzf = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
