package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zzhg extends zzadu {
    private static final zzhg zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private int zze;
    private zzii zzf;
    private zzii zzg;
    private boolean zzh;

    static {
        zzhg zzhgVar = new zzhg();
        zzi = zzhgVar;
        zzadu.zzcs(zzhg.class, zzhgVar);
    }

    public static zzhf zzi() {
        return (zzhf) zzi.zzcn();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zze;
    }

    public final zzii zzc() {
        zzii zziiVar = this.zzf;
        return zziiVar == null ? zzii.zzk() : zziiVar;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final zzii zze() {
        zzii zziiVar = this.zzg;
        return zziiVar == null ? zzii.zzk() : zziiVar;
    }

    public final boolean zzf() {
        return (this.zzb & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004ဇ\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzhg();
        }
        if (i2 == 4) {
            return new zzhf(zzi);
        }
        if (i2 == 5) {
            return zzi;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzj;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzhg.class) {
            try {
                zzafjVar = zzj;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzi);
                    zzj = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final boolean zzh() {
        return this.zzh;
    }

    public final /* synthetic */ void zzj(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final /* synthetic */ void zzk(zzii zziiVar) {
        this.zzf = zziiVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void zzl(zzii zziiVar) {
        this.zzg = zziiVar;
        this.zzb |= 4;
    }

    public final /* synthetic */ void zzm(boolean z) {
        this.zzb |= 8;
        this.zzh = z;
    }
}
