package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbgx extends zzbjr {
    private static final zzbgx zzh;
    private static volatile zzblh zzi;
    private boolean zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;

    static {
        zzbgx zzbgxVar = new zzbgx();
        zzh = zzbgxVar;
        zzbjr.zzbF(zzbgx.class, zzbgxVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0007\u0002\u0007\u0003\u0007\u0004\u0007", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbgx();
        }
        if (i2 == 4) {
            return new zzbh(zzh);
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
        synchronized (zzbgx.class) {
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
