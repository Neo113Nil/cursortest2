package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzavo extends zzbjr {
    private static final zzavo zzf;
    private static volatile zzblh zzg;
    private zzbkb zzb;
    private zzbkb zze;

    static {
        zzavo zzavoVar = new zzavo();
        zzf = zzavoVar;
        zzbjr.zzbF(zzavo.class, zzavoVar);
    }

    public zzavo() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzb = zzblkVar;
        this.zze = zzblkVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzf, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[]{"zzb", "zze", zzapu.class});
        }
        if (i2 == 3) {
            return new zzavo();
        }
        if (i2 == 4) {
            return new zzaw(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzg;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzavo.class) {
            try {
                zzblhVar = zzg;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzf);
                    zzg = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
