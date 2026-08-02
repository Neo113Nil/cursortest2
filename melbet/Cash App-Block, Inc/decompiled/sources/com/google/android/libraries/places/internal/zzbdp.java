package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbdp extends zzbjr {
    private static final zzbdp zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private zzbkb zze;
    private zzbkb zzf;
    private zzbkb zzg;
    private zzbde zzh;

    static {
        zzbdp zzbdpVar = new zzbdp();
        zzi = zzbdpVar;
        zzbjr.zzbF(zzbdp.class, zzbdpVar);
    }

    public zzbdp() {
        zzblk zzblkVar = zzblk.zzb;
        this.zze = zzblkVar;
        this.zzf = zzblkVar;
        this.zzg = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzi, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဉ\u0000", new Object[]{"zzb", "zze", zzbgv.class, "zzf", zzben.class, "zzg", zzbdo.class, "zzh"});
        }
        if (i2 == 3) {
            return new zzbdp();
        }
        if (i2 == 4) {
            return new zzbe(zzi);
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
        synchronized (zzbdp.class) {
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
}
