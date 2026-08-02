package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzala extends zzbjr {
    private static final zzala zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private int zze;
    private float zzf;

    static {
        zzala zzalaVar = new zzala();
        zzg = zzalaVar;
        zzbjr.zzbF(zzala.class, zzalaVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0001\u0002\u0000\u0001\u0010\u0011\u0002\u0000\u0000\u0000\u0010᠌\u0000\u0011ခ\u0001", new Object[]{"zzb", "zze", zzaa.zza$17, "zzf"});
        }
        if (i2 == 3) {
            return new zzala();
        }
        if (i2 == 4) {
            return new zzal(zzg);
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
        synchronized (zzala.class) {
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
