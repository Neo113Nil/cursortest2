package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbgr extends zzbjr {
    private static final zzbgr zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private zzboa zze;
    private zzboa zzf;

    static {
        zzbgr zzbgrVar = new zzbgr();
        zzg = zzbgrVar;
        zzbjr.zzbF(zzbgr.class, zzbgrVar);
    }

    public static zzbgr zzf() {
        return zzg;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzg, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzbgr();
        }
        if (i2 == 4) {
            return new zzbh(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzh;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbgr.class) {
            try {
                zzblhVar = zzh;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzg);
                    zzh = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final zzboa zzc() {
        zzboa zzboaVar = this.zze;
        return zzboaVar == null ? zzboa.zzg() : zzboaVar;
    }

    public final boolean zzd() {
        return (this.zzb & 2) != 0;
    }

    public final zzboa zze() {
        zzboa zzboaVar = this.zzf;
        return zzboaVar == null ? zzboa.zzg() : zzboaVar;
    }
}
