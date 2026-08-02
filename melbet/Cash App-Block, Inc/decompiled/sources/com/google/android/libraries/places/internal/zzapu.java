package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzapu extends zzbjr {
    private static final zzapu zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private String zze = "";
    private int zzf;

    static {
        zzapu zzapuVar = new zzapu();
        zzg = zzapuVar;
        zzbjr.zzbF(zzapu.class, zzapuVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", "zzf", zzanz.zza$14});
        }
        if (i2 == 3) {
            return new zzapu();
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
        synchronized (zzapu.class) {
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
