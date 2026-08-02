package com.google.android.gms.internal.measurement;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;

/* loaded from: classes.dex */
public final class zzqv extends zzadu {
    private static final zzqv zzj;
    private static volatile zzafj zzk;
    private int zzb;
    private long zzh;
    private String zze = "";
    private zzacr zzf = zzacr.zza;
    private String zzg = "";
    private zzaef zzi = zzafm.zzb;

    static {
        zzqv zzqvVar = new zzqv();
        zzj = zzqvVar;
        zzadu.zzcs(zzqv.class, zzqvVar);
    }

    public static zzqu zzh() {
        return (zzqu) zzj.zzcn();
    }

    public static zzqv zzi() {
        return zzj;
    }

    public final String zza() {
        return this.zze;
    }

    public final zzacr zzb() {
        return this.zzf;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final long zzd() {
        return this.zzh;
    }

    public final zzaef zze() {
        return this.zzi;
    }

    public final int zzf() {
        return this.zzi.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzj, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002ည\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005\u001b", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", "zzi", zzqx.class});
        }
        if (i2 == 3) {
            return new zzqv();
        }
        if (i2 == 4) {
            return new zzqu();
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
        synchronized (zzqv.class) {
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

    public final /* synthetic */ void zzj$1(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void zzk(zzacr zzacrVar) {
        zzacrVar.getClass();
        this.zzb |= 2;
        this.zzf = zzacrVar;
    }

    public final /* synthetic */ void zzl$1(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void zzm(long j) {
        this.zzb |= 8;
        this.zzh = j;
    }

    public final void zzn(zzqx zzqxVar) {
        zzaef zzaefVar = this.zzi;
        if (!((zzace) zzaefVar).zza) {
            this.zzi = FillrEnv$EnumUnboxingLocalUtility.m(zzaefVar);
        }
        this.zzi.add(zzqxVar);
    }
}
