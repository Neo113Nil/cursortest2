package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzben extends zzbjr {
    private static final zzben zzj;
    private static volatile zzblh zzk;
    private int zze;
    private int zzf;
    private String zzb = "";
    private zzbkb zzg = zzblk.zzb;
    private String zzh = "";
    private String zzi = "";

    static {
        zzben zzbenVar = new zzben();
        zzj = zzbenVar;
        zzbjr.zzbF(zzben.class, zzbenVar);
    }

    public final String zza() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzj, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\u0004\u0003\u0004\u0004\u001b\u0005Ȉ\u0006Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg", zzbcb.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzben();
        }
        if (i2 == 4) {
            return new zzbe(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzk;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzben.class) {
            try {
                zzblhVar = zzk;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzj);
                    zzk = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final int zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zzf;
    }

    public final zzbkb zze() {
        return this.zzg;
    }

    public final String zzf() {
        return this.zzh;
    }

    public final String zzg() {
        return this.zzi;
    }
}
