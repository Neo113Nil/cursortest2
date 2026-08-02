package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbhq extends zzbjr {
    private static final zzbhq zzf;
    private static volatile zzblh zzg;
    private int zzb = 0;
    private Object zze;

    static {
        zzbhq zzbhqVar = new zzbhq();
        zzf = zzbhqVar;
        zzbjr.zzbF(zzbhq.class, zzbhqVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzf, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzb", zzazv.class, zzbcz.class});
        }
        if (i2 == 3) {
            return new zzbhq();
        }
        if (i2 == 4) {
            return new zzbh(zzf);
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
        synchronized (zzbhq.class) {
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
