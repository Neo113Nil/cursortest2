package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzauv extends zzbjr {
    private static final zzauv zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private int zzf;
    private boolean zzh;
    private zzbkb zze = zzblk.zzb;
    private String zzg = "";

    static {
        zzauv zzauvVar = new zzauv();
        zzi = zzauvVar;
        zzbjr.zzbF(zzauv.class, zzauvVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001a\u0002᠌\u0000\u0003ဈ\u0001\u0004ဇ\u0002", new Object[]{"zzb", "zze", "zzf", zzc.zza$3, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzauv();
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
        synchronized (zzauv.class) {
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
