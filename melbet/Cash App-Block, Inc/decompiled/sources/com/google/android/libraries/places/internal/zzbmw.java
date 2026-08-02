package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbmw extends zzbjr {
    private static final zzbmw zzi;
    private static volatile zzblh zzj;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private int zzh;

    static {
        zzbmw zzbmwVar = new zzbmw();
        zzi = zzbmwVar;
        zzbjr.zzbF(zzbmw.class, zzbmwVar);
    }

    public static zzbmu zzc$1() {
        return (zzbmu) zzi.zzbB();
    }

    public static zzbmw zze() {
        return zzi;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzi, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005\f", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzbmw();
        }
        if (i2 == 4) {
            return new zzbmu(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzj;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbmw.class) {
            try {
                zzblhVar = zzj;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzi);
                    zzj = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final void zzf$2(int i) {
        int i2;
        if (i == 11) {
            zzbkc.zza();
            throw null;
        }
        switch (i) {
            case 1:
                i2 = 0;
                break;
            case 2:
                i2 = 1;
                break;
            case 3:
                i2 = 2;
                break;
            case 4:
                i2 = 3;
                break;
            case 5:
                i2 = 4;
                break;
            case 6:
                i2 = 6;
                break;
            case 7:
                i2 = 7;
                break;
            case 8:
                i2 = 8;
                break;
            case 9:
                i2 = 5;
                break;
            case 10:
                i2 = 9;
                break;
            case 11:
                i2 = -1;
                break;
            default:
                throw null;
        }
        this.zzb = i2;
    }

    public final /* synthetic */ void zzg(String str) {
        str.getClass();
        this.zze = str;
    }

    public final /* synthetic */ void zzh$1(String str) {
        str.getClass();
        this.zzg = str;
    }

    public final /* synthetic */ void zzj(int i) {
        this.zzh = 2;
    }
}
