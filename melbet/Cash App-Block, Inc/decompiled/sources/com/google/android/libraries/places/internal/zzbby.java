package com.google.android.libraries.places.internal;

/* loaded from: classes4.dex */
public final class zzbby extends zzbjr {
    private static final zzbby zzl;
    private static volatile zzblh zzm;
    private int zzb;
    private zzbny zzg;
    private int zzi;
    private float zzj;
    private float zzk;
    private String zze = "";
    private String zzf = "";
    private zzbkb zzh = zzblk.zzb;

    static {
        zzbby zzbbyVar = new zzbby();
        zzl = zzbbyVar;
        zzbjr.zzbF(zzbby.class, zzbbyVar);
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
            return new zzbll(zzl, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003ဉ\u0000\u0004Ț\u0005\f\u0006\u0001\u0007ခ\u0001", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzbby();
        }
        if (i2 == 4) {
            return new zzba(zzl);
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
        synchronized (zzbby.class) {
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

    public final String zzc() {
        return this.zzf;
    }

    public final zzbny zzd() {
        zzbny zzbnyVar = this.zzg;
        return zzbnyVar == null ? zzbny.zzf() : zzbnyVar;
    }

    public final float zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return (this.zzb & 2) != 0;
    }

    public final float zzg() {
        return this.zzk;
    }

    public final int zzi() {
        int i;
        switch (this.zzi) {
            case 0:
                i = 2;
                break;
            case 1:
                i = 3;
                break;
            case 2:
                i = 4;
                break;
            case 3:
                i = 5;
                break;
            case 4:
                i = 6;
                break;
            case 5:
                i = 7;
                break;
            case 6:
                i = 8;
                break;
            default:
                i = 0;
                break;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
