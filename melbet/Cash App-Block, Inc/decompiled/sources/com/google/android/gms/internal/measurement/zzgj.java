package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zzgj extends zzadu {
    private static final zzgj zzi;
    private static volatile zzafj zzj;
    private int zzb;
    private String zze = "";
    private boolean zzf;
    private boolean zzg;
    private int zzh;

    static {
        zzgj zzgjVar = new zzgj();
        zzi = zzgjVar;
        zzadu.zzcs(zzgj.class, zzgjVar);
    }

    public final String zza() {
        return this.zze;
    }

    public final boolean zzb() {
        return (this.zzb & 2) != 0;
    }

    public final boolean zzc() {
        return this.zzf;
    }

    public final boolean zzd() {
        return (this.zzb & 4) != 0;
    }

    public final boolean zze() {
        return this.zzg;
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
            return new zzafn(zzi, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004င\u0003", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh"});
        }
        if (i2 == 3) {
            return new zzgj();
        }
        if (i2 == 4) {
            return new zzgi(zzi);
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
        synchronized (zzgj.class) {
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

    public final int zzh() {
        return this.zzh;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }
}
