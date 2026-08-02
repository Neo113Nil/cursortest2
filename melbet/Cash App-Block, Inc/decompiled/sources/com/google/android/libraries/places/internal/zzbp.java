package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbp extends zzbjr {
    private static final zzbp zzn;
    private static volatile zzblh zzo;
    private int zzb;
    private zzbjz zze = zzbjs.zzb;
    private int zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private float zzj;
    private float zzk;
    private int zzl;
    private zzbl zzm;

    static {
        zzbp zzbpVar = new zzbp();
        zzn = zzbpVar;
        zzbjr.zzbF(zzbp.class, zzbpVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzc zzcVar = zzc.zza$17;
            zzc zzcVar2 = zzc.zza$27;
            return new zzbll(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0001\u0000\u0001ࠬ\u0002᠌\u0000\u0003᠌\u0001\u0004င\u0002\u0005ဂ\u0003\u0006ခ\u0004\u0007ခ\u0005\b᠌\u0006\tဉ\u0007", new Object[]{"zzb", "zze", zzcVar, "zzf", zzcVar2, "zzg", zzcVar2, "zzh", "zzi", "zzj", "zzk", "zzl", zzcVar, "zzm"});
        }
        if (i2 == 3) {
            return new zzbp();
        }
        if (i2 == 4) {
            return new zzbk(zzn);
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
        synchronized (zzbp.class) {
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
