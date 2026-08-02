package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbfe extends zzbjr {
    private static final zzbfe zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private zzbfd zzg;

    static {
        zzbfe zzbfeVar = new zzbfe();
        zzh = zzbfeVar;
        zzbjr.zzbF(zzbfe.class, zzbfeVar);
    }

    public static zzbfe zze() {
        return zzh;
    }

    public final String zza() {
        return this.zze;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbfe();
        }
        if (i2 == 4) {
            return new zzbh(zzh);
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
        synchronized (zzbfe.class) {
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
        return this.zzf;
    }

    public final zzbfd zzd() {
        zzbfd zzbfdVar = this.zzg;
        return zzbfdVar == null ? zzbfd.zzd() : zzbfdVar;
    }
}
