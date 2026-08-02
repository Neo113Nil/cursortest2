package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzape extends zzbjr {
    private static final zzape zzf;
    private static volatile zzblh zzg;
    private int zzb;
    private int zze;

    static {
        zzape zzapeVar = new zzape();
        zzf = zzapeVar;
        zzbjr.zzbF(zzape.class, zzapeVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzf, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzb", "zze", zzanz.zza$8});
        }
        if (i2 == 3) {
            return new zzape();
        }
        if (i2 == 4) {
            return new zzaq(zzf);
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
        synchronized (zzape.class) {
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
