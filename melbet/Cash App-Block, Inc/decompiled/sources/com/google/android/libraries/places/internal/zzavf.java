package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzavf extends zzbjr {
    private static final zzavf zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private int zze;
    private long zzf;
    private int zzg;

    static {
        zzavf zzavfVar = new zzavf();
        zzh = zzavfVar;
        zzbjr.zzbF(zzavf.class, zzavfVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0001\u0003\u0000\u0001\u0001\b\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001\b᠌\u0002", new Object[]{"zzb", "zze", zzc.zza$5, "zzf", "zzg", zzanz.zza$12});
        }
        if (i2 == 3) {
            return new zzavf();
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
        synchronized (zzavf.class) {
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
