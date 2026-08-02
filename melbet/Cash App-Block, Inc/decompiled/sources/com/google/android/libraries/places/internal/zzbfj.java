package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbfj extends zzbjr {
    private static final zzbfj zzk;
    private static volatile zzblh zzl;
    private int zzb;
    private zzbdb zze;
    private zzbdb zzf;
    private zzbdb zzg;
    private zzbdb zzh;
    private String zzi = "";
    private zzbny zzj;

    static {
        zzbfj zzbfjVar = new zzbfj();
        zzk = zzbfjVar;
        zzbjr.zzbF(zzbfj.class, zzbfjVar);
    }

    public static zzbfj zzk() {
        return zzk;
    }

    public final zzbdb zza() {
        zzbdb zzbdbVar = this.zze;
        return zzbdbVar == null ? zzbdb.zzd() : zzbdbVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005Ȉ\u0006ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzbfj();
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
        synchronized (zzbfj.class) {
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

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final zzbdb zzd() {
        zzbdb zzbdbVar = this.zzf;
        return zzbdbVar == null ? zzbdb.zzd() : zzbdbVar;
    }

    public final boolean zze() {
        return (this.zzb & 4) != 0;
    }

    public final zzbdb zzf() {
        zzbdb zzbdbVar = this.zzg;
        return zzbdbVar == null ? zzbdb.zzd() : zzbdbVar;
    }

    public final boolean zzg() {
        return (this.zzb & 8) != 0;
    }

    public final zzbdb zzh() {
        zzbdb zzbdbVar = this.zzh;
        return zzbdbVar == null ? zzbdb.zzd() : zzbdbVar;
    }

    public final String zzi() {
        return this.zzi;
    }

    public final zzbny zzj() {
        zzbny zzbnyVar = this.zzj;
        return zzbnyVar == null ? zzbny.zzf() : zzbnyVar;
    }
}
