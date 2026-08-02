package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes4.dex */
public final class zzik extends zzadu {
    private static final zzik zzg;
    private static volatile zzafj zzh;
    private int zzb;
    private int zze;
    private zzaee zzf = zzaeq.zze();

    static {
        zzik zzikVar = new zzik();
        zzg = zzikVar;
        zzadu.zzcs(zzik.class, zzikVar);
    }

    public static zzij zzf() {
        return (zzij) zzg.zzcn();
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

    public final long zze(int i) {
        return ((zzaeq) this.zzf).zzc(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzg, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0014", new Object[]{"zzb", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new zzik();
        }
        if (i2 == 4) {
            return new zzij(zzg);
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
        synchronized (zzik.class) {
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

    public final /* synthetic */ void zzh(int i) {
        this.zzb |= 1;
        this.zze = i;
    }

    public final void zzi(List list) {
        List list2 = this.zzf;
        if (!((zzace) list2).zza) {
            int size = list2.size();
            this.zzf = ((zzaeq) list2).zzg(size + size);
        }
        zzadp.zzaV(list, this.zzf);
    }
}
