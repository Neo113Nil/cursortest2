package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbge extends zzbjr {
    private static final zzbge zzf;
    private static volatile zzblh zzg;
    private String zzb = "";
    private String zze = "";

    static {
        zzbge zzbgeVar = new zzbge();
        zzf = zzbgeVar;
        zzbjr.zzbF(zzbge.class, zzbgeVar);
    }

    public static zzbge zzd() {
        return zzf;
    }

    public final String zza() {
        return this.zzb;
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
            return new zzbge();
        }
        if (i2 == 4) {
            return new zzbh(zzf);
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
        synchronized (zzbge.class) {
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
        return this.zze;
    }
}
