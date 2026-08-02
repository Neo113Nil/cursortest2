package com.google.android.libraries.places.widget.internal.placedetails.photoviewer;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.google.android.play.core.review.zzb;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new zzb(8);
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final String zzd;
    public final String zze;
    public final String zzf;

    public zzd(String str, String str2, String str3, String str4, String str5, String str6) {
        str.getClass();
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = str4;
        this.zze = str5;
        this.zzf = str6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzd)) {
            return false;
        }
        zzd zzdVar = (zzd) obj;
        return Intrinsics.areEqual(this.zza, zzdVar.zza) && Intrinsics.areEqual(this.zzb, zzdVar.zzb) && Intrinsics.areEqual(this.zzc, zzdVar.zzc) && Intrinsics.areEqual(this.zzd, zzdVar.zzd) && Intrinsics.areEqual(this.zze, zzdVar.zze) && Intrinsics.areEqual(this.zzf, zzdVar.zzf);
    }

    public final int hashCode() {
        int hashCode = this.zza.hashCode() * 31;
        String str = this.zzb;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.zzc;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.zzd;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.zze;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.zzf;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzc;
        int length3 = String.valueOf(str3).length();
        String str4 = this.zzd;
        int length4 = String.valueOf(str4).length();
        String str5 = this.zze;
        int length5 = String.valueOf(str5).length();
        String str6 = this.zzf;
        StringBuilder sb = new StringBuilder(length + 43 + length2 + 17 + length3 + 18 + length4 + 15 + length5 + 17 + String.valueOf(str6).length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "PhotoPageData(photoUri=", str, ", photoThumbnailUri=", str2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", reportPhotoUri=", str3, ", userDisplayName=", str4);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", userImageUri=", str5, ", userProfileUri=", str6);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.zza);
        parcel.writeString(this.zzb);
        parcel.writeString(this.zzc);
        parcel.writeString(this.zzd);
        parcel.writeString(this.zze);
        parcel.writeString(this.zzf);
    }
}
