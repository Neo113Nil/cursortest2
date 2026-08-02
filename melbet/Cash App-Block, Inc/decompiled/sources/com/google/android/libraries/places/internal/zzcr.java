package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzcr extends zzbjr {
    private static final zzcr zzl;
    private static volatile zzblh zzm;
    private int zzb;
    private zzbkb zze;
    private zzbkb zzf;
    private zzbkb zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private long zzk;

    static {
        zzcr zzcrVar = new zzcr();
        zzl = zzcrVar;
        zzbjr.zzbF(zzcr.class, zzcrVar);
    }

    public zzcr() {
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
            return new zzbll(zzl, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0003\u0000\u0002\u001b\u0003\u001b\u0004င\u0000\u0005င\u0001\u0006င\u0002\u0007ဂ\u0003\b\u001b", new Object[]{"zzb", "zzf", zzcq.class, "zzg", zzco.class, "zzh", "zzi", "zzj", "zzk", "zze", zzcc.class});
        }
        if (i2 == 3) {
            return new zzcr();
        }
        if (i2 == 4) {
            return new zzbk(zzl);
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
        synchronized (zzcr.class) {
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
}
