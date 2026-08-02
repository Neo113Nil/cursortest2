package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.impl.WorkLauncherImpl;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.signin.internal.zab;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new zab(13);
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;
    public final String zzg;
    public final String zzh;
    public final String zzi;
    public final String zzj;
    public final String zzk;
    public final String zzl;
    public final String zzm;
    public final long zzn;
    public final String zzo;
    public final String zzp;
    public final String zzq;
    public final String zzr;
    public final String zzs;
    public final String zzt;
    public final String zzu;
    public final int zzv;

    public zzaj(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
        this.zzg = str7;
        this.zzh = str8;
        this.zzi = str9;
        this.zzj = str10;
        this.zzk = str11;
        this.zzl = str12;
        this.zzm = str13;
        this.zzn = j;
        this.zzo = str14;
        this.zzp = str15;
        this.zzq = str16;
        this.zzr = str17;
        this.zzs = str18;
        this.zzt = str19;
        this.zzu = str20;
        this.zzv = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzaj) {
            zzaj zzajVar = (zzaj) obj;
            if (zzae.equal(this.zza, zzajVar.zza) && zzae.equal(this.zzb, zzajVar.zzb) && zzae.equal(this.zzc, zzajVar.zzc) && zzae.equal(this.zzd, zzajVar.zzd) && zzae.equal(this.zze, zzajVar.zze) && zzae.equal(this.zzf, zzajVar.zzf) && zzae.equal(this.zzg, zzajVar.zzg) && zzae.equal(this.zzh, zzajVar.zzh) && zzae.equal(this.zzi, zzajVar.zzi) && zzae.equal(this.zzj, zzajVar.zzj) && zzae.equal(this.zzk, zzajVar.zzk) && zzae.equal(this.zzl, zzajVar.zzl) && zzae.equal(this.zzm, zzajVar.zzm) && this.zzn == zzajVar.zzn && zzae.equal(this.zzo, zzajVar.zzo) && zzae.equal(this.zzp, zzajVar.zzp) && zzae.equal(this.zzq, zzajVar.zzq) && zzae.equal(this.zzr, zzajVar.zzr) && zzae.equal(this.zzs, zzajVar.zzs) && zzae.equal(this.zzt, zzajVar.zzt) && zzae.equal(this.zzu, zzajVar.zzu) && zzae.equal(Integer.valueOf(this.zzv), Integer.valueOf(zzajVar.zzv))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh, this.zzi, this.zzj, this.zzk, this.zzl, this.zzm, Long.valueOf(this.zzn), this.zzo, this.zzp, this.zzq, this.zzr, this.zzs, this.zzt, this.zzu, Integer.valueOf(this.zzv)});
    }

    public final String toString() {
        WorkLauncherImpl workLauncherImpl = new WorkLauncherImpl(this);
        workLauncherImpl.add(this.zza, "issuerName");
        workLauncherImpl.add(this.zzb, "issuerPhoneNumber");
        workLauncherImpl.add(this.zzc, "appLogoUrl");
        workLauncherImpl.add(this.zzd, "appName");
        workLauncherImpl.add(this.zze, "appDeveloperName");
        workLauncherImpl.add(this.zzf, "appPackageName");
        workLauncherImpl.add(this.zzg, "privacyNoticeUrl");
        workLauncherImpl.add(this.zzh, "termsAndConditionsUrl");
        workLauncherImpl.add(this.zzi, "productShortName");
        workLauncherImpl.add(this.zzj, "appAction");
        workLauncherImpl.add(this.zzk, "appIntentExtraMessage");
        workLauncherImpl.add(this.zzl, "issuerMessageHeadline");
        workLauncherImpl.add(this.zzm, "issuerMessageBody");
        workLauncherImpl.add(Long.valueOf(this.zzn), "issuerMessageExpiryTimestampMillis");
        workLauncherImpl.add(this.zzo, "issuerMessageLinkPackageName");
        workLauncherImpl.add(this.zzp, "issuerMessageLinkAction");
        workLauncherImpl.add(this.zzq, "issuerMessageLinkExtraText");
        workLauncherImpl.add(this.zzr, "issuerMessageLinkUrl");
        workLauncherImpl.add(this.zzs, "issuerMessageLinkText");
        workLauncherImpl.add(this.zzt, "issuerWebLinkUrl");
        workLauncherImpl.add(this.zzu, "issuerWebLinkText");
        workLauncherImpl.add(Integer.valueOf(this.zzv), "issuerMessageType");
        return workLauncherImpl.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 6, this.zze);
        MooncakeHeaderViewKt.writeString(parcel, 7, this.zzf);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zzg);
        MooncakeHeaderViewKt.writeString(parcel, 9, this.zzh);
        MooncakeHeaderViewKt.writeString(parcel, 10, this.zzi);
        MooncakeHeaderViewKt.writeString(parcel, 11, this.zzj);
        MooncakeHeaderViewKt.writeString(parcel, 12, this.zzk);
        MooncakeHeaderViewKt.writeString(parcel, 13, this.zzl);
        MooncakeHeaderViewKt.writeString(parcel, 14, this.zzm);
        MooncakeHeaderViewKt.zza(parcel, 15, 8);
        parcel.writeLong(this.zzn);
        MooncakeHeaderViewKt.writeString(parcel, 16, this.zzo);
        MooncakeHeaderViewKt.writeString(parcel, 17, this.zzp);
        MooncakeHeaderViewKt.writeString(parcel, 18, this.zzq);
        MooncakeHeaderViewKt.writeString(parcel, 20, this.zzr);
        MooncakeHeaderViewKt.writeString(parcel, 21, this.zzs);
        MooncakeHeaderViewKt.writeString(parcel, 22, this.zzt);
        MooncakeHeaderViewKt.writeString(parcel, 23, this.zzu);
        MooncakeHeaderViewKt.zza(parcel, 24, 4);
        parcel.writeInt(this.zzv);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
