package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbdm extends zzbjr {
    private static final zzbdm zzf;
    private static volatile zzblh zzg;
    private String zzb = "";
    private zzbkb zze = zzblk.zzb;

    static {
        zzbdm zzbdmVar = new zzbdm();
        zzf = zzbdmVar;
        zzbjr.zzbF(zzbdm.class, zzbdmVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", new Object[]{"zzb", "zze", zzbdl.class});
        }
        if (i2 == 3) {
            return new zzbdm();
        }
        if (i2 == 4) {
            return new zzbe(zzf);
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
        synchronized (zzbdm.class) {
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
