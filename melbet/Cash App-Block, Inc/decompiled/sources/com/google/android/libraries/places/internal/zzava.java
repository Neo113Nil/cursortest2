package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzava extends zzbjr {
    private static final zzava zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private int zze;
    private int zzf;
    private boolean zzg;

    static {
        zzava zzavaVar = new zzava();
        zzh = zzavaVar;
        zzbjr.zzbF(zzava.class, zzavaVar);
    }

    public static zzauy zza() {
        return (zzauy) zzh.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003ဇ\u0002", new Object[]{"zzb", "zze", zzc.zza$4, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzava();
        }
        if (i2 == 4) {
            return new zzauy(zzh);
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
        synchronized (zzava.class) {
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

    public final /* synthetic */ void zzd(int i) {
        this.zze = 1;
        this.zzb = 1 | this.zzb;
    }
}
