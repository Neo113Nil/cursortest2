package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzagc extends zzbjr {
    private static final zzagc zzl;
    private static volatile zzblh zzm;
    private int zzb;
    private long zze;
    private int zzg;
    private long zzh;
    private long zzi;
    private long zzj;
    private zzbkt zzk = zzbkt.zzb;
    private zzbim zzf = zzbim.zza;

    static {
        zzagc zzagcVar = new zzagc();
        zzl = zzagcVar;
        zzbjr.zzbF(zzagc.class, zzagcVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0001\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001\u0003᠌\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u00072", new Object[]{"zzb", "zze", "zzf", "zzg", zzc.zza, "zzh", "zzi", "zzj", "zzk", zzaga.zza});
        }
        if (i2 == 3) {
            return new zzagc();
        }
        if (i2 == 4) {
            return new zzag(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzm;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzagc.class) {
            try {
                zzblhVar = zzm;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzl);
                    zzm = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
