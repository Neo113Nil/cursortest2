package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbff extends zzbjr {
    private static final zzbff zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private zzbfe zzf;
    private String zze = "";
    private String zzg = "";

    static {
        zzbff zzbffVar = new zzbff();
        zzh = zzbffVar;
        zzbjr.zzbF(zzbff.class, zzbffVar);
    }

    public static zzbff zzf() {
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
            return new zzbll(zzh, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbff();
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
        synchronized (zzbff.class) {
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

    public final boolean zzc() {
        return (this.zzb & 1) != 0;
    }

    public final zzbfe zzd() {
        zzbfe zzbfeVar = this.zzf;
        return zzbfeVar == null ? zzbfe.zze() : zzbfeVar;
    }

    public final String zze() {
        return this.zzg;
    }
}
