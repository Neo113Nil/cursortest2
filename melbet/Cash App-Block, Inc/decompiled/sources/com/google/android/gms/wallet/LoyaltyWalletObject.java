package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wallet.wobs.LoyaltyPoints;
import com.google.android.gms.wallet.wobs.TimeInterval;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class LoyaltyWalletObject extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LoyaltyWalletObject> CREATOR = new zzb(15);
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
    public final int zzk;
    public final ArrayList zzl;
    public final TimeInterval zzm;
    public final ArrayList zzn;
    public final String zzo;
    public final String zzp;
    public final ArrayList zzq;
    public final boolean zzr;
    public final ArrayList zzs;
    public final ArrayList zzt;
    public final ArrayList zzu;
    public final LoyaltyPoints zzv;

    public LoyaltyWalletObject(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i, ArrayList arrayList, TimeInterval timeInterval, ArrayList arrayList2, String str11, String str12, ArrayList arrayList3, boolean z, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, LoyaltyPoints loyaltyPoints) {
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
        this.zzk = i;
        this.zzl = arrayList;
        this.zzm = timeInterval;
        this.zzn = arrayList2;
        this.zzo = str11;
        this.zzp = str12;
        this.zzq = arrayList3;
        this.zzr = z;
        this.zzs = arrayList4;
        this.zzt = arrayList5;
        this.zzu = arrayList6;
        this.zzv = loyaltyPoints;
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
        MooncakeHeaderViewKt.zza(parcel, 12, 4);
        parcel.writeInt(this.zzk);
        MooncakeHeaderViewKt.writeTypedList(parcel, 13, this.zzl);
        MooncakeHeaderViewKt.writeParcelable(parcel, 14, this.zzm, i);
        MooncakeHeaderViewKt.writeTypedList(parcel, 15, this.zzn);
        MooncakeHeaderViewKt.writeString(parcel, 16, this.zzo);
        MooncakeHeaderViewKt.writeString(parcel, 17, this.zzp);
        MooncakeHeaderViewKt.writeTypedList(parcel, 18, this.zzq);
        MooncakeHeaderViewKt.zza(parcel, 19, 4);
        parcel.writeInt(this.zzr ? 1 : 0);
        MooncakeHeaderViewKt.writeTypedList(parcel, 20, this.zzs);
        MooncakeHeaderViewKt.writeTypedList(parcel, 21, this.zzt);
        MooncakeHeaderViewKt.writeTypedList(parcel, 22, this.zzu);
        MooncakeHeaderViewKt.writeParcelable(parcel, 23, this.zzv, i);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
