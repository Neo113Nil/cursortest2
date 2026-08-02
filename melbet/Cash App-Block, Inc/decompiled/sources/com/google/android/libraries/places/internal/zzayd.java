package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzayd extends zzbjr {
    private static final zzayd zzn;
    private static volatile zzblh zzo;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;
    private boolean zzm;

    static {
        zzayd zzaydVar = new zzayd();
        zzn = zzaydVar;
        zzbjr.zzbF(zzayd.class, zzaydVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzn, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007ဇ\u0006\bဇ\u0007\tဇ\b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm"});
        }
        if (i2 == 3) {
            return new zzayd();
        }
        if (i2 == 4) {
            return new zzba(zzn);
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
        synchronized (zzayd.class) {
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
