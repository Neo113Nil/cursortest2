package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbga extends zzbjr {
    private static final zzbga zzl;
    private static volatile zzblh zzm;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    static {
        zzbga zzbgaVar = new zzbga();
        zzl = zzbgaVar;
        zzbjr.zzbF(zzbga.class, zzbgaVar);
    }

    public static zzbga zzp() {
        return zzl;
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
            return new zzbll(zzl, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzbga();
        }
        if (i2 == 4) {
            return new zzbh(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzm;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbga.class) {
            try {
                zzblhVar = zzm;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzl);
                    zzm = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final boolean zzc() {
        return this.zze;
    }

    public final boolean zzd() {
        return (this.zzb & 2) != 0;
    }

    public final boolean zze() {
        return this.zzf;
    }

    public final boolean zzf() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zzg() {
        return this.zzg;
    }

    public final boolean zzh() {
        return (this.zzb & 8) != 0;
    }

    public final boolean zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        return (this.zzb & 16) != 0;
    }

    public final boolean zzk() {
        return this.zzi;
    }

    public final boolean zzl() {
        return (this.zzb & 32) != 0;
    }

    public final boolean zzm() {
        return this.zzj;
    }

    public final boolean zzn() {
        return (this.zzb & 64) != 0;
    }

    public final boolean zzo() {
        return this.zzk;
    }
}
