package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzawq extends zzbjr {
    private static final zzawq zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private int zze;
    private zzbkb zzf;
    private zzbkb zzg;
    private zzbkb zzh;

    static {
        zzawq zzawqVar = new zzawq();
        zzi = zzawqVar;
        zzbjr.zzbF(zzawq.class, zzawqVar);
    }

    public zzawq() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzf = zzblkVar;
        this.zzg = zzblkVar;
        this.zzh = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0003\u0000\u0001င\u0000\u0002\u001a\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", zzaws.class, "zzh", zzapu.class});
        }
        if (i2 == 3) {
            return new zzawq();
        }
        if (i2 == 4) {
            return new zzaw(zzi);
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
        synchronized (zzawq.class) {
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
