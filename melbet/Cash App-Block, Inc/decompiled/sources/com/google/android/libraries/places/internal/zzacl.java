package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzacl extends zzbjr {
    private static final zzacl zzj;
    private static volatile zzblh zzk;
    private int zzb;
    private zzacf zze;
    private zzacw zzf;
    private zzadb zzg;
    private zzaig zzh;
    private int zzi;

    static {
        zzacl zzaclVar = new zzacl();
        zzj = zzaclVar;
        zzbjr.zzbF(zzacl.class, zzaclVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005ဋ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzacl();
        }
        if (i2 == 4) {
            return new zzac(11, zzj);
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
        synchronized (zzacl.class) {
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
