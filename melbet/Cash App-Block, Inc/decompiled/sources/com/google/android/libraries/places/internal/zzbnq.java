package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbnq extends zzbjo {
    private static final zzbnq zzf;
    private static volatile zzblh zzg;
    private byte zze;

    static {
        zzbnq zzbnqVar = new zzbnq();
        zzf = zzbnqVar;
        zzbjr.zzbF(zzbnq.class, zzbnqVar);
    }

    public zzbnq() {
        ((zzbjo) this).zzb = zzbjh.zzd;
        this.zze = (byte) 2;
    }

    public static zzbnq zzc() {
        return zzf;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i2 == 2) {
            return new zzbll(zzf, "\u0003\u0000", null);
        }
        if (i2 == 3) {
            return new zzbnq();
        }
        if (i2 == 4) {
            return new zzac(1, zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            this.zze = zzbjrVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzblh zzblhVar2 = zzg;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbnq.class) {
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
}
