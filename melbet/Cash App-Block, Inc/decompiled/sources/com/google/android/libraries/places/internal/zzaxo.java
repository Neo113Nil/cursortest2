package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaxo extends zzbjr {
    private static final zzaxo zzo;
    private static volatile zzblh zzp;
    private int zzb;
    private long zze;
    private int zzf;
    private long zzg;
    private zzbim zzh = zzbim.zza;
    private long zzi;
    private long zzj;
    private long zzk;
    private float zzl;
    private boolean zzm;
    private int zzn;

    static {
        zzaxo zzaxoVar = new zzaxo();
        zzo = zzaxoVar;
        zzbjr.zzbF(zzaxo.class, zzaxoVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzo, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ဂ\u0002\u0004ည\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bခ\u0007\tဇ\b\nင\t", new Object[]{"zzb", "zze", "zzf", zzc.zza$15, "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn"});
        }
        if (i2 == 3) {
            return new zzaxo();
        }
        if (i2 == 4) {
            return new zzba(zzo);
        }
        if (i2 == 5) {
            return zzo;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzp;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaxo.class) {
            try {
                zzblhVar = zzp;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzo);
                    zzp = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
