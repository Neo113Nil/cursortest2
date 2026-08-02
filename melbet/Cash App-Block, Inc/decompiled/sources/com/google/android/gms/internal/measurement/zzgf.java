package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes4.dex */
public final class zzgf extends zzadu {
    private static final zzgf zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private zzaef zze;
    private zzaef zzf;
    private zzaef zzg;
    private boolean zzh;
    private zzaef zzi;

    static {
        zzgf zzgfVar = new zzgf();
        zzj = zzgfVar;
        zzadu.zzcs(zzgf.class, zzgfVar);
    }

    public zzgf() {
        zzafm zzafmVar = zzafm.zzb;
        this.zze = zzafmVar;
        this.zzf = zzafmVar;
        this.zzg = zzafmVar;
        this.zzi = zzafmVar;
    }

    public static zzgf zzh() {
        return zzj;
    }

    public final List zza() {
        return this.zze;
    }

    public final List zzb() {
        return this.zzf;
    }

    public final List zzc() {
        return this.zzg;
    }

    public final boolean zzd() {
        return (this.zzb & 1) != 0;
    }

    public final boolean zze() {
        return this.zzh;
    }

    public final zzaef zzf() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0004\u0000\u0001\u001b\u0002\u001b\u0003\u001b\u0004ဇ\u0000\u0005\u001b", new Object[]{"zzb", "zze", zzfu.class, "zzf", zzfw.class, "zzg", zzgc.class, "zzh", "zzi", zzfu.class});
        }
        if (i2 == 3) {
            return new zzgf();
        }
        if (i2 == 4) {
            return new zzfi(zzj);
        }
        if (i2 == 5) {
            return zzj;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzk;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzgf.class) {
            try {
                zzafjVar = zzk;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzj);
                    zzk = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }
}
