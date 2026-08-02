package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzawm extends zzbjr {
    private static final zzawm zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private int zze;
    private zzbkb zzf;
    private zzbkb zzg;

    static {
        zzawm zzawmVar = new zzawm();
        zzh = zzawmVar;
        zzbjr.zzbF(zzawm.class, zzawmVar);
    }

    public zzawm() {
        zzblk zzblkVar = zzblk.zzb;
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
            return new zzbll(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001င\u0000\u0002\u001a\u0003\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", zzawo.class});
        }
        if (i2 == 3) {
            return new zzawm();
        }
        if (i2 == 4) {
            return new zzaw(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzi;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzawm.class) {
            try {
                zzblhVar = zzi;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzh);
                    zzi = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
