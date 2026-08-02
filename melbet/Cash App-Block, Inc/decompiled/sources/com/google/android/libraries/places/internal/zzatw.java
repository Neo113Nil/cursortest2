package com.google.android.libraries.places.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzatw extends zzbjr {
    private static final zzatw zzV;
    private static volatile zzblh zzW;
    private zzaql zzA;
    private zzawx zzB;
    private boolean zzC;
    private String zzD;
    private zzaqv zzE;
    private boolean zzF;
    private String zzG;
    private int zzH;
    private String zzI;
    private String zzJ;
    private int zzK;
    private String zzL;
    private int zzM;
    private int zzN;
    private zzbno zzO;
    private zzapr zzP;
    private boolean zzQ;
    private zzarh zzR;
    private zzasg zzS;
    private zzarm zzT;
    private int zzb;
    private int zze;
    private int zzf;
    private zzabz zzh;
    private zzahz zzi;
    private int zzj;
    private float zzk;
    private zzbkb zzl;
    private zzavi zzm;
    private zzbkb zzn;
    private zzaqy zzo;
    private zzarr zzp;
    private zzava zzq;
    private zzauj zzr;
    private zzaut zzs;
    private zzaup zzt;
    private zzavf zzu;
    private zzatj zzv;
    private zzaty zzw;
    private zzauv zzx;
    private zzatm zzy;
    private zzaru zzz;
    private byte zzU = 2;
    private int zzg = 1;

    static {
        zzatw zzatwVar = new zzatw();
        zzV = zzatwVar;
        zzbjr.zzbF(zzatw.class, zzatwVar);
    }

    public zzatw() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzl = zzblkVar;
        this.zzn = zzblkVar;
        this.zzD = "";
        this.zzG = "";
        this.zzI = "";
        this.zzJ = "";
        this.zzL = "";
    }

    public static zzatp zza$1() {
        return (zzatp) zzV.zzbB();
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.zzU);
        }
        if (i2 == 2) {
            return new zzbll(zzV, "\u0001)\u0000\u0002\u0001))\u0000\u0002\u0003\u0001᠌\u0001\u0002ဉ\u0002\u0003ᐉ\u0003\u0004\u001b\u0005ᐉ\u0006\u0006\u001b\u0007ဉ\u0007\bᐉ\b\t᠌\u0004\nခ\u0005\u000bဇ\u0015\fဉ\t\rဈ\u0016\u000eဉ\n\u000fဉ\u000b\u0010ဉ\f\u0011ဉ\r\u0012ဉ\u000e\u0013ဉ\u000f\u0014ဉ\u0010\u0015ဉ\u0011\u0016ဉ\u0012\u0017ဉ\u0013\u0018ဉ\u0017\u0019င\u0000\u001aဉ\u0014\u001bဇ\u0018\u001cဈ\u0019\u001d᠌\u001a\u001eဈ\u001b\u001fဈ\u001c ᠌\u001d!ဈ\u001e\"᠌\u001f#᠌ $ဉ!%ဉ\"&ဇ#'ဉ$(ဉ%)ဉ&", new Object[]{"zzb", "zze", "zzg", zzat.zza$24, "zzh", "zzi", "zzl", zzaxs.class, "zzm", "zzn", zzaqy.class, "zzo", "zzp", "zzj", zzat.zza$23, "zzk", "zzC", "zzq", "zzD", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzE", "zzf", "zzB", "zzF", "zzG", "zzH", zzat.zza$25, "zzI", "zzJ", "zzK", zzat.zza$28, "zzL", "zzM", zzat.zza$27, "zzN", zzat.zza$26, "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT"});
        }
        if (i2 == 3) {
            return new zzatw();
        }
        if (i2 == 4) {
            return new zzatp(zzV);
        }
        if (i2 == 5) {
            return zzV;
        }
        if (i2 != 6) {
            this.zzU = zzbjrVar == null ? (byte) 0 : (byte) 1;
            return null;
        }
        zzblh zzblhVar2 = zzW;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzatw.class) {
            try {
                zzblhVar = zzW;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzV);
                    zzW = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final /* synthetic */ void zzc(zzabz zzabzVar) {
        this.zzh = zzabzVar;
        this.zzb |= 4;
    }

    public final /* synthetic */ void zzd(zzavi zzaviVar) {
        this.zzm = zzaviVar;
        this.zzb |= 64;
    }

    public final /* synthetic */ void zze(zzava zzavaVar) {
        this.zzq = zzavaVar;
        this.zzb |= 512;
    }

    public final /* synthetic */ void zzf(zzauj zzaujVar) {
        this.zzr = zzaujVar;
        this.zzb |= 1024;
    }

    public final /* synthetic */ void zzh(zzaqv zzaqvVar) {
        this.zzE = zzaqvVar;
        this.zzb |= 8388608;
    }

    public final /* synthetic */ void zzi(boolean z) {
        this.zzb |= 16777216;
        this.zzF = z;
    }

    public final /* synthetic */ void zzj$1(String str) {
        str.getClass();
        this.zzb |= 33554432;
        this.zzG = str;
    }

    public final /* synthetic */ void zzk() {
        this.zzb |= 134217728;
        this.zzI = "5.2.0";
    }

    public final /* synthetic */ void zzl(String str) {
        str.getClass();
        this.zzb |= 1073741824;
        this.zzL = str;
    }

    public final /* synthetic */ void zzm(zzbno zzbnoVar) {
        this.zzO = zzbnoVar;
        this.zze |= 2;
    }

    public final /* synthetic */ void zzo() {
        this.zze |= 8;
        this.zzQ = false;
    }

    public final /* synthetic */ void zzs(int i) {
        this.zzg = i;
        this.zzb |= 2;
    }

    public final /* synthetic */ void zzt(int i) {
        this.zzK = i - 1;
        this.zzb |= PKIFailureInfo.duplicateCertReq;
    }

    public final /* synthetic */ void zzu(int i) {
        this.zzM = i - 1;
        this.zzb |= PKIFailureInfo.systemUnavail;
    }

    public final /* synthetic */ void zzv(int i) {
        this.zzN = i - 1;
        this.zze |= 1;
    }
}
