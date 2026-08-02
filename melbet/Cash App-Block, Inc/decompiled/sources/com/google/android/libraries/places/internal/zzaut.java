package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaut extends zzbjr {
    private static final zzaut zzm;
    private static volatile zzblh zzn;
    private int zzb;
    private zzaqn zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;

    static {
        zzaut zzautVar = new zzaut();
        zzm = zzautVar;
        zzbjr.zzbF(zzaut.class, zzautVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003᠌\u0002\u0004ဇ\u0003\u0005ဂ\u0004\u0006᠌\u0005\u0007င\u0006\b᠌\u0007", new Object[]{"zzb", "zze", "zzf", zzanz.zza$19, "zzg", zzc.zza$3, "zzh", "zzi", "zzj", zzc.zza$2, "zzk", "zzl", zzanz.zza$12});
        }
        if (i2 == 3) {
            return new zzaut();
        }
        if (i2 == 4) {
            return new zzaw(zzm);
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
        synchronized (zzaut.class) {
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
