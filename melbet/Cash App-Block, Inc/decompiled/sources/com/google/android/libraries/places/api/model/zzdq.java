package com.google.android.libraries.places.api.model;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;

/* loaded from: classes4.dex */
public final class zzdq implements Parcelable {
    public static final Parcelable.Creator<zzdq> CREATOR = new zzdp(0);
    public final String zza;
    public final String zzb;
    public final String zzc;
    public final Uri zzd;

    public zzdq(Uri uri, String str, String str2, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = uri;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzdq) {
            zzdq zzdqVar = (zzdq) obj;
            String str = this.zza;
            if (str != null ? str.equals(zzdqVar.zza) : zzdqVar.zza == null) {
                String str2 = this.zzb;
                if (str2 != null ? str2.equals(zzdqVar.zzb) : zzdqVar.zzb == null) {
                    String str3 = this.zzc;
                    if (str3 != null ? str3.equals(zzdqVar.zzc) : zzdqVar.zzc == null) {
                        Uri uri = this.zzd;
                        if (uri != null ? uri.equals(zzdqVar.zzd) : zzdqVar.zzd == null) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.zza;
        int hashCode = str == null ? 0 : str.hashCode();
        String str2 = this.zzb;
        int hashCode2 = str2 == null ? 0 : str2.hashCode();
        int i = hashCode ^ 1000003;
        String str3 = this.zzc;
        int hashCode3 = ((((i * 1000003) ^ hashCode2) * 1000003) ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        Uri uri = this.zzd;
        return hashCode3 ^ (uri != null ? uri.hashCode() : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzd);
        String str = this.zza;
        int length = String.valueOf(str).length();
        String str2 = this.zzb;
        int length2 = String.valueOf(str2).length();
        String str3 = this.zzc;
        StringBuilder sb = new StringBuilder(length + 41 + length2 + 17 + String.valueOf(str3).length() + 15 + valueOf.length() + 1);
        Boxes$$ExternalSyntheticOutline1.m(sb, "ConsumerAlertDetails{title=", str, ", description=", str2);
        Boxes$$ExternalSyntheticOutline1.m(sb, ", aboutLinkTitle=", str3, ", aboutLinkUri=", valueOf);
        sb.append("}");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zza;
        if (str == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str);
        }
        String str2 = this.zzb;
        if (str2 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str2);
        }
        String str3 = this.zzc;
        if (str3 == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeString(str3);
        }
        parcel.writeParcelable(this.zzd, i);
    }
}
