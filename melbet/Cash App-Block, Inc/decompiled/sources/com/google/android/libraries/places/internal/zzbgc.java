package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbgc extends zzbjr {
    private static final zzbgc zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;

    static {
        zzbgc zzbgcVar = new zzbgc();
        zzi = zzbgcVar;
        zzbjr.zzbF(zzbgc.class, zzbgcVar);
    }

    public static zzbgc zzj() {
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
            return new zzbll(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbgc();
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
        synchronized (zzbgc.class) {
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
}
