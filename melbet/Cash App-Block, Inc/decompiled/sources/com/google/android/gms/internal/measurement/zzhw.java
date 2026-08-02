package com.google.android.gms.internal.measurement;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class zzhw extends zzadu {
    private static final zzhw zzk;
    private static volatile zzafj zzl;
    private int zzb;
    private long zzg;
    private float zzh;
    private double zzi;
    private String zze = "";
    private String zzf = "";
    private zzaef zzj = zzafm.zzb;

    static {
        zzhw zzhwVar = new zzhw();
        zzk = zzhwVar;
        zzadu.zzcs(zzhw.class, zzhwVar);
    }

    public static zzhv zzn() {
        return (zzhv) zzk.zzcn();
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final String zzb() {
        return this.zze;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final boolean zze() {
        return (this.zzb & 4) != 0;
    }

    public final long zzf() {
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
            return new zzafn(zzk, "\u0004\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ခ\u0003\u0005က\u0004\u0006\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", zzhw.class});
        }
        if (i2 == 3) {
            return new zzhw();
        }
        if (i2 == 4) {
            return new zzhv(zzk);
        }
        if (i2 == 5) {
            return zzk;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzl;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzhw.class) {
            try {
                zzafjVar = zzl;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzk);
                    zzl = zzafjVar;
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

    public final float zzi() {
        return this.zzh;
    }

    public final boolean zzj() {
        return (this.zzb & 16) != 0;
    }

    public final double zzk() {
        return this.zzi;
    }

    public final zzaef zzl() {
        return this.zzj;
    }

    public final int zzm() {
        return this.zzj.size();
    }

    public final /* synthetic */ void zzo(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void zzp(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void zzq$1() {
        this.zzb &= -3;
        this.zzf = zzk.zzf;
    }

    public final /* synthetic */ void zzr$1(long j) {
        this.zzb |= 4;
        this.zzg = j;
    }

    public final /* synthetic */ void zzs$1() {
        this.zzb &= -5;
        this.zzg = 0L;
    }

    public final /* synthetic */ void zzt(double d) {
        this.zzb |= 16;
        this.zzi = d;
    }

    public final /* synthetic */ void zzu() {
        this.zzb &= -17;
        this.zzi = 0.0d;
    }

    public final void zzv(zzhw zzhwVar) {
        zzaef zzaefVar = this.zzj;
        if (!((zzace) zzaefVar).zza) {
            this.zzj = FillrEnv$EnumUnboxingLocalUtility.m(zzaefVar);
        }
        this.zzj.add(zzhwVar);
    }

    public final void zzw(ArrayList arrayList) {
        zzaef zzaefVar = this.zzj;
        if (!((zzace) zzaefVar).zza) {
            this.zzj = FillrEnv$EnumUnboxingLocalUtility.m(zzaefVar);
        }
        zzadp.zzaV(arrayList, this.zzj);
    }

    public final void zzx() {
        this.zzj = zzafm.zzb;
    }
}
