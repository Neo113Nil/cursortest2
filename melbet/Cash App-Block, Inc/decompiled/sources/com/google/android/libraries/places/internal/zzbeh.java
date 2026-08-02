package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbeh extends zzbjr {
    private static final zzbeh zzh;
    private static volatile zzblh zzi;
    private String zzb = "";
    private String zze = "";
    private String zzf = "";
    private String zzg = "";

    static {
        zzbeh zzbehVar = new zzbeh();
        zzh = zzbehVar;
        zzbjr.zzbF(zzbeh.class, zzbehVar);
    }

    public static zzbeg zza$1() {
        return (zzbeg) zzh.zzbB();
    }

    public static zzbeh zzc() {
        return zzh;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004Ȉ", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbeh();
        }
        if (i2 == 4) {
            return new zzbeg(zzh);
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
        synchronized (zzbeh.class) {
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

    public final /* synthetic */ void zzd(String str) {
        this.zzb = str;
    }

    public final /* synthetic */ void zze(String str) {
        str.getClass();
        this.zze = str;
    }

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zzg = str;
    }
}
