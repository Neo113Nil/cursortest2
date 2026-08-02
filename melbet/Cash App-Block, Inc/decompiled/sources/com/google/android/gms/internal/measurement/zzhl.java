package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zzhl extends zzadu {
    private static final zzhl zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private int zzf;

    static {
        zzhl zzhlVar = new zzhl();
        zzg = zzhlVar;
        zzadu.zzcs(zzhl.class, zzhlVar);
    }

    public static zzhk zza() {
        return (zzhk) zzg.zzcn();
    }

    public final int zzc$1() {
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int zzd() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void zze(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void zzf(int i) {
        this.zzf = i - 1;
        this.zzb |= 2;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zze", zzfj.zza$7, "zzf", zzfj.zza$8});
        }
        if (i2 == 3) {
            return new zzhl();
        }
        if (i2 == 4) {
            return new zzhk(zzg);
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
        synchronized (zzhl.class) {
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
