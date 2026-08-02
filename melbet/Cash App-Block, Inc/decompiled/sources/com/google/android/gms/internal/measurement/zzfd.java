package com.google.android.gms.internal.measurement;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzfd extends zzadu {
    private static final zzfd zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private int zze;
    private zzaef zzf;
    private zzaef zzg;
    private boolean zzh;
    private boolean zzi;

    static {
        zzfd zzfdVar = new zzfd();
        zzj = zzfdVar;
        zzadu.zzcs(zzfd.class, zzfdVar);
    }

    public zzfd() {
        zzafm zzafmVar = zzafm.zzb;
        this.zzf = zzafmVar;
        this.zzg = zzafmVar;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zze;
    }

    public final List zzc() {
        return this.zzf;
    }

    public final int zzd() {
        return this.zzf.size();
    }

    public final zzfn zze(int i) {
        return (zzfn) this.zzf.get(i);
    }

    public final zzaef zzf() {
        return this.zzg;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"zzb", "zze", "zzf", zzfn.class, "zzg", zzff.class, "zzh", "zzi"});
        }
        if (i2 == 3) {
            return new zzfd();
        }
        if (i2 == 4) {
            return new zzfc(zzj);
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
        synchronized (zzfd.class) {
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

    public final int zzh() {
        return this.zzg.size();
    }

    public final zzff zzi(int i) {
        return (zzff) this.zzg.get(i);
    }

    public final void zzj(int i, zzfn zzfnVar) {
        zzaef zzaefVar = this.zzf;
        if (!((zzace) zzaefVar).zza) {
            this.zzf = FillrEnv$EnumUnboxingLocalUtility.m(zzaefVar);
        }
        this.zzf.set(i, zzfnVar);
    }

    public final void zzk(int i, zzff zzffVar) {
        zzaef zzaefVar = this.zzg;
        if (!((zzace) zzaefVar).zza) {
            this.zzg = FillrEnv$EnumUnboxingLocalUtility.m(zzaefVar);
        }
        this.zzg.set(i, zzffVar);
    }
}
