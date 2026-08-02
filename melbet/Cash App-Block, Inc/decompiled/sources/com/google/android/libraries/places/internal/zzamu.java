package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzamu extends zzbjr {
    private static final zzamu zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    static {
        zzamu zzamuVar = new zzamu();
        zzh = zzamuVar;
        zzbjr.zzbF(zzamu.class, zzamuVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003᠌\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", zzai.zza$18});
        }
        if (i2 == 3) {
            return new zzamu();
        }
        if (i2 == 4) {
            return new zzao(zzh);
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
        synchronized (zzamu.class) {
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
