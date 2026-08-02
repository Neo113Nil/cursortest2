package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbi extends zzbjr {
    private static final zzbi zzk;
    private static volatile zzblh zzl;
    private int zzb;
    private zzdq zze;
    private String zzf = "";
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;

    static {
        zzbi zzbiVar = new zzbi();
        zzk = zzbiVar;
        zzbjr.zzbF(zzbi.class, zzbiVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0001\u0002ဉ\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005", new Object[]{"zzb", "zzf", "zze", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzbi();
        }
        if (i2 == 4) {
            return new zzbh(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzl;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbi.class) {
            try {
                zzblhVar = zzl;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzk);
                    zzl = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
