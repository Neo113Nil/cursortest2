package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbg extends zzbjr {
    private static final zzbg zzl;
    private static volatile zzblh zzm;
    private int zzb;
    private int zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private zzbjz zzj = zzbjs.zzb;
    private int zzk;

    static {
        zzbg zzbgVar = new zzbg();
        zzl = zzbgVar;
        zzbjr.zzbF(zzbg.class, zzbgVar);
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
            zzc zzcVar2 = zzc.zza$26;
            return new zzbll(zzl, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001᠌\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004င\u0003\u0005င\u0004\u0006ࠞ\u0007᠌\u0005", new Object[]{"zzb", "zze", zzcVar, "zzf", "zzg", "zzh", "zzi", "zzj", zzcVar2, "zzk", zzcVar2});
        }
        if (i2 == 3) {
            return new zzbg();
        }
        if (i2 == 4) {
            return new zzbe(zzl);
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
        synchronized (zzbg.class) {
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
