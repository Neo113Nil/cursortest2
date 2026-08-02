package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcl extends zzbjr {
    private static final zzcl zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private zzdq zze;
    private zzcr zzf;
    private zzbkb zzg = zzblk.zzb;

    static {
        zzcl zzclVar = new zzcl();
        zzh = zzclVar;
        zzbjr.zzbF(zzcl.class, zzclVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", zzcx.class});
        }
        if (i2 == 3) {
            return new zzcl();
        }
        if (i2 == 4) {
            return new zzbk(zzh);
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
        synchronized (zzcl.class) {
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
