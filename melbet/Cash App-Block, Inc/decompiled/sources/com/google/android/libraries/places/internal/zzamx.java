package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzamx extends zzbjr {
    private static final zzamx zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private String zze = "";
    private int zzf;
    private long zzg;

    static {
        zzamx zzamxVar = new zzamx();
        zzh = zzamxVar;
        zzbjr.zzbF(zzamx.class, zzamxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဂ\u0002", new Object[]{"zzb", "zze", "zzf", zzai.zza$19, "zzg"});
        }
        if (i2 == 3) {
            return new zzamx();
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
        synchronized (zzamx.class) {
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
