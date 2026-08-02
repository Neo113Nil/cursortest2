package com.google.android.libraries.places.internal;

import java.util.List;

/* loaded from: classes4.dex */
public final class zzbhx extends zzbjr {
    private static final zzbhx zzi;
    private static volatile zzblh zzj;
    private zzbkb zzb;
    private zzbkb zze;
    private zzbkb zzf;
    private String zzg;
    private String zzh;

    static {
        zzbhx zzbhxVar = new zzbhx();
        zzi = zzbhxVar;
        zzbjr.zzbF(zzbhx.class, zzbhxVar);
    }

    public zzbhx() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzb = zzblkVar;
        this.zze = zzblkVar;
        this.zzf = zzblkVar;
        this.zzg = "";
        this.zzh = "";
    }

    public static zzbhx zzf() {
        return zzi;
    }

    public final List zza() {
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
            return new zzbll(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0003\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004Ȉ\u0005Ȉ", new Object[]{"zzb", zzbgj.class, "zze", zzbhd.class, "zzf", zzbdp.class, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbhx();
        }
        if (i2 == 4) {
            return new zzbk(zzi);
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
        synchronized (zzbhx.class) {
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

    public final zzbkb zzc() {
        return this.zze;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final String zze() {
        return this.zzh;
    }
}
