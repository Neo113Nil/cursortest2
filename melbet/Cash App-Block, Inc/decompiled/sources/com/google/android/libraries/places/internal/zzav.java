package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzav extends zzbjr {
    private static final zzav zzm;
    private static volatile zzblh zzn;
    private int zzb;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private long zzi;
    private long zzj;
    private int zzk;
    private int zzl;

    static {
        zzav zzavVar = new zzav();
        zzm = zzavVar;
        zzbjr.zzbF(zzav.class, zzavVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzat zzatVar = zzat.zza;
            zzat zzatVar2 = zzat.zza$29;
            return new zzbll(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007᠌\u0006\b᠌\u0007", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzatVar, "zzi", "zzj", "zzk", zzatVar2, "zzl", zzatVar2});
        }
        if (i2 == 3) {
            return new zzav();
        }
        if (i2 == 4) {
            return new zzaq(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzn;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzav.class) {
            try {
                zzblhVar = zzn;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzm);
                    zzn = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
