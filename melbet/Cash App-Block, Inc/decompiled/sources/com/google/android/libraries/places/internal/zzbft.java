package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbft extends zzbjr {
    private static final zzbft zzj;
    private static volatile zzblh zzk;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private zzbnu zzh;
    private boolean zzi;

    static {
        zzbft zzbftVar = new zzbft();
        zzj = zzbftVar;
        zzbjr.zzbF(zzbft.class, zzbftVar);
    }

    public static zzbft zzh() {
        return zzj;
    }

    public final int zza() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzj, "\u0000\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0005\u0007\u0006ဉ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzi", "zzh"});
        }
        if (i2 == 3) {
            return new zzbft();
        }
        if (i2 == 4) {
            return new zzbh(zzj);
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
        synchronized (zzbft.class) {
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
        return this.zzf;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final boolean zze() {
        return (this.zzb & 8) != 0;
    }

    public final zzbnu zzf() {
        zzbnu zzbnuVar = this.zzh;
        return zzbnuVar == null ? zzbnu.zzg() : zzbnuVar;
    }

    public final boolean zzg() {
        return this.zzi;
    }
}
