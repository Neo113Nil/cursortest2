package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbny extends zzbjr {
    private static final zzbny zzf;
    private static volatile zzblh zzg;
    private String zzb = "";
    private String zze = "";

    static {
        zzbny zzbnyVar = new zzbny();
        zzf = zzbnyVar;
        zzbjr.zzbF(zzbny.class, zzbnyVar);
    }

    public static zzbny zzf() {
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
            return new zzbll(zzf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzbny();
        }
        if (i2 == 4) {
            return new zzbk(zzf);
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
        synchronized (zzbny.class) {
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

    public final String zzc() {
        return this.zzb;
    }

    public final String zze() {
        return this.zze;
    }
}
