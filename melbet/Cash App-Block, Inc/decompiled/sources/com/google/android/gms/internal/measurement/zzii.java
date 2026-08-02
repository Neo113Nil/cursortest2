package com.google.android.gms.internal.measurement;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzii extends zzadu {
    private static final zzii zzh;
    private static volatile zzafj zzi;
    private zzaee zzb = zzaeq.zze();
    private zzaee zze = zzaeq.zze();
    private zzaef zzf;
    private zzaef zzg;

    static {
        zzii zziiVar = new zzii();
        zzh = zziiVar;
        zzadu.zzcs(zzii.class, zziiVar);
    }

    public zzii() {
        zzafm zzafmVar = zzafm.zzb;
        this.zzf = zzafmVar;
        this.zzg = zzafmVar;
    }

    public static zzih zzj() {
        return (zzih) zzh.zzcn();
    }

    public static zzii zzk() {
        return zzh;
    }

    public final List zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzb.size();
    }

    public final List zzc() {
        return this.zze;
    }

    public final int zzd() {
        return this.zze.size();
    }

    public final zzaef zze() {
        return this.zzf;
    }

    public final int zzf() {
        return this.zzf.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzh, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0004\u0000\u0001\u0015\u0002\u0015\u0003\u001b\u0004\u001b", new Object[]{"zzb", "zze", "zzf", zzhq.class, "zzg", zzik.class});
        }
        if (i2 == 3) {
            return new zzii();
        }
        if (i2 == 4) {
            return new zzih(zzh);
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
        synchronized (zzii.class) {
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

    public final zzaef zzh() {
        return this.zzg;
    }

    public final int zzi() {
        return this.zzg.size();
    }

    public final void zzl(Iterable iterable) {
        List list = this.zzb;
        if (!((zzace) list).zza) {
            int size = list.size();
            this.zzb = ((zzaeq) list).zzg(size + size);
        }
        zzadp.zzaV(iterable, this.zzb);
    }

    public final void zzm$1() {
        this.zzb = zzaeq.zze();
    }

    public final void zzn(List list) {
        List list2 = this.zze;
        if (!((zzace) list2).zza) {
            int size = list2.size();
            this.zze = ((zzaeq) list2).zzg(size + size);
        }
        zzadp.zzaV(list, this.zze);
    }

    public final void zzo() {
        this.zze = zzaeq.zze();
    }

    public final void zzp(ArrayList arrayList) {
        zzaef zzaefVar = this.zzf;
        if (!((zzace) zzaefVar).zza) {
            this.zzf = FillrEnv$EnumUnboxingLocalUtility.m(zzaefVar);
        }
        zzadp.zzaV(arrayList, this.zzf);
    }

    public final void zzq$1() {
        this.zzf = zzafm.zzb;
    }

    public final void zzr(Iterable iterable) {
        zzaef zzaefVar = this.zzg;
        if (!((zzace) zzaefVar).zza) {
            this.zzg = FillrEnv$EnumUnboxingLocalUtility.m(zzaefVar);
        }
        zzadp.zzaV(iterable, this.zzg);
    }

    public final void zzs$1() {
        this.zzg = zzafm.zzb;
    }
}
