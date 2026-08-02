package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbfl extends zzbjr {
    private static final zzbfl zzk;
    private static volatile zzblh zzl;
    private int zzb;
    private zzbny zze;
    private zzbny zzg;
    private zzbgt zzi;
    private zzbny zzj;
    private String zzf = "";
    private String zzh = "";

    static {
        zzbfl zzbflVar = new zzbfl();
        zzk = zzbflVar;
        zzbjr.zzbF(zzbfl.class, zzbflVar);
    }

    public static zzbfl zzg() {
        return zzk;
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
            return new zzbll(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004Ȉ\u0005Ȉ\u0006ဉ\u0003", new Object[]{"zzb", "zze", "zzg", "zzi", "zzf", "zzh", "zzj"});
        }
        if (i2 == 3) {
            return new zzbfl();
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
        synchronized (zzbfl.class) {
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

    public final zzbny zzc() {
        zzbny zzbnyVar = this.zze;
        return zzbnyVar == null ? zzbny.zzf() : zzbnyVar;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final boolean zze() {
        return (this.zzb & 8) != 0;
    }

    public final zzbny zzf() {
        zzbny zzbnyVar = this.zzj;
        return zzbnyVar == null ? zzbny.zzf() : zzbnyVar;
    }
}
