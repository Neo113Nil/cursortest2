package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public final class CardInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new zab(24);
    public final boolean zzA;
    public final long zzB;
    public final long zzC;
    public final boolean zzD;
    public final long zzE;
    public final String zzF;
    public final String zzG;
    public final zze zzH;
    public final int zzI;
    public final boolean zzJ;
    public final String zzK;
    public final int zzL;
    public final boolean zzM;
    public final long zzN;
    public final String zzO;
    public final int zzP;
    public final String zza;
    public final String zzb;
    public final byte[] zzc;
    public final String zzd;
    public final String zze;
    public final int zzf;
    public final TokenStatus zzg;
    public final String zzh;
    public final Uri zzi;
    public final int zzj;
    public final int zzk;
    public final zzaj zzl;
    public final String zzm;
    public final zzaz zzn;
    public final String zzo;
    public final byte[] zzp;
    public final int zzq;
    public final int zzr;
    public final int zzs;
    public final zzah zzt;
    public final zzaf zzu;
    public final String zzv;
    public final zzan[] zzw;
    public final boolean zzx;
    public final List zzy;
    public final boolean zzz;

    static {
        com.google.android.gms.internal.tapandpay.zzau.zzk(2, 10, 9);
    }

    public CardInfo(String str, String str2, byte[] bArr, String str3, String str4, int i, TokenStatus tokenStatus, String str5, Uri uri, int i2, int i3, zzaj zzajVar, String str6, zzaz zzazVar, String str7, byte[] bArr2, int i4, int i5, int i6, zzah zzahVar, zzaf zzafVar, String str8, zzan[] zzanVarArr, boolean z, ArrayList arrayList, boolean z2, boolean z3, long j, long j2, boolean z4, long j3, String str9, String str10, zze zzeVar, int i7, boolean z5, String str11, int i8, boolean z6, long j4, String str12, int i9) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = bArr;
        this.zzd = str3;
        this.zze = str4;
        this.zzf = i;
        this.zzg = tokenStatus;
        this.zzh = str5;
        this.zzi = uri;
        this.zzj = i2;
        this.zzk = i3;
        this.zzl = zzajVar;
        this.zzm = str6;
        this.zzn = zzazVar;
        this.zzo = str7;
        this.zzp = bArr2;
        this.zzq = i4;
        this.zzr = i5;
        this.zzs = i6;
        this.zzt = zzahVar;
        this.zzu = zzafVar;
        this.zzv = str8;
        this.zzw = zzanVarArr;
        this.zzx = z;
        this.zzy = arrayList;
        this.zzz = z2;
        this.zzA = z3;
        this.zzB = j;
        this.zzC = j2;
        this.zzD = z4;
        this.zzE = j3;
        this.zzF = str9;
        this.zzG = str10;
        this.zzH = zzeVar;
        this.zzI = i7;
        this.zzJ = z5;
        this.zzK = str11;
        this.zzL = i8;
        this.zzM = z6;
        this.zzN = j4;
        this.zzO = str12;
        this.zzP = i9;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CardInfo) {
            CardInfo cardInfo = (CardInfo) obj;
            if (zzae.equal(this.zza, cardInfo.zza) && zzae.equal(this.zzb, cardInfo.zzb) && Arrays.equals(this.zzc, cardInfo.zzc) && zzae.equal(this.zzd, cardInfo.zzd) && zzae.equal(this.zze, cardInfo.zze) && this.zzf == cardInfo.zzf && zzae.equal(this.zzg, cardInfo.zzg) && zzae.equal(this.zzh, cardInfo.zzh) && zzae.equal(this.zzi, cardInfo.zzi) && this.zzj == cardInfo.zzj && this.zzk == cardInfo.zzk && zzae.equal(this.zzl, cardInfo.zzl) && zzae.equal(this.zzm, cardInfo.zzm) && zzae.equal(this.zzn, cardInfo.zzn) && this.zzq == cardInfo.zzq && this.zzr == cardInfo.zzr && this.zzs == cardInfo.zzs && zzae.equal(this.zzt, cardInfo.zzt) && zzae.equal(this.zzu, cardInfo.zzu) && zzae.equal(this.zzv, cardInfo.zzv) && Arrays.equals(this.zzw, cardInfo.zzw) && this.zzx == cardInfo.zzx && zzae.equal(this.zzy, cardInfo.zzy) && this.zzz == cardInfo.zzz && this.zzA == cardInfo.zzA && this.zzB == cardInfo.zzB && this.zzD == cardInfo.zzD && this.zzE == cardInfo.zzE && zzae.equal(this.zzF, cardInfo.zzF) && zzae.equal(this.zzG, cardInfo.zzG) && zzae.equal(this.zzH, cardInfo.zzH) && this.zzI == cardInfo.zzI && this.zzJ == cardInfo.zzJ && this.zzL == cardInfo.zzL && this.zzM == cardInfo.zzM && this.zzP == cardInfo.zzP && this.zzN == cardInfo.zzN && zzae.equal(this.zzO, cardInfo.zzO)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, Integer.valueOf(this.zzf), this.zzg, this.zzh, this.zzi, Integer.valueOf(this.zzj), Integer.valueOf(this.zzk), this.zzm, this.zzn, Integer.valueOf(this.zzq), Integer.valueOf(this.zzr), Integer.valueOf(this.zzs), this.zzt, this.zzu, this.zzv, this.zzw, Boolean.valueOf(this.zzx), this.zzy, Boolean.valueOf(this.zzz), Boolean.valueOf(this.zzA), Long.valueOf(this.zzB), Boolean.valueOf(this.zzD), Long.valueOf(this.zzE), this.zzF, this.zzG, this.zzH, Integer.valueOf(this.zzI), Boolean.valueOf(this.zzJ), Integer.valueOf(this.zzL), Boolean.valueOf(this.zzM), Long.valueOf(this.zzN), this.zzO, Integer.valueOf(this.zzP)});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.zza, "billingCardId");
        workLauncherImpl.add(this.zzb, "auxClientTokenId");
        byte[] bArr = this.zzc;
        workLauncherImpl.add(bArr == null ? null : Arrays.toString(bArr), "serverToken");
        workLauncherImpl.add(this.zzd, "cardholderName");
        workLauncherImpl.add(this.zze, "displayName");
        workLauncherImpl.add(Integer.valueOf(this.zzf), "cardNetwork");
        workLauncherImpl.add(this.zzg, "tokenStatus");
        workLauncherImpl.add(this.zzh, "panLastDigits");
        workLauncherImpl.add(this.zzi, "cardImageUrl");
        workLauncherImpl.add(Integer.valueOf(this.zzj), "cardColor");
        workLauncherImpl.add(Integer.valueOf(this.zzk), "overlayTextColor");
        zzaj zzajVar = this.zzl;
        workLauncherImpl.add(zzajVar == null ? null : zzajVar.toString(), "issuerInfo");
        workLauncherImpl.add(this.zzm, "tokenLastDigits");
        workLauncherImpl.add(this.zzn, "transactionInfo");
        workLauncherImpl.add(this.zzo, "issuerTokenId");
        byte[] bArr2 = this.zzp;
        workLauncherImpl.add(bArr2 == null ? null : Arrays.toString(bArr2), "inAppCardToken");
        workLauncherImpl.add(Integer.valueOf(this.zzq), "cachedEligibility");
        workLauncherImpl.add(Integer.valueOf(this.zzr), "paymentProtocol");
        workLauncherImpl.add(Integer.valueOf(this.zzs), "tokenType");
        workLauncherImpl.add(this.zzt, "inStoreCvmConfig");
        workLauncherImpl.add(this.zzu, "inAppCvmConfig");
        workLauncherImpl.add(this.zzv, "tokenDisplayName");
        zzan[] zzanVarArr = this.zzw;
        workLauncherImpl.add(zzanVarArr != null ? Arrays.toString(zzanVarArr) : null, "onlineAccountCardLinkInfos");
        workLauncherImpl.add(Boolean.valueOf(this.zzx), "allowAidSelection");
        workLauncherImpl.add("[" + TextUtils.join(", ", this.zzy) + "]", "badges");
        workLauncherImpl.add(Boolean.valueOf(this.zzz), "upgradeAvailable");
        workLauncherImpl.add(Boolean.valueOf(this.zzA), "requiresSignature");
        workLauncherImpl.add(Long.valueOf(this.zzB), "googleTokenId");
        workLauncherImpl.add(Boolean.valueOf(this.zzD), "isTransit");
        workLauncherImpl.add(Long.valueOf(this.zzE), "googleWalletId");
        workLauncherImpl.add(this.zzF, "devicePaymentMethodId");
        workLauncherImpl.add(this.zzG, "cloudPaymentMethodId");
        workLauncherImpl.add(Long.valueOf(this.zzN), "auxiliaryGoogleTokenId");
        workLauncherImpl.add(this.zzO, "auxiliaryIssuerTokenId");
        workLauncherImpl.add(Integer.valueOf(this.zzP), "auxiliaryNetwork");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeByteArray(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zze);
        MooncakeHeaderViewKt.zza(parcel, 6, 4);
        parcel.writeInt(this.zzf);
        MooncakeHeaderViewKt.writeParcelable(parcel, 7, this.zzg, i);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zzh);
        MooncakeHeaderViewKt.writeParcelable(parcel, 9, this.zzi, i);
        MooncakeHeaderViewKt.zza(parcel, 10, 4);
        parcel.writeInt(this.zzj);
        MooncakeHeaderViewKt.zza(parcel, 11, 4);
        parcel.writeInt(this.zzk);
        MooncakeHeaderViewKt.writeParcelable(parcel, 12, this.zzl, i);
        MooncakeHeaderViewKt.writeString(parcel, 13, this.zzm);
        MooncakeHeaderViewKt.writeParcelable(parcel, 15, this.zzn, i);
        MooncakeHeaderViewKt.writeString(parcel, 16, this.zzo);
        MooncakeHeaderViewKt.writeByteArray(parcel, 17, this.zzp);
        MooncakeHeaderViewKt.zza(parcel, 18, 4);
        parcel.writeInt(this.zzq);
        MooncakeHeaderViewKt.zza(parcel, 20, 4);
        parcel.writeInt(this.zzr);
        MooncakeHeaderViewKt.zza(parcel, 21, 4);
        parcel.writeInt(this.zzs);
        MooncakeHeaderViewKt.writeParcelable(parcel, 22, this.zzt, i);
        MooncakeHeaderViewKt.writeParcelable(parcel, 23, this.zzu, i);
        MooncakeHeaderViewKt.writeString(parcel, 24, this.zzv);
        MooncakeHeaderViewKt.writeTypedArray(parcel, 25, this.zzw, i);
        MooncakeHeaderViewKt.zza(parcel, 26, 4);
        parcel.writeInt(this.zzx ? 1 : 0);
        MooncakeHeaderViewKt.writeTypedList(parcel, 27, this.zzy);
        MooncakeHeaderViewKt.zza(parcel, 28, 4);
        parcel.writeInt(this.zzz ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 29, 4);
        parcel.writeInt(this.zzA ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 30, 8);
        parcel.writeLong(this.zzB);
        MooncakeHeaderViewKt.zza(parcel, 31, 8);
        parcel.writeLong(this.zzC);
        MooncakeHeaderViewKt.zza(parcel, 32, 4);
        parcel.writeInt(this.zzD ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 33, 8);
        parcel.writeLong(this.zzE);
        MooncakeHeaderViewKt.writeString(parcel, 34, this.zzF);
        MooncakeHeaderViewKt.writeString(parcel, 35, this.zzG);
        MooncakeHeaderViewKt.writeParcelable(parcel, 36, this.zzH, i);
        MooncakeHeaderViewKt.zza(parcel, 37, 4);
        parcel.writeInt(this.zzI);
        MooncakeHeaderViewKt.zza(parcel, 38, 4);
        parcel.writeInt(this.zzJ ? 1 : 0);
        MooncakeHeaderViewKt.writeString(parcel, 39, this.zzK);
        MooncakeHeaderViewKt.zza(parcel, 40, 4);
        parcel.writeInt(this.zzL);
        MooncakeHeaderViewKt.zza(parcel, 41, 4);
        parcel.writeInt(this.zzM ? 1 : 0);
        MooncakeHeaderViewKt.zza(parcel, 42, 8);
        parcel.writeLong(this.zzN);
        MooncakeHeaderViewKt.writeString(parcel, 43, this.zzO);
        MooncakeHeaderViewKt.zza(parcel, 44, 4);
        parcel.writeInt(this.zzP);
        MooncakeHeaderViewKt.writeString(parcel, 45, this.zzb);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
