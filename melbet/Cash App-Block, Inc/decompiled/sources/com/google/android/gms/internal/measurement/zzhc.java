package com.google.android.gms.internal.measurement;

/* loaded from: classes4.dex */
public final class zzhc extends zzadu {
    private static final zzhc zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private String zze = "";
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private String zzi = "";
    private String zzj = "";
    private String zzk = "";

    static {
        zzhc zzhcVar = new zzhc();
        zzl = zzhcVar;
        zzadu.zzcs(zzhc.class, zzhcVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzl, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzhc();
        }
        if (i2 == 4) {
            return new zzfi(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzm;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzhc.class) {
            try {
                zzafjVar = zzm;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzl);
                    zzm = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }
}
