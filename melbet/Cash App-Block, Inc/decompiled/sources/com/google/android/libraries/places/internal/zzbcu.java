package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbcu extends zzbjr {
    private static final zzbcu zzf;
    private static volatile zzblh zzg;
    private int zzb = 0;
    private Object zze;

    static {
        zzbcu zzbcuVar = new zzbcu();
        zzf = zzbcuVar;
        zzbjr.zzbF(zzbcu.class, zzbcuVar);
    }

    public final boolean zza() {
        return this.zzb == 1;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzf, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"zze", "zzb", zzbcn.class, zzbcp.class});
        }
        if (i2 == 3) {
            return new zzbcu();
        }
        if (i2 == 4) {
            return new zzbe(zzf);
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
        synchronized (zzbcu.class) {
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

    public final zzbcn zzc() {
        return this.zzb == 1 ? (zzbcn) this.zze : zzbcn.zzg();
    }
}
