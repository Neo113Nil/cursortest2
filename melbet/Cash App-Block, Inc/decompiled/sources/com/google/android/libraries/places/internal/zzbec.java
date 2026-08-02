package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbec extends zzbjr {
    private static final zzbec zzh;
    private static volatile zzblh zzi;
    private int zzb;
    private int zze;
    private zzboa zzf;
    private zzblx zzg;

    static {
        zzbec zzbecVar = new zzbec();
        zzh = zzbecVar;
        zzbjr.zzbF(zzbec.class, zzbecVar);
    }

    public final zzbeb zza() {
        zzbeb zzbebVar;
        switch (this.zze) {
            case 0:
                zzbebVar = zzbeb.FUEL_TYPE_UNSPECIFIED;
                break;
            case 1:
                zzbebVar = zzbeb.DIESEL;
                break;
            case 2:
                zzbebVar = zzbeb.REGULAR_UNLEADED;
                break;
            case 3:
                zzbebVar = zzbeb.MIDGRADE;
                break;
            case 4:
                zzbebVar = zzbeb.PREMIUM;
                break;
            case 5:
                zzbebVar = zzbeb.SP91;
                break;
            case 6:
                zzbebVar = zzbeb.SP91_E10;
                break;
            case 7:
                zzbebVar = zzbeb.SP92;
                break;
            case 8:
                zzbebVar = zzbeb.SP95;
                break;
            case 9:
                zzbebVar = zzbeb.SP95_E10;
                break;
            case 10:
                zzbebVar = zzbeb.SP98;
                break;
            case 11:
                zzbebVar = zzbeb.SP99;
                break;
            case 12:
                zzbebVar = zzbeb.SP100;
                break;
            case 13:
                zzbebVar = zzbeb.LPG;
                break;
            case 14:
                zzbebVar = zzbeb.E80;
                break;
            case 15:
                zzbebVar = zzbeb.E85;
                break;
            case 16:
                zzbebVar = zzbeb.METHANE;
                break;
            case 17:
                zzbebVar = zzbeb.BIO_DIESEL;
                break;
            case 18:
                zzbebVar = zzbeb.TRUCK_DIESEL;
                break;
            case 19:
                zzbebVar = zzbeb.DIESEL_PLUS;
                break;
            case 20:
                zzbebVar = zzbeb.E100;
                break;
            default:
                zzbebVar = null;
                break;
        }
        return zzbebVar == null ? zzbeb.UNRECOGNIZED : zzbebVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzh, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzbec();
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
        synchronized (zzbec.class) {
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

    public final zzboa zzc() {
        zzboa zzboaVar = this.zzf;
        return zzboaVar == null ? zzboa.zzg() : zzboaVar;
    }

    public final zzblx zzd() {
        zzblx zzblxVar = this.zzg;
        return zzblxVar == null ? zzblx.zzg() : zzblxVar;
    }
}
