package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzn extends zzbjr {
    private static final zzn zzn;
    private static volatile zzblh zzo;
    private int zzb;
    private zzdh zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private boolean zzj;
    private long zzk;
    private boolean zzl;
    private zzay zzm;

    static {
        zzn zznVar = new zzn();
        zzn = zznVar;
        zzbjr.zzbF(zzn.class, zznVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004᠌\u0003\u0005᠌\u0004\u0006ဇ\u0005\u0007ဂ\u0006\bဇ\u0007\tဉ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzc.zza$17, "zzi", zzf.zza$17, "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzn();
        }
        if (i2 == 4) {
            return new zze(zzn);
        }
        if (i2 == 5) {
            return zzn;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzo;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzn.class) {
            try {
                zzblhVar = zzo;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzn);
                    zzo = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
