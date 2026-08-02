package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zzfw extends zzadu {
    private static final zzfw zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzfw zzfwVar = new zzfw();
        zzg = zzfwVar;
        zzadu.zzcs(zzfw.class, zzfwVar);
    }

    public final int zzb() {
        int zza = zzh.zza(this.zze);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    public final int zzc$1() {
        int zza = zzh.zza(this.zzf);
        if (zza == 0) {
            return 1;
        }
        return zza;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            zzfj zzfjVar = zzfj.zza$4;
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", zzfjVar, "zzf", zzfjVar});
        }
        if (i2 == 3) {
            return new zzfw();
        }
        if (i2 == 4) {
            return new zzfi(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzh;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzfw.class) {
            try {
                zzafjVar = zzh;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzg);
                    zzh = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }
}
