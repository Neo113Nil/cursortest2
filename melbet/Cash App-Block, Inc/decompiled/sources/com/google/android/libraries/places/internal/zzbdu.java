package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbdu extends zzbjr {
    private static final zzbdu zzk;
    private static volatile zzblh zzl;
    private int zzb;
    private int zze;
    private double zzf;
    private int zzg;
    private int zzh;
    private int zzi;
    private zzblx zzj;

    static {
        zzbdu zzbduVar = new zzbdu();
        zzk = zzbduVar;
        zzbjr.zzbF(zzbdu.class, zzbduVar);
    }

    public final zzbdy zza() {
        zzbdy zzbdyVar;
        switch (this.zze) {
            case 0:
                zzbdyVar = zzbdy.EV_CONNECTOR_TYPE_UNSPECIFIED;
                break;
            case 1:
                zzbdyVar = zzbdy.EV_CONNECTOR_TYPE_OTHER;
                break;
            case 2:
                zzbdyVar = zzbdy.EV_CONNECTOR_TYPE_J1772;
                break;
            case 3:
                zzbdyVar = zzbdy.EV_CONNECTOR_TYPE_TYPE_2;
                break;
            case 4:
                zzbdyVar = zzbdy.EV_CONNECTOR_TYPE_CHADEMO;
                break;
            case 5:
                zzbdyVar = zzbdy.EV_CONNECTOR_TYPE_CCS_COMBO_1;
                break;
            case 6:
                zzbdyVar = zzbdy.EV_CONNECTOR_TYPE_CCS_COMBO_2;
                break;
            case 7:
                zzbdyVar = zzbdy.EV_CONNECTOR_TYPE_TESLA;
                break;
            case 8:
                zzbdyVar = zzbdy.EV_CONNECTOR_TYPE_UNSPECIFIED_GB_T;
                break;
            case 9:
                zzbdyVar = zzbdy.EV_CONNECTOR_TYPE_UNSPECIFIED_WALL_OUTLET;
                break;
            case 10:
                zzbdyVar = zzbdy.EV_CONNECTOR_TYPE_NACS;
                break;
            default:
                zzbdyVar = null;
                break;
        }
        return zzbdyVar == null ? zzbdy.UNRECOGNIZED : zzbdyVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzk, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\f\u0002\u0000\u0003\u0004\u0004င\u0000\u0005င\u0001\u0006ဉ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj"});
        }
        if (i2 == 3) {
            return new zzbdu();
        }
        if (i2 == 4) {
            return new zzbe(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzl;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbdu.class) {
            try {
                zzblhVar = zzl;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzk);
                    zzl = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final double zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzg;
    }

    public final boolean zze() {
        return (this.zzb & 1) != 0;
    }

    public final int zzf() {
        return this.zzh;
    }

    public final boolean zzg() {
        return (this.zzb & 2) != 0;
    }

    public final int zzh() {
        return this.zzi;
    }

    public final boolean zzi() {
        return (this.zzb & 4) != 0;
    }

    public final zzblx zzj() {
        zzblx zzblxVar = this.zzj;
        return zzblxVar == null ? zzblx.zzg() : zzblxVar;
    }
}
