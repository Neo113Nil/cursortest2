package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzj extends zzbjr {
    private static final zzj zzq;
    private static volatile zzblh zzr;
    private int zzb;
    private zzdq zze;
    private zzan zzf;
    private zzq zzg;
    private zzs zzh;
    private zzn zzi;
    private zzab zzj;
    private zzl zzk;
    private zzw zzl;
    private zzah zzm;
    private zzaf zzn;
    private zzy zzo;
    private zzad zzp;

    static {
        zzj zzjVar = new zzj();
        zzq = zzjVar;
        zzbjr.zzbF(zzj.class, zzjVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0001\u0002ဉ\u0002\u0003ဉ\u0003\u0004ဉ\u0004\u0005ဉ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bဉ\b\tဉ\t\nဉ\u0000\u000bဉ\n\fဉ\u000b", new Object[]{"zzb", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zze", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new zzj();
        }
        if (i2 == 4) {
            return new zze(zzq);
        }
        if (i2 == 5) {
            return zzq;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzr;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzj.class) {
            try {
                zzblhVar = zzr;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzq);
                    zzr = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }
}
