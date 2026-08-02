package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzacs extends zzbjr {
    private static final zzacs zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private zzbkb zze = zzblk.zzb;
    private int zzf;

    static {
        zzacs zzacsVar = new zzacs();
        zzg = zzacsVar;
        zzbjr.zzbF(zzacs.class, zzacsVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဋ\u0000", new Object[]{"zzb", "zze", zzacq.class, "zzf"});
        }
        if (i2 == 3) {
            return new zzacs();
        }
        if (i2 == 4) {
            return new zzac(14, zzg);
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
        synchronized (zzacs.class) {
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
}
