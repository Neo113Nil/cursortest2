package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes4.dex */
public final class zziy extends zzadu {
    private static final zziy zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private String zze = "";
    private zzaef zzf = zzafm.zzb;

    static {
        zziy zziyVar = new zziy();
        zzg = zziyVar;
        zzadu.zzcs(zziy.class, zziyVar);
    }

    public final String zza() {
        return this.zze;
    }

    public final List zzb() {
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
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b", new Object[]{"zzb", "zze", "zzf", zzje.class});
        }
        if (i2 == 3) {
            return new zziy();
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
        synchronized (zziy.class) {
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
