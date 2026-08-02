package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzazv extends zzbjr {
    private static final zzazv zzg;
    private static volatile zzblh zzh;
    private int zzb;
    private zzbnw zze;
    private zzbnw zzf;

    static {
        zzazv zzazvVar = new zzazv();
        zzg = zzazvVar;
        zzbjr.zzbF(zzazv.class, zzazvVar);
    }

    public static zzazv zze() {
        return zzg;
    }

    public final zzbnw zza() {
        zzbnw zzbnwVar = this.zze;
        return zzbnwVar == null ? zzbnw.zzg() : zzbnwVar;
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
            return new zzazv();
        }
        if (i2 == 4) {
            return new zzba(zzg);
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
        synchronized (zzazv.class) {
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

    public final zzbnw zzc() {
        zzbnw zzbnwVar = this.zzf;
        return zzbnwVar == null ? zzbnw.zzg() : zzbnwVar;
    }
}
