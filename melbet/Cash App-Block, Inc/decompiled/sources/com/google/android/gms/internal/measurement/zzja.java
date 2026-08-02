package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes4.dex */
public final class zzja extends zzadu {
    private static final zzja zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private zzaef zze = zzafm.zzb;
    private zziw zzf;

    static {
        zzja zzjaVar = new zzja();
        zzg = zzjaVar;
        zzadu.zzcs(zzja.class, zzjaVar);
    }

    public final List zza() {
        return this.zze;
    }

    public final zziw zzb() {
        zziw zziwVar = this.zzf;
        return zziwVar == null ? zziw.zzc() : zziwVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zze", zzje.class, "zzf"});
        }
        if (i2 == 3) {
            return new zzja();
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
        synchronized (zzja.class) {
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
