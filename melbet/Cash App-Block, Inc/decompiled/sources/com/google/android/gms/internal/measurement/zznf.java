package com.google.android.gms.internal.measurement;

/* loaded from: classes.dex */
public final class zznf extends zzadu {
    private static final zznf zzf;
    private static volatile zzafj zzg;
    private int zzb;
    private boolean zze;

    static {
        zznf zznfVar = new zznf();
        zzf = zznfVar;
        zzadu.zzcs(zznf.class, zznfVar);
    }

    public static zznf zzb() {
        return zzf;
    }

    public final boolean zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzf, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"zzb", "zze"});
        }
        if (i2 == 3) {
            return new zznf();
        }
        if (i2 == 4) {
            return new zzfi();
        }
        if (i2 == 5) {
            return zzf;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzg;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zznf.class) {
            try {
                zzafjVar = zzg;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzf);
                    zzg = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }
}
