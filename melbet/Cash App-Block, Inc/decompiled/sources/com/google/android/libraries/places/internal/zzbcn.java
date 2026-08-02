package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbcn extends zzbjr {
    private static final zzbcn zzk;
    private static volatile zzblh zzl;
    private int zzb;
    private zzbcl zzg;
    private zzbct zzh;
    private int zzj;
    private String zze = "";
    private String zzf = "";
    private zzbkb zzi = zzblk.zzb;

    static {
        zzbcn zzbcnVar = new zzbcn();
        zzk = zzbcnVar;
        zzbjr.zzbF(zzbcn.class, zzbcnVar);
    }

    public static zzbcn zzg() {
        return zzk;
    }

    public final String zza() {
        return this.zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004ဉ\u0001\u0005Ț\u0006\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzbcn();
        }
        if (i2 == 4) {
            return new zzbe(zzk);
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
        synchronized (zzbcn.class) {
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

    public final zzbcl zzc() {
        zzbcl zzbclVar = this.zzg;
        return zzbclVar == null ? zzbcl.zzd() : zzbclVar;
    }

    public final zzbct zzd() {
        zzbct zzbctVar = this.zzh;
        return zzbctVar == null ? zzbct.zzd() : zzbctVar;
    }

    public final zzbkb zze() {
        return this.zzi;
    }

    public final int zzf() {
        return this.zzj;
    }
}
