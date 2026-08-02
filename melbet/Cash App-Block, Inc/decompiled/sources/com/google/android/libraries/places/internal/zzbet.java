package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbet extends zzbjr {
    private static final zzbet zzh;
    private static volatile zzblh zzi;
    private String zzb = "";
    private String zze = "";
    private zzbkb zzf = zzblk.zzb;
    private String zzg = "";

    static {
        zzbet zzbetVar = new zzbet();
        zzh = zzbetVar;
        zzbjr.zzbF(zzbet.class, zzbetVar);
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
            return new zzbll(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbet();
        }
        if (i2 == 4) {
            return new zzbe(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzi;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbet.class) {
            try {
                zzblhVar = zzi;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzh);
                    zzi = zzblhVar;
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

    public final zzbkb zzd() {
        return this.zzf;
    }
}
