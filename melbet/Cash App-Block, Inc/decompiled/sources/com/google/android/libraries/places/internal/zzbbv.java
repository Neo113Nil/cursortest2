package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbbv extends zzbjr {
    private static final zzbbv zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private zzbny zzg;
    private int zzh;

    static {
        zzbbv zzbbvVar = new zzbbv();
        zzi = zzbbvVar;
        zzbjr.zzbF(zzbbv.class, zzbbvVar);
    }

    public final String zza() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbbv();
        }
        if (i2 == 4) {
            return new zzba(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzj;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbbv.class) {
            try {
                zzblhVar = zzj;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzi);
                    zzj = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final zzbny zzd() {
        zzbny zzbnyVar = this.zzg;
        return zzbnyVar == null ? zzbny.zzf() : zzbnyVar;
    }

    public final int zzf() {
        int i = this.zzh;
        int i2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? 0 : 5 : 4 : 3 : 2;
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }
}
