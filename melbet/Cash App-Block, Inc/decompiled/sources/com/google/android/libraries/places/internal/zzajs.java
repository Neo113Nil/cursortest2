package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzajs extends zzbjr {
    private static final zzajs zzj;
    private static volatile zzblh zzk;
    private int zzb;
    private long zze;
    private zzaja zzf;
    private long zzg;
    private int zzh;
    private boolean zzi;

    static {
        zzajs zzajsVar = new zzajs();
        zzj = zzajsVar;
        zzbjr.zzbF(zzajs.class, zzajsVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001စ\u0000\u0002ဉ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzajs();
        }
        if (i2 == 4) {
            return new zzal(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzk;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzajs.class) {
            try {
                zzblhVar = zzk;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzj);
                    zzk = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
