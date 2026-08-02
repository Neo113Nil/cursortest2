package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbnh extends zzbjr {
    private static final zzbnh zzf;
    private static volatile zzblh zzg;
    private int zzb;
    private String zze = "";

    static {
        zzbnh zzbnhVar = new zzbnh();
        zzf = zzbnhVar;
        zzbjr.zzbF(zzbnh.class, zzbnhVar);
    }

    public static zzbng zzc() {
        return (zzbng) zzf.zzbB();
    }

    public static zzbnh zze() {
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
            return new zzbll(zzf, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ለ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zzbnh();
        }
        if (i2 == 4) {
            return new zzbng(zzf);
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
        synchronized (zzbnh.class) {
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

    public final /* synthetic */ void zzf(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }
}
