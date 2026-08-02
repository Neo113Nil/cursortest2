package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzaun extends zzbjr {
    private static final zzaun zzj;
    private static volatile zzblh zzk;
    private int zzb;
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzaun zzaunVar = new zzaun();
        zzj = zzaunVar;
        zzbjr.zzbF(zzaun.class, zzaunVar);
    }

    public static zzaum zzg() {
        return (zzaum) zzj.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzj, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzaun();
        }
        if (i2 == 4) {
            return new zzaum(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzk;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzaun.class) {
            try {
                zzblhVar = zzk;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzj);
                    zzk = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zzh(boolean z) {
        this.zzb |= 1;
        this.zze = z;
    }

    public final /* synthetic */ void zzi(boolean z) {
        this.zzb |= 2;
        this.zzf = z;
    }

    public final /* synthetic */ void zzj(boolean z) {
        this.zzb |= 4;
        this.zzg = z;
    }

    public final /* synthetic */ void zzk(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }

    public final /* synthetic */ void zzl(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }
}
