package com.google.android.gms.internal.measurement;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;

/* loaded from: classes4.dex */
public final class zzmg extends zzadu {
    private static final zzmg zzl;
    private static volatile zzafj zzm;
    private int zzb;
    private String zze = "";
    private zzacr zzf = zzacr.zza;
    private String zzg = "";
    private zzaef zzh;
    private zzaef zzi;
    private boolean zzj;
    private long zzk;

    static {
        zzmg zzmgVar = new zzmg();
        zzl = zzmgVar;
        zzadu.zzcs(zzmg.class, zzmgVar);
    }

    public zzmg() {
        zzafm zzafmVar = zzafm.zzb;
        this.zzh = zzafmVar;
        this.zzi = zzafmVar;
    }

    public static zzmf zzh() {
        return (zzmf) zzl.zzcn();
    }

    public final String zza() {
        return this.zze;
    }

    public final boolean zzb() {
        return (this.zzb & 2) != 0;
    }

    public final zzacr zzc() {
        return this.zzf;
    }

    public final String zzd() {
        return this.zzg;
    }

    public final zzaef zze() {
        return this.zzh;
    }

    public final long zzf() {
        return this.zzk;
    }

    @Override // com.google.android.gms.internal.measurement.zzadu
    public final Object zzg(int i) {
        zzafj zzafjVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzafn(zzl, "\u0004\u0007\u0000\u0001\u0001\t\u0007\u0000\u0002\u0000\u0001ဈ\u0002\u0002ဈ\u0000\u0003ည\u0001\u0004\u001b\u0005\u001a\bဇ\u0003\tဂ\u0004", new Object[]{"zzb", "zzg", "zze", "zzf", "zzh", zzmi.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new zzmg();
        }
        if (i2 == 4) {
            return new zzmf(zzl);
        }
        if (i2 == 5) {
            return zzl;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzm;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzmg.class) {
            try {
                zzafjVar = zzm;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzl);
                    zzm = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final /* synthetic */ void zzi(String str) {
        str.getClass();
        this.zzb |= 1;
        this.zze = str;
    }

    public final /* synthetic */ void zzj(zzacq zzacqVar) {
        zzacqVar.getClass();
        this.zzb |= 2;
        this.zzf = zzacqVar;
    }

    public final /* synthetic */ void zzk(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final void zzl(zzmi zzmiVar) {
        zzaef zzaefVar = this.zzh;
        if (!((zzace) zzaefVar).zza) {
            this.zzh = FillrEnv$EnumUnboxingLocalUtility.m(zzaefVar);
        }
        this.zzh.add(zzmiVar);
    }

    public final void zzm$1(String str) {
        str.getClass();
        zzaef zzaefVar = this.zzi;
        if (!((zzace) zzaefVar).zza) {
            this.zzi = FillrEnv$EnumUnboxingLocalUtility.m(zzaefVar);
        }
        this.zzi.add(str);
    }

    public final /* synthetic */ void zzn(boolean z) {
        this.zzb |= 8;
        this.zzj = z;
    }

    public final /* synthetic */ void zzo$1(long j) {
        this.zzb |= 16;
        this.zzk = j;
    }
}
