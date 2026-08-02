package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzamp extends zzbjr {
    private static final zzamp zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private String zzg = "";

    static {
        zzamp zzampVar = new zzamp();
        zzh = zzampVar;
        zzbjr.zzbF(zzamp.class, zzampVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", zzai.zza$17, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzamp();
        }
        if (i2 == 4) {
            return new zzao(zzh);
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
        synchronized (zzamp.class) {
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
