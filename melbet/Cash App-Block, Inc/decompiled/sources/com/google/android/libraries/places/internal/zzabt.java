package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzabt extends zzbjr {
    private static final zzabt zzm;
    private static volatile zzblh zzn;
    private int zzb;
    private boolean zzg;
    private boolean zzh;
    private long zzi;
    private float zzj;
    private int zzl;
    private zzbjz zze = zzbjs.zzb;
    private String zzf = "";
    private zzbim zzk = zzbim.zza;

    static {
        zzabt zzabtVar = new zzabt();
        zzm = zzabtVar;
        zzbjr.zzbF(zzabt.class, zzabtVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ࠬ\u0002ဈ\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဂ\u0003\u0006ခ\u0004\u0007ည\u0005\bင\u0006", new Object[]{"zzb", "zze", zzaa.zza$2, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzabt();
        }
        if (i2 == 4) {
            return new zzac(5, zzm);
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
        synchronized (zzabt.class) {
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
