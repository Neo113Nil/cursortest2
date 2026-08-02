package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zzgp extends zzadu {
    private static final zzgp zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private int zze = 14;
    private int zzf = 11;
    private int zzg = 60;
    private int zzh = 13;
    private int zzi = 11;

    static {
        zzgp zzgpVar = new zzgp();
        zzj = zzgpVar;
        zzadu.zzcs(zzgp.class, zzgpVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzgp();
        }
        if (i2 == 4) {
            return new zzfi(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzk;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzgp.class) {
            try {
                zzafjVar = zzk;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzj);
                    zzk = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }
}
