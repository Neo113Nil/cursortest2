package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbdb extends zzbjr {
    private static final zzbdb zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private zzbny zzf;
    private zzbgt zzg;
    private String zze = "";
    private zzbkb zzh = zzblk.zzb;

    static {
        zzbdb zzbdbVar = new zzbdb();
        zzi = zzbdbVar;
        zzbjr.zzbF(zzbdb.class, zzbdbVar);
    }

    public static zzbdb zzd() {
        return zzi;
    }

    public final zzbny zza() {
        zzbny zzbnyVar = this.zzf;
        return zzbnyVar == null ? zzbny.zzf() : zzbnyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004Ț", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbdb();
        }
        if (i2 == 4) {
            return new zzbe(zzi);
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
        synchronized (zzbdb.class) {
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

    public final zzbkb zzc() {
        return this.zzh;
    }
}
