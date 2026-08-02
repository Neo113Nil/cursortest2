package com.google.android.gms.internal.measurement;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzff extends zzadu {
    private static final zzff zzm;
    private static volatile zzafj zzn;
    private int zzb;
    private int zze;
    private String zzf = "";
    private zzaef zzg = zzafm.zzb;
    private boolean zzh;
    private zzfl zzi;
    private boolean zzj;
    private boolean zzk;
    private boolean zzl;

    static {
        zzff zzffVar = new zzff();
        zzm = zzffVar;
        zzadu.zzcs(zzff.class, zzffVar);
    }

    public static zzfe zzn() {
        return (zzfe) zzm.zzcn();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final int zzb() {
        return this.zze;
    }

    public final String zzc() {
        return this.zzf;
    }

    public final List zzd() {
        return this.zzg;
    }

    public final int zze() {
        return this.zzg.size();
    }

    public final zzfh zzf(int i) {
        return (zzfh) this.zzg.get(i);
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzm, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0003\u001b\u0004ဇ\u0002\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဇ\u0005\bဇ\u0006", new Object[]{"zzb", "zze", "zzf", "zzg", zzfh.class, "zzh", "zzi", "zzj", "zzk", "zzl"});
        }
        if (i2 == 3) {
            return new zzff();
        }
        if (i2 == 4) {
            return new zzfe(zzm);
        }
        if (i2 == 5) {
            return zzm;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzn;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzff.class) {
            try {
                zzafjVar = zzn;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzm);
                    zzn = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final boolean zzh() {
        return (this.zzb & 8) != 0;
    }

    public final zzfl zzi() {
        zzfl zzflVar = this.zzi;
        return zzflVar == null ? zzfl.zzk() : zzflVar;
    }

    public final boolean zzj() {
        return this.zzj;
    }

    public final boolean zzk() {
        return this.zzk;
    }

    public final boolean zzl() {
        return (this.zzb & 64) != 0;
    }

    public final boolean zzm() {
        return this.zzl;
    }

    public final /* synthetic */ void zzo(String str) {
        this.zzb |= 2;
        this.zzf = str;
    }

    public final void zzp(int i, zzfh zzfhVar) {
        zzaef zzaefVar = this.zzg;
        if (!((zzace) zzaefVar).zza) {
            this.zzg = FillrEnv$EnumUnboxingLocalUtility.m(zzaefVar);
        }
        this.zzg.set(i, zzfhVar);
    }
}
