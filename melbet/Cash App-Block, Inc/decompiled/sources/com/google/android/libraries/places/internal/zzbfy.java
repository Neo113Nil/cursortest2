package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbfy extends zzbjr {
    private static final zzbfy zzl;
    private static volatile zzblh zzm;
    private int zzb;
    private boolean zze;
    private zzbkb zzf;
    private zzbkb zzg;
    private int zzh;
    private zzbkb zzi;
    private zzblx zzj;
    private zzblx zzk;

    static {
        zzbfy zzbfyVar = new zzbfy();
        zzl = zzbfyVar;
        zzbjr.zzbF(zzbfy.class, zzbfyVar);
    }

    public zzbfy() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzf = zzblkVar;
        this.zzg = zzblkVar;
        this.zzi = zzblkVar;
    }

    public static zzbfy zzl() {
        return zzl;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzl, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဇ\u0000\u0002\u001b\u0003Ț\u0004\f\u0005\u001b\u0006ဉ\u0001\u0007ဉ\u0002", new Object[]{"zzb", "zze", "zzf", zzbfu.class, "zzg", "zzh", "zzi", zzbfx.class, "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzbfy();
        }
        if (i2 == 4) {
            return new zzbh(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzm;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbfy.class) {
            try {
                zzblhVar = zzm;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzl);
                    zzm = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final boolean zzc() {
        return this.zze;
    }

    public final zzbkb zzd() {
        return this.zzf;
    }

    public final zzbkb zze() {
        return this.zzg;
    }

    public final zzbfv zzf() {
        zzbfv zzbfvVar;
        switch (this.zzh) {
            case 0:
                zzbfvVar = zzbfv.SECONDARY_HOURS_TYPE_UNSPECIFIED;
                break;
            case 1:
                zzbfvVar = zzbfv.DRIVE_THROUGH;
                break;
            case 2:
                zzbfvVar = zzbfv.HAPPY_HOUR;
                break;
            case 3:
                zzbfvVar = zzbfv.DELIVERY;
                break;
            case 4:
                zzbfvVar = zzbfv.TAKEOUT;
                break;
            case 5:
                zzbfvVar = zzbfv.KITCHEN;
                break;
            case 6:
                zzbfvVar = zzbfv.BREAKFAST;
                break;
            case 7:
                zzbfvVar = zzbfv.LUNCH;
                break;
            case 8:
                zzbfvVar = zzbfv.DINNER;
                break;
            case 9:
                zzbfvVar = zzbfv.BRUNCH;
                break;
            case 10:
                zzbfvVar = zzbfv.PICKUP;
                break;
            case 11:
                zzbfvVar = zzbfv.ACCESS;
                break;
            case 12:
                zzbfvVar = zzbfv.SENIOR_HOURS;
                break;
            case 13:
                zzbfvVar = zzbfv.ONLINE_SERVICE_HOURS;
                break;
            default:
                zzbfvVar = null;
                break;
        }
        return zzbfvVar == null ? zzbfv.UNRECOGNIZED : zzbfvVar;
    }

    public final zzbkb zzg() {
        return this.zzi;
    }

    public final boolean zzh() {
        return (this.zzb & 2) != 0;
    }

    public final zzblx zzi() {
        zzblx zzblxVar = this.zzj;
        return zzblxVar == null ? zzblx.zzg() : zzblxVar;
    }

    public final boolean zzj() {
        return (this.zzb & 4) != 0;
    }

    public final zzblx zzk() {
        zzblx zzblxVar = this.zzk;
        return zzblxVar == null ? zzblx.zzg() : zzblxVar;
    }
}
