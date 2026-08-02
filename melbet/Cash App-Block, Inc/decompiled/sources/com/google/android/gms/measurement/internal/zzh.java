package com.google.android.gms.measurement.internal;

import android.text.TextUtils;
import com.google.android.gms.common.internal.zzae;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes4.dex */
public final class zzh {
    public Long zzA;
    public long zzB;
    public String zzC;
    public int zzD;
    public int zzE;
    public long zzF;
    public String zzG;
    public byte[] zzH;
    public int zzI;
    public long zzJ;
    public long zzK;
    public long zzL;
    public long zzM;
    public long zzN;
    public long zzO;
    public long zzP;
    public String zzQ;
    public boolean zzR;
    public long zzS;
    public long zzT;
    public final zzic zza;
    public final String zzb;
    public String zzc;
    public String zzd;
    public String zze;
    public String zzf;
    public long zzg;
    public long zzh;
    public long zzi;
    public String zzj;
    public long zzk;
    public String zzl;
    public long zzm;
    public long zzn;
    public boolean zzo;
    public boolean zzp;
    public Boolean zzq;
    public long zzr;
    public ArrayList zzs;
    public String zzt;
    public boolean zzu;
    public long zzv;
    public long zzw;
    public int zzx;
    public boolean zzy;
    public Long zzz;

    public zzh(zzic zzicVar, String str) {
        zzae.checkNotNull(zzicVar);
        zzae.checkNotEmpty(str);
        this.zza = zzicVar;
        this.zzb = str;
        zzhz zzhzVar = zzicVar.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
    }

    public final void zzA(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzn != j;
        this.zzn = j;
    }

    public final long zzB() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzr;
    }

    public final void zzC(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzr != j;
        this.zzr = j;
    }

    public final boolean zzD() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzo;
    }

    public final void zzE(boolean z) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzo != z;
        this.zzo = z;
    }

    public final void zzF(long j) {
        zzae.checkArgument(j >= 0);
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzg != j;
        this.zzg = j;
    }

    public final long zzG() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzg;
    }

    public final long zzH() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzS;
    }

    public final void zzI(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzS != j;
        this.zzS = j;
    }

    public final long zzJ() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzT;
    }

    public final void zzK(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzT != j;
        this.zzT = j;
    }

    public final void zzM(long j) {
        zzic zzicVar = this.zza;
        zzhz zzhzVar = zzicVar.zzj;
        zzgu zzguVar = zzicVar.zzi;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        long j2 = this.zzg + j;
        String str = this.zzb;
        if (j2 > 2147483647L) {
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzb(zzgu.zzl(str), "Bundle index overflow. appId");
            j2 = (-1) + j;
        }
        long j3 = this.zzF + 1;
        if (j3 > 2147483647L) {
            zzic.zzP(zzguVar);
            zzguVar.zzg.zzb(zzgu.zzl(str), "Delivery index overflow. appId");
            j3 = 0;
        }
        this.zzR = true;
        this.zzg = j2;
        this.zzF = j3;
    }

    public final long zzN() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzK;
    }

    public final void zzO(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzK != j;
        this.zzK = j;
    }

    public final long zzP() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzL;
    }

    public final void zzQ(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzL != j;
        this.zzL = j;
    }

    public final long zzR() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzM;
    }

    public final void zzS(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzM != j;
        this.zzM = j;
    }

    public final long zzT() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzN;
    }

    public final void zzU(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzN != j;
        this.zzN = j;
    }

    public final long zzV() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzP;
    }

    public final void zzW(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzP != j;
        this.zzP = j;
    }

    public final long zzX() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzO;
    }

    public final void zzY(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzO != j;
        this.zzO = j;
    }

    public final String zzZ() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzQ;
    }

    public final boolean zza() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzR;
    }

    public final int zzaA() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzD;
    }

    public final void zzaB(int i) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzD != i;
        this.zzD = i;
    }

    public final int zzaC() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzE;
    }

    public final void zzaD(int i) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzE != i;
        this.zzE = i;
    }

    public final void zzaE(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzF != j;
        this.zzF = j;
    }

    public final long zzaF() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzF;
    }

    public final void zzaG(String str) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzG != str;
        this.zzG = str;
    }

    public final String zzaH() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzG;
    }

    public final void zzaI(byte[] bArr) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzH != bArr;
        this.zzH = bArr;
    }

    public final byte[] zzaJ() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzH;
    }

    public final void zzaK(int i) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzI != i;
        this.zzI = i;
    }

    public final int zzaL() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzI;
    }

    public final void zzaM(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzJ != j;
        this.zzJ = j;
    }

    public final long zzaN() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzJ;
    }

    public final String zzaa() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        String str = this.zzQ;
        zzab(null);
        return str;
    }

    public final void zzab(String str) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= !Objects.equals(this.zzQ, str);
        this.zzQ = str;
    }

    public final boolean zzac() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzp;
    }

    public final void zzad(boolean z) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzp != z;
        this.zzp = z;
    }

    public final Boolean zzae() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzq;
    }

    public final void zzaf(Boolean bool) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= !Objects.equals(this.zzq, bool);
        this.zzq = bool;
    }

    public final ArrayList zzag() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzs;
    }

    public final void zzah(List list) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        if (Objects.equals(this.zzs, list)) {
            return;
        }
        this.zzR = true;
        this.zzs = list != null ? new ArrayList(list) : null;
    }

    public final boolean zzai() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzu;
    }

    public final void zzaj(boolean z) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzu != z;
        this.zzu = z;
    }

    public final long zzak() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzv;
    }

    public final void zzal(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzv != j;
        this.zzv = j;
    }

    public final long zzam() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzw;
    }

    public final void zzan(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzw != j;
        this.zzw = j;
    }

    public final int zzao() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzx;
    }

    public final void zzap(int i) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzx != i;
        this.zzx = i;
    }

    public final boolean zzaq() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzy;
    }

    public final void zzar(boolean z) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzy != z;
        this.zzy = z;
    }

    public final Long zzas() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzz;
    }

    public final void zzat(Long l) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= !Objects.equals(this.zzz, l);
        this.zzz = l;
    }

    public final Long zzau() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzA;
    }

    public final void zzav(Long l) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= !Objects.equals(this.zzA, l);
        this.zzA = l;
    }

    public final long zzaw() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzB;
    }

    public final void zzax(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzB != j;
        this.zzB = j;
    }

    public final String zzay() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzC;
    }

    public final void zzaz(String str) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzC != str;
        this.zzC = str;
    }

    public final void zzb() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR = false;
    }

    public final String zzc() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzb;
    }

    public final String zzd() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzc;
    }

    public final void zze(String str) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= !Objects.equals(this.zzc, str);
        this.zzc = str;
    }

    public final String zzf() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzd;
    }

    public final void zzg(String str) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        if (true == TextUtils.isEmpty(str)) {
            str = null;
        }
        this.zzR |= true ^ Objects.equals(this.zzd, str);
        this.zzd = str;
    }

    public final String zzh() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzt;
    }

    public final void zzi(String str) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= !Objects.equals(this.zzt, str);
        this.zzt = str;
    }

    public final String zzj() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zze;
    }

    public final void zzk(String str) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= !Objects.equals(this.zze, str);
        this.zze = str;
    }

    public final String zzl() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzf;
    }

    public final void zzm(String str) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= !Objects.equals(this.zzf, str);
        this.zzf = str;
    }

    public final long zzn() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzh;
    }

    public final void zzo(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzh != j;
        this.zzh = j;
    }

    public final long zzp() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzi;
    }

    public final void zzq(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzi != j;
        this.zzi = j;
    }

    public final String zzr() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzj;
    }

    public final void zzs(String str) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= !Objects.equals(this.zzj, str);
        this.zzj = str;
    }

    public final long zzt() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzk;
    }

    public final void zzu(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzk != j;
        this.zzk = j;
    }

    public final String zzv() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzl;
    }

    public final void zzw(String str) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= !Objects.equals(this.zzl, str);
        this.zzl = str;
    }

    public final long zzx() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzm;
    }

    public final void zzy(long j) {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        this.zzR |= this.zzm != j;
        this.zzm = j;
    }

    public final long zzz() {
        zzhz zzhzVar = this.zza.zzj;
        zzic.zzP(zzhzVar);
        zzhzVar.zzg();
        return this.zzn;
    }
}
