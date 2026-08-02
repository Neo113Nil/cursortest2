package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zzme extends zzadu {
    private static final zzme zzh;
    private static volatile zzafj zzi;
    private int zzb;
    private zzmd zzf;
    private String zze = "";
    private String zzg = "";

    static {
        zzme zzmeVar = new zzme();
        zzh = zzmeVar;
        zzadu.zzcs(zzme.class, zzmeVar);
    }

    public static zzmb zzb() {
        return (zzmb) zzh.zzcn();
    }

    public final String zza() {
        return this.zze;
    }

    public final /* synthetic */ void zzc$4(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void zzd(zzmd zzmdVar) {
        this.zzf = zzmdVar;
        this.zzb |= 2;
    }

    public final /* synthetic */ void zze$1(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzh, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဈ\u0002", new Object[]{"zzb", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new zzme();
        }
        if (i2 == 4) {
            return new zzmb(zzh);
        }
        if (i2 == 5) {
            return zzh;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzi;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzme.class) {
            try {
                zzafjVar = zzi;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzh);
                    zzi = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }
}
