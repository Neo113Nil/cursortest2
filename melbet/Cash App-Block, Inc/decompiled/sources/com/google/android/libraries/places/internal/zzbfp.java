package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbfp extends zzbjr {
    private static final zzbfp zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private zzbdb zze;
    private zzbdb zzf;
    private String zzg = "";
    private zzbny zzh;

    static {
        zzbfp zzbfpVar = new zzbfp();
        zzi = zzbfpVar;
        zzbjr.zzbF(zzbfp.class, zzbfpVar);
    }

    public static zzbfp zzh() {
        return zzi;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003Ȉ\u0004ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbfp();
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
        synchronized (zzbfp.class) {
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

    public final zzbdb zzc() {
        zzbdb zzbdbVar = this.zze;
        return zzbdbVar == null ? zzbdb.zzd() : zzbdbVar;
    }

    public final boolean zzd() {
        return (this.zzb & 2) != 0;
    }

    public final zzbdb zze() {
        zzbdb zzbdbVar = this.zzf;
        return zzbdbVar == null ? zzbdb.zzd() : zzbdbVar;
    }

    public final String zzf() {
        return this.zzg;
    }

    public final zzbny zzg() {
        zzbny zzbnyVar = this.zzh;
        return zzbnyVar == null ? zzbny.zzf() : zzbnyVar;
    }
}
