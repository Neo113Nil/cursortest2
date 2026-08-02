package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzauj extends zzbjr {
    private static final zzauj zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private zzarj zze;
    private int zzf;
    private int zzg;
    private zzavc zzh;

    static {
        zzauj zzaujVar = new zzauj();
        zzi = zzaujVar;
        zzbjr.zzbF(zzauj.class, zzaujVar);
    }

    public static zzauh zza$1() {
        return (zzauh) zzi.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzi, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002᠌\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"zzb", "zze", "zzf", zzc.zza$1, "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzauj();
        }
        if (i2 == 4) {
            return new zzauh(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzj;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzauj.class) {
            try {
                zzblhVar = zzj;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzi);
                    zzj = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zzc(int i) {
        this.zzb |= 4;
        this.zzg = i;
    }

    public final /* synthetic */ void zzd(zzavc zzavcVar) {
        this.zzh = zzavcVar;
        this.zzb |= 8;
    }

    public final /* synthetic */ void zzf$1(int i) {
        this.zzf = i - 1;
        this.zzb |= 2;
    }
}
