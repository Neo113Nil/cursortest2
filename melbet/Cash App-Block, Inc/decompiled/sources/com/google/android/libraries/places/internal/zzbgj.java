package com.google.android.libraries.places.internal;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public final class zzbgj extends zzbjr {
    private static final zzbgj zzaM;
    private static volatile zzblh zzaN;
    private int zzA;
    private zzboe zzB;
    private zzbkb zzC;
    private String zzD;
    private int zzE;
    private zzbnu zzF;
    private int zzG;
    private zzbkb zzH;
    private int zzI;
    private String zzJ;
    private String zzK;
    private boolean zzL;
    private boolean zzM;
    private boolean zzN;
    private boolean zzO;
    private boolean zzP;
    private boolean zzQ;
    private boolean zzR;
    private boolean zzS;
    private boolean zzT;
    private boolean zzU;
    private boolean zzV;
    private boolean zzW;
    private zzbfy zzX;
    private zzbkb zzY;
    private zzbkb zzZ;
    private zzbkb zzaA;
    private boolean zzaB;
    private zzbbz zzaC;
    private zzbfn zzaD;
    private zzbgr zzaE;
    private zzbgg zzaF;
    private zzbfj zzaG;
    private zzbfp zzaH;
    private zzbff zzaI;
    private String zzaJ;
    private String zzaK;
    private zzbcx zzaL;
    private zzbny zzaa;
    private boolean zzab;
    private boolean zzac;
    private boolean zzad;
    private boolean zzae;
    private boolean zzaf;
    private boolean zzag;
    private boolean zzah;
    private boolean zzai;
    private boolean zzaj;
    private boolean zzak;
    private boolean zzal;
    private boolean zzam;
    private zzbgc zzan;
    private zzbga zzao;
    private zzbkb zzap;
    private zzber zzaq;
    private boolean zzar;
    private boolean zzas;
    private boolean zzat;
    private boolean zzau;
    private boolean zzav;
    private zzbed zzaw;
    private zzbdx zzax;
    private zzbfl zzay;
    private zzbev zzaz;
    private int zzb;
    private int zze;
    private String zzf = "";
    private String zzg = "";
    private zzbny zzh;
    private zzbkb zzi;
    private String zzj;
    private zzbny zzk;
    private zzbny zzl;
    private String zzm;
    private String zzn;
    private String zzo;
    private String zzp;
    private zzboc zzq;
    private zzbkb zzr;
    private zzbge zzs;
    private zzbnw zzt;
    private zzazv zzu;
    private double zzv;
    private String zzw;
    private String zzx;
    private zzbkb zzy;
    private zzbfy zzz;

    static {
        zzbgj zzbgjVar = new zzbgj();
        zzaM = zzbgjVar;
        zzbjr.zzbF(zzbgj.class, zzbgjVar);
    }

    public zzbgj() {
        zzblk zzblkVar = zzblk.zzb;
        this.zzi = zzblkVar;
        this.zzj = "";
        this.zzm = "";
        this.zzn = "";
        this.zzo = "";
        this.zzp = "";
        this.zzr = zzblkVar;
        this.zzw = "";
        this.zzx = "";
        this.zzy = zzblkVar;
        this.zzC = zzblkVar;
        this.zzD = "";
        this.zzH = zzblkVar;
        this.zzJ = "";
        this.zzK = "";
        this.zzY = zzblkVar;
        this.zzZ = zzblkVar;
        this.zzap = zzblkVar;
        this.zzaA = zzblkVar;
        this.zzaJ = "";
        this.zzaK = "";
    }

    public static zzbgj zzbp() {
        return zzaM;
    }

    public final boolean zzA() {
        return (this.zzb & 128) != 0;
    }

    public final zzbfy zzB() {
        zzbfy zzbfyVar = this.zzz;
        return zzbfyVar == null ? zzbfy.zzl() : zzbfyVar;
    }

    public final boolean zzC() {
        return (this.zzb & 256) != 0;
    }

    public final int zzD() {
        return this.zzA;
    }

    public final boolean zzE() {
        return (this.zzb & 512) != 0;
    }

    public final zzboe zzF() {
        zzboe zzboeVar = this.zzB;
        return zzboeVar == null ? zzboe.zze() : zzboeVar;
    }

    public final zzbkb zzG() {
        return this.zzC;
    }

    public final String zzH() {
        return this.zzD;
    }

    public final zzbez zzI() {
        int i = this.zzE;
        zzbez zzbezVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : zzbez.FUTURE_OPENING : zzbez.CLOSED_PERMANENTLY : zzbez.CLOSED_TEMPORARILY : zzbez.OPERATIONAL : zzbez.BUSINESS_STATUS_UNSPECIFIED;
        return zzbezVar == null ? zzbez.UNRECOGNIZED : zzbezVar;
    }

    public final zzbgp zzJ() {
        int i = this.zzG;
        zzbgp zzbgpVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : zzbgp.PRICE_LEVEL_VERY_EXPENSIVE : zzbgp.PRICE_LEVEL_EXPENSIVE : zzbgp.PRICE_LEVEL_MODERATE : zzbgp.PRICE_LEVEL_INEXPENSIVE : zzbgp.PRICE_LEVEL_FREE : zzbgp.PRICE_LEVEL_UNSPECIFIED;
        return zzbgpVar == null ? zzbgp.UNRECOGNIZED : zzbgpVar;
    }

    public final zzbkb zzK() {
        return this.zzH;
    }

    public final boolean zzL() {
        return (this.zzb & 2048) != 0;
    }

    public final int zzM() {
        return this.zzI;
    }

    public final String zzN() {
        return this.zzJ;
    }

    public final String zzO() {
        return this.zzK;
    }

    public final boolean zzP() {
        return (this.zzb & 4096) != 0;
    }

    public final boolean zzQ() {
        return this.zzL;
    }

    public final boolean zzR() {
        return (this.zzb & PKIFailureInfo.certRevoked) != 0;
    }

    public final boolean zzS() {
        return this.zzM;
    }

    public final boolean zzT() {
        return (this.zzb & 16384) != 0;
    }

    public final boolean zzU() {
        return this.zzN;
    }

    public final boolean zzV() {
        return (this.zzb & 32768) != 0;
    }

    public final boolean zzW() {
        return this.zzO;
    }

    public final boolean zzX() {
        return (this.zzb & 65536) != 0;
    }

    public final boolean zzY() {
        return this.zzP;
    }

    public final boolean zzZ() {
        return (this.zzb & PKIFailureInfo.unsupportedVersion) != 0;
    }

    public final String zza() {
        return this.zzf;
    }

    public final boolean zzaA() {
        return this.zzae;
    }

    public final boolean zzaB() {
        return (this.zzb & 1073741824) != 0;
    }

    public final boolean zzaC() {
        return this.zzaf;
    }

    public final boolean zzaD() {
        return (this.zzb & PKIFailureInfo.systemUnavail) != 0;
    }

    public final boolean zzaE() {
        return this.zzag;
    }

    public final boolean zzaF() {
        return (this.zze & 2) != 0;
    }

    public final boolean zzaG() {
        return this.zzai;
    }

    public final boolean zzaH() {
        return (this.zze & 4) != 0;
    }

    public final boolean zzaI() {
        return this.zzaj;
    }

    public final boolean zzaJ() {
        return (this.zze & 8) != 0;
    }

    public final boolean zzaK() {
        return this.zzak;
    }

    public final boolean zzaL() {
        return (this.zze & 16) != 0;
    }

    public final boolean zzaM() {
        return this.zzal;
    }

    public final boolean zzaN() {
        return (this.zze & 32) != 0;
    }

    public final boolean zzaO() {
        return this.zzam;
    }

    public final zzbgc zzaP() {
        zzbgc zzbgcVar = this.zzan;
        return zzbgcVar == null ? zzbgc.zzj() : zzbgcVar;
    }

    public final zzbga zzaQ() {
        zzbga zzbgaVar = this.zzao;
        return zzbgaVar == null ? zzbga.zzp() : zzbgaVar;
    }

    public final zzbkb zzaR() {
        return this.zzap;
    }

    public final zzber zzaS() {
        zzber zzberVar = this.zzaq;
        return zzberVar == null ? zzber.zzj() : zzberVar;
    }

    public final boolean zzaT() {
        return (this.zze & 16384) != 0;
    }

    public final zzbed zzaU() {
        zzbed zzbedVar = this.zzaw;
        return zzbedVar == null ? zzbed.zzc() : zzbedVar;
    }

    public final boolean zzaV() {
        return (this.zze & 32768) != 0;
    }

    public final zzbdx zzaW() {
        zzbdx zzbdxVar = this.zzax;
        return zzbdxVar == null ? zzbdx.zzd() : zzbdxVar;
    }

    public final boolean zzaX() {
        return (this.zze & 65536) != 0;
    }

    public final zzbfl zzaY() {
        zzbfl zzbflVar = this.zzay;
        return zzbflVar == null ? zzbfl.zzg() : zzbflVar;
    }

    public final zzbkb zzaZ() {
        return this.zzaA;
    }

    public final boolean zzaa() {
        return this.zzQ;
    }

    public final boolean zzab() {
        return (this.zzb & PKIFailureInfo.transactionIdInUse) != 0;
    }

    public final boolean zzac() {
        return this.zzR;
    }

    public final boolean zzad() {
        return (this.zzb & PKIFailureInfo.signerNotTrusted) != 0;
    }

    public final boolean zzae() {
        return this.zzS;
    }

    public final boolean zzaf() {
        return (this.zzb & PKIFailureInfo.badCertTemplate) != 0;
    }

    public final boolean zzag() {
        return this.zzT;
    }

    public final boolean zzah() {
        return (this.zzb & PKIFailureInfo.badSenderNonce) != 0;
    }

    public final boolean zzai() {
        return this.zzU;
    }

    public final boolean zzaj() {
        return (this.zzb & 4194304) != 0;
    }

    public final boolean zzak() {
        return this.zzV;
    }

    public final boolean zzal() {
        return (this.zzb & 8388608) != 0;
    }

    public final boolean zzam() {
        return this.zzW;
    }

    public final boolean zzan() {
        return (this.zzb & 16777216) != 0;
    }

    public final zzbfy zzao() {
        zzbfy zzbfyVar = this.zzX;
        return zzbfyVar == null ? zzbfy.zzl() : zzbfyVar;
    }

    public final zzbkb zzap() {
        return this.zzY;
    }

    public final zzbkb zzaq() {
        return this.zzZ;
    }

    public final boolean zzar() {
        return (this.zzb & 33554432) != 0;
    }

    public final zzbny zzas() {
        zzbny zzbnyVar = this.zzaa;
        return zzbnyVar == null ? zzbny.zzf() : zzbnyVar;
    }

    public final boolean zzat() {
        return (this.zzb & 67108864) != 0;
    }

    public final boolean zzau() {
        return this.zzab;
    }

    public final boolean zzav() {
        return (this.zzb & 134217728) != 0;
    }

    public final boolean zzaw() {
        return this.zzac;
    }

    public final boolean zzax() {
        return (this.zzb & 268435456) != 0;
    }

    public final boolean zzay() {
        return this.zzad;
    }

    public final boolean zzaz() {
        return (this.zzb & PKIFailureInfo.duplicateCertReq) != 0;
    }

    @Override // com.google.android.libraries.places.internal.zzbjr
    public final Object zzb(int i, zzbjr zzbjrVar) {
        zzblh zzblhVar;
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new zzbll(zzaM, "\u0000U\u0000\u0002\u0001aU\u0000\t\u0000\u0001Ȉ\u0002Ȉ\u0005Ț\u0007Ȉ\bȈ\tȈ\n\u001b\u000bဉ\u0004\fဉ\u0005\rဉ\u0006\u000e\u0000\u000fȈ\u0010Ȉ\u0015ဉ\u0007\u0016င\b\u0018Ȉ\u0019\f\u001a\f\u001b\u001b\u001cင\u000b\u001dȈ\u001eȈ\u001fဉ\u0000 ဉ\u0001!ဇ\f\"ဇ\r#ဇ\u000e$ဇ\u000f&ဇ\u0010'ဇ\u0011(ဇ\u0012)ဇ\u0013*ဇ\u0014+ဇ\u0015,ဇ\u0016-ဇ\u0017.ဉ\u0018/\u001b1\u001b2Ȉ3Ȉ4ဉ\u00195\u001b6\u001b7ဇ\u001a8ဇ\u001b9ဇ\u001c:ဇ\u001d;ဇ\u001e<ဇ\u001f=ဇ >ဇ!?ဇ\"@ဇ#Aဇ$Bဇ%Cဉ&Fဉ'G\u001bHဉ(Iဇ)Jဇ*Kဇ+Lဇ,Mဇ-Nဉ.Oဉ/Pဉ0Qဉ1R\u001bSဇ2Tဉ3Uဉ4Vဉ5Wဉ6Xဉ\tYဉ7Zဉ\u0003[ဉ8\\ဉ9]Ȉ^Ȉ_ဉ\n`ဉ\u0002aဉ:", new Object[]{"zzb", "zze", "zzf", "zzg", "zzi", "zzm", "zzn", "zzo", "zzr", zzbet.class, "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzz", "zzA", "zzD", "zzE", "zzG", "zzH", zzbex.class, "zzI", "zzJ", "zzK", "zzh", "zzk", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", "zzX", "zzY", zzbfy.class, "zzZ", zzbfy.class, "zzj", "zzp", "zzaa", "zzy", zzbgv.class, "zzC", zzben.class, "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", zzbgi.class, "zzaq", "zzar", "zzas", "zzat", "zzau", "zzav", "zzaw", "zzax", "zzay", "zzaz", "zzaA", zzbfh.class, "zzaB", "zzaC", "zzaD", "zzaE", "zzaF", "zzB", "zzaG", "zzq", "zzaH", "zzaI", "zzaJ", "zzaK", "zzF", "zzl", "zzaL"});
        }
        if (i2 == 3) {
            return new zzbgj();
        }
        if (i2 == 4) {
            return new zzbh(zzaM);
        }
        if (i2 == 5) {
            return zzaM;
        }
        if (i2 != 6) {
            throw null;
        }
        zzblh zzblhVar2 = zzaN;
        if (zzblhVar2 != null) {
            return zzblhVar2;
        }
        synchronized (zzbgj.class) {
            try {
                zzblhVar = zzaN;
                if (zzblhVar == null) {
                    zzblhVar = new zzbjm(zzaM);
                    zzaN = zzblhVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return zzblhVar;
    }

    public final boolean zzba() {
        return (this.zze & PKIFailureInfo.transactionIdInUse) != 0;
    }

    public final boolean zzbb() {
        return this.zzaB;
    }

    public final boolean zzbc() {
        return (this.zze & PKIFailureInfo.signerNotTrusted) != 0;
    }

    public final zzbbz zzbd() {
        zzbbz zzbbzVar = this.zzaC;
        return zzbbzVar == null ? zzbbz.zzd() : zzbbzVar;
    }

    public final boolean zzbe() {
        return (this.zze & PKIFailureInfo.badCertTemplate) != 0;
    }

    public final zzbfn zzbf() {
        zzbfn zzbfnVar = this.zzaD;
        return zzbfnVar == null ? zzbfn.zzg() : zzbfnVar;
    }

    public final zzbgr zzbg() {
        zzbgr zzbgrVar = this.zzaE;
        return zzbgrVar == null ? zzbgr.zzf() : zzbgrVar;
    }

    public final boolean zzbh() {
        return (this.zze & 4194304) != 0;
    }

    public final zzbgg zzbi() {
        zzbgg zzbggVar = this.zzaF;
        return zzbggVar == null ? zzbgg.zzf() : zzbggVar;
    }

    public final boolean zzbj() {
        return (this.zze & 8388608) != 0;
    }

    public final zzbfj zzbk() {
        zzbfj zzbfjVar = this.zzaG;
        return zzbfjVar == null ? zzbfj.zzk() : zzbfjVar;
    }

    public final boolean zzbl() {
        return (this.zze & 16777216) != 0;
    }

    public final zzbfp zzbm() {
        zzbfp zzbfpVar = this.zzaH;
        return zzbfpVar == null ? zzbfp.zzh() : zzbfpVar;
    }

    public final boolean zzbn() {
        return (this.zze & 33554432) != 0;
    }

    public final zzbff zzbo() {
        zzbff zzbffVar = this.zzaI;
        return zzbffVar == null ? zzbff.zzf() : zzbffVar;
    }

    public final String zzc() {
        return this.zzg;
    }

    public final boolean zzd() {
        return (this.zzb & 1) != 0;
    }

    public final zzbny zze() {
        zzbny zzbnyVar = this.zzh;
        return zzbnyVar == null ? zzbny.zzf() : zzbnyVar;
    }

    public final zzbkb zzf() {
        return this.zzi;
    }

    public final String zzg() {
        return this.zzj;
    }

    public final boolean zzh() {
        return (this.zzb & 2) != 0;
    }

    public final zzbny zzi() {
        zzbny zzbnyVar = this.zzk;
        return zzbnyVar == null ? zzbny.zzf() : zzbnyVar;
    }

    public final String zzj() {
        return this.zzm;
    }

    public final String zzk() {
        return this.zzn;
    }

    public final String zzl() {
        return this.zzo;
    }

    public final String zzm() {
        return this.zzp;
    }

    public final boolean zzn() {
        return (this.zzb & 8) != 0;
    }

    public final zzboc zzo() {
        zzboc zzbocVar = this.zzq;
        return zzbocVar == null ? zzboc.zzn() : zzbocVar;
    }

    public final zzbkb zzp() {
        return this.zzr;
    }

    public final boolean zzq() {
        return (this.zzb & 16) != 0;
    }

    public final zzbge zzr() {
        zzbge zzbgeVar = this.zzs;
        return zzbgeVar == null ? zzbge.zzd() : zzbgeVar;
    }

    public final boolean zzs() {
        return (this.zzb & 32) != 0;
    }

    public final zzbnw zzt() {
        zzbnw zzbnwVar = this.zzt;
        return zzbnwVar == null ? zzbnw.zzg() : zzbnwVar;
    }

    public final boolean zzu() {
        return (this.zzb & 64) != 0;
    }

    public final zzazv zzv() {
        zzazv zzazvVar = this.zzu;
        return zzazvVar == null ? zzazv.zze() : zzazvVar;
    }

    public final double zzw() {
        return this.zzv;
    }

    public final String zzx() {
        return this.zzw;
    }

    public final String zzy() {
        return this.zzx;
    }

    public final zzbkb zzz() {
        return this.zzy;
    }
}
