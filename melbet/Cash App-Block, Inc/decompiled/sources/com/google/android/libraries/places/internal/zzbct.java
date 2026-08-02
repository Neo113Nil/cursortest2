package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbct extends zzbjr {
    private static final zzbct zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private zzbcl zze;
    private zzbcl zzf;

    static {
        zzbct zzbctVar = new zzbct();
        zzg = zzbctVar;
        zzbjr.zzbF(zzbct.class, zzbctVar);
    }

    public static zzbct zzd() {
        return zzg;
    }

    public final zzbcl zza() {
        zzbcl zzbclVar = this.zze;
        return zzbclVar == null ? zzbcl.zzd() : zzbclVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbct();
        }
        if (i2 == 4) {
            return new zzbe(zzg);
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
        synchronized (zzbct.class) {
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

    public final zzbcl zzc() {
        zzbcl zzbclVar = this.zzf;
        return zzbclVar == null ? zzbcl.zzd() : zzbclVar;
    }
}
