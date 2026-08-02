package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbfu extends zzbjr {
    private static final zzbfu zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private zzbft zze;
    private zzbft zzf;

    static {
        zzbfu zzbfuVar = new zzbfu();
        zzg = zzbfuVar;
        zzbjr.zzbF(zzbfu.class, zzbfuVar);
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
            return new zzbll(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbfu();
        }
        if (i2 == 4) {
            return new zzbh(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzh;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbfu.class) {
            try {
                zzblhVar = zzh;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzg);
                    zzh = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final zzbft zzc() {
        zzbft zzbftVar = this.zze;
        return zzbftVar == null ? zzbft.zzh() : zzbftVar;
    }

    public final boolean zzd() {
        return (this.zzb & 2) != 0;
    }

    public final zzbft zze() {
        zzbft zzbftVar = this.zzf;
        return zzbftVar == null ? zzbft.zzh() : zzbftVar;
    }
}
