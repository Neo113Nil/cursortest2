package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzblx extends zzbjr {
    private static final zzblx zzf;
    private static volatile zzblh zzg;
    private long zzb;
    private int zze;

    static {
        zzblx zzblxVar = new zzblx();
        zzf = zzblxVar;
        zzbjr.zzbF(zzblx.class, zzblxVar);
    }

    public static zzblw zzf() {
        return (zzblw) zzf.zzbB();
    }

    public static zzblx zzg() {
        return zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002\u0004", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzblx();
        }
        if (i2 == 4) {
            return new zzblw(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzg;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzblx.class) {
            try {
                zzblhVar = zzg;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzf);
                    zzg = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final long zzc() {
        return this.zzb;
    }

    public final int zze() {
        return this.zze;
    }

    public final /* synthetic */ void zzh(long j) {
        this.zzb = j;
    }

    public final /* synthetic */ void zzi(int i) {
        this.zze = i;
    }
}
