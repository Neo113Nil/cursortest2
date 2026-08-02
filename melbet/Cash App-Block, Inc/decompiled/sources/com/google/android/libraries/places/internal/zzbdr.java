package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbdr extends zzbjr {
    private static final zzbdr zzn;
    private static volatile zzblh zzo;
    private int zzb;
    private int zze;
    private zzbkb zzf;
    private boolean zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzbkb zzm;

    static {
        zzbdr zzbdrVar = new zzbdr();
        zzn = zzbdrVar;
        zzbjr.zzbF(zzbdr.class, zzbdrVar);
    }

    public zzbdr() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzf = zzblkVar;
        this.zzm = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzn, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0002\u0000\u0001\f\u0002\u001b\u0003\u0007\u0004င\u0000\u0005င\u0001\u0006င\u0002\u0007င\u0003\b\f\t\u001b", new Object[]{"zzb", "zze", "zzf", zzbej.class, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzbej.class});
        }
        if (i2 == 3) {
            return new zzbdr();
        }
        if (i2 == 4) {
            return new zzbe(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzo;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbdr.class) {
            try {
                zzblhVar = zzo;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzn);
                    zzo = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
