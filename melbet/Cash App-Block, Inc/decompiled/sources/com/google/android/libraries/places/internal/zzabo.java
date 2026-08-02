package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzabo extends zzbjr {
    private static final zzabo zzq;
    private static volatile zzblh zzr;
    private int zzb;
    private zzabn zze;
    private zzabn zzf;
    private zzabn zzg;
    private zzabn zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private int zzn;
    private int zzo;
    private int zzp;

    static {
        zzabo zzaboVar = new zzabo();
        zzq = zzaboVar;
        zzbjr.zzbF(zzabo.class, zzaboVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzq, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဉ\u0003\u0005င\u0004\u0006င\u0005\u0007င\u0006\bင\u0007\tင\b\nင\t\u000bင\n\fင\u000b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", "zzp"});
        }
        if (i2 == 3) {
            return new zzabo();
        }
        if (i2 == 4) {
            return new zzac(2, zzq);
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
        synchronized (zzabo.class) {
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
