package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbai extends zzbjr {
    private static final zzbai zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private int zze = 1;
    private int zzf = 1;
    private int zzg;

    static {
        zzbai zzbaiVar = new zzbai();
        zzh = zzbaiVar;
        zzbjr.zzbF(zzbai.class, zzbaiVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003င\u0002", new Object[]{"zzb", "zze", zzc.zza$19, "zzf", zzc.zza$18, "zzg"});
        }
        if (i2 == 3) {
            return new zzbai();
        }
        if (i2 == 4) {
            return new zzba(zzh);
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
        synchronized (zzbai.class) {
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
