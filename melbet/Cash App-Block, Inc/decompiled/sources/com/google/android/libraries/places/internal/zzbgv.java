package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbgv extends zzbjr {
    private static final zzbgv zzo;
    private static volatile zzblh zzp;
    private int zzb;
    private zzbny zzg;
    private zzbny zzh;
    private double zzi;
    private zzbcb zzj;
    private zzblx zzk;
    private zzbnu zzn;
    private String zze = "";
    private String zzf = "";
    private String zzl = "";
    private String zzm = "";

    static {
        zzbgv zzbgvVar = new zzbgv();
        zzo = zzbgvVar;
        zzbjr.zzbF(zzbgv.class, zzbgvVar);
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
            return new zzbll(zzo, "\u0000\n\u0000\u0001\u0001\u0011\n\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0007\u0000\tဉ\u0000\fဉ\u0001\rဉ\u0002\u000eဉ\u0003\u000fȈ\u0010Ȉ\u0011ဉ\u0004", new Object[]{"zzb", "zze", "zzf", "zzi", "zzg", "zzh", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new zzbgv();
        }
        if (i2 == 4) {
            return new zzbh(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzp;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbgv.class) {
            try {
                zzblhVar = zzp;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzo);
                    zzp = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final boolean zzc() {
        return (this.zzb & 1) != 0;
    }

    public final zzbny zzd() {
        zzbny zzbnyVar = this.zzg;
        return zzbnyVar == null ? zzbny.zzf() : zzbnyVar;
    }

    public final boolean zze() {
        return (this.zzb & 2) != 0;
    }

    public final zzbny zzf() {
        zzbny zzbnyVar = this.zzh;
        return zzbnyVar == null ? zzbny.zzf() : zzbnyVar;
    }

    public final double zzg() {
        return this.zzi;
    }

    public final boolean zzh() {
        return (this.zzb & 4) != 0;
    }

    public final zzbcb zzi() {
        zzbcb zzbcbVar = this.zzj;
        return zzbcbVar == null ? zzbcb.zze() : zzbcbVar;
    }

    public final boolean zzj() {
        return (this.zzb & 8) != 0;
    }

    public final zzblx zzk() {
        zzblx zzblxVar = this.zzk;
        return zzblxVar == null ? zzblx.zzg() : zzblxVar;
    }

    public final String zzl() {
        return this.zzl;
    }

    public final boolean zzm() {
        return (this.zzb & 16) != 0;
    }

    public final zzbnu zzn() {
        zzbnu zzbnuVar = this.zzn;
        return zzbnuVar == null ? zzbnu.zzg() : zzbnuVar;
    }
}
