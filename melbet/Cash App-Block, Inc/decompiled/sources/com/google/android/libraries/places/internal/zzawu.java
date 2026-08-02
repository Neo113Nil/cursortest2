package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzawu extends zzbjr {
    private static final zzawu zzk;
    private static volatile zzblh zzl;
    private int zzb;
    private int zze;
    private int zzf;
    private int zzg;
    private String zzh = "";
    private boolean zzi;
    private int zzj;

    static {
        zzawu zzawuVar = new zzawu();
        zzk = zzawuVar;
        zzbjr.zzbF(zzawu.class, zzawuVar);
    }

    public static zzawt zza() {
        return (zzawt) zzk.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzk, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006င\u0005", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzawu();
        }
        if (i2 == 4) {
            return new zzawt(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzl;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzawu.class) {
            try {
                zzblhVar = zzl;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzk);
                    zzl = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zzc(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void zzd(int i) {
        this.zzb |= 2;
        this.zzf = i;
    }

    public final /* synthetic */ void zze(int i) {
        this.zzb |= 4;
        this.zzg = i;
    }

    public final /* synthetic */ void zzf(boolean z) {
        this.zzb |= 16;
        this.zzi = z;
    }

    public final /* synthetic */ void zzg$1(int i) {
        this.zzb |= 32;
        this.zzj = i;
    }
}
