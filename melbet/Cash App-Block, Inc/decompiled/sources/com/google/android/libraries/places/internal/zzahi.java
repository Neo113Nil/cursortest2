package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzahi extends zzbjr {
    private static final zzahi zzm;
    private static volatile zzblh zzn;
    private int zzb;
    private zzbjz zze;
    private zzbjz zzf;
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private zzbkb zzk;
    private double zzl;

    static {
        zzahi zzahiVar = new zzahi();
        zzm = zzahiVar;
        zzbjr.zzbF(zzahi.class, zzahiVar);
    }

    public zzahi() {
        zzbjs zzbjsVar = zzbjs.zzb;
        this.zze = zzbjsVar;
        this.zzf = zzbjsVar;
        this.zzk = zzblk.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzm, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001\u0016\u0002\u0016\u0003င\u0000\u0004င\u0001\u0005ဂ\u0002\u0006င\u0003\u0007\u001b\bက\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", zzahh.class, "zzl"});
        }
        if (i2 == 3) {
            return new zzahi();
        }
        if (i2 == 4) {
            return new zzaj(zzm);
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
        synchronized (zzahi.class) {
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
