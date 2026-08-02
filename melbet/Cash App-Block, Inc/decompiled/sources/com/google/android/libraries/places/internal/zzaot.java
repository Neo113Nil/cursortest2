package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaot extends zzbjr {
    private static final zzaot zzq;
    private static volatile zzblh zzr;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private boolean zzh;
    private boolean zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private zzbkb zzm = zzblk.zzb;
    private int zzn;
    private int zzo;
    private int zzp;

    static {
        zzaot zzaotVar = new zzaot();
        zzq = zzaotVar;
        zzbjr.zzbF(zzaot.class, zzaotVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\t\u001b\nင\b\u000b᠌\t\fင\n", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", zzaos.class, "zzn", "zzo", zzai.zza$28, "zzp"});
        }
        if (i2 == 3) {
            return new zzaot();
        }
        if (i2 == 4) {
            return new zzao(zzq);
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
        synchronized (zzaot.class) {
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
