package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbev extends zzbjr {
    private static final zzbev zzj;
    private static volatile zzblh zzk;
    private int zzb;
    private zzbny zze;
    private zzbny zzf;
    private zzbgt zzg;
    private zzbkb zzh = zzblk.zzb;
    private String zzi = "";

    static {
        zzbev zzbevVar = new zzbev();
        zzj = zzbevVar;
        zzbjr.zzbF(zzbev.class, zzbevVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzj, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0002\u0003ဉ\u0001\u0004\u001b\u0005Ȉ", new Object[]{"zzb", "zze", "zzg", "zzf", "zzh", zzbdb.class, "zzi"});
        }
        if (i2 == 3) {
            return new zzbev();
        }
        if (i2 == 4) {
            return new zzbe(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzk;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbev.class) {
            try {
                zzblhVar = zzk;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzj);
                    zzk = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
