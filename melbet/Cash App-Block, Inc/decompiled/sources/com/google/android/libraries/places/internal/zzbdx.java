package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbdx extends zzbjr {
    private static final zzbdx zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private zzbkb zze;
    private zzbkb zzf;

    static {
        zzbdx zzbdxVar = new zzbdx();
        zzg = zzbdxVar;
        zzbjr.zzbF(zzbdx.class, zzbdxVar);
    }

    public zzbdx() {
        zzblk zzblkVar = zzblk.zzb;
        this.zze = zzblkVar;
        this.zzf = zzblkVar;
    }

    public static zzbdx zzd() {
        return zzg;
    }

    public final int zza() {
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
            return new zzbll(zzg, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u0004\u0002\u001b\u0003\u001b", new Object[]{"zzb", "zze", zzbdu.class, "zzf", zzbdw.class});
        }
        if (i2 == 3) {
            return new zzbdx();
        }
        if (i2 == 4) {
            return new zzbe(zzg);
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
        synchronized (zzbdx.class) {
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

    public final zzbkb zzc() {
        return this.zze;
    }
}
