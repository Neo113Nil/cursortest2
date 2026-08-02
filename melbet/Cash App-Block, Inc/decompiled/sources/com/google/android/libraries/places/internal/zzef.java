package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzef extends zzbjr {
    private static final zzef zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private zzbkb zze = zzblk.zzb;
    private float zzf;
    private float zzg;

    static {
        zzef zzefVar = new zzef();
        zzh = zzefVar;
        zzbjr.zzbF(zzef.class, zzefVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ခ\u0000\u0003ခ\u0001", new Object[]{"zzb", "zze", zzen.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzef();
        }
        if (i2 == 4) {
            return new zze(zzh);
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
        synchronized (zzef.class) {
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
