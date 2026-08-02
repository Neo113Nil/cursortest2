package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbgg extends zzbjr {
    private static final zzbgg zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private zzbny zze;
    private zzbny zzg;
    private String zzf = "";
    private String zzh = "";

    static {
        zzbgg zzbggVar = new zzbgg();
        zzi = zzbggVar;
        zzbjr.zzbF(zzbgg.class, zzbggVar);
    }

    public static zzbgg zzf() {
        return zzi;
    }

    public final zzbny zza() {
        zzbny zzbnyVar = this.zze;
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
            return new zzbll(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002Ȉ\u0003ဉ\u0001\u0004Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbgg();
        }
        if (i2 == 4) {
            return new zzbh(zzi);
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
        synchronized (zzbgg.class) {
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

    public final String zze() {
        return this.zzh;
    }
}
