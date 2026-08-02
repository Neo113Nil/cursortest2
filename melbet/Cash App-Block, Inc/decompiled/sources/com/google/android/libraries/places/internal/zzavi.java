package com.google.android.libraries.places.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzavi extends zzbjr {
    private static final zzavi zzB;
    private static volatile zzblh zzC;
    private int zzb;
    private int zze;
    private zzarj zzh;
    private zzavz zzi;
    private zzaue zzj;
    private zzasy zzk;
    private zzauc zzl;
    private zzata zzm;
    private zzaua zzn;
    private zzawb zzo;
    private zzawb zzp;
    private zzaug zzq;
    private zzato zzr;
    private zzavk zzs;
    private zzavm zzt;
    private zzaux zzu;
    private zzaul zzv;
    private zzavo zzw;
    private zzavt zzx;
    private zzavw zzy;
    private zzauc zzz;
    private byte zzA = 2;
    private String zzf = "";
    private String zzg = "";

    static {
        zzavi zzaviVar = new zzavi();
        zzB = zzaviVar;
        zzbjr.zzbF(zzavi.class, zzaviVar);
    }

    public static zzavg zza$1() {
        return (zzavg) zzB.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzA);
        }
        if (i2 == 2) {
            return new zzbll(zzB, "\u0001\u0016\u0000\u0001\u0001\u0016\u0016\u0000\u0000\u0004\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006\bဉ\u0007\tᐉ\b\nဉ\t\u000bဉ\u000b\fဉ\n\rဉ\f\u000eဉ\r\u000fဉ\u000e\u0010ဉ\u000f\u0011ဉ\u0010\u0012ဉ\u0011\u0013ဉ\u0012\u0014ဉ\u0013\u0015ဉ\u0014\u0016ဉ\u0015", new Object[]{"zzb", "zze", zzc.zza$6, "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzp", "zzo", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz"});
        }
        if (i2 == 3) {
            return new zzavi();
        }
        if (i2 == 4) {
            return new zzavg(zzB);
        }
        if (i2 == 5) {
            return zzB;
        }
        if (i2 != 6) {
            this.zzA = zzbjrVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzblh zzblhVar2 = zzC;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzavi.class) {
            try {
                zzblhVar = zzC;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzB);
                    zzC = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zzc(String str) {
        str.getClass();
        this.zzb |= 2;
        this.zzf = str;
    }

    public final /* synthetic */ void zzd(String str) {
        str.getClass();
        this.zzb |= 4;
        this.zzg = str;
    }

    public final /* synthetic */ void zze(zzauc zzaucVar) {
        this.zzl = zzaucVar;
        this.zzb |= 128;
    }

    public final /* synthetic */ void zzf(zzata zzataVar) {
        this.zzm = zzataVar;
        this.zzb |= 256;
    }

    public final /* synthetic */ void zzg(zzavt zzavtVar) {
        this.zzx = zzavtVar;
        this.zzb |= PKIFailureInfo.signerNotTrusted;
    }

    public final /* synthetic */ void zzi(zzauc zzaucVar) {
        this.zzz = zzaucVar;
        this.zzb |= PKIFailureInfo.badSenderNonce;
    }

    public final /* synthetic */ void zzk(int i) {
        this.zze = i - 1;
        this.zzb |= 1;
    }
}
