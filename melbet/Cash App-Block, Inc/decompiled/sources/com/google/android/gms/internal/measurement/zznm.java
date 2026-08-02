package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zznm extends zzadu {
    private static final zznm zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private String zze = "";
    private long zzf;

    static {
        zznm zznmVar = new zznm();
        zzg = zznmVar;
        zzadu.zzcs(zznm.class, zznmVar);
    }

    public static zznm zzc() {
        return zzg;
    }

    public final String zza() {
        return this.zze;
    }

    public final long zzb() {
        return this.zzf;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zznm();
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
        synchronized (zznm.class) {
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
