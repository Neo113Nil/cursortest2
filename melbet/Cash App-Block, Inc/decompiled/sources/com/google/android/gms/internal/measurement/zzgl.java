package com.google.android.gms.internal.measurement;

import com.fillr.core.FillrEnv$EnumUnboxingLocalUtility;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzgl extends zzadu {
    private static final zzgl zzw;
    private static volatile zzafj zzx;
    private int zzb;
    private long zze;
    private String zzf = "";
    private int zzg;
    private zzaef zzh;
    private zzaef zzi;
    private zzaef zzj;
    private String zzk;
    private boolean zzl;
    private zzaef zzm;
    private zzaef zzn;
    private String zzo;
    private String zzp;
    private zzgf zzq;
    private zzgp zzr;
    private zzgv zzs;
    private zzgr zzt;
    private zzgn zzu;
    private zzaeb zzv;

    static {
        zzgl zzglVar = new zzgl();
        zzw = zzglVar;
        zzadu.zzcs(zzgl.class, zzglVar);
    }

    public zzgl() {
        zzafm zzafmVar = zzafm.zzb;
        this.zzh = zzafmVar;
        this.zzi = zzafmVar;
        this.zzj = zzafmVar;
        this.zzk = "";
        this.zzm = zzafmVar;
        this.zzn = zzafmVar;
        this.zzo = "";
        this.zzp = "";
        this.zzv = zzadv.zzb;
    }

    public static zzgk zzs() {
        return (zzgk) zzw.zzcn();
    }

    public static zzgl zzt() {
        return zzw;
    }

    public final boolean zza() {
        return (this.zzb & 1) != 0;
    }

    public final long zzb() {
        return this.zze;
    }

    public final boolean zzc() {
        return (this.zzb & 2) != 0;
    }

    public final String zzd() {
        return this.zzf;
    }

    public final zzaef zze() {
        return this.zzh;
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
            return new zzafn(zzw, "\u0004\u0012\u0000\u0001\u0001\u0014\u0012\u0000\u0006\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003င\u0002\u0004\u001b\u0005\u001b\u0006\u001b\u0007ဈ\u0003\bဇ\u0004\t\u001b\n\u001b\u000bဈ\u0005\u000eဈ\u0006\u000fဉ\u0007\u0010ဉ\b\u0011ဉ\t\u0012ဉ\n\u0013ဉ\u000b\u0014+", new Object[]{"zzb", "zze", "zzf", "zzg", "zzh", zzgt.class, "zzi", zzgj.class, "zzj", zzfd.class, "zzk", "zzl", "zzm", zzja.class, "zzn", zzgh.class, "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv"});
        }
        if (i2 == 3) {
            return new zzgl();
        }
        if (i2 == 4) {
            return new zzgk(zzw);
        }
        if (i2 == 5) {
            return zzw;
        }
        if (i2 != 6) {
            throw null;
        }
        zzafj zzafjVar2 = zzx;
        if (zzafjVar2 != null) {
            return zzafjVar2;
        }
        synchronized (zzgl.class) {
            try {
                zzafjVar = zzx;
                if (zzafjVar == null) {
                    zzafjVar = new zzadq(zzw);
                    zzx = zzafjVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzafjVar;
    }

    public final zzgj zzh(int i) {
        return (zzgj) this.zzi.get(i);
    }

    public final List zzi() {
        return this.zzj;
    }

    public final zzaef zzj() {
        return this.zzm;
    }

    public final int zzk() {
        return this.zzm.size();
    }

    public final zzaef zzl() {
        return this.zzn;
    }

    public final String zzm() {
        return this.zzo;
    }

    public final boolean zzn() {
        return (this.zzb & 128) != 0;
    }

    public final zzgf zzo() {
        zzgf zzgfVar = this.zzq;
        return zzgfVar == null ? zzgf.zzh() : zzgfVar;
    }

    public final boolean zzp() {
        return (this.zzb & 512) != 0;
    }

    public final zzgv zzq() {
        zzgv zzgvVar = this.zzs;
        return zzgvVar == null ? zzgv.zze() : zzgvVar;
    }

    public final zzaeb zzr() {
        return this.zzv;
    }

    public final void zzu(int i, zzgj zzgjVar) {
        zzaef zzaefVar = this.zzi;
        if (!((zzace) zzaefVar).zza) {
            this.zzi = FillrEnv$EnumUnboxingLocalUtility.m(zzaefVar);
        }
        this.zzi.set(i, zzgjVar);
    }

    public final void zzv() {
        this.zzj = zzafm.zzb;
    }

    public final void zzw() {
        this.zzm = zzafm.zzb;
    }
}
