package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzajo extends zzbjr {
    private static final zzajo zzm;
    private static volatile zzblh zzn;
    private int zzb;
    private int zze;
    private long zzf;
    private zzaja zzg;
    private long zzh;
    private int zzi;
    private zzbjz zzj;
    private zzbjz zzk;
    private int zzl;

    static {
        zzajo zzajoVar = new zzajo();
        zzm = zzajoVar;
        zzbjr.zzbF(zzajo.class, zzajoVar);
    }

    public zzajo() {
        zzbjs zzbjsVar = zzbjs.zzb;
        this.zzj = zzbjsVar;
        this.zzk = zzbjsVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0002\u0000\u0001᠌\u0000\u0002စ\u0001\u0003ဉ\u0002\u0004ဂ\u0003\u0005င\u0004\u0006\u0016\u0007\u0016\bင\u0005", new Object[]{"zzb", "zze", zzai.zza$9, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzajo();
        }
        if (i2 == 4) {
            return new zzal(zzm);
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
        synchronized (zzajo.class) {
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
