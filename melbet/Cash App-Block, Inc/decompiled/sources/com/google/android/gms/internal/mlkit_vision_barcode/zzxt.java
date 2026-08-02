package com.google.android.gms.internal.mlkit_vision_barcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.squareup.cash.directory_ui.views.MooncakeHeaderViewKt;

/* loaded from: classes4.dex */
public final class zzxt extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzxt> CREATOR = new zzh(19);
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
    public final String zzn;

    public zzxt(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
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
        this.zzn = str14;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int zzb = MooncakeHeaderViewKt.zzb(parcel, 20293);
        MooncakeHeaderViewKt.writeString(parcel, 1, this.zza);
        MooncakeHeaderViewKt.writeString(parcel, 2, this.zzb);
        MooncakeHeaderViewKt.writeString(parcel, 3, this.zzc);
        MooncakeHeaderViewKt.writeString(parcel, 4, this.zzd);
        MooncakeHeaderViewKt.writeString(parcel, 5, this.zze);
        MooncakeHeaderViewKt.writeString(parcel, 6, this.zzf);
        MooncakeHeaderViewKt.writeString(parcel, 7, this.zzg);
        MooncakeHeaderViewKt.writeString(parcel, 8, this.zzh);
        MooncakeHeaderViewKt.writeString(parcel, 9, this.zzi);
        MooncakeHeaderViewKt.writeString(parcel, 10, this.zzj);
        MooncakeHeaderViewKt.writeString(parcel, 11, this.zzk);
        MooncakeHeaderViewKt.writeString(parcel, 12, this.zzl);
        MooncakeHeaderViewKt.writeString(parcel, 13, this.zzm);
        MooncakeHeaderViewKt.writeString(parcel, 14, this.zzn);
        MooncakeHeaderViewKt.zzc(parcel, zzb);
    }
}
