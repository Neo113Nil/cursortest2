package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbhc extends zzbjr {
    private static final zzbhc zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private zzbiz zze;
    private int zzf;

    static {
        zzbhc zzbhcVar = new zzbhc();
        zzg = zzbhcVar;
        zzbjr.zzbF(zzbhc.class, zzbhcVar);
    }

    public final zzbiz zza() {
        zzbiz zzbizVar = this.zze;
        return zzbizVar == null ? zzbiz.zzf() : zzbizVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002\u0004", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbhc();
        }
        if (i2 == 4) {
            return new zzbh(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzh;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbhc.class) {
            try {
                zzblhVar = zzh;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzg);
                    zzh = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final int zzc() {
        return this.zzf;
    }
}
